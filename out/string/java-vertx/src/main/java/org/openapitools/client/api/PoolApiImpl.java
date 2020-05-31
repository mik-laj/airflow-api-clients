package org.openapitools.client.api;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.Pool;
import org.openapitools.client.model.PoolCollection;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.MultiMap;
import io.vertx.core.json.JsonObject;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.*;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-31T07:37:24.519Z[GMT]")
public class PoolApiImpl implements PoolApi {

    private ApiClient apiClient;

    public PoolApiImpl() {
        this(null);
    }

    public PoolApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient != null ? apiClient : Configuration.getDefaultApiClient();
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
     * @param resultHandler Asynchronous result handler
     */
    public void createPool(Pool pool, Handler<AsyncResult<Pool>> resultHandler) {
        Object localVarBody = pool;
        
        // verify the required parameter 'pool' is set
        if (pool == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'pool' when calling createPool"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/pools";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] {  };
        TypeReference<Pool> localVarReturnType = new TypeReference<Pool>() {};
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Delete a pool
     * 
     * @param poolName The Pool name. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void deletePool(String poolName, Handler<AsyncResult<Void>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'poolName' is set
        if (poolName == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'poolName' when calling deletePool"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/pools/{pool_name}".replaceAll("\\{" + "pool_name" + "\\}", poolName.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] {  };

        apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, null, resultHandler);
    }
    /**
     * Get a pool
     * 
     * @param poolName The Pool name. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getPool(String poolName, Handler<AsyncResult<Pool>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'poolName' is set
        if (poolName == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'poolName' when calling getPool"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/pools/{pool_name}".replaceAll("\\{" + "pool_name" + "\\}", poolName.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] {  };
        TypeReference<Pool> localVarReturnType = new TypeReference<Pool>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Get all pools
     * 
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getPools(Integer limit, Integer offset, Handler<AsyncResult<PoolCollection>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/pools";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] {  };
        TypeReference<PoolCollection> localVarReturnType = new TypeReference<PoolCollection>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Update a pool
     * 
     * @param poolName The Pool name. (required)
     * @param pool  (required)
     * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;&gt;())
     * @param resultHandler Asynchronous result handler
     */
    public void updatePool(String poolName, Pool pool, List<String> updateMask, Handler<AsyncResult<Pool>> resultHandler) {
        Object localVarBody = pool;
        
        // verify the required parameter 'poolName' is set
        if (poolName == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'poolName' when calling updatePool"));
            return;
        }
        
        // verify the required parameter 'pool' is set
        if (pool == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'pool' when calling updatePool"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/pools/{pool_name}".replaceAll("\\{" + "pool_name" + "\\}", poolName.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "update_mask", updateMask));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] {  };
        TypeReference<Pool> localVarReturnType = new TypeReference<Pool>() {};
        apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
}
