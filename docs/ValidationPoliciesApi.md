# ValidationPoliciesApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addPolicyRule**](ValidationPoliciesApi.md#addPolicyRule) | **POST** /v1/policies/{policy_id}/rules | Add rule to policy |
| [**createPolicy**](ValidationPoliciesApi.md#createPolicy) | **POST** /v1/policies | Create policy |
| [**createPolicyFromPreset**](ValidationPoliciesApi.md#createPolicyFromPreset) | **POST** /v1/policies/from-preset | Create policy from preset |
| [**deletePolicy**](ValidationPoliciesApi.md#deletePolicy) | **DELETE** /v1/policies/{policy_id} | Delete policy |
| [**deletePolicyRule**](ValidationPoliciesApi.md#deletePolicyRule) | **DELETE** /v1/policies/{policy_id}/rules/{rule_id} | Delete rule |
| [**getPolicy**](ValidationPoliciesApi.md#getPolicy) | **GET** /v1/policies/{policy_id} | Get policy |
| [**getPolicyPresets**](ValidationPoliciesApi.md#getPolicyPresets) | **GET** /v1/policies/presets | Get policy presets |
| [**listPolicies**](ValidationPoliciesApi.md#listPolicies) | **GET** /v1/policies | List policies |
| [**testPolicy**](ValidationPoliciesApi.md#testPolicy) | **POST** /v1/policies/test | Test policy evaluation |
| [**updatePolicy**](ValidationPoliciesApi.md#updatePolicy) | **PUT** /v1/policies/{policy_id} | Update policy |


<a id="addPolicyRule"></a>
# **addPolicyRule**
> AddPolicyRule201Response addPolicyRule(policyId, policyRule)

Add rule to policy

Add a new rule to an existing policy.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ValidationPoliciesApi()
val policyId : kotlin.Int = 56 // kotlin.Int | 
val policyRule : PolicyRule =  // PolicyRule | 
try {
    val result : AddPolicyRule201Response = apiInstance.addPolicyRule(policyId, policyRule)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ValidationPoliciesApi#addPolicyRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ValidationPoliciesApi#addPolicyRule")
    e.printStackTrace()
}
```

### Parameters
| **policyId** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **policyRule** | [**PolicyRule**](PolicyRule.md)|  | |

### Return type

[**AddPolicyRule201Response**](AddPolicyRule201Response.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createPolicy"></a>
# **createPolicy**
> PolicyResponse createPolicy(createPolicyRequest)

Create policy

Create a new validation policy with rules.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ValidationPoliciesApi()
val createPolicyRequest : CreatePolicyRequest =  // CreatePolicyRequest | 
try {
    val result : PolicyResponse = apiInstance.createPolicy(createPolicyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ValidationPoliciesApi#createPolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ValidationPoliciesApi#createPolicy")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createPolicyRequest** | [**CreatePolicyRequest**](CreatePolicyRequest.md)|  | |

### Return type

[**PolicyResponse**](PolicyResponse.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createPolicyFromPreset"></a>
# **createPolicyFromPreset**
> PolicyResponse createPolicyFromPreset(createPolicyFromPresetRequest)

Create policy from preset

Create a policy using a preset template.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ValidationPoliciesApi()
val createPolicyFromPresetRequest : CreatePolicyFromPresetRequest =  // CreatePolicyFromPresetRequest | 
try {
    val result : PolicyResponse = apiInstance.createPolicyFromPreset(createPolicyFromPresetRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ValidationPoliciesApi#createPolicyFromPreset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ValidationPoliciesApi#createPolicyFromPreset")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createPolicyFromPresetRequest** | [**CreatePolicyFromPresetRequest**](CreatePolicyFromPresetRequest.md)|  | |

### Return type

[**PolicyResponse**](PolicyResponse.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deletePolicy"></a>
# **deletePolicy**
> DeletePolicy200Response deletePolicy(policyId)

Delete policy

Delete a policy and all its rules.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ValidationPoliciesApi()
val policyId : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : DeletePolicy200Response = apiInstance.deletePolicy(policyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ValidationPoliciesApi#deletePolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ValidationPoliciesApi#deletePolicy")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **policyId** | **kotlin.Int**|  | |

### Return type

[**DeletePolicy200Response**](DeletePolicy200Response.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deletePolicyRule"></a>
# **deletePolicyRule**
> DeletePolicyRule200Response deletePolicyRule(policyId, ruleId)

Delete rule

Delete a rule from a policy.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ValidationPoliciesApi()
val policyId : kotlin.Int = 56 // kotlin.Int | 
val ruleId : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : DeletePolicyRule200Response = apiInstance.deletePolicyRule(policyId, ruleId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ValidationPoliciesApi#deletePolicyRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ValidationPoliciesApi#deletePolicyRule")
    e.printStackTrace()
}
```

### Parameters
| **policyId** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleId** | **kotlin.Int**|  | |

### Return type

[**DeletePolicyRule200Response**](DeletePolicyRule200Response.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPolicy"></a>
# **getPolicy**
> PolicyResponse getPolicy(policyId)

Get policy

Get a single policy with its rules.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ValidationPoliciesApi()
val policyId : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : PolicyResponse = apiInstance.getPolicy(policyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ValidationPoliciesApi#getPolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ValidationPoliciesApi#getPolicy")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **policyId** | **kotlin.Int**|  | |

### Return type

[**PolicyResponse**](PolicyResponse.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPolicyPresets"></a>
# **getPolicyPresets**
> PolicyPresetsResponse getPolicyPresets()

Get policy presets

Get available preset templates for quick policy creation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ValidationPoliciesApi()
try {
    val result : PolicyPresetsResponse = apiInstance.getPolicyPresets()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ValidationPoliciesApi#getPolicyPresets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ValidationPoliciesApi#getPolicyPresets")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PolicyPresetsResponse**](PolicyPresetsResponse.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listPolicies"></a>
# **listPolicies**
> PolicyListResponse listPolicies(includeRules)

List policies

List all validation policies for your account. Includes plan limits.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ValidationPoliciesApi()
val includeRules : kotlin.Boolean = true // kotlin.Boolean | Include full rules in response
try {
    val result : PolicyListResponse = apiInstance.listPolicies(includeRules)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ValidationPoliciesApi#listPolicies")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ValidationPoliciesApi#listPolicies")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **includeRules** | **kotlin.Boolean**| Include full rules in response | [optional] [default to false] |

### Return type

[**PolicyListResponse**](PolicyListResponse.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="testPolicy"></a>
# **testPolicy**
> PolicyTestResponse testPolicy(testPolicyRequest)

Test policy evaluation

Test how a policy would evaluate a validation result without affecting production.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ValidationPoliciesApi()
val testPolicyRequest : TestPolicyRequest =  // TestPolicyRequest | 
try {
    val result : PolicyTestResponse = apiInstance.testPolicy(testPolicyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ValidationPoliciesApi#testPolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ValidationPoliciesApi#testPolicy")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **testPolicyRequest** | [**TestPolicyRequest**](TestPolicyRequest.md)|  | |

### Return type

[**PolicyTestResponse**](PolicyTestResponse.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updatePolicy"></a>
# **updatePolicy**
> PolicyResponse updatePolicy(policyId, updatePolicyRequest)

Update policy

Update a policy&#39;s settings (name, enabled, default).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ValidationPoliciesApi()
val policyId : kotlin.Int = 56 // kotlin.Int | 
val updatePolicyRequest : UpdatePolicyRequest =  // UpdatePolicyRequest | 
try {
    val result : PolicyResponse = apiInstance.updatePolicy(policyId, updatePolicyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ValidationPoliciesApi#updatePolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ValidationPoliciesApi#updatePolicy")
    e.printStackTrace()
}
```

### Parameters
| **policyId** | **kotlin.Int**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updatePolicyRequest** | [**UpdatePolicyRequest**](UpdatePolicyRequest.md)|  | |

### Return type

[**PolicyResponse**](PolicyResponse.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

