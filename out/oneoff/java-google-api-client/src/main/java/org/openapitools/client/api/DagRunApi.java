package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.DAGRun;
import org.openapitools.client.model.DAGRunCollection;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.ListDagRunsForm;
import org.threeten.bp.OffsetDateTime;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:10:42.716Z[GMT]")
public class DagRunApi {
    private ApiClient apiClient;

    public DagRunApi() {
        this(new ApiClient());
    }

    public DagRunApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Trigger a DAG Run
    * <p><b>200</b> - Successful response.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>409</b> - The resource that a client tried to create already exists.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param dagId The DAG ID.
    * @param dagRunId The DAG Run ID.
    * @param daGRun The daGRun parameter
    * @return DAGRun
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DAGRun createDagRun(String dagId, String dagRunId, DAGRun daGRun) throws IOException {
        HttpResponse response = createDagRunForHttpResponse(dagId, dagRunId, daGRun);
        TypeReference<DAGRun> typeRef = new TypeReference<DAGRun>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Trigger a DAG Run
    * <p><b>200</b> - Successful response.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>409</b> - The resource that a client tried to create already exists.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param dagId The DAG ID.
    * @param dagRunId The DAG Run ID.
    * @param daGRun The daGRun parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DAGRun
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DAGRun createDagRun(String dagId, String dagRunId, DAGRun daGRun, Map<String, Object> params) throws IOException {
        HttpResponse response = createDagRunForHttpResponse(dagId, dagRunId, daGRun, params);
        TypeReference<DAGRun> typeRef = new TypeReference<DAGRun>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse createDagRunForHttpResponse(String dagId, String dagRunId, DAGRun daGRun) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling createDagRun");
        }// verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagRunId' when calling createDagRun");
        }// verify the required parameter 'daGRun' is set
        if (daGRun == null) {
            throw new IllegalArgumentException("Missing the required parameter 'daGRun' when calling createDagRun");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/dagRuns/{dag_run_id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(daGRun);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse createDagRunForHttpResponse(String dagId, String dagRunId, java.io.InputStream daGRun, String mediaType) throws IOException {
          // verify the required parameter 'dagId' is set
              if (dagId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling createDagRun");
              }// verify the required parameter 'dagRunId' is set
              if (dagRunId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'dagRunId' when calling createDagRun");
              }// verify the required parameter 'daGRun' is set
              if (daGRun == null) {
              throw new IllegalArgumentException("Missing the required parameter 'daGRun' when calling createDagRun");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("dag_id", dagId);
                      uriVariables.put("dag_run_id", dagRunId);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/dagRuns/{dag_run_id}");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = daGRun == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, daGRun);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse createDagRunForHttpResponse(String dagId, String dagRunId, DAGRun daGRun, Map<String, Object> params) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling createDagRun");
        }// verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagRunId' when calling createDagRun");
        }// verify the required parameter 'daGRun' is set
        if (daGRun == null) {
            throw new IllegalArgumentException("Missing the required parameter 'daGRun' when calling createDagRun");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/dagRuns/{dag_run_id}");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(daGRun);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Delete a DAG Run
    * <p><b>204</b> - No content.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param dagId The DAG ID.
    * @param dagRunId The DAG Run ID.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void deleteDagRun(String dagId, String dagRunId) throws IOException {
        deleteDagRunForHttpResponse(dagId, dagRunId);
    }

  /**
    * Delete a DAG Run
    * <p><b>204</b> - No content.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param dagId The DAG ID.
    * @param dagRunId The DAG Run ID.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void deleteDagRun(String dagId, String dagRunId, Map<String, Object> params) throws IOException {
        deleteDagRunForHttpResponse(dagId, dagRunId, params);
    }

    public HttpResponse deleteDagRunForHttpResponse(String dagId, String dagRunId) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling deleteDagRun");
        }// verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagRunId' when calling deleteDagRun");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/dagRuns/{dag_run_id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

    public HttpResponse deleteDagRunForHttpResponse(String dagId, String dagRunId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling deleteDagRun");
        }// verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagRunId' when calling deleteDagRun");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/dagRuns/{dag_run_id}");

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
    * Get a DAG Run
    * <p><b>200</b> - Successful response.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param dagId The DAG ID.
    * @param dagRunId The DAG Run ID.
    * @return DAGRun
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DAGRun getDagRun(String dagId, String dagRunId) throws IOException {
        HttpResponse response = getDagRunForHttpResponse(dagId, dagRunId);
        TypeReference<DAGRun> typeRef = new TypeReference<DAGRun>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get a DAG Run
    * <p><b>200</b> - Successful response.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param dagId The DAG ID.
    * @param dagRunId The DAG Run ID.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DAGRun
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DAGRun getDagRun(String dagId, String dagRunId, Map<String, Object> params) throws IOException {
        HttpResponse response = getDagRunForHttpResponse(dagId, dagRunId, params);
        TypeReference<DAGRun> typeRef = new TypeReference<DAGRun>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse getDagRunForHttpResponse(String dagId, String dagRunId) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling getDagRun");
        }// verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagRunId' when calling getDagRun");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/dagRuns/{dag_run_id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse getDagRunForHttpResponse(String dagId, String dagRunId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling getDagRun");
        }// verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagRunId' when calling getDagRun");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/dagRuns/{dag_run_id}");

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
    * Get all DAG Runs
    * This endpoint allows specifying &#x60;~&#x60; as the dag_id to retrieve DAG Runs for all DAGs. 
    * <p><b>200</b> - List of DAG Runs.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * @param dagId The DAG ID.
    * @param limit The numbers of items to return.
    * @param offset The number of items to skip before starting to collect the result set.
    * @param executionDateGte Returns objects greater or equal to the specified date. This can be combined with execution_date_lte parameter to receive only the selected period. 
    * @param executionDateLte Returns objects less than or equal to the specified date. This can be combined with execution_date_gte parameter to receive only the selected period. 
    * @param startDateGte Returns objects greater or equal the specified date. This can be combined with startd_ate_lte parameter to receive only the selected period. 
    * @param startDateLte Returns objects less or equal the specified date. This can be combined with start_date_gte parameter to receive only the selected period. 
    * @param endDateGte Returns objects greater or equal the specified date. This can be combined with start_date_lte parameter to receive only the selected period. 
    * @param endDateLte Returns objects less than or equal to the specified date. This can be combined with start_date_gte parameter to receive only the selected period. 
    * @return DAGRunCollection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DAGRunCollection getDagRuns(String dagId, Integer limit, Integer offset, OffsetDateTime executionDateGte, OffsetDateTime executionDateLte, OffsetDateTime startDateGte, OffsetDateTime startDateLte, OffsetDateTime endDateGte, OffsetDateTime endDateLte) throws IOException {
        HttpResponse response = getDagRunsForHttpResponse(dagId, limit, offset, executionDateGte, executionDateLte, startDateGte, startDateLte, endDateGte, endDateLte);
        TypeReference<DAGRunCollection> typeRef = new TypeReference<DAGRunCollection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get all DAG Runs
    * This endpoint allows specifying &#x60;~&#x60; as the dag_id to retrieve DAG Runs for all DAGs. 
    * <p><b>200</b> - List of DAG Runs.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * @param dagId The DAG ID.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DAGRunCollection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DAGRunCollection getDagRuns(String dagId, Map<String, Object> params) throws IOException {
        HttpResponse response = getDagRunsForHttpResponse(dagId, params);
        TypeReference<DAGRunCollection> typeRef = new TypeReference<DAGRunCollection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse getDagRunsForHttpResponse(String dagId, Integer limit, Integer offset, OffsetDateTime executionDateGte, OffsetDateTime executionDateLte, OffsetDateTime startDateGte, OffsetDateTime startDateLte, OffsetDateTime endDateGte, OffsetDateTime endDateLte) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling getDagRuns");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/dagRuns");
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
        }        if (executionDateGte != null) {
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
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse getDagRunsForHttpResponse(String dagId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling getDagRuns");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/dagRuns");

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
    * Get all DAG Runs from aall DAGs.
    * This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits 
    * <p><b>200</b> - List of DAG Runs.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param listDagRunsForm The listDagRunsForm parameter
    * @return DAGRunCollection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DAGRunCollection getDagRunsBatch(ListDagRunsForm listDagRunsForm) throws IOException {
        HttpResponse response = getDagRunsBatchForHttpResponse(listDagRunsForm);
        TypeReference<DAGRunCollection> typeRef = new TypeReference<DAGRunCollection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get all DAG Runs from aall DAGs.
    * This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits 
    * <p><b>200</b> - List of DAG Runs.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param listDagRunsForm The listDagRunsForm parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DAGRunCollection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DAGRunCollection getDagRunsBatch(ListDagRunsForm listDagRunsForm, Map<String, Object> params) throws IOException {
        HttpResponse response = getDagRunsBatchForHttpResponse(listDagRunsForm, params);
        TypeReference<DAGRunCollection> typeRef = new TypeReference<DAGRunCollection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse getDagRunsBatchForHttpResponse(ListDagRunsForm listDagRunsForm) throws IOException {
        // verify the required parameter 'listDagRunsForm' is set
        if (listDagRunsForm == null) {
            throw new IllegalArgumentException("Missing the required parameter 'listDagRunsForm' when calling getDagRunsBatch");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/~/dagRuns/list");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(listDagRunsForm);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse getDagRunsBatchForHttpResponse(java.io.InputStream listDagRunsForm, String mediaType) throws IOException {
          // verify the required parameter 'listDagRunsForm' is set
              if (listDagRunsForm == null) {
              throw new IllegalArgumentException("Missing the required parameter 'listDagRunsForm' when calling getDagRunsBatch");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/~/dagRuns/list");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = listDagRunsForm == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, listDagRunsForm);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse getDagRunsBatchForHttpResponse(ListDagRunsForm listDagRunsForm, Map<String, Object> params) throws IOException {
        // verify the required parameter 'listDagRunsForm' is set
        if (listDagRunsForm == null) {
            throw new IllegalArgumentException("Missing the required parameter 'listDagRunsForm' when calling getDagRunsBatch");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/~/dagRuns/list");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(listDagRunsForm);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Update a DAG Run
    * <p><b>200</b> - Successful response.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param dagId The DAG ID.
    * @param dagRunId The DAG Run ID.
    * @param daGRun The daGRun parameter
    * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields. 
    * @return DAGRun
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DAGRun updateDagRun(String dagId, String dagRunId, DAGRun daGRun, List<String> updateMask) throws IOException {
        HttpResponse response = updateDagRunForHttpResponse(dagId, dagRunId, daGRun, updateMask);
        TypeReference<DAGRun> typeRef = new TypeReference<DAGRun>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update a DAG Run
    * <p><b>200</b> - Successful response.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param dagId The DAG ID.
    * @param dagRunId The DAG Run ID.
    * @param daGRun The daGRun parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DAGRun
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DAGRun updateDagRun(String dagId, String dagRunId, DAGRun daGRun, Map<String, Object> params) throws IOException {
        HttpResponse response = updateDagRunForHttpResponse(dagId, dagRunId, daGRun, params);
        TypeReference<DAGRun> typeRef = new TypeReference<DAGRun>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse updateDagRunForHttpResponse(String dagId, String dagRunId, DAGRun daGRun, List<String> updateMask) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling updateDagRun");
        }// verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagRunId' when calling updateDagRun");
        }// verify the required parameter 'daGRun' is set
        if (daGRun == null) {
            throw new IllegalArgumentException("Missing the required parameter 'daGRun' when calling updateDagRun");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/dagRuns/{dag_run_id}");
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

        HttpContent content = apiClient.new JacksonJsonHttpContent(daGRun);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
    }

      public HttpResponse updateDagRunForHttpResponse(String dagId, String dagRunId, java.io.InputStream daGRun, List<String> updateMask, String mediaType) throws IOException {
          // verify the required parameter 'dagId' is set
              if (dagId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling updateDagRun");
              }// verify the required parameter 'dagRunId' is set
              if (dagRunId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'dagRunId' when calling updateDagRun");
              }// verify the required parameter 'daGRun' is set
              if (daGRun == null) {
              throw new IllegalArgumentException("Missing the required parameter 'daGRun' when calling updateDagRun");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("dag_id", dagId);
                      uriVariables.put("dag_run_id", dagRunId);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/dagRuns/{dag_run_id}");
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

              HttpContent content = daGRun == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, daGRun);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
      }

    public HttpResponse updateDagRunForHttpResponse(String dagId, String dagRunId, DAGRun daGRun, Map<String, Object> params) throws IOException {
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagId' when calling updateDagRun");
        }// verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'dagRunId' when calling updateDagRun");
        }// verify the required parameter 'daGRun' is set
        if (daGRun == null) {
            throw new IllegalArgumentException("Missing the required parameter 'daGRun' when calling updateDagRun");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dags/{dag_id}/dagRuns/{dag_run_id}");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(daGRun);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
    }


}
