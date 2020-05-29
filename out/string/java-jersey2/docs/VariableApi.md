# VariableApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVariable**](VariableApi.md#createVariable) | **POST** /variables | Create a variable
[**deleteVariable**](VariableApi.md#deleteVariable) | **DELETE** /variables/{variable_key} | Delete variable
[**getVariable**](VariableApi.md#getVariable) | **GET** /variables/{variable_key} | Get a variable by key
[**getVariables**](VariableApi.md#getVariables) | **GET** /variables | Get all variables
[**updateVariable**](VariableApi.md#updateVariable) | **PATCH** /variables/{variable_key} | Update a variable by key



## createVariable

> Variable createVariable(variable)

Create a variable

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VariableApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v1");

        VariableApi apiInstance = new VariableApi(defaultClient);
        Variable variable = new Variable(); // Variable | 
        try {
            Variable result = apiInstance.createVariable(variable);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VariableApi#createVariable");
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
 **variable** | [**Variable**](Variable.md)|  |

### Return type

[**Variable**](Variable.md)

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


## deleteVariable

> deleteVariable(variableKey)

Delete variable

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VariableApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v1");

        VariableApi apiInstance = new VariableApi(defaultClient);
        String variableKey = "variableKey_example"; // String | The Variable Key.
        try {
            apiInstance.deleteVariable(variableKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling VariableApi#deleteVariable");
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
 **variableKey** | **String**| The Variable Key. |

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


## getVariable

> Variable getVariable(variableKey)

Get a variable by key

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VariableApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v1");

        VariableApi apiInstance = new VariableApi(defaultClient);
        String variableKey = "variableKey_example"; // String | The Variable Key.
        try {
            Variable result = apiInstance.getVariable(variableKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VariableApi#getVariable");
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
 **variableKey** | **String**| The Variable Key. |

### Return type

[**Variable**](Variable.md)

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


## getVariables

> VariableCollection getVariables(limit, offset)

Get all variables

The collection does not contain data. To get data, you must get a single entity.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VariableApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v1");

        VariableApi apiInstance = new VariableApi(defaultClient);
        Integer limit = 100; // Integer | The numbers of items to return.
        Integer offset = 56; // Integer | The number of items to skip before starting to collect the result set.
        try {
            VariableCollection result = apiInstance.getVariables(limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VariableApi#getVariables");
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
 **limit** | **Integer**| The numbers of items to return. | [optional] [default to 100]
 **offset** | **Integer**| The number of items to skip before starting to collect the result set. | [optional]

### Return type

[**VariableCollection**](VariableCollection.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of variables. |  -  |
| **401** | Request not authenticated due to missing, invalid, authentication info. |  -  |
| **403** | Client does not have sufficient permission. |  -  |


## updateVariable

> Variable updateVariable(variableKey, variable, updateMask)

Update a variable by key

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VariableApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v1");

        VariableApi apiInstance = new VariableApi(defaultClient);
        String variableKey = "variableKey_example"; // String | The Variable Key.
        Variable variable = new Variable(); // Variable | 
        List<String> updateMask = Arrays.asList(); // List<String> | The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields. 
        try {
            Variable result = apiInstance.updateVariable(variableKey, variable, updateMask);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VariableApi#updateVariable");
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
 **variableKey** | **String**| The Variable Key. |
 **variable** | [**Variable**](Variable.md)|  |
 **updateMask** | [**List&lt;String&gt;**](String.md)| The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  | [optional]

### Return type

[**Variable**](Variable.md)

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

