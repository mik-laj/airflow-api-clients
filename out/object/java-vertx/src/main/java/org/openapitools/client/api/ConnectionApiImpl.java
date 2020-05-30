package org.openapitools.client.api;

import org.openapitools.client.model.Connection;
import org.openapitools.client.model.ConnectionCollection;
import org.openapitools.client.model.Error;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-30T18:47:16.120Z[GMT]")
public class ConnectionApiImpl implements ConnectionApi {

    private ApiClient apiClient;

    public ConnectionApiImpl() {
        this(null);
    }

    public ConnectionApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient != null ? apiClient : Configuration.getDefaultApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create connection entry
     * 
     * @param connection  (required)
     * @param resultHandler Asynchronous result handler
     */
    public void createConnection(Connection connection, Handler<AsyncResult<Connection>> resultHandler) {
        Object localVarBody = connection;
        
        // verify the required parameter 'connection' is set
        if (connection == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'connection' when calling createConnection"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/connections";

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
        TypeReference<Connection> localVarReturnType = new TypeReference<Connection>() {};
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Delete a connection entry
     * 
     * @param connectionId The Connection ID. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void deleteConnection(Integer connectionId, Handler<AsyncResult<Void>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'connectionId' is set
        if (connectionId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'connectionId' when calling deleteConnection"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/connections/{connection_id}".replaceAll("\\{" + "connection_id" + "\\}", connectionId.toString());

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
     * Get a connection entry
     * 
     * @param connectionId The Connection ID. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getConnection(Integer connectionId, Handler<AsyncResult<Connection>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'connectionId' is set
        if (connectionId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'connectionId' when calling getConnection"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/connections/{connection_id}".replaceAll("\\{" + "connection_id" + "\\}", connectionId.toString());

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
        TypeReference<Connection> localVarReturnType = new TypeReference<Connection>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Get all connection entries
     * 
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getConnections(Integer limit, Integer offset, Handler<AsyncResult<ConnectionCollection>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/connections";

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
        TypeReference<ConnectionCollection> localVarReturnType = new TypeReference<ConnectionCollection>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Update a connection entry
     * 
     * @param connectionId The Connection ID. (required)
     * @param connection  (required)
     * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;&gt;())
     * @param resultHandler Asynchronous result handler
     */
    public void updateConnection(Integer connectionId, Connection connection, List<String> updateMask, Handler<AsyncResult<Connection>> resultHandler) {
        Object localVarBody = connection;
        
        // verify the required parameter 'connectionId' is set
        if (connectionId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'connectionId' when calling updateConnection"));
            return;
        }
        
        // verify the required parameter 'connection' is set
        if (connection == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'connection' when calling updateConnection"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/connections/{connection_id}".replaceAll("\\{" + "connection_id" + "\\}", connectionId.toString());

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
        TypeReference<Connection> localVarReturnType = new TypeReference<Connection>() {};
        apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
}
