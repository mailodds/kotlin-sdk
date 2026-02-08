package ci;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class SmokeTest {
    static final String API_URL = "https://api.mailodds.com";
    static String apiKey;
    static int passed = 0, failed = 0;

    static void check(String label, String expected, String actual) {
        if ((expected == null && actual == null) || (expected != null && expected.equals(actual))) {
            passed++;
        } else {
            failed++;
            System.out.printf("  FAIL: %s expected=%s got=%s%n", label, expected, actual);
        }
    }

    static String apiCall(String email, String key) throws Exception {
        URL url = URI.create(API_URL + "/v1/validate").toURL();
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Authorization", "Bearer " + key);
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setConnectTimeout(30000);
        conn.setReadTimeout(30000);
        conn.setDoOutput(true);

        String body = "{\"email\":\"" + email + "\"}";
        conn.getOutputStream().write(body.getBytes(StandardCharsets.UTF_8));

        int code = conn.getResponseCode();
        InputStream is = code >= 400 ? conn.getErrorStream() : conn.getInputStream();
        String resp = new String(is.readAllBytes(), StandardCharsets.UTF_8);
        return code + "|" + resp;
    }

    static String jsonGet(String json, String key) {
        String search = "\"" + key + "\":";
        int idx = json.indexOf(search);
        if (idx < 0) return null;
        int start = idx + search.length();
        while (start < json.length() && json.charAt(start) == ' ') start++;
        if (json.charAt(start) == '"') {
            int end = json.indexOf('"', start + 1);
            return json.substring(start + 1, end);
        } else if (json.substring(start).startsWith("null")) {
            return null;
        } else if (json.substring(start).startsWith("true")) {
            return "true";
        } else if (json.substring(start).startsWith("false")) {
            return "false";
        }
        int end = start;
        while (end < json.length() && json.charAt(end) != ',' && json.charAt(end) != '}') end++;
        return json.substring(start, end).trim();
    }

    public static void main(String[] args) throws Exception {
        apiKey = System.getenv("MAILODDS_TEST_KEY");
        if (apiKey == null || apiKey.isEmpty()) {
            System.out.println("ERROR: MAILODDS_TEST_KEY not set");
            System.exit(1);
        }

        // Prove SDK classes load (Kotlin SDK uses 'apis' package)
        Class.forName("com.mailodds.apis.EmailValidationApi");

        String[][] cases = {
            {"test@deliverable.mailodds.com", "valid", "accept", null},
            {"test@invalid.mailodds.com", "invalid", "reject", "smtp_rejected"},
            {"test@risky.mailodds.com", "catch_all", "accept_with_caution", "catch_all_detected"},
            {"test@disposable.mailodds.com", "do_not_mail", "reject", "disposable"},
            {"test@role.mailodds.com", "do_not_mail", "reject", "role_account"},
            {"test@timeout.mailodds.com", "unknown", "retry_later", "smtp_unreachable"},
            {"test@freeprovider.mailodds.com", "valid", "accept", null},
        };

        for (String[] c : cases) {
            String domain = c[0].split("@")[1].split("\\.")[0];
            try {
                String raw = apiCall(c[0], apiKey);
                String json = raw.substring(raw.indexOf("|") + 1);
                check(domain + ".status", c[1], jsonGet(json, "status"));
                check(domain + ".action", c[2], jsonGet(json, "action"));
                check(domain + ".sub_status", c[3], jsonGet(json, "sub_status"));
                check(domain + ".test_mode", "true", jsonGet(json, "test_mode"));
            } catch (Exception e) {
                failed++;
                System.out.printf("  FAIL: %s error: %s%n", domain, e.getMessage());
            }
        }

        // Error handling
        String r401 = apiCall("test@deliverable.mailodds.com", "invalid_key");
        check("error.401", "401", r401.split("\\|")[0]);

        URL url = URI.create(API_URL + "/v1/validate").toURL();
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Authorization", "Bearer " + apiKey);
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setDoOutput(true);
        conn.getOutputStream().write("{}".getBytes(StandardCharsets.UTF_8));
        int code = conn.getResponseCode();
        if (code == 400 || code == 422) { passed++; }
        else { failed++; System.out.printf("  FAIL: error.400 expected=400|422 got=%d%n", code); }

        int total = passed + failed;
        String result = failed == 0 ? "PASS" : "FAIL";
        System.out.printf("%n%s: Kotlin SDK (%d/%d)%n", result, passed, total);
        if (failed > 0) System.exit(1);
    }
}
