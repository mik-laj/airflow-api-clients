package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ClearTaskInstance;
import org.openapitools.client.model.DAG;
import org.openapitools.client.model.DAGCollection;
import org.openapitools.client.model.DAGDetail;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.InlineResponse2001;
import org.openapitools.client.model.Task;
import org.openapitools.client.model.TaskCollection;
import org.openapitools.client.model.TaskInstanceReferenceCollection;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-31T07:39:41.492Z[GMT]")
public class DagApi {
    private ApiClient apiClient;

    public DagApi() {
        this(new ApiClient());
    }

    public DagApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Clears a set of task instances associated with the DAG for a specified date range.
    * <p><b>200</b> - A list of cleared task references
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param dagId The DAG ID.
    * @param clearTaskInstance Parameters of action
    * @return TaskInstanceReferenceCollection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TaskInstanceReferenceCollection clearTaskInstance(String dagId, ClearTaskInstance clearTaskInstance) throws IOException {
        HttpResponse response = clearTaskInstanceForHttpResponse(dagId, clearTaskInstance);
        TypeReference<TaskInstanceReferenceCollection> typeRef = new TypeReference<TaskInstanceReferenceCollection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Clears a set of task instances associated with the DAG for a specified date range.
    * <p><b>200</b> - A list of cleared task references
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param dagId The DAG ID.
    * @param clearTaskInstance Parameters of action
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TaskInstanceReferenceCollection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TaskInstanceReferenceCollection clearTaskInstance(String dagId, ClearTaskInstance clearTaskInstance, Map<String, Object> params) throws IOException {
        HttpResponse response = clearTaskInstanceForHttpResponse(dagId, clearTaskInstance, params);
        TypeReference<TaskInstanceReferenceCollection> typeRef = new TypeReference<TaskInstanceReferenceCollection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse clearTaskInstanceForHttpResponse(String dagId, ClearTaskInstance clearTaskInstance) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling clearTaskInstance");
        }// verify the required parameter 'clearTaskInstance' is set
        if (clearTaskInstance == null) {
            throw new IllegalArgumentException("Missing the required parameter 'clearTaskInstance' when calling clearTaskInstance");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/clearTaskInstances");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(clearTaskInstance);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse clearTaskInstanceForHttpResponse(String dagId, java.io.InputStream clearTaskInstance, String mediaType) throws IOException {
          // verify the required parameter 'dagId' is set
              if (dagId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling clearTaskInstance");
              }// verify the required parameter 'clearTaskInstance' is set
              if (clearTaskInstance == null) {
              throw new IllegalArgumentException("Missing the required parameter 'clearTaskInstance' when calling clearTaskInstance");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("dag_id", dagId);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/clearTaskInstances");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = clearTaskInstance == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, clearTaskInstance);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse clearTaskInstanceForHttpResponse(String dagId, ClearTaskInstance clearTaskInstance, Map<String, Object> params) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling clearTaskInstance");
        }// verify the required parameter 'clearTaskInstance' is set
        if (clearTaskInstance == null) {
            throw new IllegalArgumentException("Missing the required parameter 'clearTaskInstance' when calling clearTaskInstance");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/clearTaskInstances");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(clearTaskInstance);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Get basic information about a DAG
    * Presents only information available in database (DAGModel). If you need detailed information, consider using GET /dags/{dag_id}/detail. 
    * <p><b>200</b> - Successful response.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param dagId The DAG ID.
    * @return DAG
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DAG getDag(String dagId) throws IOException {
        HttpResponse response = getDagForHttpResponse(dagId);
        TypeReference<DAG> typeRef = new TypeReference<DAG>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get basic information about a DAG
    * Presents only information available in database (DAGModel). If you need detailed information, consider using GET /dags/{dag_id}/detail. 
    * <p><b>200</b> - Successful response.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param dagId The DAG ID.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DAG
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DAG getDag(String dagId, Map<String, Object> params) throws IOException {
        HttpResponse response = getDagForHttpResponse(dagId, params);
        TypeReference<DAG> typeRef = new TypeReference<DAG>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse getDagForHttpResponse(String dagId) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling getDag");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse getDagForHttpResponse(String dagId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling getDag");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}");

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
    * Get a simplified representation of DAG.
    * The response contains many DAG attributes, so the response can be large. If possible, consider using GET /dags/{dag_id}. 
    * <p><b>200</b> - Successful response.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param dagId The DAG ID.
    * @return DAGDetail
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DAGDetail getDagDetail(String dagId) throws IOException {
        HttpResponse response = getDagDetailForHttpResponse(dagId);
        TypeReference<DAGDetail> typeRef = new TypeReference<DAGDetail>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get a simplified representation of DAG.
    * The response contains many DAG attributes, so the response can be large. If possible, consider using GET /dags/{dag_id}. 
    * <p><b>200</b> - Successful response.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param dagId The DAG ID.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DAGDetail
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DAGDetail getDagDetail(String dagId, Map<String, Object> params) throws IOException {
        HttpResponse response = getDagDetailForHttpResponse(dagId, params);
        TypeReference<DAGDetail> typeRef = new TypeReference<DAGDetail>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse getDagDetailForHttpResponse(String dagId) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling getDagDetail");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/details");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse getDagDetailForHttpResponse(String dagId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling getDagDetail");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/details");

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
    * Get source code using file token
    * <p><b>200</b> - Successful response.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param fileToken The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change. 
    * @return InlineResponse2001
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public InlineResponse2001 getDagSource(String fileToken) throws IOException {
        HttpResponse response = getDagSourceForHttpResponse(fileToken);
        TypeReference<InlineResponse2001> typeRef = new TypeReference<InlineResponse2001>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get source code using file token
    * <p><b>200</b> - Successful response.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param fileToken The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change. 
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return InlineResponse2001
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public InlineResponse2001 getDagSource(String fileToken, Map<String, Object> params) throws IOException {
        HttpResponse response = getDagSourceForHttpResponse(fileToken, params);
        TypeReference<InlineResponse2001> typeRef = new TypeReference<InlineResponse2001>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse getDagSourceForHttpResponse(String fileToken) throws IOException {
        // verify the required parameter 'fileToken' is set
        if (fileToken == null) {
            throw new IllegalArgumentException("Missing the required parameter 'fileToken' when calling getDagSource");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("file_token", fileToken);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dagSources/{file_token}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse getDagSourceForHttpResponse(String fileToken, Map<String, Object> params) throws IOException {
        // verify the required parameter 'fileToken' is set
        if (fileToken == null) {
            throw new IllegalArgumentException("Missing the required parameter 'fileToken' when calling getDagSource");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("file_token", fileToken);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dagSources/{file_token}");

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
    * Get all DAGs
    * <p><b>200</b> - List of DAGs.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * @param limit The numbers of items to return.
    * @param offset The number of items to skip before starting to collect the result set.
    * @return DAGCollection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DAGCollection getDags(Integer limit, Integer offset) throws IOException {
        HttpResponse response = getDagsForHttpResponse(limit, offset);
        TypeReference<DAGCollection> typeRef = new TypeReference<DAGCollection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get all DAGs
    * <p><b>200</b> - List of DAGs.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DAGCollection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DAGCollection getDags(Map<String, Object> params) throws IOException {
        HttpResponse response = getDagsForHttpResponse(params);
        TypeReference<DAGCollection> typeRef = new TypeReference<DAGCollection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse getDagsForHttpResponse(Integer limit, Integer offset) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags");
        if (limit != null) {
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

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse getDagsForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags");

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

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }


  /**
    * Get simplified representation of a task.
    * <p><b>200</b> - Successful response.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param dagId The DAG ID.
    * @param taskId The Task ID.
    * @return Task
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Task getTask(String dagId, String taskId) throws IOException {
        HttpResponse response = getTaskForHttpResponse(dagId, taskId);
        TypeReference<Task> typeRef = new TypeReference<Task>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get simplified representation of a task.
    * <p><b>200</b> - Successful response.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param dagId The DAG ID.
    * @param taskId The Task ID.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Task
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Task getTask(String dagId, String taskId, Map<String, Object> params) throws IOException {
        HttpResponse response = getTaskForHttpResponse(dagId, taskId, params);
        TypeReference<Task> typeRef = new TypeReference<Task>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse getTaskForHttpResponse(String dagId, String taskId) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling getTask");
        }// verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'taskId' when calling getTask");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("task_id", taskId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/tasks/{task_id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse getTaskForHttpResponse(String dagId, String taskId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling getTask");
        }// verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'taskId' when calling getTask");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("task_id", taskId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/tasks/{task_id}");

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
    * Get tasks for DAG
    * <p><b>200</b> - Successful response.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param dagId The DAG ID.
    * @return TaskCollection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TaskCollection getTasks(String dagId) throws IOException {
        HttpResponse response = getTasksForHttpResponse(dagId);
        TypeReference<TaskCollection> typeRef = new TypeReference<TaskCollection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get tasks for DAG
    * <p><b>200</b> - Successful response.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param dagId The DAG ID.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TaskCollection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TaskCollection getTasks(String dagId, Map<String, Object> params) throws IOException {
        HttpResponse response = getTasksForHttpResponse(dagId, params);
        TypeReference<TaskCollection> typeRef = new TypeReference<TaskCollection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse getTasksForHttpResponse(String dagId) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling getTasks");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/tasks");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse getTasksForHttpResponse(String dagId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling getTasks");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/tasks");

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
    * Update a DAG
    * <p><b>200</b> - Successful response.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param dagId The DAG ID.
    * @param DAG The DAG parameter
    * @return DAG
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DAG updateDag(String dagId, DAG DAG) throws IOException {
        HttpResponse response = updateDagForHttpResponse(dagId, DAG);
        TypeReference<DAG> typeRef = new TypeReference<DAG>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update a DAG
    * <p><b>200</b> - Successful response.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param dagId The DAG ID.
    * @param DAG The DAG parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DAG
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DAG updateDag(String dagId, DAG DAG, Map<String, Object> params) throws IOException {
        HttpResponse response = updateDagForHttpResponse(dagId, DAG, params);
        TypeReference<DAG> typeRef = new TypeReference<DAG>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse updateDagForHttpResponse(String dagId, DAG DAG) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling updateDag");
        }// verify the required parameter 'DAG' is set
        if (DAG == null) {
            throw new IllegalArgumentException("Missing the required parameter 'DAG' when calling updateDag");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(DAG);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
    }

      public HttpResponse updateDagForHttpResponse(String dagId, java.io.InputStream DAG, String mediaType) throws IOException {
          // verify the required parameter 'dagId' is set
              if (dagId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling updateDag");
              }// verify the required parameter 'DAG' is set
              if (DAG == null) {
              throw new IllegalArgumentException("Missing the required parameter 'DAG' when calling updateDag");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("dag_id", dagId);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = DAG == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, DAG);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
      }

    public HttpResponse updateDagForHttpResponse(String dagId, DAG DAG, Map<String, Object> params) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling updateDag");
        }// verify the required parameter 'DAG' is set
        if (DAG == null) {
            throw new IllegalArgumentException("Missing the required parameter 'DAG' when calling updateDag");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(DAG);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
    }


}
