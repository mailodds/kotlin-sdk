# SystemApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getTelemetrySummary**](SystemApi.md#getTelemetrySummary) | **GET** /v1/telemetry/summary | Get validation telemetry |
| [**healthCheck**](SystemApi.md#healthCheck) | **GET** /health | Health check |


<a id="getTelemetrySummary"></a>
# **getTelemetrySummary**
> TelemetrySummary getTelemetrySummary(window)

Get validation telemetry

Get validation metrics for your account. Useful for building dashboards and monitoring. Supports ETag caching.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SystemApi()
val window : kotlin.String = window_example // kotlin.String | Time window for metrics
try {
    val result : TelemetrySummary = apiInstance.getTelemetrySummary(window)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SystemApi#getTelemetrySummary")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SystemApi#getTelemetrySummary")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **window** | **kotlin.String**| Time window for metrics | [optional] [default to Window._24h] [enum: 1h, 24h, 30d] |

### Return type

[**TelemetrySummary**](TelemetrySummary.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="healthCheck"></a>
# **healthCheck**
> HealthCheck200Response healthCheck()

Health check

Check API health status. No authentication required.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SystemApi()
try {
    val result : HealthCheck200Response = apiInstance.healthCheck()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SystemApi#healthCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SystemApi#healthCheck")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**HealthCheck200Response**](HealthCheck200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

