package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.Pool;
import org.openapitools.client.model.PoolCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-31T07:37:07.361Z[GMT]")
public class PoolApi {
  private ApiClient apiClient;

  public PoolApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PoolApi(ApiClient apiClient) {
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
   * Create a pool
   * 
   * @param pool  (required)
   * @return Pool
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
  public Pool createPool(Pool pool) throws ApiException {
    return createPoolWithHttpInfo(pool).getData();
  }

  /**
   * Create a pool
   * 
   * @param pool  (required)
   * @return ApiResponse&lt;Pool&gt;
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
  public ApiResponse<Pool> createPoolWithHttpInfo(Pool pool) throws ApiException {
    Object localVarPostBody = pool;
    
    // verify the required parameter 'pool' is set
    if (pool == null) {
      throw new ApiException(400, "Missing the required parameter 'pool' when calling createPool");
    }
    
    // create path and map variables
    String localVarPath = "/pools";

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

    GenericType<Pool> localVarReturnType = new GenericType<Pool>() {};

    return apiClient.invokeAPI("PoolApi.createPool", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, null);
  }
  /**
   * Delete a pool
   * 
   * @param poolName The Pool name. (required)
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
  public void deletePool(String poolName) throws ApiException {
    deletePoolWithHttpInfo(poolName);
  }

  /**
   * Delete a pool
   * 
   * @param poolName The Pool name. (required)
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
  public ApiResponse<Void> deletePoolWithHttpInfo(String poolName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'poolName' is set
    if (poolName == null) {
      throw new ApiException(400, "Missing the required parameter 'poolName' when calling deletePool");
    }
    
    // create path and map variables
    String localVarPath = "/pools/{pool_name}"
      .replaceAll("\\{" + "pool_name" + "\\}", apiClient.escapeString(poolName.toString()));

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

    return apiClient.invokeAPI("PoolApi.deletePool", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, null);
  }
  /**
   * Get a pool
   * 
   * @param poolName The Pool name. (required)
   * @return Pool
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
  public Pool getPool(String poolName) throws ApiException {
    return getPoolWithHttpInfo(poolName).getData();
  }

  /**
   * Get a pool
   * 
   * @param poolName The Pool name. (required)
   * @return ApiResponse&lt;Pool&gt;
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
  public ApiResponse<Pool> getPoolWithHttpInfo(String poolName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'poolName' is set
    if (poolName == null) {
      throw new ApiException(400, "Missing the required parameter 'poolName' when calling getPool");
    }
    
    // create path and map variables
    String localVarPath = "/pools/{pool_name}"
      .replaceAll("\\{" + "pool_name" + "\\}", apiClient.escapeString(poolName.toString()));

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

    GenericType<Pool> localVarReturnType = new GenericType<Pool>() {};

    return apiClient.invokeAPI("PoolApi.getPool", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, null);
  }
  /**
   * Get all pools
   * 
   * @param limit The numbers of items to return. (optional, default to 100)
   * @param offset The number of items to skip before starting to collect the result set. (optional)
   * @return PoolCollection
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List of pools. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Request not authenticated due to missing, invalid, authentication info. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Client does not have sufficient permission. </td><td>  -  </td></tr>
     </table>
   */
  public PoolCollection getPools(Integer limit, Integer offset) throws ApiException {
    return getPoolsWithHttpInfo(limit, offset).getData();
  }

  /**
   * Get all pools
   * 
   * @param limit The numbers of items to return. (optional, default to 100)
   * @param offset The number of items to skip before starting to collect the result set. (optional)
   * @return ApiResponse&lt;PoolCollection&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List of pools. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Request not authenticated due to missing, invalid, authentication info. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Client does not have sufficient permission. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PoolCollection> getPoolsWithHttpInfo(Integer limit, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/pools";

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

    GenericType<PoolCollection> localVarReturnType = new GenericType<PoolCollection>() {};

    return apiClient.invokeAPI("PoolApi.getPools", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, null);
  }
  /**
   * Update a pool
   * 
   * @param poolName The Pool name. (required)
   * @param pool  (required)
   * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;String&gt;())
   * @return Pool
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
  public Pool updatePool(String poolName, Pool pool, List<String> updateMask) throws ApiException {
    return updatePoolWithHttpInfo(poolName, pool, updateMask).getData();
  }

  /**
   * Update a pool
   * 
   * @param poolName The Pool name. (required)
   * @param pool  (required)
   * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;String&gt;())
   * @return ApiResponse&lt;Pool&gt;
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
  public ApiResponse<Pool> updatePoolWithHttpInfo(String poolName, Pool pool, List<String> updateMask) throws ApiException {
    Object localVarPostBody = pool;
    
    // verify the required parameter 'poolName' is set
    if (poolName == null) {
      throw new ApiException(400, "Missing the required parameter 'poolName' when calling updatePool");
    }
    
    // verify the required parameter 'pool' is set
    if (pool == null) {
      throw new ApiException(400, "Missing the required parameter 'pool' when calling updatePool");
    }
    
    // create path and map variables
    String localVarPath = "/pools/{pool_name}"
      .replaceAll("\\{" + "pool_name" + "\\}", apiClient.escapeString(poolName.toString()));

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

    GenericType<Pool> localVarReturnType = new GenericType<Pool>() {};

    return apiClient.invokeAPI("PoolApi.updatePool", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, null);
  }
}
