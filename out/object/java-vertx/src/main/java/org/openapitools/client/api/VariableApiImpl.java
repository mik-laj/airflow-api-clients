package org.openapitools.client.api;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.Variable;
import org.openapitools.client.model.VariableCollection;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:06:30.200Z[GMT]")
public class VariableApiImpl implements VariableApi {

    private ApiClient apiClient;

    public VariableApiImpl() {
        this(null);
    }

    public VariableApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient != null ? apiClient : Configuration.getDefaultApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a variable
     * 
     * @param variable  (required)
     * @param resultHandler Asynchronous result handler
     */
    public void createVariable(Variable variable, Handler<AsyncResult<Variable>> resultHandler) {
        Object localVarBody = variable;
        
        // verify the required parameter 'variable' is set
        if (variable == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'variable' when calling createVariable"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/variables";

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
        TypeReference<Variable> localVarReturnType = new TypeReference<Variable>() {};
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Delete variable
     * 
     * @param variableKey The Variable Key. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void deleteVariable(String variableKey, Handler<AsyncResult<Void>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'variableKey' is set
        if (variableKey == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'variableKey' when calling deleteVariable"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/variables/{variable_key}".replaceAll("\\{" + "variable_key" + "\\}", variableKey.toString());

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
     * Get a variable by key
     * 
     * @param variableKey The Variable Key. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getVariable(String variableKey, Handler<AsyncResult<Variable>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'variableKey' is set
        if (variableKey == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'variableKey' when calling getVariable"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/variables/{variable_key}".replaceAll("\\{" + "variable_key" + "\\}", variableKey.toString());

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
        TypeReference<Variable> localVarReturnType = new TypeReference<Variable>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Get all variables
     * The collection does not contain data. To get data, you must get a single entity.
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getVariables(Integer limit, Integer offset, Handler<AsyncResult<VariableCollection>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/variables";

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
        TypeReference<VariableCollection> localVarReturnType = new TypeReference<VariableCollection>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Update a variable by key
     * 
     * @param variableKey The Variable Key. (required)
     * @param variable  (required)
     * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;&gt;())
     * @param resultHandler Asynchronous result handler
     */
    public void updateVariable(String variableKey, Variable variable, List<String> updateMask, Handler<AsyncResult<Variable>> resultHandler) {
        Object localVarBody = variable;
        
        // verify the required parameter 'variableKey' is set
        if (variableKey == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'variableKey' when calling updateVariable"));
            return;
        }
        
        // verify the required parameter 'variable' is set
        if (variable == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'variable' when calling updateVariable"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/variables/{variable_key}".replaceAll("\\{" + "variable_key" + "\\}", variableKey.toString());

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
        TypeReference<Variable> localVarReturnType = new TypeReference<Variable>() {};
        apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
}
