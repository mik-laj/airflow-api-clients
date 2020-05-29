# DAGRunApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDagRun**](DAGRunApi.md#createDagRun) | **POST** /dags/{dag_id}/dagRuns/{dag_run_id} | Trigger a DAG Run
[**deleteDagRun**](DAGRunApi.md#deleteDagRun) | **DELETE** /dags/{dag_id}/dagRuns/{dag_run_id} | Delete a DAG Run
[**getDagRun**](DAGRunApi.md#getDagRun) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id} | Get a DAG Run
[**getDagRuns**](DAGRunApi.md#getDagRuns) | **GET** /dags/{dag_id}/dagRuns | Get all DAG Runs
[**getDagRunsBatch**](DAGRunApi.md#getDagRunsBatch) | **POST** /dags/~/dagRuns/list | Get all DAG Runs from aall DAGs.
[**updateDagRun**](DAGRunApi.md#updateDagRun) | **PATCH** /dags/{dag_id}/dagRuns/{dag_run_id} | Update a DAG Run



## createDagRun

Trigger a DAG Run

### Example

```bash
 createDagRun dag_id=value dag_run_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **string** | The DAG ID. | [default to null]
 **dagRunId** | **string** | The DAG Run ID. | [default to null]
 **dAGRun** | [**DAGRun**](DAGRun.md) |  |

### Return type

[**DAGRun**](DAGRun.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## deleteDagRun

Delete a DAG Run

### Example

```bash
 deleteDagRun dag_id=value dag_run_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **string** | The DAG ID. | [default to null]
 **dagRunId** | **string** | The DAG Run ID. | [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getDagRun

Get a DAG Run

### Example

```bash
 getDagRun dag_id=value dag_run_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **string** | The DAG ID. | [default to null]
 **dagRunId** | **string** | The DAG Run ID. | [default to null]

### Return type

[**DAGRun**](DAGRun.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getDagRuns

Get all DAG Runs

This endpoint allows specifying '~' as the dag_id to retrieve DAG Runs for all DAGs.

### Example

```bash
 getDagRuns dag_id=value  limit=value  offset=value  execution_date_gte=value  execution_date_lte=value  start_date_gte=value  start_date_lte=value  end_date_gte=value  end_date_lte=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **string** | The DAG ID. | [default to null]
 **limit** | **integer** | The numbers of items to return. | [optional] [default to 100]
 **offset** | **integer** | The number of items to skip before starting to collect the result set. | [optional] [default to null]
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

### Return type

[**DAGRunCollection**](DAGRunCollection.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getDagRunsBatch

Get all DAG Runs from aall DAGs.

This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits

### Example

```bash
 getDagRunsBatch
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listDagRunsForm** | [**ListDagRunsForm**](ListDagRunsForm.md) |  |

### Return type

[**DAGRunCollection**](DAGRunCollection.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updateDagRun

Update a DAG Run

### Example

```bash
 updateDagRun dag_id=value dag_run_id=value  Specify as:  update_mask="value1,value2,..."
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **string** | The DAG ID. | [default to null]
 **dagRunId** | **string** | The DAG Run ID. | [default to null]
 **dAGRun** | [**DAGRun**](DAGRun.md) |  |
 **updateMask** | [**array[string]**](string.md) | The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields. | [optional] [default to null]

### Return type

[**DAGRun**](DAGRun.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

