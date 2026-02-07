
# CreateJobRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **emails** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of emails to validate |  |
| **dedup** | **kotlin.Boolean** | Remove duplicate emails |  [optional] |
| **metadata** | [**kotlin.Any**](.md) | Custom metadata for the job |  [optional] |
| **webhookUrl** | [**java.net.URI**](java.net.URI.md) | URL for completion webhook |  [optional] |
| **idempotencyKey** | **kotlin.String** | Unique key for idempotent requests |  [optional] |



