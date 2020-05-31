package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.XCom;
import org.openapitools.client.model.XComCollection;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-31T07:37:27.206Z[GMT]")
public class XComApi {
    private ApiClient apiClient;

    public XComApi() {
        this(new ApiClient());
    }

    public XComApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Delete an XCom entry
    * <p><b>204</b> - No content.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param dagId The DAG ID.
    * @param dagRunId The DAG Run ID.
    * @param taskId The Task ID.
    * @param key The XCom Key.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void deleteXComValue(String dagId, String dagRunId, String taskId, String key) throws IOException {
        deleteXComValueForHttpResponse(dagId, dagRunId, taskId, key);
    }

  /**
    * Delete an XCom entry
    * <p><b>204</b> - No content.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param dagId The DAG ID.
    * @param dagRunId The DAG Run ID.
    * @param taskId The Task ID.
    * @param key The XCom Key.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void deleteXComValue(String dagId, String dagRunId, String taskId, String key, Map<String, Object> params) throws IOException {
        deleteXComValueForHttpResponse(dagId, dagRunId, taskId, key, params);
    }

    public HttpResponse deleteXComValueForHttpResponse(String dagId, String dagRunId, String taskId, String key) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling deleteXComValue");
        }// verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagRunId' when calling deleteXComValue");
        }// verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'taskId' when calling deleteXComValue");
        }// verify the required parameter 'key' is set
        if (key == null) {
            throw new IllegalArgumentException("Missing the required parameter 'key' when calling deleteXComValue");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        uriVariables.put("task_id", taskId);
        uriVariables.put("key", key);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

    public HttpResponse deleteXComValueForHttpResponse(String dagId, String dagRunId, String taskId, String key, Map<String, Object> params) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling deleteXComValue");
        }// verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagRunId' when calling deleteXComValue");
        }// verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'taskId' when calling deleteXComValue");
        }// verify the required parameter 'key' is set
        if (key == null) {
            throw new IllegalArgumentException("Missing the required parameter 'key' when calling deleteXComValue");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        uriVariables.put("task_id", taskId);
        uriVariables.put("key", key);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}");

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
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }


  /**
    * Get all XCom entries
    * This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id, task_id to retrieve XCOM entries for for all DAGs, DAG Runs and task instances.
    * <p><b>200</b> - List of XCom entries.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param dagId The DAG ID.
    * @param dagRunId The DAG Run ID.
    * @param taskId The Task ID.
    * @param limit The numbers of items to return.
    * @param offset The number of items to skip before starting to collect the result set.
    * @return XComCollection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XComCollection getXComEntry(String dagId, String dagRunId, String taskId, Integer limit, Integer offset) throws IOException {
        HttpResponse response = getXComEntryForHttpResponse(dagId, dagRunId, taskId, limit, offset);
        TypeReference<XComCollection> typeRef = new TypeReference<XComCollection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get all XCom entries
    * This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id, task_id to retrieve XCOM entries for for all DAGs, DAG Runs and task instances.
    * <p><b>200</b> - List of XCom entries.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param dagId The DAG ID.
    * @param dagRunId The DAG Run ID.
    * @param taskId The Task ID.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return XComCollection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XComCollection getXComEntry(String dagId, String dagRunId, String taskId, Map<String, Object> params) throws IOException {
        HttpResponse response = getXComEntryForHttpResponse(dagId, dagRunId, taskId, params);
        TypeReference<XComCollection> typeRef = new TypeReference<XComCollection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse getXComEntryForHttpResponse(String dagId, String dagRunId, String taskId, Integer limit, Integer offset) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling getXComEntry");
        }// verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagRunId' when calling getXComEntry");
        }// verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'taskId' when calling getXComEntry");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        uriVariables.put("task_id", taskId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries");
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

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse getXComEntryForHttpResponse(String dagId, String dagRunId, String taskId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling getXComEntry");
        }// verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagRunId' when calling getXComEntry");
        }// verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'taskId' when calling getXComEntry");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        uriVariables.put("task_id", taskId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries");

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
    * Get an XCom entry
    * <p><b>200</b> - Successful response.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param dagId The DAG ID.
    * @param dagRunId The DAG Run ID.
    * @param taskId The Task ID.
    * @param key The XCom Key.
    * @return XCom
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XCom getXComValue(String dagId, String dagRunId, String taskId, String key) throws IOException {
        HttpResponse response = getXComValueForHttpResponse(dagId, dagRunId, taskId, key);
        TypeReference<XCom> typeRef = new TypeReference<XCom>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get an XCom entry
    * <p><b>200</b> - Successful response.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param dagId The DAG ID.
    * @param dagRunId The DAG Run ID.
    * @param taskId The Task ID.
    * @param key The XCom Key.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return XCom
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XCom getXComValue(String dagId, String dagRunId, String taskId, String key, Map<String, Object> params) throws IOException {
        HttpResponse response = getXComValueForHttpResponse(dagId, dagRunId, taskId, key, params);
        TypeReference<XCom> typeRef = new TypeReference<XCom>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse getXComValueForHttpResponse(String dagId, String dagRunId, String taskId, String key) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling getXComValue");
        }// verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagRunId' when calling getXComValue");
        }// verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'taskId' when calling getXComValue");
        }// verify the required parameter 'key' is set
        if (key == null) {
            throw new IllegalArgumentException("Missing the required parameter 'key' when calling getXComValue");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        uriVariables.put("task_id", taskId);
        uriVariables.put("key", key);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse getXComValueForHttpResponse(String dagId, String dagRunId, String taskId, String key, Map<String, Object> params) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling getXComValue");
        }// verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagRunId' when calling getXComValue");
        }// verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'taskId' when calling getXComValue");
        }// verify the required parameter 'key' is set
        if (key == null) {
            throw new IllegalArgumentException("Missing the required parameter 'key' when calling getXComValue");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        uriVariables.put("task_id", taskId);
        uriVariables.put("key", key);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}");

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
    * Create an XCom entry
    * <p><b>200</b> - Successful response.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param dagId The DAG ID.
    * @param dagRunId The DAG Run ID.
    * @param taskId The Task ID.
    * @param xcom The xcom parameter
    * @return XCom
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XCom updateXComEntry(String dagId, String dagRunId, String taskId, XCom xcom) throws IOException {
        HttpResponse response = updateXComEntryForHttpResponse(dagId, dagRunId, taskId, xcom);
        TypeReference<XCom> typeRef = new TypeReference<XCom>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Create an XCom entry
    * <p><b>200</b> - Successful response.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param dagId The DAG ID.
    * @param dagRunId The DAG Run ID.
    * @param taskId The Task ID.
    * @param xcom The xcom parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return XCom
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XCom updateXComEntry(String dagId, String dagRunId, String taskId, XCom xcom, Map<String, Object> params) throws IOException {
        HttpResponse response = updateXComEntryForHttpResponse(dagId, dagRunId, taskId, xcom, params);
        TypeReference<XCom> typeRef = new TypeReference<XCom>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse updateXComEntryForHttpResponse(String dagId, String dagRunId, String taskId, XCom xcom) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling updateXComEntry");
        }// verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagRunId' when calling updateXComEntry");
        }// verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'taskId' when calling updateXComEntry");
        }// verify the required parameter 'xcom' is set
        if (xcom == null) {
            throw new IllegalArgumentException("Missing the required parameter 'xcom' when calling updateXComEntry");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        uriVariables.put("task_id", taskId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(xcom);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse updateXComEntryForHttpResponse(String dagId, String dagRunId, String taskId, java.io.InputStream xcom, String mediaType) throws IOException {
          // verify the required parameter 'dagId' is set
              if (dagId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling updateXComEntry");
              }// verify the required parameter 'dagRunId' is set
              if (dagRunId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'dagRunId' when calling updateXComEntry");
              }// verify the required parameter 'taskId' is set
              if (taskId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'taskId' when calling updateXComEntry");
              }// verify the required parameter 'xcom' is set
              if (xcom == null) {
              throw new IllegalArgumentException("Missing the required parameter 'xcom' when calling updateXComEntry");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("dag_id", dagId);
                      uriVariables.put("dag_run_id", dagRunId);
                      uriVariables.put("task_id", taskId);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = xcom == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, xcom);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse updateXComEntryForHttpResponse(String dagId, String dagRunId, String taskId, XCom xcom, Map<String, Object> params) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling updateXComEntry");
        }// verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagRunId' when calling updateXComEntry");
        }// verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'taskId' when calling updateXComEntry");
        }// verify the required parameter 'xcom' is set
        if (xcom == null) {
            throw new IllegalArgumentException("Missing the required parameter 'xcom' when calling updateXComEntry");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        uriVariables.put("task_id", taskId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(xcom);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Update an XCom entry
    * <p><b>200</b> - Successful response.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param dagId The DAG ID.
    * @param dagRunId The DAG Run ID.
    * @param taskId The Task ID.
    * @param key The XCom Key.
    * @param xcom The xcom parameter
    * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields. 
    * @return XCom
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XCom updateXComValue(String dagId, String dagRunId, String taskId, String key, XCom xcom, List<String> updateMask) throws IOException {
        HttpResponse response = updateXComValueForHttpResponse(dagId, dagRunId, taskId, key, xcom, updateMask);
        TypeReference<XCom> typeRef = new TypeReference<XCom>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update an XCom entry
    * <p><b>200</b> - Successful response.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param dagId The DAG ID.
    * @param dagRunId The DAG Run ID.
    * @param taskId The Task ID.
    * @param key The XCom Key.
    * @param xcom The xcom parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return XCom
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XCom updateXComValue(String dagId, String dagRunId, String taskId, String key, XCom xcom, Map<String, Object> params) throws IOException {
        HttpResponse response = updateXComValueForHttpResponse(dagId, dagRunId, taskId, key, xcom, params);
        TypeReference<XCom> typeRef = new TypeReference<XCom>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse updateXComValueForHttpResponse(String dagId, String dagRunId, String taskId, String key, XCom xcom, List<String> updateMask) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling updateXComValue");
        }// verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagRunId' when calling updateXComValue");
        }// verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'taskId' when calling updateXComValue");
        }// verify the required parameter 'key' is set
        if (key == null) {
            throw new IllegalArgumentException("Missing the required parameter 'key' when calling updateXComValue");
        }// verify the required parameter 'xcom' is set
        if (xcom == null) {
            throw new IllegalArgumentException("Missing the required parameter 'xcom' when calling updateXComValue");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        uriVariables.put("task_id", taskId);
        uriVariables.put("key", key);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}");
        if (updateMask != null) {
            String key = "update_mask";
            Object value = updateMask;
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

        HttpContent content = apiClient.new JacksonJsonHttpContent(xcom);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
    }

      public HttpResponse updateXComValueForHttpResponse(String dagId, String dagRunId, String taskId, String key, java.io.InputStream xcom, List<String> updateMask, String mediaType) throws IOException {
          // verify the required parameter 'dagId' is set
              if (dagId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling updateXComValue");
              }// verify the required parameter 'dagRunId' is set
              if (dagRunId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'dagRunId' when calling updateXComValue");
              }// verify the required parameter 'taskId' is set
              if (taskId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'taskId' when calling updateXComValue");
              }// verify the required parameter 'key' is set
              if (key == null) {
              throw new IllegalArgumentException("Missing the required parameter 'key' when calling updateXComValue");
              }// verify the required parameter 'xcom' is set
              if (xcom == null) {
              throw new IllegalArgumentException("Missing the required parameter 'xcom' when calling updateXComValue");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("dag_id", dagId);
                      uriVariables.put("dag_run_id", dagRunId);
                      uriVariables.put("task_id", taskId);
                      uriVariables.put("key", key);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}");
              if (updateMask != null) {
                  String key = "update_mask";
                  Object value = updateMask;
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

              HttpContent content = xcom == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, xcom);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
      }

    public HttpResponse updateXComValueForHttpResponse(String dagId, String dagRunId, String taskId, String key, XCom xcom, Map<String, Object> params) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling updateXComValue");
        }// verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagRunId' when calling updateXComValue");
        }// verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'taskId' when calling updateXComValue");
        }// verify the required parameter 'key' is set
        if (key == null) {
            throw new IllegalArgumentException("Missing the required parameter 'key' when calling updateXComValue");
        }// verify the required parameter 'xcom' is set
        if (xcom == null) {
            throw new IllegalArgumentException("Missing the required parameter 'xcom' when calling updateXComValue");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        uriVariables.put("task_id", taskId);
        uriVariables.put("key", key);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(xcom);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
    }


}
