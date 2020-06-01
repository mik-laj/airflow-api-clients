package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import java.math.BigDecimal;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.ExtraLinkCollection;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.ListTaskInstanceForm;
import org.threeten.bp.OffsetDateTime;
import org.openapitools.client.model.TaskInstance;
import org.openapitools.client.model.TaskInstanceCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-31T07:37:16.815Z[GMT]")
@Component("org.openapitools.client.api.TaskInstanceApi")
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
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param taskId The Task ID. (required)
     * @return ExtraLinkCollection
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExtraLinkCollection getExtraLinks(String dagId, String dagRunId, String taskId) throws RestClientException {
        return getExtraLinksWithHttpInfo(dagId, dagRunId, taskId).getBody();
    }

    /**
     * Get extra links for task instance
     * 
     * <p><b>200</b> - Successful response.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param taskId The Task ID. (required)
     * @return ResponseEntity&lt;ExtraLinkCollection&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ExtraLinkCollection> getExtraLinksWithHttpInfo(String dagId, String dagRunId, String taskId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dagId' when calling getExtraLinks");
        }
        
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dagRunId' when calling getExtraLinks");
        }
        
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'taskId' when calling getExtraLinks");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        uriVariables.put("task_id", taskId);
        String path = apiClient.expandPath("/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/links", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ExtraLinkCollection> returnType = new ParameterizedTypeReference<ExtraLinkCollection>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get logs for a task instance
     * Get logs for a specific task instance and its try number
     * <p><b>200</b> - Content of logs.
     * <p><b>400</b> - Client specified an invalid argument.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param taskId The Task ID. (required)
     * @param taskTryNumber The Task Try Number. (required)
     * @param fullContent A full content will be returned. By default, only the first fragment will be returned.  (optional)
     * @param token A token that allows you to continue fetching logs. If passed, it will specify the location from which the download should be continued.  (optional)
     * @return InlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse200 getLogs(String dagId, String dagRunId, String taskId, Integer taskTryNumber, Boolean fullContent, String token) throws RestClientException {
        return getLogsWithHttpInfo(dagId, dagRunId, taskId, taskTryNumber, fullContent, token).getBody();
    }

    /**
     * Get logs for a task instance
     * Get logs for a specific task instance and its try number
     * <p><b>200</b> - Content of logs.
     * <p><b>400</b> - Client specified an invalid argument.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param taskId The Task ID. (required)
     * @param taskTryNumber The Task Try Number. (required)
     * @param fullContent A full content will be returned. By default, only the first fragment will be returned.  (optional)
     * @param token A token that allows you to continue fetching logs. If passed, it will specify the location from which the download should be continued.  (optional)
     * @return ResponseEntity&lt;InlineResponse200&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse200> getLogsWithHttpInfo(String dagId, String dagRunId, String taskId, Integer taskTryNumber, Boolean fullContent, String token) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dagId' when calling getLogs");
        }
        
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dagRunId' when calling getLogs");
        }
        
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'taskId' when calling getLogs");
        }
        
        // verify the required parameter 'taskTryNumber' is set
        if (taskTryNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'taskTryNumber' when calling getLogs");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        uriVariables.put("task_id", taskId);
        uriVariables.put("task_try_number", taskTryNumber);
        String path = apiClient.expandPath("/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/logs/{task_try_number}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "full_content", fullContent));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "token", token));

        final String[] accepts = { 
            "application/json", "text/plain"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<InlineResponse200> returnType = new ParameterizedTypeReference<InlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a task instance
     * 
     * <p><b>200</b> - Successful response.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param taskId The Task ID. (required)
     * @return TaskInstance
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskInstance getTaskInstance(String dagId, String dagRunId, String taskId) throws RestClientException {
        return getTaskInstanceWithHttpInfo(dagId, dagRunId, taskId).getBody();
    }

    /**
     * Get a task instance
     * 
     * <p><b>200</b> - Successful response.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param taskId The Task ID. (required)
     * @return ResponseEntity&lt;TaskInstance&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskInstance> getTaskInstanceWithHttpInfo(String dagId, String dagRunId, String taskId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dagId' when calling getTaskInstance");
        }
        
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dagRunId' when calling getTaskInstance");
        }
        
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'taskId' when calling getTaskInstance");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        uriVariables.put("task_id", taskId);
        String path = apiClient.expandPath("/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<TaskInstance> returnType = new ParameterizedTypeReference<TaskInstance>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a list of task instance of DAG.
     * This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id to retrieve DAG Runs for all DAGs and DAG Runs. 
     * <p><b>200</b> - List of task instances.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
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
     * @param state The value can be repeated to retrieve multiple matching values (OR condition). (optional, default to new ArrayList&lt;String&gt;())
     * @param pool The value can be repeated to retrieve multiple matching values (OR condition). (optional, default to new ArrayList&lt;String&gt;())
     * @param queue The value can be repeated to retrieve multiple matching values (OR condition). (optional, default to new ArrayList&lt;String&gt;())
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @return TaskInstanceCollection
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskInstanceCollection getTaskInstances(String dagId, String dagRunId, OffsetDateTime executionDateGte, OffsetDateTime executionDateLte, OffsetDateTime startDateGte, OffsetDateTime startDateLte, OffsetDateTime endDateGte, OffsetDateTime endDateLte, BigDecimal durationGte, BigDecimal durationLte, List<String> state, List<String> pool, List<String> queue, Integer limit, Integer offset) throws RestClientException {
        return getTaskInstancesWithHttpInfo(dagId, dagRunId, executionDateGte, executionDateLte, startDateGte, startDateLte, endDateGte, endDateLte, durationGte, durationLte, state, pool, queue, limit, offset).getBody();
    }

    /**
     * Get a list of task instance of DAG.
     * This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id to retrieve DAG Runs for all DAGs and DAG Runs. 
     * <p><b>200</b> - List of task instances.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
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
     * @param state The value can be repeated to retrieve multiple matching values (OR condition). (optional, default to new ArrayList&lt;String&gt;())
     * @param pool The value can be repeated to retrieve multiple matching values (OR condition). (optional, default to new ArrayList&lt;String&gt;())
     * @param queue The value can be repeated to retrieve multiple matching values (OR condition). (optional, default to new ArrayList&lt;String&gt;())
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @return ResponseEntity&lt;TaskInstanceCollection&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskInstanceCollection> getTaskInstancesWithHttpInfo(String dagId, String dagRunId, OffsetDateTime executionDateGte, OffsetDateTime executionDateLte, OffsetDateTime startDateGte, OffsetDateTime startDateLte, OffsetDateTime endDateGte, OffsetDateTime endDateLte, BigDecimal durationGte, BigDecimal durationLte, List<String> state, List<String> pool, List<String> queue, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dagId' when calling getTaskInstances");
        }
        
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dagRunId' when calling getTaskInstances");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        String path = apiClient.expandPath("/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

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

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<TaskInstanceCollection> returnType = new ParameterizedTypeReference<TaskInstanceCollection>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get list of task instances from all DAGs and DAG Runs.
     * This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits 
     * <p><b>200</b> - List of task instances.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param listTaskInstanceForm  (required)
     * @return TaskInstanceCollection
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskInstanceCollection getTaskInstancesBatch(ListTaskInstanceForm listTaskInstanceForm) throws RestClientException {
        return getTaskInstancesBatchWithHttpInfo(listTaskInstanceForm).getBody();
    }

    /**
     * Get list of task instances from all DAGs and DAG Runs.
     * This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits 
     * <p><b>200</b> - List of task instances.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param listTaskInstanceForm  (required)
     * @return ResponseEntity&lt;TaskInstanceCollection&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskInstanceCollection> getTaskInstancesBatchWithHttpInfo(ListTaskInstanceForm listTaskInstanceForm) throws RestClientException {
        Object postBody = listTaskInstanceForm;
        
        // verify the required parameter 'listTaskInstanceForm' is set
        if (listTaskInstanceForm == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listTaskInstanceForm' when calling getTaskInstancesBatch");
        }
        
        String path = apiClient.expandPath("/dags/~/dagRuns/~/taskInstances/list", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<TaskInstanceCollection> returnType = new ParameterizedTypeReference<TaskInstanceCollection>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
