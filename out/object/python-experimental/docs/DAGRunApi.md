# openapi_client.DAGRunApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_dag_run**](DAGRunApi.md#create_dag_run) | **POST** /dags/{dag_id}/dagRuns/{dag_run_id} | Trigger a DAG Run
[**delete_dag_run**](DAGRunApi.md#delete_dag_run) | **DELETE** /dags/{dag_id}/dagRuns/{dag_run_id} | Delete a DAG Run
[**get_dag_run**](DAGRunApi.md#get_dag_run) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id} | Get a DAG Run
[**get_dag_runs**](DAGRunApi.md#get_dag_runs) | **GET** /dags/{dag_id}/dagRuns | Get all DAG Runs
[**get_dag_runs_batch**](DAGRunApi.md#get_dag_runs_batch) | **POST** /dags/~/dagRuns/list | Get all DAG Runs from aall DAGs.
[**update_dag_run**](DAGRunApi.md#update_dag_run) | **PATCH** /dags/{dag_id}/dagRuns/{dag_run_id} | Update a DAG Run


# **create_dag_run**
> dag_run.DAGRun create_dag_run(dag_id, dag_run_id, dag_run_dag_run)

Trigger a DAG Run

### Example

```python
from __future__ import print_function
import time
import openapi_client
from pprint import pprint
# Defining the host is optional and defaults to http://localhost/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DAGRunApi(api_client)
    dag_id = 'dag_id_example' # str | The DAG ID.
    dag_run_id = 'dag_run_id_example' # str | The DAG Run ID.
    dag_run_dag_run = openapi_client.DAGRun() # dag_run.DAGRun | 
    
    # example passing only required values which don't have defaults set
    try:
        # Trigger a DAG Run
        api_response = api_instance.create_dag_run(dag_id, dag_run_id, dag_run_dag_run)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling DAGRunApi->create_dag_run: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dag_id** | **str**| The DAG ID. |
 **dag_run_id** | **str**| The DAG Run ID. |
 **dag_run_dag_run** | [**dag_run.DAGRun**](DAGRun.md)|  |

### Return type

[**dag_run.DAGRun**](DAGRun.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response. |  -  |
**400** | Client specified an invalid argument. |  -  |
**401** | Request not authenticated due to missing, invalid, authentication info. |  -  |
**409** | The resource that a client tried to create already exists. |  -  |
**403** | Client does not have sufficient permission. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_dag_run**
> delete_dag_run(dag_id, dag_run_id)

Delete a DAG Run

### Example

```python
from __future__ import print_function
import time
import openapi_client
from pprint import pprint
# Defining the host is optional and defaults to http://localhost/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DAGRunApi(api_client)
    dag_id = 'dag_id_example' # str | The DAG ID.
    dag_run_id = 'dag_run_id_example' # str | The DAG Run ID.
    
    # example passing only required values which don't have defaults set
    try:
        # Delete a DAG Run
        api_instance.delete_dag_run(dag_id, dag_run_id)
    except openapi_client.ApiException as e:
        print("Exception when calling DAGRunApi->delete_dag_run: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dag_id** | **str**| The DAG ID. |
 **dag_run_id** | **str**| The DAG Run ID. |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No content. |  -  |
**400** | Client specified an invalid argument. |  -  |
**401** | Request not authenticated due to missing, invalid, authentication info. |  -  |
**403** | Client does not have sufficient permission. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_dag_run**
> dag_run.DAGRun get_dag_run(dag_id, dag_run_id)

Get a DAG Run

### Example

```python
from __future__ import print_function
import time
import openapi_client
from pprint import pprint
# Defining the host is optional and defaults to http://localhost/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DAGRunApi(api_client)
    dag_id = 'dag_id_example' # str | The DAG ID.
    dag_run_id = 'dag_run_id_example' # str | The DAG Run ID.
    
    # example passing only required values which don't have defaults set
    try:
        # Get a DAG Run
        api_response = api_instance.get_dag_run(dag_id, dag_run_id)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling DAGRunApi->get_dag_run: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dag_id** | **str**| The DAG ID. |
 **dag_run_id** | **str**| The DAG Run ID. |

### Return type

[**dag_run.DAGRun**](DAGRun.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response. |  -  |
**401** | Request not authenticated due to missing, invalid, authentication info. |  -  |
**403** | Client does not have sufficient permission. |  -  |
**404** | A specified resource is not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_dag_runs**
> dag_run_collection.DAGRunCollection get_dag_runs(dag_id)

Get all DAG Runs

This endpoint allows specifying `~` as the dag_id to retrieve DAG Runs for all DAGs. 

### Example

```python
from __future__ import print_function
import time
import openapi_client
from pprint import pprint
# Defining the host is optional and defaults to http://localhost/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DAGRunApi(api_client)
    dag_id = 'dag_id_example' # str | The DAG ID.
    limit = 100 # int | The numbers of items to return. (optional) if omitted the server will use the default value of 100
offset = 56 # int | The number of items to skip before starting to collect the result set. (optional)
execution_date_gte = '2013-10-20T19:20:30+01:00' # datetime | Returns objects greater or equal to the specified date. This can be combined with execution_date_lte parameter to receive only the selected period.  (optional)
execution_date_lte = '2013-10-20T19:20:30+01:00' # datetime | Returns objects less than or equal to the specified date. This can be combined with execution_date_gte parameter to receive only the selected period.  (optional)
start_date_gte = '2013-10-20T19:20:30+01:00' # datetime | Returns objects greater or equal the specified date. This can be combined with startd_ate_lte parameter to receive only the selected period.  (optional)
start_date_lte = '2013-10-20T19:20:30+01:00' # datetime | Returns objects less or equal the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  (optional)
end_date_gte = '2013-10-20T19:20:30+01:00' # datetime | Returns objects greater or equal the specified date. This can be combined with start_date_lte parameter to receive only the selected period.  (optional)
end_date_lte = '2013-10-20T19:20:30+01:00' # datetime | Returns objects less than or equal to the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  (optional)

    # example passing only required values which don't have defaults set
    try:
        # Get all DAG Runs
        api_response = api_instance.get_dag_runs(dag_id)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling DAGRunApi->get_dag_runs: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get all DAG Runs
        api_response = api_instance.get_dag_runs(dag_id, limit=limit, offset=offset, execution_date_gte=execution_date_gte, execution_date_lte=execution_date_lte, start_date_gte=start_date_gte, start_date_lte=start_date_lte, end_date_gte=end_date_gte, end_date_lte=end_date_lte)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling DAGRunApi->get_dag_runs: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dag_id** | **str**| The DAG ID. |
 **limit** | **int**| The numbers of items to return. | [optional] if omitted the server will use the default value of 100
 **offset** | **int**| The number of items to skip before starting to collect the result set. | [optional]
 **execution_date_gte** | **datetime**| Returns objects greater or equal to the specified date. This can be combined with execution_date_lte parameter to receive only the selected period.  | [optional]
 **execution_date_lte** | **datetime**| Returns objects less than or equal to the specified date. This can be combined with execution_date_gte parameter to receive only the selected period.  | [optional]
 **start_date_gte** | **datetime**| Returns objects greater or equal the specified date. This can be combined with startd_ate_lte parameter to receive only the selected period.  | [optional]
 **start_date_lte** | **datetime**| Returns objects less or equal the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  | [optional]
 **end_date_gte** | **datetime**| Returns objects greater or equal the specified date. This can be combined with start_date_lte parameter to receive only the selected period.  | [optional]
 **end_date_lte** | **datetime**| Returns objects less than or equal to the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  | [optional]

### Return type

[**dag_run_collection.DAGRunCollection**](DAGRunCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of DAG Runs. |  -  |
**401** | Request not authenticated due to missing, invalid, authentication info. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_dag_runs_batch**
> dag_run_collection.DAGRunCollection get_dag_runs_batch(list_dag_runs_form_list_dag_runs_form)

Get all DAG Runs from aall DAGs.

This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits 

### Example

```python
from __future__ import print_function
import time
import openapi_client
from pprint import pprint
# Defining the host is optional and defaults to http://localhost/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DAGRunApi(api_client)
    list_dag_runs_form_list_dag_runs_form = openapi_client.ListDagRunsForm() # list_dag_runs_form.ListDagRunsForm | 
    
    # example passing only required values which don't have defaults set
    try:
        # Get all DAG Runs from aall DAGs.
        api_response = api_instance.get_dag_runs_batch(list_dag_runs_form_list_dag_runs_form)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling DAGRunApi->get_dag_runs_batch: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **list_dag_runs_form_list_dag_runs_form** | [**list_dag_runs_form.ListDagRunsForm**](ListDagRunsForm.md)|  |

### Return type

[**dag_run_collection.DAGRunCollection**](DAGRunCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of DAG Runs. |  -  |
**400** | Client specified an invalid argument. |  -  |
**401** | Request not authenticated due to missing, invalid, authentication info. |  -  |
**403** | Client does not have sufficient permission. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_dag_run**
> dag_run.DAGRun update_dag_run(dag_id, dag_run_id, dag_run_dag_run)

Update a DAG Run

### Example

```python
from __future__ import print_function
import time
import openapi_client
from pprint import pprint
# Defining the host is optional and defaults to http://localhost/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost/api/v1"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DAGRunApi(api_client)
    dag_id = 'dag_id_example' # str | The DAG ID.
    dag_run_id = 'dag_run_id_example' # str | The DAG Run ID.
    dag_run_dag_run = openapi_client.DAGRun() # dag_run.DAGRun | 
    update_mask = ['update_mask_example'] # [str] | The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional)

    # example passing only required values which don't have defaults set
    try:
        # Update a DAG Run
        api_response = api_instance.update_dag_run(dag_id, dag_run_id, dag_run_dag_run)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling DAGRunApi->update_dag_run: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Update a DAG Run
        api_response = api_instance.update_dag_run(dag_id, dag_run_id, dag_run_dag_run, update_mask=update_mask)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling DAGRunApi->update_dag_run: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dag_id** | **str**| The DAG ID. |
 **dag_run_id** | **str**| The DAG Run ID. |
 **dag_run_dag_run** | [**dag_run.DAGRun**](DAGRun.md)|  |
 **update_mask** | **[str]**| The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  | [optional]

### Return type

[**dag_run.DAGRun**](DAGRun.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response. |  -  |
**400** | Client specified an invalid argument. |  -  |
**401** | Request not authenticated due to missing, invalid, authentication info. |  -  |
**403** | Client does not have sufficient permission. |  -  |
**404** | A specified resource is not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

