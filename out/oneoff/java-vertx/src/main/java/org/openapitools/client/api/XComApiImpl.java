package org.openapitools.client.api;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.XCom;
import org.openapitools.client.model.XComCollection;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-31T07:39:38.900Z[GMT]")
public class XComApiImpl implements XComApi {

    private ApiClient apiClient;

    public XComApiImpl() {
        this(null);
    }

    public XComApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient != null ? apiClient : Configuration.getDefaultApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete an XCom entry
     * 
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param taskId The Task ID. (required)
     * @param key The XCom Key. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void deleteXComValue(String dagId, String dagRunId, String taskId, String key, Handler<AsyncResult<Void>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagId' when calling deleteXComValue"));
            return;
        }
        
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagRunId' when calling deleteXComValue"));
            return;
        }
        
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'taskId' when calling deleteXComValue"));
            return;
        }
        
        // verify the required parameter 'key' is set
        if (key == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'key' when calling deleteXComValue"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}".replaceAll("\\{" + "dag_id" + "\\}", dagId.toString()).replaceAll("\\{" + "dag_run_id" + "\\}", dagRunId.toString()).replaceAll("\\{" + "task_id" + "\\}", taskId.toString()).replaceAll("\\{" + "key" + "\\}", key.toString());

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
     * Get all XCom entries
     * This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id, task_id to retrieve XCOM entries for for all DAGs, DAG Runs and task instances.
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param taskId The Task ID. (required)
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getXComEntry(String dagId, String dagRunId, String taskId, Integer limit, Integer offset, Handler<AsyncResult<XComCollection>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagId' when calling getXComEntry"));
            return;
        }
        
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagRunId' when calling getXComEntry"));
            return;
        }
        
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'taskId' when calling getXComEntry"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries".replaceAll("\\{" + "dag_id" + "\\}", dagId.toString()).replaceAll("\\{" + "dag_run_id" + "\\}", dagRunId.toString()).replaceAll("\\{" + "task_id" + "\\}", taskId.toString());

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
        TypeReference<XComCollection> localVarReturnType = new TypeReference<XComCollection>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Get an XCom entry
     * 
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param taskId The Task ID. (required)
     * @param key The XCom Key. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getXComValue(String dagId, String dagRunId, String taskId, String key, Handler<AsyncResult<XCom>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagId' when calling getXComValue"));
            return;
        }
        
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagRunId' when calling getXComValue"));
            return;
        }
        
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'taskId' when calling getXComValue"));
            return;
        }
        
        // verify the required parameter 'key' is set
        if (key == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'key' when calling getXComValue"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}".replaceAll("\\{" + "dag_id" + "\\}", dagId.toString()).replaceAll("\\{" + "dag_run_id" + "\\}", dagRunId.toString()).replaceAll("\\{" + "task_id" + "\\}", taskId.toString()).replaceAll("\\{" + "key" + "\\}", key.toString());

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
        TypeReference<XCom> localVarReturnType = new TypeReference<XCom>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Create an XCom entry
     * 
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param taskId The Task ID. (required)
     * @param xcom  (required)
     * @param resultHandler Asynchronous result handler
     */
    public void updateXComEntry(String dagId, String dagRunId, String taskId, XCom xcom, Handler<AsyncResult<XCom>> resultHandler) {
        Object localVarBody = xcom;
        
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagId' when calling updateXComEntry"));
            return;
        }
        
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagRunId' when calling updateXComEntry"));
            return;
        }
        
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'taskId' when calling updateXComEntry"));
            return;
        }
        
        // verify the required parameter 'xcom' is set
        if (xcom == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'xcom' when calling updateXComEntry"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries".replaceAll("\\{" + "dag_id" + "\\}", dagId.toString()).replaceAll("\\{" + "dag_run_id" + "\\}", dagRunId.toString()).replaceAll("\\{" + "task_id" + "\\}", taskId.toString());

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
        TypeReference<XCom> localVarReturnType = new TypeReference<XCom>() {};
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Update an XCom entry
     * 
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param taskId The Task ID. (required)
     * @param key The XCom Key. (required)
     * @param xcom  (required)
     * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;&gt;())
     * @param resultHandler Asynchronous result handler
     */
    public void updateXComValue(String dagId, String dagRunId, String taskId, String key, XCom xcom, List<String> updateMask, Handler<AsyncResult<XCom>> resultHandler) {
        Object localVarBody = xcom;
        
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagId' when calling updateXComValue"));
            return;
        }
        
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagRunId' when calling updateXComValue"));
            return;
        }
        
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'taskId' when calling updateXComValue"));
            return;
        }
        
        // verify the required parameter 'key' is set
        if (key == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'key' when calling updateXComValue"));
            return;
        }
        
        // verify the required parameter 'xcom' is set
        if (xcom == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'xcom' when calling updateXComValue"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}".replaceAll("\\{" + "dag_id" + "\\}", dagId.toString()).replaceAll("\\{" + "dag_run_id" + "\\}", dagRunId.toString()).replaceAll("\\{" + "task_id" + "\\}", taskId.toString()).replaceAll("\\{" + "key" + "\\}", key.toString());

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
        TypeReference<XCom> localVarReturnType = new TypeReference<XCom>() {};
        apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
}
