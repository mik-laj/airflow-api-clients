# VariableApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVariable**](VariableApi.md#createVariable) | **POST** /variables | Create a variable
[**deleteVariable**](VariableApi.md#deleteVariable) | **DELETE** /variables/{variable_key} | Delete variable
[**getVariable**](VariableApi.md#getVariable) | **GET** /variables/{variable_key} | Get a variable by key
[**getVariables**](VariableApi.md#getVariables) | **GET** /variables | Get all variables
[**updateVariable**](VariableApi.md#updateVariable) | **PATCH** /variables/{variable_key} | Update a variable by key


<a name="createVariable"></a>
# **createVariable**
> Variable createVariable(variable)

Create a variable

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variable** | [**Variable**](..//Models/Variable.md)|  |

### Return type

[**Variable**](..//Models/Variable.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="deleteVariable"></a>
# **deleteVariable**
> deleteVariable(variableKey)

Delete variable

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variableKey** | **String**| The Variable Key. | [default to null]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getVariable"></a>
# **getVariable**
> Variable getVariable(variableKey)

Get a variable by key

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variableKey** | **String**| The Variable Key. | [default to null]

### Return type

[**Variable**](..//Models/Variable.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getVariables"></a>
# **getVariables**
> VariableCollection getVariables(limit, offset)

Get all variables

    The collection does not contain data. To get data, you must get a single entity.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| The numbers of items to return. | [optional] [default to 100]
 **offset** | **Integer**| The number of items to skip before starting to collect the result set. | [optional] [default to null]

### Return type

[**VariableCollection**](..//Models/VariableCollection.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="updateVariable"></a>
# **updateVariable**
> Variable updateVariable(variableKey, variable, updateMask)

Update a variable by key

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variableKey** | **String**| The Variable Key. | [default to null]
 **variable** | [**Variable**](..//Models/Variable.md)|  |
 **updateMask** | [**List**](..//Models/String.md)| The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  | [optional] [default to null]

### Return type

[**Variable**](..//Models/Variable.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

