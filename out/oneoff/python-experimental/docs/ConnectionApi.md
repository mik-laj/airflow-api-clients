# openapi_client.ConnectionApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_connection**](ConnectionApi.md#create_connection) | **POST** /connections | Create connection entry
[**delete_connection**](ConnectionApi.md#delete_connection) | **DELETE** /connections/{connection_id} | Delete a connection entry
[**get_connection**](ConnectionApi.md#get_connection) | **GET** /connections/{connection_id} | Get a connection entry
[**get_connections**](ConnectionApi.md#get_connections) | **GET** /connections | Get all connection entries
[**update_connection**](ConnectionApi.md#update_connection) | **PATCH** /connections/{connection_id} | Update a connection entry


# **create_connection**
> connection.Connection create_connection(connection_connection)

Create connection entry

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
    api_instance = openapi_client.ConnectionApi(api_client)
    connection_connection = openapi_client.Connection() # connection.Connection | 
    
    # example passing only required values which don't have defaults set
    try:
        # Create connection entry
        api_response = api_instance.create_connection(connection_connection)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling ConnectionApi->create_connection: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connection_connection** | [**connection.Connection**](Connection.md)|  |

### Return type

[**connection.Connection**](Connection.md)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_connection**
> delete_connection(connection_id)

Delete a connection entry

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
    api_instance = openapi_client.ConnectionApi(api_client)
    connection_id = 56 # int | The Connection ID.
    
    # example passing only required values which don't have defaults set
    try:
        # Delete a connection entry
        api_instance.delete_connection(connection_id)
    except openapi_client.ApiException as e:
        print("Exception when calling ConnectionApi->delete_connection: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connection_id** | **int**| The Connection ID. |

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

# **get_connection**
> connection.Connection get_connection(connection_id)

Get a connection entry

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
    api_instance = openapi_client.ConnectionApi(api_client)
    connection_id = 56 # int | The Connection ID.
    
    # example passing only required values which don't have defaults set
    try:
        # Get a connection entry
        api_response = api_instance.get_connection(connection_id)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling ConnectionApi->get_connection: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connection_id** | **int**| The Connection ID. |

### Return type

[**connection.Connection**](Connection.md)

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

# **get_connections**
> connection_collection.ConnectionCollection get_connections()

Get all connection entries

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
    api_instance = openapi_client.ConnectionApi(api_client)
    limit = 100 # int | The numbers of items to return. (optional) if omitted the server will use the default value of 100
offset = 56 # int | The number of items to skip before starting to collect the result set. (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get all connection entries
        api_response = api_instance.get_connections(limit=limit, offset=offset)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling ConnectionApi->get_connections: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| The numbers of items to return. | [optional] if omitted the server will use the default value of 100
 **offset** | **int**| The number of items to skip before starting to collect the result set. | [optional]

### Return type

[**connection_collection.ConnectionCollection**](ConnectionCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of connection entry. |  -  |
**401** | Request not authenticated due to missing, invalid, authentication info. |  -  |
**403** | Client does not have sufficient permission. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_connection**
> connection.Connection update_connection(connection_id, connection_connection)

Update a connection entry

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
    api_instance = openapi_client.ConnectionApi(api_client)
    connection_id = 56 # int | The Connection ID.
    connection_connection = openapi_client.Connection() # connection.Connection | 
    update_mask = ['update_mask_example'] # [str] | The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional)

    # example passing only required values which don't have defaults set
    try:
        # Update a connection entry
        api_response = api_instance.update_connection(connection_id, connection_connection)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling ConnectionApi->update_connection: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Update a connection entry
        api_response = api_instance.update_connection(connection_id, connection_connection, update_mask=update_mask)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling ConnectionApi->update_connection: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connection_id** | **int**| The Connection ID. |
 **connection_connection** | [**connection.Connection**](Connection.md)|  |
 **update_mask** | **[str]**| The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  | [optional]

### Return type

[**connection.Connection**](Connection.md)

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

