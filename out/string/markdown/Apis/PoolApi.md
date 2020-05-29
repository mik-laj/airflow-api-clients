# PoolApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPool**](PoolApi.md#createPool) | **POST** /pools | Create a pool
[**deletePool**](PoolApi.md#deletePool) | **DELETE** /pools/{pool_name} | Delete a pool
[**getPool**](PoolApi.md#getPool) | **GET** /pools/{pool_name} | Get a pool
[**getPools**](PoolApi.md#getPools) | **GET** /pools | Get all pools
[**updatePool**](PoolApi.md#updatePool) | **PATCH** /pools/{pool_name} | Update a pool


<a name="createPool"></a>
# **createPool**
> Pool createPool(pool)

Create a pool

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pool** | [**Pool**](..//Models/Pool.md)|  |

### Return type

[**Pool**](..//Models/Pool.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="deletePool"></a>
# **deletePool**
> deletePool(poolName)

Delete a pool

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolName** | **String**| The Pool name. | [default to null]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getPool"></a>
# **getPool**
> Pool getPool(poolName)

Get a pool

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolName** | **String**| The Pool name. | [default to null]

### Return type

[**Pool**](..//Models/Pool.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getPools"></a>
# **getPools**
> PoolCollection getPools(limit, offset)

Get all pools

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| The numbers of items to return. | [optional] [default to 100]
 **offset** | **Integer**| The number of items to skip before starting to collect the result set. | [optional] [default to null]

### Return type

[**PoolCollection**](..//Models/PoolCollection.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="updatePool"></a>
# **updatePool**
> Pool updatePool(poolName, pool, updateMask)

Update a pool

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolName** | **String**| The Pool name. | [default to null]
 **pool** | [**Pool**](..//Models/Pool.md)|  |
 **updateMask** | [**List**](..//Models/String.md)| The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  | [optional] [default to null]

### Return type

[**Pool**](..//Models/Pool.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

