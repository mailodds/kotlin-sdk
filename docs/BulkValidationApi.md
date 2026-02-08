# BulkValidationApi

All URIs are relative to *https://api.mailodds.com/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**cancelJob**](BulkValidationApi.md#cancelJob) | **POST** /v1/jobs/{job_id}/cancel | Cancel a job |
| [**createJob**](BulkValidationApi.md#createJob) | **POST** /v1/jobs | Create bulk validation job (JSON) |
| [**createJobFromS3**](BulkValidationApi.md#createJobFromS3) | **POST** /v1/jobs/upload/s3 | Create job from S3 upload |
| [**createJobUpload**](BulkValidationApi.md#createJobUpload) | **POST** /v1/jobs/upload | Create bulk validation job (file upload) |
| [**deleteJob**](BulkValidationApi.md#deleteJob) | **DELETE** /v1/jobs/{job_id} | Delete a job |
| [**getJob**](BulkValidationApi.md#getJob) | **GET** /v1/jobs/{job_id} | Get job status |
| [**getJobResults**](BulkValidationApi.md#getJobResults) | **GET** /v1/jobs/{job_id}/results | Get job results |
| [**getPresignedUpload**](BulkValidationApi.md#getPresignedUpload) | **POST** /v1/jobs/upload/presigned | Get S3 presigned upload URL |
| [**listJobs**](BulkValidationApi.md#listJobs) | **GET** /v1/jobs | List validation jobs |


<a id="cancelJob"></a>
# **cancelJob**
> JobResponse cancelJob(jobId)

Cancel a job

Cancel a pending or processing job. Partial results are preserved.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BulkValidationApi()
val jobId : kotlin.String = jobId_example // kotlin.String | 
try {
    val result : JobResponse = apiInstance.cancelJob(jobId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BulkValidationApi#cancelJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BulkValidationApi#cancelJob")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **kotlin.String**|  | |

### Return type

[**JobResponse**](JobResponse.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="createJob"></a>
# **createJob**
> JobResponse createJob(createJobRequest)

Create bulk validation job (JSON)

Create a new bulk validation job by submitting a JSON array of emails.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BulkValidationApi()
val createJobRequest : CreateJobRequest =  // CreateJobRequest | 
try {
    val result : JobResponse = apiInstance.createJob(createJobRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BulkValidationApi#createJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BulkValidationApi#createJob")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createJobRequest** | [**CreateJobRequest**](CreateJobRequest.md)|  | |

### Return type

[**JobResponse**](JobResponse.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createJobFromS3"></a>
# **createJobFromS3**
> JobResponse createJobFromS3(createJobFromS3Request)

Create job from S3 upload

Create a validation job from a file previously uploaded to S3.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BulkValidationApi()
val createJobFromS3Request : CreateJobFromS3Request =  // CreateJobFromS3Request | 
try {
    val result : JobResponse = apiInstance.createJobFromS3(createJobFromS3Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BulkValidationApi#createJobFromS3")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BulkValidationApi#createJobFromS3")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createJobFromS3Request** | [**CreateJobFromS3Request**](CreateJobFromS3Request.md)|  | |

### Return type

[**JobResponse**](JobResponse.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createJobUpload"></a>
# **createJobUpload**
> JobResponse createJobUpload(file, dedup, metadata)

Create bulk validation job (file upload)

Create a new bulk validation job by uploading a CSV, Excel, or TXT file.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BulkValidationApi()
val file : java.io.File = BINARY_DATA_HERE // java.io.File | CSV, Excel (.xlsx, .xls), ODS, or TXT file
val dedup : kotlin.Boolean = true // kotlin.Boolean | Remove duplicate emails
val metadata : kotlin.String = metadata_example // kotlin.String | JSON metadata for the job
try {
    val result : JobResponse = apiInstance.createJobUpload(file, dedup, metadata)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BulkValidationApi#createJobUpload")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BulkValidationApi#createJobUpload")
    e.printStackTrace()
}
```

### Parameters
| **file** | **java.io.File**| CSV, Excel (.xlsx, .xls), ODS, or TXT file | |
| **dedup** | **kotlin.Boolean**| Remove duplicate emails | [optional] [default to false] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **metadata** | **kotlin.String**| JSON metadata for the job | [optional] |

### Return type

[**JobResponse**](JobResponse.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a id="deleteJob"></a>
# **deleteJob**
> DeleteJob200Response deleteJob(jobId)

Delete a job

Permanently delete a completed or cancelled job and its results.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BulkValidationApi()
val jobId : kotlin.String = jobId_example // kotlin.String | 
try {
    val result : DeleteJob200Response = apiInstance.deleteJob(jobId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BulkValidationApi#deleteJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BulkValidationApi#deleteJob")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **kotlin.String**|  | |

### Return type

[**DeleteJob200Response**](DeleteJob200Response.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getJob"></a>
# **getJob**
> JobResponse getJob(jobId)

Get job status

Get the status and details of a specific validation job.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BulkValidationApi()
val jobId : kotlin.String = jobId_example // kotlin.String | 
try {
    val result : JobResponse = apiInstance.getJob(jobId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BulkValidationApi#getJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BulkValidationApi#getJob")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **kotlin.String**|  | |

### Return type

[**JobResponse**](JobResponse.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getJobResults"></a>
# **getJobResults**
> ResultsResponse getJobResults(jobId, format, filter, page, perPage)

Get job results

Download validation results in JSON, CSV, or NDJSON format.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BulkValidationApi()
val jobId : kotlin.String = jobId_example // kotlin.String | 
val format : kotlin.String = format_example // kotlin.String | 
val filter : kotlin.String = filter_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | 
val perPage : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ResultsResponse = apiInstance.getJobResults(jobId, format, filter, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BulkValidationApi#getJobResults")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BulkValidationApi#getJobResults")
    e.printStackTrace()
}
```

### Parameters
| **jobId** | **kotlin.String**|  | |
| **format** | **kotlin.String**|  | [optional] [default to Format.json] [enum: json, csv, ndjson] |
| **filter** | **kotlin.String**|  | [optional] [enum: all, valid_only, invalid_only] |
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **perPage** | **kotlin.Int**|  | [optional] [default to 1000] |

### Return type

[**ResultsResponse**](ResultsResponse.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/x-ndjson

<a id="getPresignedUpload"></a>
# **getPresignedUpload**
> PresignedUploadResponse getPresignedUpload(getPresignedUploadRequest)

Get S3 presigned upload URL

Get a presigned URL for uploading large files (&gt;10MB) directly to S3.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BulkValidationApi()
val getPresignedUploadRequest : GetPresignedUploadRequest =  // GetPresignedUploadRequest | 
try {
    val result : PresignedUploadResponse = apiInstance.getPresignedUpload(getPresignedUploadRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BulkValidationApi#getPresignedUpload")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BulkValidationApi#getPresignedUpload")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **getPresignedUploadRequest** | [**GetPresignedUploadRequest**](GetPresignedUploadRequest.md)|  | |

### Return type

[**PresignedUploadResponse**](PresignedUploadResponse.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="listJobs"></a>
# **listJobs**
> JobListResponse listJobs(page, perPage, status)

List validation jobs

List all validation jobs for the authenticated account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BulkValidationApi()
val page : kotlin.Int = 56 // kotlin.Int | 
val perPage : kotlin.Int = 56 // kotlin.Int | 
val status : kotlin.String = status_example // kotlin.String | 
try {
    val result : JobListResponse = apiInstance.listJobs(page, perPage, status)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BulkValidationApi#listJobs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BulkValidationApi#listJobs")
    e.printStackTrace()
}
```

### Parameters
| **page** | **kotlin.Int**|  | [optional] [default to 1] |
| **perPage** | **kotlin.Int**|  | [optional] [default to 20] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **status** | **kotlin.String**|  | [optional] [enum: pending, processing, completed, failed, cancelled] |

### Return type

[**JobListResponse**](JobListResponse.md)

### Authorization


Configure BearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

