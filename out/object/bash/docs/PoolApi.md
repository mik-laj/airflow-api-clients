# PoolApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPool**](PoolApi.md#createPool) | **POST** /pools | Create a pool
[**deletePool**](PoolApi.md#deletePool) | **DELETE** /pools/{pool_name} | Delete a pool
[**getPool**](PoolApi.md#getPool) | **GET** /pools/{pool_name} | Get a pool
[**getPools**](PoolApi.md#getPools) | **GET** /pools | Get all pools
[**updatePool**](PoolApi.md#updatePool) | **PATCH** /pools/{pool_name} | Update a pool



## createPool

Create a pool

### Example

```bash
 createPool
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pool** | [**Pool**](Pool.md) |  |

### Return type

[**Pool**](Pool.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## deletePool

Delete a pool

### Example

```bash
 deletePool pool_name=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolName** | **string** | The Pool name. | [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getPool

Get a pool

### Example

```bash
 getPool pool_name=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolName** | **string** | The Pool name. | [default to null]

### Return type

[**Pool**](Pool.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getPools

Get all pools

### Example

```bash
 getPools  limit=value  offset=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer** | The numbers of items to return. | [optional] [default to 100]
 **offset** | **integer** | The number of items to skip before starting to collect the result set. | [optional] [default to null]

### Return type

[**PoolCollection**](PoolCollection.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updatePool

Update a pool

### Example

```bash
 updatePool pool_name=value  Specify as:  update_mask="value1,value2,..."
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolName** | **string** | The Pool name. | [default to null]
 **pool** | [**Pool**](Pool.md) |  |
 **updateMask** | [**array[string]**](string.md) | The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields. | [optional] [default to null]

### Return type

[**Pool**](Pool.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

