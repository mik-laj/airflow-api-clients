package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import java.math.BigDecimal;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.ExtraLinkCollection;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.ListTaskInstanceForm;
import java.time.OffsetDateTime;
import org.openapitools.client.model.TaskInstance;
import org.openapitools.client.model.TaskInstanceCollection;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-30T18:47:11.028Z[GMT]")
public class TaskInstanceApi {
    private ApiClient apiClient;

    public TaskInstanceApi() {
        this(new ApiClient());
    }

    @Autowired
    public TaskInstanceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
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
     * <p><b>200</b> - Successful response.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param dagId The DAG ID.
     * @param dagRunId The DAG Run ID.
     * @param taskId The Task ID.
     * @return ExtraLinkCollection
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ExtraLinkCollection> getExtraLinks(String dagId, String dagRunId, String taskId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagId' when calling getExtraLinks", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagRunId' when calling getExtraLinks", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new WebClientResponseException("Missing the required parameter 'taskId' when calling getExtraLinks", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("dag_id", dagId);
        pathParams.put("dag_run_id", dagRunId);
        pathParams.put("task_id", taskId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ExtraLinkCollection> localVarReturnType = new ParameterizedTypeReference<ExtraLinkCollection>() {};
        return apiClient.invokeAPI("/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/links", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get logs for a task instance
     * Get logs for a specific task instance and its try number
     * <p><b>200</b> - Content of logs.
     * <p><b>400</b> - Client specified an invalid argument.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param dagId The DAG ID.
     * @param dagRunId The DAG Run ID.
     * @param taskId The Task ID.
     * @param taskTryNumber The Task Try Number.
     * @param fullContent A full content will be returned. By default, only the first fragment will be returned. 
     * @param token A token that allows you to continue fetching logs. If passed, it will specify the location from which the download should be continued. 
     * @return InlineResponse200
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<InlineResponse200> getLogs(String dagId, String dagRunId, String taskId, Integer taskTryNumber, Boolean fullContent, String token) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagId' when calling getLogs", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagRunId' when calling getLogs", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new WebClientResponseException("Missing the required parameter 'taskId' when calling getLogs", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'taskTryNumber' is set
        if (taskTryNumber == null) {
            throw new WebClientResponseException("Missing the required parameter 'taskTryNumber' when calling getLogs", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("dag_id", dagId);
        pathParams.put("dag_run_id", dagRunId);
        pathParams.put("task_id", taskId);
        pathParams.put("task_try_number", taskTryNumber);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "full_content", fullContent));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "token", token));

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<InlineResponse200> localVarReturnType = new ParameterizedTypeReference<InlineResponse200>() {};
        return apiClient.invokeAPI("/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/logs/{task_try_number}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get a task instance
     * 
     * <p><b>200</b> - Successful response.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param dagId The DAG ID.
     * @param dagRunId The DAG Run ID.
     * @param taskId The Task ID.
     * @return TaskInstance
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TaskInstance> getTaskInstance(String dagId, String dagRunId, String taskId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagId' when calling getTaskInstance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagRunId' when calling getTaskInstance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new WebClientResponseException("Missing the required parameter 'taskId' when calling getTaskInstance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("dag_id", dagId);
        pathParams.put("dag_run_id", dagRunId);
        pathParams.put("task_id", taskId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<TaskInstance> localVarReturnType = new ParameterizedTypeReference<TaskInstance>() {};
        return apiClient.invokeAPI("/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get a list of task instance of DAG.
     * This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id to retrieve DAG Runs for all DAGs and DAG Runs. 
     * <p><b>200</b> - List of task instances.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * @param dagId The DAG ID.
     * @param dagRunId The DAG Run ID.
     * @param executionDateGte Returns objects greater or equal to the specified date. This can be combined with execution_date_lte parameter to receive only the selected period. 
     * @param executionDateLte Returns objects less than or equal to the specified date. This can be combined with execution_date_gte parameter to receive only the selected period. 
     * @param startDateGte Returns objects greater or equal the specified date. This can be combined with startd_ate_lte parameter to receive only the selected period. 
     * @param startDateLte Returns objects less or equal the specified date. This can be combined with start_date_gte parameter to receive only the selected period. 
     * @param endDateGte Returns objects greater or equal the specified date. This can be combined with start_date_lte parameter to receive only the selected period. 
     * @param endDateLte Returns objects less than or equal to the specified date. This can be combined with start_date_gte parameter to receive only the selected period. 
     * @param durationGte Returns objects greater than or equal to the specified values. This can be combined with duration_lte parameter to receive only the selected period. 
     * @param durationLte Returns objects less than or equal to the specified values. This can be combined with duration_gte parameter to receive only the selected range. 
     * @param state The value can be repeated to retrieve multiple matching values (OR condition).
     * @param pool The value can be repeated to retrieve multiple matching values (OR condition).
     * @param queue The value can be repeated to retrieve multiple matching values (OR condition).
     * @param limit The numbers of items to return.
     * @param offset The number of items to skip before starting to collect the result set.
     * @return TaskInstanceCollection
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TaskInstanceCollection> getTaskInstances(String dagId, String dagRunId, OffsetDateTime executionDateGte, OffsetDateTime executionDateLte, OffsetDateTime startDateGte, OffsetDateTime startDateLte, OffsetDateTime endDateGte, OffsetDateTime endDateLte, BigDecimal durationGte, BigDecimal durationLte, List<String> state, List<String> pool, List<String> queue, Integer limit, Integer offset) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagId' when calling getTaskInstances", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagRunId' when calling getTaskInstances", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("dag_id", dagId);
        pathParams.put("dag_run_id", dagRunId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "execution_date_gte", executionDateGte));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "execution_date_lte", executionDateLte));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date_gte", startDateGte));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date_lte", startDateLte));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date_gte", endDateGte));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date_lte", endDateLte));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "duration_gte", durationGte));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "duration_lte", durationLte));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "state", state));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "pool", pool));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "Queue", queue));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<TaskInstanceCollection> localVarReturnType = new ParameterizedTypeReference<TaskInstanceCollection>() {};
        return apiClient.invokeAPI("/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get list of task instances from all DAGs and DAG Runs.
     * This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits 
     * <p><b>200</b> - List of task instances.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param listTaskInstanceForm The listTaskInstanceForm parameter
     * @return TaskInstanceCollection
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TaskInstanceCollection> getTaskInstancesBatch(ListTaskInstanceForm listTaskInstanceForm) throws WebClientResponseException {
        Object postBody = listTaskInstanceForm;
        // verify the required parameter 'listTaskInstanceForm' is set
        if (listTaskInstanceForm == null) {
            throw new WebClientResponseException("Missing the required parameter 'listTaskInstanceForm' when calling getTaskInstancesBatch", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<TaskInstanceCollection> localVarReturnType = new ParameterizedTypeReference<TaskInstanceCollection>() {};
        return apiClient.invokeAPI("/dags/~/dagRuns/~/taskInstances/list", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
