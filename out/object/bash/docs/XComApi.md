# XComApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteXComValue**](XComApi.md#deleteXComValue) | **DELETE** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key} | Delete an XCom entry
[**getXComEntry**](XComApi.md#getXComEntry) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries | Get all XCom entries
[**getXComValue**](XComApi.md#getXComValue) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key} | Get an XCom entry
[**updateXComEntry**](XComApi.md#updateXComEntry) | **POST** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries | Create an XCom entry
[**updateXComValue**](XComApi.md#updateXComValue) | **PATCH** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key} | Update an XCom entry



## deleteXComValue

Delete an XCom entry

### Example

```bash
 deleteXComValue dag_id=value dag_run_id=value task_id=value xcom_key=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **string** | The DAG ID. | [default to null]
 **dagRunId** | **string** | The DAG Run ID. | [default to null]
 **taskId** | **string** | The Task ID. | [default to null]
 **xcomKey** | **string** | The XCom Key. | [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getXComEntry

Get all XCom entries

This endpoint allows specifying '~' as the dag_id, dag_run_id, task_id to retrieve XCOM entries for for all DAGs, DAG Runs and task instances.

### Example

```bash
 getXComEntry dag_id=value dag_run_id=value task_id=value  limit=value  offset=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **string** | The DAG ID. | [default to null]
 **dagRunId** | **string** | The DAG Run ID. | [default to null]
 **taskId** | **string** | The Task ID. | [default to null]
 **limit** | **integer** | The numbers of items to return. | [optional] [default to 100]
 **offset** | **integer** | The number of items to skip before starting to collect the result set. | [optional] [default to null]

### Return type

[**XComCollection**](XComCollection.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getXComValue

Get an XCom entry

### Example

```bash
 getXComValue dag_id=value dag_run_id=value task_id=value xcom_key=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **string** | The DAG ID. | [default to null]
 **dagRunId** | **string** | The DAG Run ID. | [default to null]
 **taskId** | **string** | The Task ID. | [default to null]
 **xcomKey** | **string** | The XCom Key. | [default to null]

### Return type

[**XCom**](XCom.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updateXComEntry

Create an XCom entry

### Example

```bash
 updateXComEntry dag_id=value dag_run_id=value task_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **string** | The DAG ID. | [default to null]
 **dagRunId** | **string** | The DAG Run ID. | [default to null]
 **taskId** | **string** | The Task ID. | [default to null]
 **xCom** | [**XCom**](XCom.md) |  |

### Return type

[**XCom**](XCom.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updateXComValue

Update an XCom entry

### Example

```bash
 updateXComValue dag_id=value dag_run_id=value task_id=value xcom_key=value  Specify as:  update_mask="value1,value2,..."
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **string** | The DAG ID. | [default to null]
 **dagRunId** | **string** | The DAG Run ID. | [default to null]
 **taskId** | **string** | The Task ID. | [default to null]
 **xcomKey** | **string** | The XCom Key. | [default to null]
 **xCom** | [**XCom**](XCom.md) |  |
 **updateMask** | [**array[string]**](string.md) | The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields. | [optional] [default to null]

### Return type

[**XCom**](XCom.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

