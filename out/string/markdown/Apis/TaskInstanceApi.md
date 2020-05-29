# TaskInstanceApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getExtraLinks**](TaskInstanceApi.md#getExtraLinks) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/links | Get extra links for task instance
[**getLogs**](TaskInstanceApi.md#getLogs) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/logs/{task_try_number} | Get logs for a task instance
[**getTaskInstance**](TaskInstanceApi.md#getTaskInstance) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id} | Get a task instance
[**getTaskInstances**](TaskInstanceApi.md#getTaskInstances) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances | Get a list of task instance of DAG.
[**getTaskInstancesBatch**](TaskInstanceApi.md#getTaskInstancesBatch) | **POST** /dags/~/dagRuns/~/taskInstances/list | Get list of task instances from all DAGs and DAG Runs.


<a name="getExtraLinks"></a>
# **getExtraLinks**
> ExtraLinkCollection getExtraLinks(dagId, dagRunId, taskId)

Get extra links for task instance

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **String**| The DAG ID. | [default to null]
 **dagRunId** | **String**| The DAG Run ID. | [default to null]
 **taskId** | **String**| The Task ID. | [default to null]

### Return type

[**ExtraLinkCollection**](..//Models/ExtraLinkCollection.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getLogs"></a>
# **getLogs**
> inline_response_200 getLogs(dagId, dagRunId, taskId, taskTryNumber, fullContent, token)

Get logs for a task instance

    Get logs for a specific task instance and its try number

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **String**| The DAG ID. | [default to null]
 **dagRunId** | **String**| The DAG Run ID. | [default to null]
 **taskId** | **String**| The Task ID. | [default to null]
 **taskTryNumber** | **Integer**| The Task Try Number. | [default to null]
 **fullContent** | **Boolean**| A full content will be returned. By default, only the first fragment will be returned.  | [optional] [default to null]
 **token** | **String**| A token that allows you to continue fetching logs. If passed, it will specify the location from which the download should be continued.  | [optional] [default to null]

### Return type

[**inline_response_200**](..//Models/inline_response_200.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain

<a name="getTaskInstance"></a>
# **getTaskInstance**
> TaskInstance getTaskInstance(dagId, dagRunId, taskId)

Get a task instance

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **String**| The DAG ID. | [default to null]
 **dagRunId** | **String**| The DAG Run ID. | [default to null]
 **taskId** | **String**| The Task ID. | [default to null]

### Return type

[**TaskInstance**](..//Models/TaskInstance.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getTaskInstances"></a>
# **getTaskInstances**
> TaskInstanceCollection getTaskInstances(dagId, dagRunId, executionDateGte, executionDateLte, startDateGte, startDateLte, endDateGte, endDateLte, durationGte, durationLte, state, pool, queue, limit, offset)

Get a list of task instance of DAG.

    This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id to retrieve DAG Runs for all DAGs and DAG Runs. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **String**| The DAG ID. | [default to null]
 **dagRunId** | **String**| The DAG Run ID. | [default to null]
 **executionDateGte** | **Date**| Returns objects greater or equal to the specified date. This can be combined with execution_date_lte parameter to receive only the selected period.  | [optional] [default to null]
 **executionDateLte** | **Date**| Returns objects less than or equal to the specified date. This can be combined with execution_date_gte parameter to receive only the selected period.  | [optional] [default to null]
 **startDateGte** | **Date**| Returns objects greater or equal the specified date. This can be combined with startd_ate_lte parameter to receive only the selected period.  | [optional] [default to null]
 **startDateLte** | **Date**| Returns objects less or equal the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  | [optional] [default to null]
 **endDateGte** | **Date**| Returns objects greater or equal the specified date. This can be combined with start_date_lte parameter to receive only the selected period.  | [optional] [default to null]
 **endDateLte** | **Date**| Returns objects less than or equal to the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  | [optional] [default to null]
 **durationGte** | **BigDecimal**| Returns objects greater than or equal to the specified values. This can be combined with duration_lte parameter to receive only the selected period.  | [optional] [default to null]
 **durationLte** | **BigDecimal**| Returns objects less than or equal to the specified values. This can be combined with duration_gte parameter to receive only the selected range.  | [optional] [default to null]
 **state** | [**List**](..//Models/String.md)| The value can be repeated to retrieve multiple matching values (OR condition). | [optional] [default to null]
 **pool** | [**List**](..//Models/String.md)| The value can be repeated to retrieve multiple matching values (OR condition). | [optional] [default to null]
 **queue** | [**List**](..//Models/String.md)| The value can be repeated to retrieve multiple matching values (OR condition). | [optional] [default to null]
 **limit** | **Integer**| The numbers of items to return. | [optional] [default to 100]
 **offset** | **Integer**| The number of items to skip before starting to collect the result set. | [optional] [default to null]

### Return type

[**TaskInstanceCollection**](..//Models/TaskInstanceCollection.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getTaskInstancesBatch"></a>
# **getTaskInstancesBatch**
> TaskInstanceCollection getTaskInstancesBatch(listTaskInstanceForm)

Get list of task instances from all DAGs and DAG Runs.

    This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listTaskInstanceForm** | [**ListTaskInstanceForm**](..//Models/ListTaskInstanceForm.md)|  |

### Return type

[**TaskInstanceCollection**](..//Models/TaskInstanceCollection.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

