package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.Variable;
import org.openapitools.client.model.VariableCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:09:08.099Z[GMT]")
public class VariableApi {
  private ApiClient apiClient;

  public VariableApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VariableApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API cilent
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API cilent
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a variable
   * 
   * @param variable  (required)
   * @return Variable
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Client specified an invalid argument. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Request not authenticated due to missing, invalid, authentication info. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Client does not have sufficient permission. </td><td>  -  </td></tr>
     </table>
   */
  public Variable createVariable(Variable variable) throws ApiException {
    return createVariableWithHttpInfo(variable).getData();
  }

  /**
   * Create a variable
   * 
   * @param variable  (required)
   * @return ApiResponse&lt;Variable&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Client specified an invalid argument. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Request not authenticated due to missing, invalid, authentication info. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Client does not have sufficient permission. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Variable> createVariableWithHttpInfo(Variable variable) throws ApiException {
    Object localVarPostBody = variable;
    
    // verify the required parameter 'variable' is set
    if (variable == null) {
      throw new ApiException(400, "Missing the required parameter 'variable' when calling createVariable");
    }
    
    // create path and map variables
    String localVarPath = "/variables";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Variable> localVarReturnType = new GenericType<Variable>() {};

    return apiClient.invokeAPI("VariableApi.createVariable", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, null);
  }
  /**
   * Delete variable
   * 
   * @param variableKey The Variable Key. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No content. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Client specified an invalid argument. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Request not authenticated due to missing, invalid, authentication info. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Client does not have sufficient permission. </td><td>  -  </td></tr>
     </table>
   */
  public void deleteVariable(String variableKey) throws ApiException {
    deleteVariableWithHttpInfo(variableKey);
  }

  /**
   * Delete variable
   * 
   * @param variableKey The Variable Key. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No content. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Client specified an invalid argument. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Request not authenticated due to missing, invalid, authentication info. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Client does not have sufficient permission. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteVariableWithHttpInfo(String variableKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'variableKey' is set
    if (variableKey == null) {
      throw new ApiException(400, "Missing the required parameter 'variableKey' when calling deleteVariable");
    }
    
    // create path and map variables
    String localVarPath = "/variables/{variable_key}"
      .replaceAll("\\{" + "variable_key" + "\\}", apiClient.escapeString(variableKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    return apiClient.invokeAPI("VariableApi.deleteVariable", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, null);
  }
  /**
   * Get a variable by key
   * 
   * @param variableKey The Variable Key. (required)
   * @return Variable
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Request not authenticated due to missing, invalid, authentication info. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Client does not have sufficient permission. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> A specified resource is not found. </td><td>  -  </td></tr>
     </table>
   */
  public Variable getVariable(String variableKey) throws ApiException {
    return getVariableWithHttpInfo(variableKey).getData();
  }

  /**
   * Get a variable by key
   * 
   * @param variableKey The Variable Key. (required)
   * @return ApiResponse&lt;Variable&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Request not authenticated due to missing, invalid, authentication info. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Client does not have sufficient permission. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> A specified resource is not found. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Variable> getVariableWithHttpInfo(String variableKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'variableKey' is set
    if (variableKey == null) {
      throw new ApiException(400, "Missing the required parameter 'variableKey' when calling getVariable");
    }
    
    // create path and map variables
    String localVarPath = "/variables/{variable_key}"
      .replaceAll("\\{" + "variable_key" + "\\}", apiClient.escapeString(variableKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Variable> localVarReturnType = new GenericType<Variable>() {};

    return apiClient.invokeAPI("VariableApi.getVariable", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, null);
  }
  /**
   * Get all variables
   * The collection does not contain data. To get data, you must get a single entity.
   * @param limit The numbers of items to return. (optional, default to 100)
   * @param offset The number of items to skip before starting to collect the result set. (optional)
   * @return VariableCollection
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List of variables. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Request not authenticated due to missing, invalid, authentication info. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Client does not have sufficient permission. </td><td>  -  </td></tr>
     </table>
   */
  public VariableCollection getVariables(Integer limit, Integer offset) throws ApiException {
    return getVariablesWithHttpInfo(limit, offset).getData();
  }

  /**
   * Get all variables
   * The collection does not contain data. To get data, you must get a single entity.
   * @param limit The numbers of items to return. (optional, default to 100)
   * @param offset The number of items to skip before starting to collect the result set. (optional)
   * @return ApiResponse&lt;VariableCollection&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List of variables. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Request not authenticated due to missing, invalid, authentication info. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Client does not have sufficient permission. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VariableCollection> getVariablesWithHttpInfo(Integer limit, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/variables";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<VariableCollection> localVarReturnType = new GenericType<VariableCollection>() {};

    return apiClient.invokeAPI("VariableApi.getVariables", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, null);
  }
  /**
   * Update a variable by key
   * 
   * @param variableKey The Variable Key. (required)
   * @param variable  (required)
   * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;String&gt;())
   * @return Variable
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Client specified an invalid argument. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Request not authenticated due to missing, invalid, authentication info. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Client does not have sufficient permission. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> A specified resource is not found. </td><td>  -  </td></tr>
     </table>
   */
  public Variable updateVariable(String variableKey, Variable variable, List<String> updateMask) throws ApiException {
    return updateVariableWithHttpInfo(variableKey, variable, updateMask).getData();
  }

  /**
   * Update a variable by key
   * 
   * @param variableKey The Variable Key. (required)
   * @param variable  (required)
   * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;String&gt;())
   * @return ApiResponse&lt;Variable&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Client specified an invalid argument. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Request not authenticated due to missing, invalid, authentication info. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Client does not have sufficient permission. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> A specified resource is not found. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Variable> updateVariableWithHttpInfo(String variableKey, Variable variable, List<String> updateMask) throws ApiException {
    Object localVarPostBody = variable;
    
    // verify the required parameter 'variableKey' is set
    if (variableKey == null) {
      throw new ApiException(400, "Missing the required parameter 'variableKey' when calling updateVariable");
    }
    
    // verify the required parameter 'variable' is set
    if (variable == null) {
      throw new ApiException(400, "Missing the required parameter 'variable' when calling updateVariable");
    }
    
    // create path and map variables
    String localVarPath = "/variables/{variable_key}"
      .replaceAll("\\{" + "variable_key" + "\\}", apiClient.escapeString(variableKey.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "update_mask", updateMask));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Variable> localVarReturnType = new GenericType<Variable>() {};

    return apiClient.invokeAPI("VariableApi.updateVariable", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, null);
  }
}
