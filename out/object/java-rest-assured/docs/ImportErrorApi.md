# ImportErrorApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteImportError**](ImportErrorApi.md#deleteImportError) | **DELETE** /importErrors/{import_error_id} | Delete an import error
[**getImportError**](ImportErrorApi.md#getImportError) | **GET** /importErrors/{import_error_id} | Get an import error
[**getImportErrors**](ImportErrorApi.md#getImportErrors) | **GET** /importErrors | Get all import errors


<a name="deleteImportError"></a>
# **deleteImportError**
> deleteImportError(importErrorId)

Delete an import error

### Example
```java
// Import classes:
//import org.openapitools.client.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

ImportErrorApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost/api/v1"))).importError();

api.deleteImportError()
    .importErrorIdPath(importErrorId).execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **importErrorId** | **Integer**| The Import Error ID. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getImportError"></a>
# **getImportError**
> ImportError getImportError(importErrorId)

Get an import error

### Example
```java
// Import classes:
//import org.openapitools.client.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

ImportErrorApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost/api/v1"))).importError();

api.getImportError()
    .importErrorIdPath(importErrorId).execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **importErrorId** | **Integer**| The Import Error ID. |

### Return type

[**ImportError**](ImportError.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getImportErrors"></a>
# **getImportErrors**
> ImportErrorCollection getImportErrors(limit, offset)

Get all import errors

### Example
```java
// Import classes:
//import org.openapitools.client.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

ImportErrorApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost/api/v1"))).importError();

api.getImportErrors().execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| The numbers of items to return. | [optional] [default to 100]
 **offset** | **Integer**| The number of items to skip before starting to collect the result set. | [optional]

### Return type

[**ImportErrorCollection**](ImportErrorCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

