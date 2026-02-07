
# ValidationResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **email** | **kotlin.String** |  |  |
| **status** | [**inline**](#Status) | Validation status |  |
| **action** | [**inline**](#Action) | Recommended action |  |
| **schemaVersion** | **kotlin.String** |  |  [optional] |
| **subStatus** | **kotlin.String** | Detailed status reason |  [optional] |
| **domain** | **kotlin.String** |  |  [optional] |
| **mxFound** | **kotlin.Boolean** |  |  [optional] |
| **smtpCheck** | **kotlin.Boolean** |  |  [optional] |
| **disposable** | **kotlin.Boolean** |  |  [optional] |
| **roleAccount** | **kotlin.Boolean** |  |  [optional] |
| **freeProvider** | **kotlin.Boolean** |  |  [optional] |
| **suppressionMatch** | [**ValidationResponseSuppressionMatch**](ValidationResponseSuppressionMatch.md) |  |  [optional] |


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



