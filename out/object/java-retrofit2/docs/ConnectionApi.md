# ConnectionApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConnection**](ConnectionApi.md#createConnection) | **POST** connections | Create connection entry
[**deleteConnection**](ConnectionApi.md#deleteConnection) | **DELETE** connections/{connection_id} | Delete a connection entry
[**getConnection**](ConnectionApi.md#getConnection) | **GET** connections/{connection_id} | Get a connection entry
[**getConnections**](ConnectionApi.md#getConnections) | **GET** connections | Get all connection entries
[**updateConnection**](ConnectionApi.md#updateConnection) | **PATCH** connections/{connection_id} | Update a connection entry



## createConnection

> Connection createConnection(connection)

Create connection entry

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v1");

        ConnectionApi apiInstance = new ConnectionApi(defaultClient);
        Connection connection = new Connection(); // Connection | 
        try {
            Connection result = apiInstance.createConnection(connection);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectionApi#createConnection");
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
 **connection** | [**Connection**](Connection.md)|  |

### Return type

[**Connection**](Connection.md)

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


## deleteConnection

> deleteConnection(connectionId)

Delete a connection entry

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v1");

        ConnectionApi apiInstance = new ConnectionApi(defaultClient);
        Integer connectionId = 56; // Integer | The Connection ID.
        try {
            apiInstance.deleteConnection(connectionId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectionApi#deleteConnection");
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
 **connectionId** | **Integer**| The Connection ID. |

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


## getConnection

> Connection getConnection(connectionId)

Get a connection entry

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v1");

        ConnectionApi apiInstance = new ConnectionApi(defaultClient);
        Integer connectionId = 56; // Integer | The Connection ID.
        try {
            Connection result = apiInstance.getConnection(connectionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectionApi#getConnection");
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
 **connectionId** | **Integer**| The Connection ID. |

### Return type

[**Connection**](Connection.md)

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


## getConnections

> ConnectionCollection getConnections(limit, offset)

Get all connection entries

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v1");

        ConnectionApi apiInstance = new ConnectionApi(defaultClient);
        Integer limit = 100; // Integer | The numbers of items to return.
        Integer offset = 56; // Integer | The number of items to skip before starting to collect the result set.
        try {
            ConnectionCollection result = apiInstance.getConnections(limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectionApi#getConnections");
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

[**ConnectionCollection**](ConnectionCollection.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of connection entry. |  -  |
| **401** | Request not authenticated due to missing, invalid, authentication info. |  -  |
| **403** | Client does not have sufficient permission. |  -  |


## updateConnection

> Connection updateConnection(connectionId, connection, updateMask)

Update a connection entry

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConnectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/api/v1");

        ConnectionApi apiInstance = new ConnectionApi(defaultClient);
        Integer connectionId = 56; // Integer | The Connection ID.
        Connection connection = new Connection(); // Connection | 
        List<String> updateMask = Arrays.asList(); // List<String> | The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields. 
        try {
            Connection result = apiInstance.updateConnection(connectionId, connection, updateMask);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectionApi#updateConnection");
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
 **connectionId** | **Integer**| The Connection ID. |
 **connection** | [**Connection**](Connection.md)|  |
 **updateMask** | [**List&lt;String&gt;**](String.md)| The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  | [optional]

### Return type

[**Connection**](Connection.md)

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

