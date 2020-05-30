package org.openapitools.client.api;

import java.math.BigDecimal;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.ExtraLinkCollection;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.ListTaskInstanceForm;
import org.threeten.bp.OffsetDateTime;
import org.openapitools.client.model.TaskInstance;
import org.openapitools.client.model.TaskInstanceCollection;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-30T18:46:07.346Z[GMT]")
public class TaskInstanceApiImpl implements TaskInstanceApi {

    private ApiClient apiClient;

    public TaskInstanceApiImpl() {
        this(null);
    }

    public TaskInstanceApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient != null ? apiClient : Configuration.getDefaultApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get extra links for task instance
     * 
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param taskId The Task ID. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getExtraLinks(String dagId, String dagRunId, String taskId, Handler<AsyncResult<ExtraLinkCollection>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagId' when calling getExtraLinks"));
            return;
        }
        
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagRunId' when calling getExtraLinks"));
            return;
        }
        
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'taskId' when calling getExtraLinks"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/links".replaceAll("\\{" + "dag_id" + "\\}", dagId.toString()).replaceAll("\\{" + "dag_run_id" + "\\}", dagRunId.toString()).replaceAll("\\{" + "task_id" + "\\}", taskId.toString());

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
        TypeReference<ExtraLinkCollection> localVarReturnType = new TypeReference<ExtraLinkCollection>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Get logs for a task instance
     * Get logs for a specific task instance and its try number
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param taskId The Task ID. (required)
     * @param taskTryNumber The Task Try Number. (required)
     * @param fullContent A full content will be returned. By default, only the first fragment will be returned.  (optional)
     * @param token A token that allows you to continue fetching logs. If passed, it will specify the location from which the download should be continued.  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getLogs(String dagId, String dagRunId, String taskId, Integer taskTryNumber, Boolean fullContent, String token, Handler<AsyncResult<InlineResponse200>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagId' when calling getLogs"));
            return;
        }
        
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagRunId' when calling getLogs"));
            return;
        }
        
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'taskId' when calling getLogs"));
            return;
        }
        
        // verify the required parameter 'taskTryNumber' is set
        if (taskTryNumber == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'taskTryNumber' when calling getLogs"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/logs/{task_try_number}".replaceAll("\\{" + "dag_id" + "\\}", dagId.toString()).replaceAll("\\{" + "dag_run_id" + "\\}", dagRunId.toString()).replaceAll("\\{" + "task_id" + "\\}", taskId.toString()).replaceAll("\\{" + "task_try_number" + "\\}", taskTryNumber.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "full_content", fullContent));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "token", token));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json", "text/plain" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] {  };
        TypeReference<InlineResponse200> localVarReturnType = new TypeReference<InlineResponse200>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Get a task instance
     * 
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param taskId The Task ID. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getTaskInstance(String dagId, String dagRunId, String taskId, Handler<AsyncResult<TaskInstance>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagId' when calling getTaskInstance"));
            return;
        }
        
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagRunId' when calling getTaskInstance"));
            return;
        }
        
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'taskId' when calling getTaskInstance"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}".replaceAll("\\{" + "dag_id" + "\\}", dagId.toString()).replaceAll("\\{" + "dag_run_id" + "\\}", dagRunId.toString()).replaceAll("\\{" + "task_id" + "\\}", taskId.toString());

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
        TypeReference<TaskInstance> localVarReturnType = new TypeReference<TaskInstance>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Get a list of task instance of DAG.
     * This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id to retrieve DAG Runs for all DAGs and DAG Runs. 
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param executionDateGte Returns objects greater or equal to the specified date. This can be combined with execution_date_lte parameter to receive only the selected period.  (optional)
     * @param executionDateLte Returns objects less than or equal to the specified date. This can be combined with execution_date_gte parameter to receive only the selected period.  (optional)
     * @param startDateGte Returns objects greater or equal the specified date. This can be combined with startd_ate_lte parameter to receive only the selected period.  (optional)
     * @param startDateLte Returns objects less or equal the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  (optional)
     * @param endDateGte Returns objects greater or equal the specified date. This can be combined with start_date_lte parameter to receive only the selected period.  (optional)
     * @param endDateLte Returns objects less than or equal to the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  (optional)
     * @param durationGte Returns objects greater than or equal to the specified values. This can be combined with duration_lte parameter to receive only the selected period.  (optional)
     * @param durationLte Returns objects less than or equal to the specified values. This can be combined with duration_gte parameter to receive only the selected range.  (optional)
     * @param state The value can be repeated to retrieve multiple matching values (OR condition). (optional, default to new ArrayList&lt;&gt;())
     * @param pool The value can be repeated to retrieve multiple matching values (OR condition). (optional, default to new ArrayList&lt;&gt;())
     * @param queue The value can be repeated to retrieve multiple matching values (OR condition). (optional, default to new ArrayList&lt;&gt;())
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getTaskInstances(String dagId, String dagRunId, OffsetDateTime executionDateGte, OffsetDateTime executionDateLte, OffsetDateTime startDateGte, OffsetDateTime startDateLte, OffsetDateTime endDateGte, OffsetDateTime endDateLte, BigDecimal durationGte, BigDecimal durationLte, List<String> state, List<String> pool, List<String> queue, Integer limit, Integer offset, Handler<AsyncResult<TaskInstanceCollection>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagId' when calling getTaskInstances"));
            return;
        }
        
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagRunId' when calling getTaskInstances"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances".replaceAll("\\{" + "dag_id" + "\\}", dagId.toString()).replaceAll("\\{" + "dag_run_id" + "\\}", dagRunId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "execution_date_gte", executionDateGte));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "execution_date_lte", executionDateLte));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date_gte", startDateGte));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date_lte", startDateLte));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date_gte", endDateGte));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date_lte", endDateLte));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "duration_gte", durationGte));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "duration_lte", durationLte));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "state", state));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "pool", pool));
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "Queue", queue));
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
        TypeReference<TaskInstanceCollection> localVarReturnType = new TypeReference<TaskInstanceCollection>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Get list of task instances from all DAGs and DAG Runs.
     * This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits 
     * @param listTaskInstanceForm  (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getTaskInstancesBatch(ListTaskInstanceForm listTaskInstanceForm, Handler<AsyncResult<TaskInstanceCollection>> resultHandler) {
        Object localVarBody = listTaskInstanceForm;
        
        // verify the required parameter 'listTaskInstanceForm' is set
        if (listTaskInstanceForm == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'listTaskInstanceForm' when calling getTaskInstancesBatch"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/dags/~/dagRuns/~/taskInstances/list";

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
        TypeReference<TaskInstanceCollection> localVarReturnType = new TypeReference<TaskInstanceCollection>() {};
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
}
