package org.openapitools.client.api;

import org.openapitools.client.model.ClearTaskInstance;
import org.openapitools.client.model.DAG;
import org.openapitools.client.model.DAGCollection;
import org.openapitools.client.model.DAGDetail;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.InlineResponse2001;
import org.openapitools.client.model.Task;
import org.openapitools.client.model.TaskCollection;
import org.openapitools.client.model.TaskInstanceReferenceCollection;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:10:30.163Z[GMT]")
public class DagApiImpl implements DagApi {

    private ApiClient apiClient;

    public DagApiImpl() {
        this(null);
    }

    public DagApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient != null ? apiClient : Configuration.getDefaultApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Clears a set of task instances associated with the DAG for a specified date range.
     * 
     * @param dagId The DAG ID. (required)
     * @param clearTaskInstance Parameters of action (required)
     * @param resultHandler Asynchronous result handler
     */
    public void clearTaskInstance(String dagId, ClearTaskInstance clearTaskInstance, Handler<AsyncResult<TaskInstanceReferenceCollection>> resultHandler) {
        Object localVarBody = clearTaskInstance;
        
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagId' when calling clearTaskInstance"));
            return;
        }
        
        // verify the required parameter 'clearTaskInstance' is set
        if (clearTaskInstance == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'clearTaskInstance' when calling clearTaskInstance"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/dags/{dag_id}/clearTaskInstances".replaceAll("\\{" + "dag_id" + "\\}", dagId.toString());

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
        TypeReference<TaskInstanceReferenceCollection> localVarReturnType = new TypeReference<TaskInstanceReferenceCollection>() {};
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Get basic information about a DAG
     * Presents only information available in database (DAGModel). If you need detailed information, consider using GET /dags/{dag_id}/detail. 
     * @param dagId The DAG ID. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getDag(String dagId, Handler<AsyncResult<DAG>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagId' when calling getDag"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/dags/{dag_id}".replaceAll("\\{" + "dag_id" + "\\}", dagId.toString());

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
        TypeReference<DAG> localVarReturnType = new TypeReference<DAG>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Get a simplified representation of DAG.
     * The response contains many DAG attributes, so the response can be large. If possible, consider using GET /dags/{dag_id}. 
     * @param dagId The DAG ID. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getDagDetail(String dagId, Handler<AsyncResult<DAGDetail>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagId' when calling getDagDetail"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/dags/{dag_id}/details".replaceAll("\\{" + "dag_id" + "\\}", dagId.toString());

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
        TypeReference<DAGDetail> localVarReturnType = new TypeReference<DAGDetail>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Get source code using file token
     * 
     * @param fileToken The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change.  (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getDagSource(String fileToken, Handler<AsyncResult<InlineResponse2001>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'fileToken' is set
        if (fileToken == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'fileToken' when calling getDagSource"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/dagSources/{file_token}".replaceAll("\\{" + "file_token" + "\\}", fileToken.toString());

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
        TypeReference<InlineResponse2001> localVarReturnType = new TypeReference<InlineResponse2001>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Get all DAGs
     * 
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getDags(Integer limit, Integer offset, Handler<AsyncResult<DAGCollection>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/dags";

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
        TypeReference<DAGCollection> localVarReturnType = new TypeReference<DAGCollection>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Get simplified representation of a task.
     * 
     * @param dagId The DAG ID. (required)
     * @param taskId The Task ID. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getTask(String dagId, String taskId, Handler<AsyncResult<Task>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagId' when calling getTask"));
            return;
        }
        
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'taskId' when calling getTask"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/dags/{dag_id}/tasks/{task_id}".replaceAll("\\{" + "dag_id" + "\\}", dagId.toString()).replaceAll("\\{" + "task_id" + "\\}", taskId.toString());

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
        TypeReference<Task> localVarReturnType = new TypeReference<Task>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Get tasks for DAG
     * 
     * @param dagId The DAG ID. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getTasks(String dagId, Handler<AsyncResult<TaskCollection>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagId' when calling getTasks"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/dags/{dag_id}/tasks".replaceAll("\\{" + "dag_id" + "\\}", dagId.toString());

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
        TypeReference<TaskCollection> localVarReturnType = new TypeReference<TaskCollection>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Update a DAG
     * 
     * @param dagId The DAG ID. (required)
     * @param DAG  (required)
     * @param resultHandler Asynchronous result handler
     */
    public void updateDag(String dagId, DAG DAG, Handler<AsyncResult<DAG>> resultHandler) {
        Object localVarBody = DAG;
        
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagId' when calling updateDag"));
            return;
        }
        
        // verify the required parameter 'DAG' is set
        if (DAG == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'DAG' when calling updateDag"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/dags/{dag_id}".replaceAll("\\{" + "dag_id" + "\\}", dagId.toString());

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
        TypeReference<DAG> localVarReturnType = new TypeReference<DAG>() {};
        apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
}
