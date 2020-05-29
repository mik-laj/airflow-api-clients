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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connection** | [**Connection**](..//Models/Connection.md)|  |

### Return type

[**Connection**](..//Models/Connection.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="deleteConnection"></a>
# **deleteConnection**
> deleteConnection(connectionId)

Delete a connection entry

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionId** | **Integer**| The Connection ID. | [default to null]

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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionId** | **Integer**| The Connection ID. | [default to null]

### Return type

[**Connection**](..//Models/Connection.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getConnections"></a>
# **getConnections**
> ConnectionCollection getConnections(limit, offset)

Get all connection entries

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| The numbers of items to return. | [optional] [default to 100]
 **offset** | **Integer**| The number of items to skip before starting to collect the result set. | [optional] [default to null]

### Return type

[**ConnectionCollection**](..//Models/ConnectionCollection.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="updateConnection"></a>
# **updateConnection**
> Connection updateConnection(connectionId, connection, updateMask)

Update a connection entry

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionId** | **Integer**| The Connection ID. | [default to null]
 **connection** | [**Connection**](..//Models/Connection.md)|  |
 **updateMask** | [**List**](..//Models/String.md)| The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  | [optional] [default to null]

### Return type

[**Connection**](..//Models/Connection.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

