package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.Variable;
import org.openapitools.client.model.VariableCollection;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-30T18:46:09.738Z[GMT]")
public class VariableApi {
    private ApiClient apiClient;

    public VariableApi() {
        this(new ApiClient());
    }

    public VariableApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Create a variable
    * <p><b>200</b> - Successful response.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param variable The variable parameter
    * @return Variable
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Variable createVariable(Variable variable) throws IOException {
        HttpResponse response = createVariableForHttpResponse(variable);
        TypeReference<Variable> typeRef = new TypeReference<Variable>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Create a variable
    * <p><b>200</b> - Successful response.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param variable The variable parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Variable
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Variable createVariable(Variable variable, Map<String, Object> params) throws IOException {
        HttpResponse response = createVariableForHttpResponse(variable, params);
        TypeReference<Variable> typeRef = new TypeReference<Variable>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse createVariableForHttpResponse(Variable variable) throws IOException {
        // verify the required parameter 'variable' is set
        if (variable == null) {
            throw new IllegalArgumentException("Missing the required parameter 'variable' when calling createVariable");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/variables");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(variable);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse createVariableForHttpResponse(java.io.InputStream variable, String mediaType) throws IOException {
          // verify the required parameter 'variable' is set
              if (variable == null) {
              throw new IllegalArgumentException("Missing the required parameter 'variable' when calling createVariable");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/variables");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = variable == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, variable);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse createVariableForHttpResponse(Variable variable, Map<String, Object> params) throws IOException {
        // verify the required parameter 'variable' is set
        if (variable == null) {
            throw new IllegalArgumentException("Missing the required parameter 'variable' when calling createVariable");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/variables");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(variable);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Delete variable
    * <p><b>204</b> - No content.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param variableKey The Variable Key.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void deleteVariable(String variableKey) throws IOException {
        deleteVariableForHttpResponse(variableKey);
    }

  /**
    * Delete variable
    * <p><b>204</b> - No content.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param variableKey The Variable Key.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void deleteVariable(String variableKey, Map<String, Object> params) throws IOException {
        deleteVariableForHttpResponse(variableKey, params);
    }

    public HttpResponse deleteVariableForHttpResponse(String variableKey) throws IOException {
        // verify the required parameter 'variableKey' is set
        if (variableKey == null) {
            throw new IllegalArgumentException("Missing the required parameter 'variableKey' when calling deleteVariable");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("variable_key", variableKey);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/variables/{variable_key}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

    public HttpResponse deleteVariableForHttpResponse(String variableKey, Map<String, Object> params) throws IOException {
        // verify the required parameter 'variableKey' is set
        if (variableKey == null) {
            throw new IllegalArgumentException("Missing the required parameter 'variableKey' when calling deleteVariable");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("variable_key", variableKey);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/variables/{variable_key}");

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
    * Get a variable by key
    * <p><b>200</b> - Successful response.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param variableKey The Variable Key.
    * @return Variable
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Variable getVariable(String variableKey) throws IOException {
        HttpResponse response = getVariableForHttpResponse(variableKey);
        TypeReference<Variable> typeRef = new TypeReference<Variable>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get a variable by key
    * <p><b>200</b> - Successful response.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param variableKey The Variable Key.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Variable
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Variable getVariable(String variableKey, Map<String, Object> params) throws IOException {
        HttpResponse response = getVariableForHttpResponse(variableKey, params);
        TypeReference<Variable> typeRef = new TypeReference<Variable>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse getVariableForHttpResponse(String variableKey) throws IOException {
        // verify the required parameter 'variableKey' is set
        if (variableKey == null) {
            throw new IllegalArgumentException("Missing the required parameter 'variableKey' when calling getVariable");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("variable_key", variableKey);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/variables/{variable_key}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse getVariableForHttpResponse(String variableKey, Map<String, Object> params) throws IOException {
        // verify the required parameter 'variableKey' is set
        if (variableKey == null) {
            throw new IllegalArgumentException("Missing the required parameter 'variableKey' when calling getVariable");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("variable_key", variableKey);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/variables/{variable_key}");

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
    * Get all variables
    * The collection does not contain data. To get data, you must get a single entity.
    * <p><b>200</b> - List of variables.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param limit The numbers of items to return.
    * @param offset The number of items to skip before starting to collect the result set.
    * @return VariableCollection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public VariableCollection getVariables(Integer limit, Integer offset) throws IOException {
        HttpResponse response = getVariablesForHttpResponse(limit, offset);
        TypeReference<VariableCollection> typeRef = new TypeReference<VariableCollection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get all variables
    * The collection does not contain data. To get data, you must get a single entity.
    * <p><b>200</b> - List of variables.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return VariableCollection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public VariableCollection getVariables(Map<String, Object> params) throws IOException {
        HttpResponse response = getVariablesForHttpResponse(params);
        TypeReference<VariableCollection> typeRef = new TypeReference<VariableCollection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse getVariablesForHttpResponse(Integer limit, Integer offset) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/variables");
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

    public HttpResponse getVariablesForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/variables");

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
    * Update a variable by key
    * <p><b>200</b> - Successful response.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param variableKey The Variable Key.
    * @param variable The variable parameter
    * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields. 
    * @return Variable
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Variable updateVariable(String variableKey, Variable variable, List<String> updateMask) throws IOException {
        HttpResponse response = updateVariableForHttpResponse(variableKey, variable, updateMask);
        TypeReference<Variable> typeRef = new TypeReference<Variable>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update a variable by key
    * <p><b>200</b> - Successful response.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param variableKey The Variable Key.
    * @param variable The variable parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Variable
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Variable updateVariable(String variableKey, Variable variable, Map<String, Object> params) throws IOException {
        HttpResponse response = updateVariableForHttpResponse(variableKey, variable, params);
        TypeReference<Variable> typeRef = new TypeReference<Variable>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse updateVariableForHttpResponse(String variableKey, Variable variable, List<String> updateMask) throws IOException {
        // verify the required parameter 'variableKey' is set
        if (variableKey == null) {
            throw new IllegalArgumentException("Missing the required parameter 'variableKey' when calling updateVariable");
        }// verify the required parameter 'variable' is set
        if (variable == null) {
            throw new IllegalArgumentException("Missing the required parameter 'variable' when calling updateVariable");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("variable_key", variableKey);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/variables/{variable_key}");
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

        HttpContent content = apiClient.new JacksonJsonHttpContent(variable);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
    }

      public HttpResponse updateVariableForHttpResponse(String variableKey, java.io.InputStream variable, List<String> updateMask, String mediaType) throws IOException {
          // verify the required parameter 'variableKey' is set
              if (variableKey == null) {
              throw new IllegalArgumentException("Missing the required parameter 'variableKey' when calling updateVariable");
              }// verify the required parameter 'variable' is set
              if (variable == null) {
              throw new IllegalArgumentException("Missing the required parameter 'variable' when calling updateVariable");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("variable_key", variableKey);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/variables/{variable_key}");
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

              HttpContent content = variable == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, variable);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
      }

    public HttpResponse updateVariableForHttpResponse(String variableKey, Variable variable, Map<String, Object> params) throws IOException {
        // verify the required parameter 'variableKey' is set
        if (variableKey == null) {
            throw new IllegalArgumentException("Missing the required parameter 'variableKey' when calling updateVariable");
        }// verify the required parameter 'variable' is set
        if (variable == null) {
            throw new IllegalArgumentException("Missing the required parameter 'variable' when calling updateVariable");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("variable_key", variableKey);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/variables/{variable_key}");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(variable);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
    }


}
