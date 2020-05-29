# TaskInstanceApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getExtraLinks**](TaskInstanceApi.md#getExtraLinks) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/links | Get extra links for task instance
[**getLogs**](TaskInstanceApi.md#getLogs) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/logs/{task_try_number} | Get logs for a task instance
[**getTaskInstance**](TaskInstanceApi.md#getTaskInstance) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id} | Get a task instance
[**getTaskInstances**](TaskInstanceApi.md#getTaskInstances) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances | Get a list of task instance of DAG.
[**getTaskInstancesBatch**](TaskInstanceApi.md#getTaskInstancesBatch) | **POST** /dags/~/dagRuns/~/taskInstances/list | Get list of task instances from all DAGs and DAG Runs.



## getExtraLinks

Get extra links for task instance

### Example

```bash
 getExtraLinks dag_id=value dag_run_id=value task_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **string** | The DAG ID. | [default to null]
 **dagRunId** | **string** | The DAG Run ID. | [default to null]
 **taskId** | **string** | The Task ID. | [default to null]

### Return type

[**ExtraLinkCollection**](ExtraLinkCollection.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getLogs

Get logs for a task instance

Get logs for a specific task instance and its try number

### Example

```bash
 getLogs dag_id=value dag_run_id=value task_id=value task_try_number=value  full_content=value  token=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **string** | The DAG ID. | [default to null]
 **dagRunId** | **string** | The DAG Run ID. | [default to null]
 **taskId** | **string** | The Task ID. | [default to null]
 **taskTryNumber** | **integer** | The Task Try Number. | [default to null]
 **fullContent** | **boolean** | A full content will be returned. By default, only the first fragment will be returned. | [optional] [default to null]
 **token** | **string** | A token that allows you to continue fetching logs. If passed, it will specify the location from which the download should be continued. | [optional] [default to null]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json, text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getTaskInstance

Get a task instance

### Example

```bash
 getTaskInstance dag_id=value dag_run_id=value task_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **string** | The DAG ID. | [default to null]
 **dagRunId** | **string** | The DAG Run ID. | [default to null]
 **taskId** | **string** | The Task ID. | [default to null]

### Return type

[**TaskInstance**](TaskInstance.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getTaskInstances

Get a list of task instance of DAG.

This endpoint allows specifying '~' as the dag_id, dag_run_id to retrieve DAG Runs for all DAGs and DAG Runs.

### Example

```bash
 getTaskInstances dag_id=value dag_run_id=value  execution_date_gte=value  execution_date_lte=value  start_date_gte=value  start_date_lte=value  end_date_gte=value  end_date_lte=value  duration_gte=value  duration_lte=value  Specify as:  state=value1 state=value2 state=...  Specify as:  pool=value1 pool=value2 pool=...  Specify as:  Queue=value1 Queue=value2 Queue=...  limit=value  offset=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **string** | The DAG ID. | [default to null]
 **dagRunId** | **string** | The DAG Run ID. | [default to null]
 **executionDateGte** | **string** | Returns objects greater or equal to the specified date.
This can be combined with execution_date_lte parameter to receive only the selected period. | [optional] [default to null]
 **executionDateLte** | **string** | Returns objects less than or equal to the specified date.
This can be combined with execution_date_gte parameter to receive only the selected period. | [optional] [default to null]
 **startDateGte** | **string** | Returns objects greater or equal the specified date.
This can be combined with startd_ate_lte parameter to receive only the selected period. | [optional] [default to null]
 **startDateLte** | **string** | Returns objects less or equal the specified date.
This can be combined with start_date_gte parameter to receive only the selected period. | [optional] [default to null]
 **endDateGte** | **string** | Returns objects greater or equal the specified date.
This can be combined with start_date_lte parameter to receive only the selected period. | [optional] [default to null]
 **endDateLte** | **string** | Returns objects less than or equal to the specified date.
This can be combined with start_date_gte parameter to receive only the selected period. | [optional] [default to null]
 **durationGte** | **integer** | Returns objects greater than or equal to the specified values.
This can be combined with duration_lte parameter to receive only the selected period. | [optional] [default to null]
 **durationLte** | **integer** | Returns objects less than or equal to the specified values.
This can be combined with duration_gte parameter to receive only the selected range. | [optional] [default to null]
 **state** | [**array[string]**](string.md) | The value can be repeated to retrieve multiple matching values (OR condition). | [optional] [default to null]
 **pool** | [**array[string]**](string.md) | The value can be repeated to retrieve multiple matching values (OR condition). | [optional] [default to null]
 **queue** | [**array[string]**](string.md) | The value can be repeated to retrieve multiple matching values (OR condition). | [optional] [default to null]
 **limit** | **integer** | The numbers of items to return. | [optional] [default to 100]
 **offset** | **integer** | The number of items to skip before starting to collect the result set. | [optional] [default to null]

### Return type

[**TaskInstanceCollection**](TaskInstanceCollection.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getTaskInstancesBatch

Get list of task instances from all DAGs and DAG Runs.

This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits

### Example

```bash
 getTaskInstancesBatch
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listTaskInstanceForm** | [**ListTaskInstanceForm**](ListTaskInstanceForm.md) |  |

### Return type

[**TaskInstanceCollection**](TaskInstanceCollection.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

