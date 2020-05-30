# XComApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteXComValue**](XComApi.md#deleteXComValue) | **DELETE** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key} | Delete an XCom entry
[**getXComEntry**](XComApi.md#getXComEntry) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries | Get all XCom entries
[**getXComValue**](XComApi.md#getXComValue) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key} | Get an XCom entry
[**updateXComEntry**](XComApi.md#updateXComEntry) | **POST** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries | Create an XCom entry
[**updateXComValue**](XComApi.md#updateXComValue) | **PATCH** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key} | Update an XCom entry


<a name="deleteXComValue"></a>
# **deleteXComValue**
> deleteXComValue(dagId, dagRunId, taskId, xcomKey)

Delete an XCom entry

### Example
```java
// Import classes:
//import org.openapitools.client.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

XComApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost/api/v1"))).xCom();

api.deleteXComValue()
    .dagIdPath(dagId)
    .dagRunIdPath(dagRunId)
    .taskIdPath(taskId)
    .xcomKeyPath(xcomKey).execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **String**| The DAG ID. |
 **dagRunId** | **String**| The DAG Run ID. |
 **taskId** | **String**| The Task ID. |
 **xcomKey** | **String**| The XCom Key. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getXComEntry"></a>
# **getXComEntry**
> XComCollection getXComEntry(dagId, dagRunId, taskId, limit, offset)

Get all XCom entries

This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id, task_id to retrieve XCOM entries for for all DAGs, DAG Runs and task instances.

### Example
```java
// Import classes:
//import org.openapitools.client.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

XComApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost/api/v1"))).xCom();

api.getXComEntry()
    .dagIdPath(dagId)
    .dagRunIdPath(dagRunId)
    .taskIdPath(taskId).execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **String**| The DAG ID. |
 **dagRunId** | **String**| The DAG Run ID. |
 **taskId** | **String**| The Task ID. |
 **limit** | **Integer**| The numbers of items to return. | [optional] [default to 100]
 **offset** | **Integer**| The number of items to skip before starting to collect the result set. | [optional]

### Return type

[**XComCollection**](XComCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getXComValue"></a>
# **getXComValue**
> XCom getXComValue(dagId, dagRunId, taskId, xcomKey)

Get an XCom entry

### Example
```java
// Import classes:
//import org.openapitools.client.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

XComApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost/api/v1"))).xCom();

api.getXComValue()
    .dagIdPath(dagId)
    .dagRunIdPath(dagRunId)
    .taskIdPath(taskId)
    .xcomKeyPath(xcomKey).execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **String**| The DAG ID. |
 **dagRunId** | **String**| The DAG Run ID. |
 **taskId** | **String**| The Task ID. |
 **xcomKey** | **String**| The XCom Key. |

### Return type

[**XCom**](XCom.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateXComEntry"></a>
# **updateXComEntry**
> XCom updateXComEntry(dagId, dagRunId, taskId, xcom)

Create an XCom entry

### Example
```java
// Import classes:
//import org.openapitools.client.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

XComApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost/api/v1"))).xCom();

api.updateXComEntry()
    .dagIdPath(dagId)
    .dagRunIdPath(dagRunId)
    .taskIdPath(taskId)
    .body(xcom).execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **String**| The DAG ID. |
 **dagRunId** | **String**| The DAG Run ID. |
 **taskId** | **String**| The Task ID. |
 **xcom** | [**XCom**](XCom.md)|  |

### Return type

[**XCom**](XCom.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateXComValue"></a>
# **updateXComValue**
> XCom updateXComValue(dagId, dagRunId, taskId, xcomKey, xcom, updateMask)

Update an XCom entry

### Example
```java
// Import classes:
//import org.openapitools.client.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

XComApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost/api/v1"))).xCom();

api.updateXComValue()
    .dagIdPath(dagId)
    .dagRunIdPath(dagRunId)
    .taskIdPath(taskId)
    .xcomKeyPath(xcomKey)
    .body(xcom).execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **String**| The DAG ID. |
 **dagRunId** | **String**| The DAG Run ID. |
 **taskId** | **String**| The Task ID. |
 **xcomKey** | **String**| The XCom Key. |
 **xcom** | [**XCom**](XCom.md)|  |
 **updateMask** | [**List&lt;String&gt;**](String.md)| The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  | [optional] [default to new ArrayList&lt;String&gt;()]

### Return type

[**XCom**](XCom.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

