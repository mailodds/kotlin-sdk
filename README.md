# MailOdds SDK for Kotlin

Official Kotlin client for the [MailOdds Email Validation API](https://mailodds.com/docs).

## Installation

Maven:

```xml
<dependency>
    <groupId>com.mailodds</groupId>
    <artifactId>mailodds-kotlin</artifactId>
    <version>1.0.0</version>
</dependency>
```

Gradle:

```kotlin
implementation("com.mailodds:mailodds-kotlin:1.0.0")
```

## Quick Start

```kotlin
import com.mailodds.apis.EmailValidationApi
import com.mailodds.infrastructure.ApiClient
import com.mailodds.models.ValidateRequest
import com.mailodds.models.ValidationResponse

ApiClient.accessToken = "mo_live_your_api_key"

val api = EmailValidationApi()
val request = ValidateRequest(email = "user@example.com")
val result = api.validateEmail(request)

when (result.action) {
    ValidationResponse.Action.accept -> println("Safe to send")
    ValidationResponse.Action.accept_with_caution -> println("Valid but risky -- flag for review")
    ValidationResponse.Action.reject -> println("Do not send")
    ValidationResponse.Action.retry_later -> println("Temporary failure -- retry after backoff")
}
```

## Response Handling

Branch on the `action` field for decisioning:

| Action | Meaning | Recommended |
|--------|---------|-------------|
| `accept` | Safe to send | Add to mailing list |
| `accept_with_caution` | Valid but risky (catch-all, role account) | Flag for review |
| `reject` | Invalid or disposable | Do not send |
| `retry_later` | Temporary failure | Retry after backoff |

## Test Mode

Use an `mo_test_` prefixed API key with test domains for predictable responses without consuming credits.

## API Reference

Full API documentation: https://mailodds.com/docs
OpenAPI spec: https://mailodds.com/openapi.yaml

## License

MIT
