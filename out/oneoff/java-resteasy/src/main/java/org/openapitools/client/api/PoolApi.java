package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:10:18.569Z[GMT]")
public class PoolApi {
  private ApiClient apiClient;

  public PoolApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PoolApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a pool
   * 
   * @param pool  (required)
   * @return a {@code Pool}
   * @throws ApiException if fails to make API call
   */
  public Pool createPool(Pool pool) throws ApiException {
    Object localVarPostBody = pool;
    
    // verify the required parameter 'pool' is set
    if (pool == null) {
      throw new ApiException(400, "Missing the required parameter 'pool' when calling createPool");
    }
    
    // create path and map variables
    String localVarPath = "/pools".replaceAll("\\{format\\}","json");

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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a pool
   * 
   * @param poolName The Pool name. (required)
   * @throws ApiException if fails to make API call
   */
  public void deletePool(String poolName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'poolName' is set
    if (poolName == null) {
      throw new ApiException(400, "Missing the required parameter 'poolName' when calling deletePool");
    }
    
    // create path and map variables
    String localVarPath = "/pools/{pool_name}".replaceAll("\\{format\\}","json")
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


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get a pool
   * 
   * @param poolName The Pool name. (required)
   * @return a {@code Pool}
   * @throws ApiException if fails to make API call
   */
  public Pool getPool(String poolName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'poolName' is set
    if (poolName == null) {
      throw new ApiException(400, "Missing the required parameter 'poolName' when calling getPool");
    }
    
    // create path and map variables
    String localVarPath = "/pools/{pool_name}".replaceAll("\\{format\\}","json")
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
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all pools
   * 
   * @param limit The numbers of items to return. (optional, default to 100)
   * @param offset The number of items to skip before starting to collect the result set. (optional)
   * @return a {@code PoolCollection}
   * @throws ApiException if fails to make API call
   */
  public PoolCollection getPools(Integer limit, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/pools".replaceAll("\\{format\\}","json");

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
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update a pool
   * 
   * @param poolName The Pool name. (required)
   * @param pool  (required)
   * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;String&gt;())
   * @return a {@code Pool}
   * @throws ApiException if fails to make API call
   */
  public Pool updatePool(String poolName, Pool pool, List<String> updateMask) throws ApiException {
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
    String localVarPath = "/pools/{pool_name}".replaceAll("\\{format\\}","json")
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
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
