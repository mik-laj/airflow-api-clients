package org.openapitools.client.api;

import org.openapitools.client.model.DAGRun;
import org.openapitools.client.model.DAGRunCollection;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.ListDagRunsForm;
import org.threeten.bp.OffsetDateTime;

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
public class DagRunApiImpl implements DagRunApi {

    private ApiClient apiClient;

    public DagRunApiImpl() {
        this(null);
    }

    public DagRunApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient != null ? apiClient : Configuration.getDefaultApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Trigger a DAG Run
     * 
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param daGRun  (required)
     * @param resultHandler Asynchronous result handler
     */
    public void createDagRun(String dagId, String dagRunId, DAGRun daGRun, Handler<AsyncResult<DAGRun>> resultHandler) {
        Object localVarBody = daGRun;
        
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagId' when calling createDagRun"));
            return;
        }
        
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagRunId' when calling createDagRun"));
            return;
        }
        
        // verify the required parameter 'daGRun' is set
        if (daGRun == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'daGRun' when calling createDagRun"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}".replaceAll("\\{" + "dag_id" + "\\}", dagId.toString()).replaceAll("\\{" + "dag_run_id" + "\\}", dagRunId.toString());

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
        TypeReference<DAGRun> localVarReturnType = new TypeReference<DAGRun>() {};
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Delete a DAG Run
     * 
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void deleteDagRun(String dagId, String dagRunId, Handler<AsyncResult<Void>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagId' when calling deleteDagRun"));
            return;
        }
        
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagRunId' when calling deleteDagRun"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}".replaceAll("\\{" + "dag_id" + "\\}", dagId.toString()).replaceAll("\\{" + "dag_run_id" + "\\}", dagRunId.toString());

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
     * Get a DAG Run
     * 
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getDagRun(String dagId, String dagRunId, Handler<AsyncResult<DAGRun>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagId' when calling getDagRun"));
            return;
        }
        
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagRunId' when calling getDagRun"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}".replaceAll("\\{" + "dag_id" + "\\}", dagId.toString()).replaceAll("\\{" + "dag_run_id" + "\\}", dagRunId.toString());

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
        TypeReference<DAGRun> localVarReturnType = new TypeReference<DAGRun>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Get all DAG Runs
     * This endpoint allows specifying &#x60;~&#x60; as the dag_id to retrieve DAG Runs for all DAGs. 
     * @param dagId The DAG ID. (required)
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @param executionDateGte Returns objects greater or equal to the specified date. This can be combined with execution_date_lte parameter to receive only the selected period.  (optional)
     * @param executionDateLte Returns objects less than or equal to the specified date. This can be combined with execution_date_gte parameter to receive only the selected period.  (optional)
     * @param startDateGte Returns objects greater or equal the specified date. This can be combined with startd_ate_lte parameter to receive only the selected period.  (optional)
     * @param startDateLte Returns objects less or equal the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  (optional)
     * @param endDateGte Returns objects greater or equal the specified date. This can be combined with start_date_lte parameter to receive only the selected period.  (optional)
     * @param endDateLte Returns objects less than or equal to the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getDagRuns(String dagId, Integer limit, Integer offset, OffsetDateTime executionDateGte, OffsetDateTime executionDateLte, OffsetDateTime startDateGte, OffsetDateTime startDateLte, OffsetDateTime endDateGte, OffsetDateTime endDateLte, Handler<AsyncResult<DAGRunCollection>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagId' when calling getDagRuns"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/dags/{dag_id}/dagRuns".replaceAll("\\{" + "dag_id" + "\\}", dagId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "execution_date_gte", executionDateGte));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "execution_date_lte", executionDateLte));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date_gte", startDateGte));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date_lte", startDateLte));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date_gte", endDateGte));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date_lte", endDateLte));

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
        TypeReference<DAGRunCollection> localVarReturnType = new TypeReference<DAGRunCollection>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Get all DAG Runs from aall DAGs.
     * This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits 
     * @param listDagRunsForm  (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getDagRunsBatch(ListDagRunsForm listDagRunsForm, Handler<AsyncResult<DAGRunCollection>> resultHandler) {
        Object localVarBody = listDagRunsForm;
        
        // verify the required parameter 'listDagRunsForm' is set
        if (listDagRunsForm == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'listDagRunsForm' when calling getDagRunsBatch"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/dags/~/dagRuns/list";

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
        TypeReference<DAGRunCollection> localVarReturnType = new TypeReference<DAGRunCollection>() {};
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Update a DAG Run
     * 
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param daGRun  (required)
     * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;&gt;())
     * @param resultHandler Asynchronous result handler
     */
    public void updateDagRun(String dagId, String dagRunId, DAGRun daGRun, List<String> updateMask, Handler<AsyncResult<DAGRun>> resultHandler) {
        Object localVarBody = daGRun;
        
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagId' when calling updateDagRun"));
            return;
        }
        
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'dagRunId' when calling updateDagRun"));
            return;
        }
        
        // verify the required parameter 'daGRun' is set
        if (daGRun == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'daGRun' when calling updateDagRun"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}".replaceAll("\\{" + "dag_id" + "\\}", dagId.toString()).replaceAll("\\{" + "dag_run_id" + "\\}", dagRunId.toString());

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
        TypeReference<DAGRun> localVarReturnType = new TypeReference<DAGRun>() {};
        apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
}
