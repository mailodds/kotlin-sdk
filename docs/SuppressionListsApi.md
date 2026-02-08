# SuppressionListsApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addSuppression**](SuppressionListsApi.md#addSuppression) | **POST** /v1/suppression | Add suppression entries |
| [**checkSuppression**](SuppressionListsApi.md#checkSuppression) | **POST** /v1/suppression/check | Check suppression status |
| [**getSuppressionStats**](SuppressionListsApi.md#getSuppressionStats) | **GET** /v1/suppression/stats | Get suppression statistics |
| [**listSuppression**](SuppressionListsApi.md#listSuppression) | **GET** /v1/suppression | List suppression entries |
| [**removeSuppression**](SuppressionListsApi.md#removeSuppression) | **DELETE** /v1/suppression | Remove suppression entries |


<a id="addSuppression"></a>
# **addSuppression**
> AddSuppressionResponse addSuppression(addSuppressionRequest)

Add suppression entries

Add emails or domains to the suppression list.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SuppressionListsApi()
val addSuppressionRequest : AddSuppressionRequest =  // AddSuppressionRequest | 
try {
    val result : AddSuppressionResponse = apiInstance.addSuppression(addSuppressionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SuppressionListsApi#addSuppression")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SuppressionListsApi#addSuppression")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **addSuppressionRequest** | [**AddSuppressionRequest**](AddSuppressionRequest.md)|  | |

### Return type

[**AddSuppressionResponse**](AddSuppressionResponse.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="checkSuppression"></a>
# **checkSuppression**
> SuppressionCheckResponse checkSuppression(checkSuppressionRequest)

Check suppression status

Check if an email is suppressed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SuppressionListsApi()
val checkSuppressionRequest : CheckSuppressionRequest =  // CheckSuppressionRequest | 
try {
    val result : SuppressionCheckResponse = apiInstance.checkSuppression(checkSuppressionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SuppressionListsApi#checkSuppression")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SuppressionListsApi#checkSuppression")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **checkSuppressionRequest** | [**CheckSuppressionRequest**](CheckSuppressionRequest.md)|  | |

### Return type

[**SuppressionCheckResponse**](SuppressionCheckResponse.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getSuppressionStats"></a>
# **getSuppressionStats**
> SuppressionStatsResponse getSuppressionStats()

Get suppression statistics

Get statistics about the suppression list.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SuppressionListsApi()
try {
    val result : SuppressionStatsResponse = apiInstance.getSuppressionStats()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SuppressionListsApi#getSuppressionStats")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SuppressionListsApi#getSuppressionStats")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SuppressionStatsResponse**](SuppressionStatsResponse.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listSuppression"></a>
# **listSuppression**
> SuppressionListResponse listSuppression(page, perPage, type, search)

List suppression entries

List all suppression entries for the account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SuppressionListsApi()
val page : kotlin.Int = 56 // kotlin.Int | 
val perPage : kotlin.Int = 56 // kotlin.Int | 
val type : kotlin.String = type_example // kotlin.String | 
val search : kotlin.String = search_example // kotlin.String | 
try {
    val result : SuppressionListResponse = apiInstance.listSuppression(page, perPage, type, search)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SuppressionListsApi#listSuppression")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SuppressionListsApi#listSuppression")
    e.printStackTrace()
}
```

### Parameters
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| **perPage** | **kotlin.Int**|  | [optional] [default to 50] |
| **type** | **kotlin.String**|  | [optional] [enum: email, domain] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **search** | **kotlin.String**|  | [optional] |

### Return type

[**SuppressionListResponse**](SuppressionListResponse.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="removeSuppression"></a>
# **removeSuppression**
> RemoveSuppression200Response removeSuppression(removeSuppressionRequest)

Remove suppression entries

Remove emails or domains from the suppression list.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SuppressionListsApi()
val removeSuppressionRequest : RemoveSuppressionRequest =  // RemoveSuppressionRequest | 
try {
    val result : RemoveSuppression200Response = apiInstance.removeSuppression(removeSuppressionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SuppressionListsApi#removeSuppression")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SuppressionListsApi#removeSuppression")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **removeSuppressionRequest** | [**RemoveSuppressionRequest**](RemoveSuppressionRequest.md)|  | |

### Return type

[**RemoveSuppression200Response**](RemoveSuppression200Response.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

