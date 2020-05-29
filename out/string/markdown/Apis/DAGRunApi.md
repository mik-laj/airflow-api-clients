# DAGRunApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDagRun**](DAGRunApi.md#createDagRun) | **POST** /dags/{dag_id}/dagRuns/{dag_run_id} | Trigger a DAG Run
[**deleteDagRun**](DAGRunApi.md#deleteDagRun) | **DELETE** /dags/{dag_id}/dagRuns/{dag_run_id} | Delete a DAG Run
[**getDagRun**](DAGRunApi.md#getDagRun) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id} | Get a DAG Run
[**getDagRuns**](DAGRunApi.md#getDagRuns) | **GET** /dags/{dag_id}/dagRuns | Get all DAG Runs
[**getDagRunsBatch**](DAGRunApi.md#getDagRunsBatch) | **POST** /dags/~/dagRuns/list | Get all DAG Runs from aall DAGs.
[**updateDagRun**](DAGRunApi.md#updateDagRun) | **PATCH** /dags/{dag_id}/dagRuns/{dag_run_id} | Update a DAG Run


<a name="createDagRun"></a>
# **createDagRun**
> DAGRun createDagRun(dagId, dagRunId, dAGRun)

Trigger a DAG Run

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **String**| The DAG ID. | [default to null]
 **dagRunId** | **String**| The DAG Run ID. | [default to null]
 **dAGRun** | [**DAGRun**](..//Models/DAGRun.md)|  |

### Return type

[**DAGRun**](..//Models/DAGRun.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="deleteDagRun"></a>
# **deleteDagRun**
> deleteDagRun(dagId, dagRunId)

Delete a DAG Run

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **String**| The DAG ID. | [default to null]
 **dagRunId** | **String**| The DAG Run ID. | [default to null]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getDagRun"></a>
# **getDagRun**
> DAGRun getDagRun(dagId, dagRunId)

Get a DAG Run

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **String**| The DAG ID. | [default to null]
 **dagRunId** | **String**| The DAG Run ID. | [default to null]

### Return type

[**DAGRun**](..//Models/DAGRun.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getDagRuns"></a>
# **getDagRuns**
> DAGRunCollection getDagRuns(dagId, limit, offset, executionDateGte, executionDateLte, startDateGte, startDateLte, endDateGte, endDateLte)

Get all DAG Runs

    This endpoint allows specifying &#x60;~&#x60; as the dag_id to retrieve DAG Runs for all DAGs. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **String**| The DAG ID. | [default to null]
 **limit** | **Integer**| The numbers of items to return. | [optional] [default to 100]
 **offset** | **Integer**| The number of items to skip before starting to collect the result set. | [optional] [default to null]
 **executionDateGte** | **Date**| Returns objects greater or equal to the specified date. This can be combined with execution_date_lte parameter to receive only the selected period.  | [optional] [default to null]
 **executionDateLte** | **Date**| Returns objects less than or equal to the specified date. This can be combined with execution_date_gte parameter to receive only the selected period.  | [optional] [default to null]
 **startDateGte** | **Date**| Returns objects greater or equal the specified date. This can be combined with startd_ate_lte parameter to receive only the selected period.  | [optional] [default to null]
 **startDateLte** | **Date**| Returns objects less or equal the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  | [optional] [default to null]
 **endDateGte** | **Date**| Returns objects greater or equal the specified date. This can be combined with start_date_lte parameter to receive only the selected period.  | [optional] [default to null]
 **endDateLte** | **Date**| Returns objects less than or equal to the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  | [optional] [default to null]

### Return type

[**DAGRunCollection**](..//Models/DAGRunCollection.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getDagRunsBatch"></a>
# **getDagRunsBatch**
> DAGRunCollection getDagRunsBatch(listDagRunsForm)

Get all DAG Runs from aall DAGs.

    This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listDagRunsForm** | [**ListDagRunsForm**](..//Models/ListDagRunsForm.md)|  |

### Return type

[**DAGRunCollection**](..//Models/DAGRunCollection.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="updateDagRun"></a>
# **updateDagRun**
> DAGRun updateDagRun(dagId, dagRunId, dAGRun, updateMask)

Update a DAG Run

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **String**| The DAG ID. | [default to null]
 **dagRunId** | **String**| The DAG Run ID. | [default to null]
 **dAGRun** | [**DAGRun**](..//Models/DAGRun.md)|  |
 **updateMask** | [**List**](..//Models/String.md)| The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  | [optional] [default to null]

### Return type

[**DAGRun**](..//Models/DAGRun.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

