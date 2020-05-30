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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **String**| The DAG ID. | [default to null]
 **dagRunId** | **String**| The DAG Run ID. | [default to null]
 **taskId** | **String**| The Task ID. | [default to null]
 **xcomKey** | **String**| The XCom Key. | [default to null]

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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **String**| The DAG ID. | [default to null]
 **dagRunId** | **String**| The DAG Run ID. | [default to null]
 **taskId** | **String**| The Task ID. | [default to null]
 **limit** | **Integer**| The numbers of items to return. | [optional] [default to 100]
 **offset** | **Integer**| The number of items to skip before starting to collect the result set. | [optional] [default to null]

### Return type

[**XComCollection**](..//Models/XComCollection.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getXComValue"></a>
# **getXComValue**
> XCom getXComValue(dagId, dagRunId, taskId, xcomKey)

Get an XCom entry

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **String**| The DAG ID. | [default to null]
 **dagRunId** | **String**| The DAG Run ID. | [default to null]
 **taskId** | **String**| The Task ID. | [default to null]
 **xcomKey** | **String**| The XCom Key. | [default to null]

### Return type

[**XCom**](..//Models/XCom.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="updateXComEntry"></a>
# **updateXComEntry**
> XCom updateXComEntry(dagId, dagRunId, taskId, xCom)

Create an XCom entry

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **String**| The DAG ID. | [default to null]
 **dagRunId** | **String**| The DAG Run ID. | [default to null]
 **taskId** | **String**| The Task ID. | [default to null]
 **xCom** | [**XCom**](..//Models/XCom.md)|  |

### Return type

[**XCom**](..//Models/XCom.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="updateXComValue"></a>
# **updateXComValue**
> XCom updateXComValue(dagId, dagRunId, taskId, xcomKey, xCom, updateMask)

Update an XCom entry

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **String**| The DAG ID. | [default to null]
 **dagRunId** | **String**| The DAG Run ID. | [default to null]
 **taskId** | **String**| The Task ID. | [default to null]
 **xcomKey** | **String**| The XCom Key. | [default to null]
 **xCom** | [**XCom**](..//Models/XCom.md)|  |
 **updateMask** | [**List**](..//Models/String.md)| The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  | [optional] [default to null]

### Return type

[**XCom**](..//Models/XCom.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

