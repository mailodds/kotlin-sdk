
# Job

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **status** | [**inline**](#Status) |  |  [optional] |
| **totalCount** | **kotlin.Int** |  |  [optional] |
| **processedCount** | **kotlin.Int** |  |  [optional] |
| **progressPercent** | **kotlin.Int** |  |  [optional] |
| **summary** | [**JobSummary**](JobSummary.md) |  |  [optional] |
| **createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **completedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **metadata** | [**kotlin.Any**](.md) |  |  [optional] |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | pending, processing, completed, failed, cancelled |



