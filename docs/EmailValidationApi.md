# EmailValidationApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**validateBatch**](EmailValidationApi.md#validateBatch) | **POST** /v1/validate/batch | Validate multiple emails (sync) |
| [**validateEmail**](EmailValidationApi.md#validateEmail) | **POST** /v1/validate | Validate single email |


<a id="validateBatch"></a>
# **validateBatch**
> ValidateBatch200Response validateBatch(validateBatchRequest)

Validate multiple emails (sync)

Validate up to 100 email addresses synchronously. For larger lists, use the bulk jobs API.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailValidationApi()
val validateBatchRequest : ValidateBatchRequest =  // ValidateBatchRequest | 
try {
    val result : ValidateBatch200Response = apiInstance.validateBatch(validateBatchRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailValidationApi#validateBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailValidationApi#validateBatch")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **validateBatchRequest** | [**ValidateBatchRequest**](ValidateBatchRequest.md)|  | |

### Return type

[**ValidateBatch200Response**](ValidateBatch200Response.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="validateEmail"></a>
# **validateEmail**
> ValidationResponse validateEmail(validateRequest)

Validate single email

Validate a single email address. Returns detailed validation results including status, sub-status, and recommended action.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailValidationApi()
val validateRequest : ValidateRequest =  // ValidateRequest | 
try {
    val result : ValidationResponse = apiInstance.validateEmail(validateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailValidationApi#validateEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailValidationApi#validateEmail")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **validateRequest** | [**ValidateRequest**](ValidateRequest.md)|  | |

### Return type

[**ValidationResponse**](ValidationResponse.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

