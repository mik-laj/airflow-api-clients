# ConnectionApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConnection**](ConnectionApi.md#createConnection) | **POST** /connections | Create connection entry
[**deleteConnection**](ConnectionApi.md#deleteConnection) | **DELETE** /connections/{connection_id} | Delete a connection entry
[**getConnection**](ConnectionApi.md#getConnection) | **GET** /connections/{connection_id} | Get a connection entry
[**getConnections**](ConnectionApi.md#getConnections) | **GET** /connections | Get all connection entries
[**updateConnection**](ConnectionApi.md#updateConnection) | **PATCH** /connections/{connection_id} | Update a connection entry


<a name="createConnection"></a>
# **createConnection**
> Connection createConnection(connection)

Create connection entry

### Example
```java
// Import classes:
//import org.openapitools.client.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

ConnectionApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost/api/v1"))).connection();

api.createConnection()
    .body(connection).execute(r -> r.prettyPeek());
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

<a name="deleteConnection"></a>
# **deleteConnection**
> deleteConnection(connectionId)

Delete a connection entry

### Example
```java
// Import classes:
//import org.openapitools.client.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

ConnectionApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost/api/v1"))).connection();

api.deleteConnection()
    .connectionIdPath(connectionId).execute(r -> r.prettyPeek());
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

<a name="getConnection"></a>
# **getConnection**
> Connection getConnection(connectionId)

Get a connection entry

### Example
```java
// Import classes:
//import org.openapitools.client.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

ConnectionApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost/api/v1"))).connection();

api.getConnection()
    .connectionIdPath(connectionId).execute(r -> r.prettyPeek());
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

<a name="getConnections"></a>
# **getConnections**
> ConnectionCollection getConnections(limit, offset)

Get all connection entries

### Example
```java
// Import classes:
//import org.openapitools.client.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

ConnectionApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost/api/v1"))).connection();

api.getConnections().execute(r -> r.prettyPeek());
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

<a name="updateConnection"></a>
# **updateConnection**
> Connection updateConnection(connectionId, connection, updateMask)

Update a connection entry

### Example
```java
// Import classes:
//import org.openapitools.client.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

ConnectionApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost/api/v1"))).connection();

api.updateConnection()
    .connectionIdPath(connectionId)
    .body(connection).execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionId** | **Integer**| The Connection ID. |
 **connection** | [**Connection**](Connection.md)|  |
 **updateMask** | [**List&lt;String&gt;**](String.md)| The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  | [optional] [default to new ArrayList&lt;String&gt;()]

### Return type

[**Connection**](Connection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

