package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.Pool;
import org.openapitools.client.model.PoolCollection;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-30T18:47:18.700Z[GMT]")
public class PoolApi {
    private ApiClient apiClient;

    public PoolApi() {
        this(new ApiClient());
    }

    public PoolApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Create a pool
    * <p><b>200</b> - Successful response.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param pool The pool parameter
    * @return Pool
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Pool createPool(Pool pool) throws IOException {
        HttpResponse response = createPoolForHttpResponse(pool);
        TypeReference<Pool> typeRef = new TypeReference<Pool>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Create a pool
    * <p><b>200</b> - Successful response.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param pool The pool parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Pool
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Pool createPool(Pool pool, Map<String, Object> params) throws IOException {
        HttpResponse response = createPoolForHttpResponse(pool, params);
        TypeReference<Pool> typeRef = new TypeReference<Pool>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse createPoolForHttpResponse(Pool pool) throws IOException {
        // verify the required parameter 'pool' is set
        if (pool == null) {
            throw new IllegalArgumentException("Missing the required parameter 'pool' when calling createPool");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/pools");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(pool);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse createPoolForHttpResponse(java.io.InputStream pool, String mediaType) throws IOException {
          // verify the required parameter 'pool' is set
              if (pool == null) {
              throw new IllegalArgumentException("Missing the required parameter 'pool' when calling createPool");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/pools");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = pool == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, pool);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse createPoolForHttpResponse(Pool pool, Map<String, Object> params) throws IOException {
        // verify the required parameter 'pool' is set
        if (pool == null) {
            throw new IllegalArgumentException("Missing the required parameter 'pool' when calling createPool");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/pools");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(pool);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Delete a pool
    * <p><b>204</b> - No content.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param poolName The Pool name.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void deletePool(String poolName) throws IOException {
        deletePoolForHttpResponse(poolName);
    }

  /**
    * Delete a pool
    * <p><b>204</b> - No content.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param poolName The Pool name.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void deletePool(String poolName, Map<String, Object> params) throws IOException {
        deletePoolForHttpResponse(poolName, params);
    }

    public HttpResponse deletePoolForHttpResponse(String poolName) throws IOException {
        // verify the required parameter 'poolName' is set
        if (poolName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'poolName' when calling deletePool");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("pool_name", poolName);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/pools/{pool_name}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

    public HttpResponse deletePoolForHttpResponse(String poolName, Map<String, Object> params) throws IOException {
        // verify the required parameter 'poolName' is set
        if (poolName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'poolName' when calling deletePool");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("pool_name", poolName);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/pools/{pool_name}");

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
    * Get a pool
    * <p><b>200</b> - Successful response.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param poolName The Pool name.
    * @return Pool
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Pool getPool(String poolName) throws IOException {
        HttpResponse response = getPoolForHttpResponse(poolName);
        TypeReference<Pool> typeRef = new TypeReference<Pool>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get a pool
    * <p><b>200</b> - Successful response.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param poolName The Pool name.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Pool
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Pool getPool(String poolName, Map<String, Object> params) throws IOException {
        HttpResponse response = getPoolForHttpResponse(poolName, params);
        TypeReference<Pool> typeRef = new TypeReference<Pool>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse getPoolForHttpResponse(String poolName) throws IOException {
        // verify the required parameter 'poolName' is set
        if (poolName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'poolName' when calling getPool");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("pool_name", poolName);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/pools/{pool_name}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse getPoolForHttpResponse(String poolName, Map<String, Object> params) throws IOException {
        // verify the required parameter 'poolName' is set
        if (poolName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'poolName' when calling getPool");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("pool_name", poolName);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/pools/{pool_name}");

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
    * Get all pools
    * <p><b>200</b> - List of pools.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param limit The numbers of items to return.
    * @param offset The number of items to skip before starting to collect the result set.
    * @return PoolCollection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PoolCollection getPools(Integer limit, Integer offset) throws IOException {
        HttpResponse response = getPoolsForHttpResponse(limit, offset);
        TypeReference<PoolCollection> typeRef = new TypeReference<PoolCollection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get all pools
    * <p><b>200</b> - List of pools.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return PoolCollection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PoolCollection getPools(Map<String, Object> params) throws IOException {
        HttpResponse response = getPoolsForHttpResponse(params);
        TypeReference<PoolCollection> typeRef = new TypeReference<PoolCollection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse getPoolsForHttpResponse(Integer limit, Integer offset) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/pools");
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

    public HttpResponse getPoolsForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/pools");

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
    * Update a pool
    * <p><b>200</b> - Successful response.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param poolName The Pool name.
    * @param pool The pool parameter
    * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields. 
    * @return Pool
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Pool updatePool(String poolName, Pool pool, List<String> updateMask) throws IOException {
        HttpResponse response = updatePoolForHttpResponse(poolName, pool, updateMask);
        TypeReference<Pool> typeRef = new TypeReference<Pool>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update a pool
    * <p><b>200</b> - Successful response.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param poolName The Pool name.
    * @param pool The pool parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Pool
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Pool updatePool(String poolName, Pool pool, Map<String, Object> params) throws IOException {
        HttpResponse response = updatePoolForHttpResponse(poolName, pool, params);
        TypeReference<Pool> typeRef = new TypeReference<Pool>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse updatePoolForHttpResponse(String poolName, Pool pool, List<String> updateMask) throws IOException {
        // verify the required parameter 'poolName' is set
        if (poolName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'poolName' when calling updatePool");
        }// verify the required parameter 'pool' is set
        if (pool == null) {
            throw new IllegalArgumentException("Missing the required parameter 'pool' when calling updatePool");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("pool_name", poolName);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/pools/{pool_name}");
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

        HttpContent content = apiClient.new JacksonJsonHttpContent(pool);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
    }

      public HttpResponse updatePoolForHttpResponse(String poolName, java.io.InputStream pool, List<String> updateMask, String mediaType) throws IOException {
          // verify the required parameter 'poolName' is set
              if (poolName == null) {
              throw new IllegalArgumentException("Missing the required parameter 'poolName' when calling updatePool");
              }// verify the required parameter 'pool' is set
              if (pool == null) {
              throw new IllegalArgumentException("Missing the required parameter 'pool' when calling updatePool");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("pool_name", poolName);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/pools/{pool_name}");
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

              HttpContent content = pool == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, pool);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
      }

    public HttpResponse updatePoolForHttpResponse(String poolName, Pool pool, Map<String, Object> params) throws IOException {
        // verify the required parameter 'poolName' is set
        if (poolName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'poolName' when calling updatePool");
        }// verify the required parameter 'pool' is set
        if (pool == null) {
            throw new IllegalArgumentException("Missing the required parameter 'pool' when calling updatePool");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("pool_name", poolName);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/pools/{pool_name}");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(pool);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
    }


}
