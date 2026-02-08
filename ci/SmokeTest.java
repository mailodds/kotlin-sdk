package ci;

// SDK smoke test -- validates build-from-source and API integration using the SDK client.
import com.mailodds.apis.EmailValidationApi;
import com.mailodds.infrastructure.ApiClient;
import com.mailodds.infrastructure.ClientException;
import com.mailodds.infrastructure.ServerException;
import com.mailodds.models.ValidateRequest;
import com.mailodds.models.ValidationResponse;

public class SmokeTest {
    static int passed = 0, failed = 0;

    static void check(String label, String expected, String actual) {
        if ((expected == null && actual == null) || (expected != null && expected.equals(actual))) {
            passed++;
        } else {
            failed++;
            System.out.printf("  FAIL: %s expected=%s got=%s%n", label, expected, actual);
        }
    }

    static void checkBool(String label, boolean expected, Boolean actual) {
        if (actual != null && expected == actual) {
            passed++;
        } else {
            failed++;
            System.out.printf("  FAIL: %s expected=%s got=%s%n", label, expected, actual);
        }
    }

    public static void main(String[] args) throws Exception {
        String apiKey = System.getenv("MAILODDS_TEST_KEY");
        if (apiKey == null || apiKey.isEmpty()) {
            System.out.println("ERROR: MAILODDS_TEST_KEY not set");
            System.exit(1);
        }

        ApiClient.Companion.setAccessToken(apiKey);
        EmailValidationApi api = new EmailValidationApi("https://api.mailodds.com", ApiClient.Companion.getDefaultClient());

        String[][] cases = {
            {"test@deliverable.mailodds.com", "valid", "accept", null},
            {"test@invalid.mailodds.com", "invalid", "reject", "smtp_rejected"},
            {"test@risky.mailodds.com", "catch_all", "accept_with_caution", "catch_all_detected"},
            {"test@disposable.mailodds.com", "do_not_mail", "reject", "disposable"},
            {"test@role.mailodds.com", "do_not_mail", "reject", "role_account"},
            {"test@timeout.mailodds.com", "unknown", "retry_later", "smtp_unreachable"},
            {"test@freeprovider.mailodds.com", "valid", "accept", null},
        };

        // [free_provider, disposable, role_account, mx_found]
        boolean[][] boolCases = {
            {false, false, false, true},  // deliverable
            {false, false, false, true},  // invalid
            {false, false, false, true},  // risky
            {false, true, false, true},   // disposable
            {false, false, true, true},   // role
            {false, false, false, true},  // timeout
            {true, false, false, true},   // freeprovider
        };

        for (int i = 0; i < cases.length; i++) {
            String domain = cases[i][0].split("@")[1].split("\\.")[0];
            try {
                ValidateRequest req = new ValidateRequest(cases[i][0], null);
                ValidationResponse resp = api.validateEmail(req);
                check(domain + ".status", cases[i][1], resp.getStatus().getValue());
                check(domain + ".action", cases[i][2], resp.getAction().getValue());
                check(domain + ".sub_status", cases[i][3], resp.getSubStatus());
                checkBool(domain + ".free_provider", boolCases[i][0], resp.getFreeProvider());
                checkBool(domain + ".disposable", boolCases[i][1], resp.getDisposable());
                checkBool(domain + ".role_account", boolCases[i][2], resp.getRoleAccount());
                checkBool(domain + ".mx_found", boolCases[i][3], resp.getMxFound());
            } catch (Exception e) {
                failed++;
                System.out.printf("  FAIL: %s error: %s%n", domain, e.getMessage());
            }
        }

        // Error handling: 401 with bad key
        try {
            ApiClient.Companion.setAccessToken("invalid_key");
            EmailValidationApi badApi = new EmailValidationApi("https://api.mailodds.com", ApiClient.Companion.getDefaultClient());
            badApi.validateEmail(new ValidateRequest("test@deliverable.mailodds.com", null));
            failed++;
            System.out.println("  FAIL: error.401 no exception raised");
        } catch (ClientException e) {
            check("error.401", "401", String.valueOf(e.getStatusCode()));
        } finally {
            ApiClient.Companion.setAccessToken(apiKey);
        }

        // Error handling: 400/422 with missing email
        try {
            api.validateEmail(new ValidateRequest("", null));
            failed++;
            System.out.println("  FAIL: error.400 no exception raised");
        } catch (ClientException e) {
            if (e.getStatusCode() == 400 || e.getStatusCode() == 422) { passed++; }
            else { failed++; System.out.printf("  FAIL: error.400 expected=400|422 got=%d%n", e.getStatusCode()); }
        }

        int total = passed + failed;
        String result = failed == 0 ? "PASS" : "FAIL";
        System.out.printf("%n%s: Kotlin SDK (%d/%d)%n", result, passed, total);
        if (failed > 0) System.exit(1);
    }
}
