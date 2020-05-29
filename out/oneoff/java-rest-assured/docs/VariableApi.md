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

### Example
```java
// Import classes:
//import org.openapitools.client.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

VariableApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost/api/v1"))).variable();

api.createVariable()
    .body(variable).execute(r -> r.prettyPeek());
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

<a name="deleteVariable"></a>
# **deleteVariable**
> deleteVariable(variableKey)

Delete variable

### Example
```java
// Import classes:
//import org.openapitools.client.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

VariableApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost/api/v1"))).variable();

api.deleteVariable()
    .variableKeyPath(variableKey).execute(r -> r.prettyPeek());
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

<a name="getVariable"></a>
# **getVariable**
> Variable getVariable(variableKey)

Get a variable by key

### Example
```java
// Import classes:
//import org.openapitools.client.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

VariableApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost/api/v1"))).variable();

api.getVariable()
    .variableKeyPath(variableKey).execute(r -> r.prettyPeek());
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

<a name="getVariables"></a>
# **getVariables**
> VariableCollection getVariables(limit, offset)

Get all variables

The collection does not contain data. To get data, you must get a single entity.

### Example
```java
// Import classes:
//import org.openapitools.client.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

VariableApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost/api/v1"))).variable();

api.getVariables().execute(r -> r.prettyPeek());
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

<a name="updateVariable"></a>
# **updateVariable**
> Variable updateVariable(variableKey, variable, updateMask)

Update a variable by key

### Example
```java
// Import classes:
//import org.openapitools.client.ApiClient;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.ErrorLoggingFilter;

VariableApi api = ApiClient.api(ApiClient.Config.apiConfig().withReqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setBaseUri("http://localhost/api/v1"))).variable();

api.updateVariable()
    .variableKeyPath(variableKey)
    .body(variable).execute(r -> r.prettyPeek());
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variableKey** | **String**| The Variable Key. |
 **variable** | [**Variable**](Variable.md)|  |
 **updateMask** | [**List&lt;String&gt;**](String.md)| The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  | [optional] [default to new ArrayList&lt;String&gt;()]

### Return type

[**Variable**](Variable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

