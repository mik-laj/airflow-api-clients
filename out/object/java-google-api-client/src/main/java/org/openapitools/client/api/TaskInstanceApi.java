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

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.api.client.http.EmptyContent;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.InputStreamContent;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.json.Json;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:06:41.398Z[GMT]")
public class TaskInstanceApi {
    private ApiClient apiClient;

    public TaskInstanceApi() {
        this(new ApiClient());
    }

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
    * <p><b>200</b> - Successful response.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param dagId The DAG ID.
    * @param dagRunId The DAG Run ID.
    * @param taskId The Task ID.
    * @return ExtraLinkCollection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExtraLinkCollection getExtraLinks(String dagId, String dagRunId, String taskId) throws IOException {
        HttpResponse response = getExtraLinksForHttpResponse(dagId, dagRunId, taskId);
        TypeReference<ExtraLinkCollection> typeRef = new TypeReference<ExtraLinkCollection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get extra links for task instance
    * <p><b>200</b> - Successful response.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param dagId The DAG ID.
    * @param dagRunId The DAG Run ID.
    * @param taskId The Task ID.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ExtraLinkCollection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExtraLinkCollection getExtraLinks(String dagId, String dagRunId, String taskId, Map<String, Object> params) throws IOException {
        HttpResponse response = getExtraLinksForHttpResponse(dagId, dagRunId, taskId, params);
        TypeReference<ExtraLinkCollection> typeRef = new TypeReference<ExtraLinkCollection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse getExtraLinksForHttpResponse(String dagId, String dagRunId, String taskId) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling getExtraLinks");
        }// verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagRunId' when calling getExtraLinks");
        }// verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'taskId' when calling getExtraLinks");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        uriVariables.put("task_id", taskId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/links");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse getExtraLinksForHttpResponse(String dagId, String dagRunId, String taskId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling getExtraLinks");
        }// verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagRunId' when calling getExtraLinks");
        }// verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'taskId' when calling getExtraLinks");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        uriVariables.put("task_id", taskId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/links");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
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
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public InlineResponse200 getLogs(String dagId, String dagRunId, String taskId, Integer taskTryNumber, Boolean fullContent, String token) throws IOException {
        HttpResponse response = getLogsForHttpResponse(dagId, dagRunId, taskId, taskTryNumber, fullContent, token);
        TypeReference<InlineResponse200> typeRef = new TypeReference<InlineResponse200>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
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
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return InlineResponse200
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public InlineResponse200 getLogs(String dagId, String dagRunId, String taskId, Integer taskTryNumber, Map<String, Object> params) throws IOException {
        HttpResponse response = getLogsForHttpResponse(dagId, dagRunId, taskId, taskTryNumber, params);
        TypeReference<InlineResponse200> typeRef = new TypeReference<InlineResponse200>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse getLogsForHttpResponse(String dagId, String dagRunId, String taskId, Integer taskTryNumber, Boolean fullContent, String token) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling getLogs");
        }// verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagRunId' when calling getLogs");
        }// verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'taskId' when calling getLogs");
        }// verify the required parameter 'taskTryNumber' is set
        if (taskTryNumber == null) {
            throw new IllegalArgumentException("Missing the required parameter 'taskTryNumber' when calling getLogs");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        uriVariables.put("task_id", taskId);
        uriVariables.put("task_try_number", taskTryNumber);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/logs/{task_try_number}");
        if (fullContent != null) {
            String key = "full_content";
            Object value = fullContent;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (token != null) {
            String key = "token";
            Object value = token;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse getLogsForHttpResponse(String dagId, String dagRunId, String taskId, Integer taskTryNumber, Map<String, Object> params) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling getLogs");
        }// verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagRunId' when calling getLogs");
        }// verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'taskId' when calling getLogs");
        }// verify the required parameter 'taskTryNumber' is set
        if (taskTryNumber == null) {
            throw new IllegalArgumentException("Missing the required parameter 'taskTryNumber' when calling getLogs");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        uriVariables.put("task_id", taskId);
        uriVariables.put("task_try_number", taskTryNumber);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/logs/{task_try_number}");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }


  /**
    * Get a task instance
    * <p><b>200</b> - Successful response.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param dagId The DAG ID.
    * @param dagRunId The DAG Run ID.
    * @param taskId The Task ID.
    * @return TaskInstance
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TaskInstance getTaskInstance(String dagId, String dagRunId, String taskId) throws IOException {
        HttpResponse response = getTaskInstanceForHttpResponse(dagId, dagRunId, taskId);
        TypeReference<TaskInstance> typeRef = new TypeReference<TaskInstance>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get a task instance
    * <p><b>200</b> - Successful response.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param dagId The DAG ID.
    * @param dagRunId The DAG Run ID.
    * @param taskId The Task ID.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TaskInstance
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TaskInstance getTaskInstance(String dagId, String dagRunId, String taskId, Map<String, Object> params) throws IOException {
        HttpResponse response = getTaskInstanceForHttpResponse(dagId, dagRunId, taskId, params);
        TypeReference<TaskInstance> typeRef = new TypeReference<TaskInstance>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse getTaskInstanceForHttpResponse(String dagId, String dagRunId, String taskId) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling getTaskInstance");
        }// verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagRunId' when calling getTaskInstance");
        }// verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'taskId' when calling getTaskInstance");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        uriVariables.put("task_id", taskId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse getTaskInstanceForHttpResponse(String dagId, String dagRunId, String taskId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling getTaskInstance");
        }// verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagRunId' when calling getTaskInstance");
        }// verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'taskId' when calling getTaskInstance");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        uriVariables.put("task_id", taskId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
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
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TaskInstanceCollection getTaskInstances(String dagId, String dagRunId, OffsetDateTime executionDateGte, OffsetDateTime executionDateLte, OffsetDateTime startDateGte, OffsetDateTime startDateLte, OffsetDateTime endDateGte, OffsetDateTime endDateLte, BigDecimal durationGte, BigDecimal durationLte, List<String> state, List<String> pool, List<String> queue, Integer limit, Integer offset) throws IOException {
        HttpResponse response = getTaskInstancesForHttpResponse(dagId, dagRunId, executionDateGte, executionDateLte, startDateGte, startDateLte, endDateGte, endDateLte, durationGte, durationLte, state, pool, queue, limit, offset);
        TypeReference<TaskInstanceCollection> typeRef = new TypeReference<TaskInstanceCollection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get a list of task instance of DAG.
    * This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id to retrieve DAG Runs for all DAGs and DAG Runs. 
    * <p><b>200</b> - List of task instances.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param dagId The DAG ID.
    * @param dagRunId The DAG Run ID.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TaskInstanceCollection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TaskInstanceCollection getTaskInstances(String dagId, String dagRunId, Map<String, Object> params) throws IOException {
        HttpResponse response = getTaskInstancesForHttpResponse(dagId, dagRunId, params);
        TypeReference<TaskInstanceCollection> typeRef = new TypeReference<TaskInstanceCollection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse getTaskInstancesForHttpResponse(String dagId, String dagRunId, OffsetDateTime executionDateGte, OffsetDateTime executionDateLte, OffsetDateTime startDateGte, OffsetDateTime startDateLte, OffsetDateTime endDateGte, OffsetDateTime endDateLte, BigDecimal durationGte, BigDecimal durationLte, List<String> state, List<String> pool, List<String> queue, Integer limit, Integer offset) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling getTaskInstances");
        }// verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagRunId' when calling getTaskInstances");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances");
        if (executionDateGte != null) {
            String key = "execution_date_gte";
            Object value = executionDateGte;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (executionDateLte != null) {
            String key = "execution_date_lte";
            Object value = executionDateLte;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (startDateGte != null) {
            String key = "start_date_gte";
            Object value = startDateGte;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (startDateLte != null) {
            String key = "start_date_lte";
            Object value = startDateLte;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (endDateGte != null) {
            String key = "end_date_gte";
            Object value = endDateGte;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (endDateLte != null) {
            String key = "end_date_lte";
            Object value = endDateLte;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (durationGte != null) {
            String key = "duration_gte";
            Object value = durationGte;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (durationLte != null) {
            String key = "duration_lte";
            Object value = durationLte;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (state != null) {
            String key = "state";
            Object value = state;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (pool != null) {
            String key = "pool";
            Object value = pool;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (queue != null) {
            String key = "Queue";
            Object value = queue;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (limit != null) {
            String key = "limit";
            Object value = limit;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (offset != null) {
            String key = "offset";
            Object value = offset;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse getTaskInstancesForHttpResponse(String dagId, String dagRunId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling getTaskInstances");
        }// verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagRunId' when calling getTaskInstances");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
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
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TaskInstanceCollection getTaskInstancesBatch(ListTaskInstanceForm listTaskInstanceForm) throws IOException {
        HttpResponse response = getTaskInstancesBatchForHttpResponse(listTaskInstanceForm);
        TypeReference<TaskInstanceCollection> typeRef = new TypeReference<TaskInstanceCollection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get list of task instances from all DAGs and DAG Runs.
    * This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits 
    * <p><b>200</b> - List of task instances.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param listTaskInstanceForm The listTaskInstanceForm parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TaskInstanceCollection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TaskInstanceCollection getTaskInstancesBatch(ListTaskInstanceForm listTaskInstanceForm, Map<String, Object> params) throws IOException {
        HttpResponse response = getTaskInstancesBatchForHttpResponse(listTaskInstanceForm, params);
        TypeReference<TaskInstanceCollection> typeRef = new TypeReference<TaskInstanceCollection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse getTaskInstancesBatchForHttpResponse(ListTaskInstanceForm listTaskInstanceForm) throws IOException {
        // verify the required parameter 'listTaskInstanceForm' is set
        if (listTaskInstanceForm == null) {
            throw new IllegalArgumentException("Missing the required parameter 'listTaskInstanceForm' when calling getTaskInstancesBatch");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/~/dagRuns/~/taskInstances/list");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(listTaskInstanceForm);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse getTaskInstancesBatchForHttpResponse(java.io.InputStream listTaskInstanceForm, String mediaType) throws IOException {
          // verify the required parameter 'listTaskInstanceForm' is set
              if (listTaskInstanceForm == null) {
              throw new IllegalArgumentException("Missing the required parameter 'listTaskInstanceForm' when calling getTaskInstancesBatch");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/~/dagRuns/~/taskInstances/list");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = listTaskInstanceForm == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, listTaskInstanceForm);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse getTaskInstancesBatchForHttpResponse(ListTaskInstanceForm listTaskInstanceForm, Map<String, Object> params) throws IOException {
        // verify the required parameter 'listTaskInstanceForm' is set
        if (listTaskInstanceForm == null) {
            throw new IllegalArgumentException("Missing the required parameter 'listTaskInstanceForm' when calling getTaskInstancesBatch");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/~/dagRuns/~/taskInstances/list");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(listTaskInstanceForm);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


}
