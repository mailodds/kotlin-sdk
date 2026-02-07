# EmailValidationApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**validateEmail**](EmailValidationApi.md#validateEmail) | **POST** /v1/validate | Validate single email |


<a id="validateEmail"></a>
# **validateEmail**
> ValidationResponse validateEmail(validateRequest)

Validate single email

Validate a single email address. Returns detailed validation results including status, sub-status, and recommended action.

### Example
```kotlin
// Import classes:
//import com.mailodds.infrastructure.*
//import com.mailodds.models.*

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

