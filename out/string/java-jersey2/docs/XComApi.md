# XComApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteXComValue**](XComApi.md#deleteXComValue) | **DELETE** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key} | Delete an XCom entry
[**getXComEntry**](XComApi.md#getXComEntry) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries | Get all XCom entries
[**getXComValue**](XComApi.md#getXComValue) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key} | Get an XCom entry
[**updateXComEntry**](XComApi.md#updateXComEntry) | **POST** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries | Create an XCom entry
[**updateXComValue**](XComApi.md#updateXComValue) | **PATCH** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key} | Update an XCom entry



## deleteXComValue

> deleteXComValue(dagId, dagRunId, taskId, xcomKey)

Delete an XCom entry

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.XComApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v1");

        XComApi apiInstance = new XComApi(defaultClient);
        String dagId = "dagId_example"; // String | The DAG ID.
        String dagRunId = "dagRunId_example"; // String | The DAG Run ID.
        String taskId = "taskId_example"; // String | The Task ID.
        String xcomKey = "xcomKey_example"; // String | The XCom Key.
        try {
            apiInstance.deleteXComValue(dagId, dagRunId, taskId, xcomKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling XComApi#deleteXComValue");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content. |  -  |
| **400** | Client specified an invalid argument. |  -  |
| **401** | Request not authenticated due to missing, invalid, authentication info. |  -  |
| **403** | Client does not have sufficient permission. |  -  |


## getXComEntry

> XComCollection getXComEntry(dagId, dagRunId, taskId, limit, offset)

Get all XCom entries

This endpoint allows specifying `~` as the dag_id, dag_run_id, task_id to retrieve XCOM entries for for all DAGs, DAG Runs and task instances.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.XComApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v1");

        XComApi apiInstance = new XComApi(defaultClient);
        String dagId = "dagId_example"; // String | The DAG ID.
        String dagRunId = "dagRunId_example"; // String | The DAG Run ID.
        String taskId = "taskId_example"; // String | The Task ID.
        Integer limit = 100; // Integer | The numbers of items to return.
        Integer offset = 56; // Integer | The number of items to skip before starting to collect the result set.
        try {
            XComCollection result = apiInstance.getXComEntry(dagId, dagRunId, taskId, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XComApi#getXComEntry");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of XCom entries. |  -  |
| **401** | Request not authenticated due to missing, invalid, authentication info. |  -  |
| **403** | Client does not have sufficient permission. |  -  |


## getXComValue

> XCom getXComValue(dagId, dagRunId, taskId, xcomKey)

Get an XCom entry

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.XComApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v1");

        XComApi apiInstance = new XComApi(defaultClient);
        String dagId = "dagId_example"; // String | The DAG ID.
        String dagRunId = "dagRunId_example"; // String | The DAG Run ID.
        String taskId = "taskId_example"; // String | The Task ID.
        String xcomKey = "xcomKey_example"; // String | The XCom Key.
        try {
            XCom result = apiInstance.getXComValue(dagId, dagRunId, taskId, xcomKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XComApi#getXComValue");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  -  |
| **401** | Request not authenticated due to missing, invalid, authentication info. |  -  |
| **403** | Client does not have sufficient permission. |  -  |
| **404** | A specified resource is not found. |  -  |


## updateXComEntry

> XCom updateXComEntry(dagId, dagRunId, taskId, xcom)

Create an XCom entry

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.XComApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v1");

        XComApi apiInstance = new XComApi(defaultClient);
        String dagId = "dagId_example"; // String | The DAG ID.
        String dagRunId = "dagRunId_example"; // String | The DAG Run ID.
        String taskId = "taskId_example"; // String | The Task ID.
        XCom xcom = new XCom(); // XCom | 
        try {
            XCom result = apiInstance.updateXComEntry(dagId, dagRunId, taskId, xcom);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XComApi#updateXComEntry");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  -  |
| **400** | Client specified an invalid argument. |  -  |
| **401** | Request not authenticated due to missing, invalid, authentication info. |  -  |
| **403** | Client does not have sufficient permission. |  -  |


## updateXComValue

> XCom updateXComValue(dagId, dagRunId, taskId, xcomKey, xcom, updateMask)

Update an XCom entry

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.XComApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v1");

        XComApi apiInstance = new XComApi(defaultClient);
        String dagId = "dagId_example"; // String | The DAG ID.
        String dagRunId = "dagRunId_example"; // String | The DAG Run ID.
        String taskId = "taskId_example"; // String | The Task ID.
        String xcomKey = "xcomKey_example"; // String | The XCom Key.
        XCom xcom = new XCom(); // XCom | 
        List<String> updateMask = Arrays.asList(); // List<String> | The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields. 
        try {
            XCom result = apiInstance.updateXComValue(dagId, dagRunId, taskId, xcomKey, xcom, updateMask);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XComApi#updateXComValue");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **String**| The DAG ID. |
 **dagRunId** | **String**| The DAG Run ID. |
 **taskId** | **String**| The Task ID. |
 **xcomKey** | **String**| The XCom Key. |
 **xcom** | [**XCom**](XCom.md)|  |
 **updateMask** | [**List&lt;String&gt;**](String.md)| The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  | [optional]

### Return type

[**XCom**](XCom.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  -  |
| **400** | Client specified an invalid argument. |  -  |
| **401** | Request not authenticated due to missing, invalid, authentication info. |  -  |
| **403** | Client does not have sufficient permission. |  -  |
| **404** | A specified resource is not found. |  -  |

