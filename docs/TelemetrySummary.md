
# TelemetrySummary

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **schemaVersion** | **kotlin.String** |  |  [optional] |
| **window** | [**inline**](#Window) |  |  [optional] |
| **generatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **timezone** | **kotlin.String** |  |  [optional] |
| **totals** | [**TelemetrySummaryTotals**](TelemetrySummaryTotals.md) |  |  [optional] |
| **rates** | [**TelemetrySummaryRates**](TelemetrySummaryRates.md) |  |  [optional] |
| **topReasons** | [**kotlin.collections.List&lt;TelemetrySummaryTopReasonsInner&gt;**](TelemetrySummaryTopReasonsInner.md) | Top rejection/status reasons |  [optional] |
| **topDomains** | [**kotlin.collections.List&lt;TelemetrySummaryTopDomainsInner&gt;**](TelemetrySummaryTopDomainsInner.md) | Top domains by volume |  [optional] |


<a id="Window"></a>
## Enum: window
| Name | Value |
| ---- | ----- |
| window | 1h, 24h, 30d |



