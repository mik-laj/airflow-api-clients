# ImportErrorApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteImportError**](ImportErrorApi.md#deleteImportError) | **DELETE** /importErrors/{import_error_id} | Delete an import error
[**getImportError**](ImportErrorApi.md#getImportError) | **GET** /importErrors/{import_error_id} | Get an import error
[**getImportErrors**](ImportErrorApi.md#getImportErrors) | **GET** /importErrors | Get all import errors



## deleteImportError

Delete an import error

### Example

```bash
 deleteImportError import_error_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **importErrorId** | **integer** | The Import Error ID. | [default to null]

### Return type

(empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getImportError

Get an import error

### Example

```bash
 getImportError import_error_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **importErrorId** | **integer** | The Import Error ID. | [default to null]

### Return type

[**ImportError**](ImportError.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getImportErrors

Get all import errors

### Example

```bash
 getImportErrors  limit=value  offset=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer** | The numbers of items to return. | [optional] [default to 100]
 **offset** | **integer** | The number of items to skip before starting to collect the result set. | [optional] [default to null]

### Return type

[**ImportErrorCollection**](ImportErrorCollection.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

