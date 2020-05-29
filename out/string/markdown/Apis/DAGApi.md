# DAGApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clearTaskInstance**](DAGApi.md#clearTaskInstance) | **POST** /dags/{dag_id}/clearTaskInstances | Clears a set of task instances associated with the DAG for a specified date range.
[**getDag**](DAGApi.md#getDag) | **GET** /dags/{dag_id} | Get basic information about a DAG
[**getDagDetail**](DAGApi.md#getDagDetail) | **GET** /dags/{dag_id}/details | Get a simplified representation of DAG.
[**getDagSource**](DAGApi.md#getDagSource) | **GET** /dagSources/{file_token} | Get source code using file token
[**getDags**](DAGApi.md#getDags) | **GET** /dags | Get all DAGs
[**getTask**](DAGApi.md#getTask) | **GET** /dags/{dag_id}/tasks/{task_id} | Get simplified representation of a task.
[**getTasks**](DAGApi.md#getTasks) | **GET** /dags/{dag_id}/tasks | Get tasks for DAG
[**updateDag**](DAGApi.md#updateDag) | **PATCH** /dags/{dag_id} | Update a DAG


<a name="clearTaskInstance"></a>
# **clearTaskInstance**
> TaskInstanceReferenceCollection clearTaskInstance(dagId, clearTaskInstance)

Clears a set of task instances associated with the DAG for a specified date range.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **String**| The DAG ID. | [default to null]
 **clearTaskInstance** | [**ClearTaskInstance**](..//Models/ClearTaskInstance.md)| Parameters of action |

### Return type

[**TaskInstanceReferenceCollection**](..//Models/TaskInstanceReferenceCollection.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="getDag"></a>
# **getDag**
> DAG getDag(dagId)

Get basic information about a DAG

    Presents only information available in database (DAGModel). If you need detailed information, consider using GET /dags/{dag_id}/detail. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **String**| The DAG ID. | [default to null]

### Return type

[**DAG**](..//Models/DAG.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getDagDetail"></a>
# **getDagDetail**
> DAGDetail getDagDetail(dagId)

Get a simplified representation of DAG.

    The response contains many DAG attributes, so the response can be large. If possible, consider using GET /dags/{dag_id}. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **String**| The DAG ID. | [default to null]

### Return type

[**DAGDetail**](..//Models/DAGDetail.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getDagSource"></a>
# **getDagSource**
> inline_response_200_1 getDagSource(fileToken)

Get source code using file token

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileToken** | **String**| The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change.  | [default to null]

### Return type

[**inline_response_200_1**](..//Models/inline_response_200_1.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getDags"></a>
# **getDags**
> DAGCollection getDags(limit, offset)

Get all DAGs

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| The numbers of items to return. | [optional] [default to 100]
 **offset** | **Integer**| The number of items to skip before starting to collect the result set. | [optional] [default to null]

### Return type

[**DAGCollection**](..//Models/DAGCollection.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getTask"></a>
# **getTask**
> Task getTask(dagId, taskId)

Get simplified representation of a task.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **String**| The DAG ID. | [default to null]
 **taskId** | **String**| The Task ID. | [default to null]

### Return type

[**Task**](..//Models/Task.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getTasks"></a>
# **getTasks**
> TaskCollection getTasks(dagId)

Get tasks for DAG

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **String**| The DAG ID. | [default to null]

### Return type

[**TaskCollection**](..//Models/TaskCollection.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="updateDag"></a>
# **updateDag**
> DAG updateDag(dagId, dAG)

Update a DAG

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **String**| The DAG ID. | [default to null]
 **dAG** | [**DAG**](..//Models/DAG.md)|  |

### Return type

[**DAG**](..//Models/DAG.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

