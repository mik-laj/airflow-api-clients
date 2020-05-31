# \XComApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteXComValue**](XComApi.md#DeleteXComValue) | **Delete** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key} | Delete an XCom entry
[**GetXComEntry**](XComApi.md#GetXComEntry) | **Get** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries | Get all XCom entries
[**GetXComValue**](XComApi.md#GetXComValue) | **Get** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key} | Get an XCom entry
[**UpdateXComEntry**](XComApi.md#UpdateXComEntry) | **Post** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries | Create an XCom entry
[**UpdateXComValue**](XComApi.md#UpdateXComValue) | **Patch** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key} | Update an XCom entry



## DeleteXComValue

> DeleteXComValue(ctx, dagId, dagRunId, taskId, key)

Delete an XCom entry

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**dagId** | **string**| The DAG ID. | 
**dagRunId** | **string**| The DAG Run ID. | 
**taskId** | **string**| The Task ID. | 
**key** | **string**| The XCom Key. | 

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetXComEntry

> XComCollection GetXComEntry(ctx, dagId, dagRunId, taskId, optional)

Get all XCom entries

This endpoint allows specifying `~` as the dag_id, dag_run_id, task_id to retrieve XCOM entries for for all DAGs, DAG Runs and task instances.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**dagId** | **string**| The DAG ID. | 
**dagRunId** | **string**| The DAG Run ID. | 
**taskId** | **string**| The Task ID. | 
 **optional** | ***GetXComEntryOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a GetXComEntryOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



 **limit** | **optional.Int32**| The numbers of items to return. | [default to 100]
 **offset** | **optional.Int32**| The number of items to skip before starting to collect the result set. | 

### Return type

[**XComCollection**](XComCollection.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetXComValue

> XCom GetXComValue(ctx, dagId, dagRunId, taskId, key)

Get an XCom entry

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**dagId** | **string**| The DAG ID. | 
**dagRunId** | **string**| The DAG Run ID. | 
**taskId** | **string**| The Task ID. | 
**key** | **string**| The XCom Key. | 

### Return type

[**XCom**](XCom.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateXComEntry

> XCom UpdateXComEntry(ctx, dagId, dagRunId, taskId, xCom)

Create an XCom entry

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**dagId** | **string**| The DAG ID. | 
**dagRunId** | **string**| The DAG Run ID. | 
**taskId** | **string**| The Task ID. | 
**xCom** | [**XCom**](XCom.md)|  | 

### Return type

[**XCom**](XCom.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateXComValue

> XCom UpdateXComValue(ctx, dagId, dagRunId, taskId, key, xCom, optional)

Update an XCom entry

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**dagId** | **string**| The DAG ID. | 
**dagRunId** | **string**| The DAG Run ID. | 
**taskId** | **string**| The Task ID. | 
**key** | **string**| The XCom Key. | 
**xCom** | [**XCom**](XCom.md)|  | 
 **optional** | ***UpdateXComValueOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a UpdateXComValueOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------





 **updateMask** | [**optional.Interface of []string**](string.md)| The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  | 

### Return type

[**XCom**](XCom.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

