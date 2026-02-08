
# ValidationResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **schemaVersion** | **kotlin.String** |  |  |
| **email** | **kotlin.String** |  |  |
| **status** | [**inline**](#Status) | Validation status |  |
| **action** | [**inline**](#Action) | Recommended action |  |
| **domain** | **kotlin.String** |  |  |
| **mxFound** | **kotlin.Boolean** | Whether MX records were found for the domain |  |
| **disposable** | **kotlin.Boolean** | Whether domain is a known disposable email provider |  |
| **roleAccount** | **kotlin.Boolean** | Whether address is a role account (e.g., info@, admin@) |  |
| **freeProvider** | **kotlin.Boolean** | Whether domain is a known free email provider (e.g., gmail.com) |  |
| **depth** | [**inline**](#Depth) | Validation depth used for this check |  |
| **processedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO 8601 timestamp of validation |  |
| **subStatus** | [**inline**](#SubStatus) | Detailed status reason. Omitted when none. |  [optional] |
| **mxHost** | **kotlin.String** | Primary MX hostname. Omitted when MX not resolved. |  [optional] |
| **smtpCheck** | **kotlin.Boolean** | Whether SMTP verification passed. Omitted when SMTP not checked. |  [optional] |
| **catchAll** | **kotlin.Boolean** | Whether domain is catch-all. Omitted when SMTP not checked. |  [optional] |
| **suggestedEmail** | **kotlin.String** | Typo correction suggestion. Omitted when no typo detected. |  [optional] |
| **retryAfterMs** | **kotlin.Int** | Suggested retry delay in milliseconds. Present only for retry_later action. |  [optional] |
| **suppressionMatch** | [**ValidationResponseSuppressionMatch**](ValidationResponseSuppressionMatch.md) |  |  [optional] |
| **policyApplied** | [**ValidationResponsePolicyApplied**](ValidationResponsePolicyApplied.md) |  |  [optional] |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | valid, invalid, catch_all, do_not_mail, unknown |


<a id="Action"></a>
## Enum: action
| Name | Value |
| ---- | ----- |
| action | accept, accept_with_caution, reject, retry_later |


<a id="Depth"></a>
## Enum: depth
| Name | Value |
| ---- | ----- |
| depth | standard, enhanced |


<a id="SubStatus"></a>
## Enum: sub_status
| Name | Value |
| ---- | ----- |
| subStatus | format_invalid, mx_missing, mx_timeout, smtp_unreachable, smtp_rejected, disposable, role_account, greylisted, catch_all_detected, suppression_match |



