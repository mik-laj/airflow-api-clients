package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Connection;
import org.openapitools.client.model.ConnectionCollection;
import org.openapitools.client.model.Error;

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
public class ConnectionApi {
    private ApiClient apiClient;

    public ConnectionApi() {
        this(new ApiClient());
    }

    public ConnectionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Create connection entry
    * <p><b>200</b> - Successful response.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param connection The connection parameter
    * @return Connection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Connection createConnection(Connection connection) throws IOException {
        HttpResponse response = createConnectionForHttpResponse(connection);
        TypeReference<Connection> typeRef = new TypeReference<Connection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Create connection entry
    * <p><b>200</b> - Successful response.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param connection The connection parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Connection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Connection createConnection(Connection connection, Map<String, Object> params) throws IOException {
        HttpResponse response = createConnectionForHttpResponse(connection, params);
        TypeReference<Connection> typeRef = new TypeReference<Connection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse createConnectionForHttpResponse(Connection connection) throws IOException {
        // verify the required parameter 'connection' is set
        if (connection == null) {
            throw new IllegalArgumentException("Missing the required parameter 'connection' when calling createConnection");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/connections");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(connection);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse createConnectionForHttpResponse(java.io.InputStream connection, String mediaType) throws IOException {
          // verify the required parameter 'connection' is set
              if (connection == null) {
              throw new IllegalArgumentException("Missing the required parameter 'connection' when calling createConnection");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/connections");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = connection == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, connection);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse createConnectionForHttpResponse(Connection connection, Map<String, Object> params) throws IOException {
        // verify the required parameter 'connection' is set
        if (connection == null) {
            throw new IllegalArgumentException("Missing the required parameter 'connection' when calling createConnection");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/connections");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(connection);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Delete a connection entry
    * <p><b>204</b> - No content.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param connectionId The Connection ID.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void deleteConnection(Integer connectionId) throws IOException {
        deleteConnectionForHttpResponse(connectionId);
    }

  /**
    * Delete a connection entry
    * <p><b>204</b> - No content.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param connectionId The Connection ID.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void deleteConnection(Integer connectionId, Map<String, Object> params) throws IOException {
        deleteConnectionForHttpResponse(connectionId, params);
    }

    public HttpResponse deleteConnectionForHttpResponse(Integer connectionId) throws IOException {
        // verify the required parameter 'connectionId' is set
        if (connectionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'connectionId' when calling deleteConnection");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("connection_id", connectionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/connections/{connection_id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

    public HttpResponse deleteConnectionForHttpResponse(Integer connectionId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'connectionId' is set
        if (connectionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'connectionId' when calling deleteConnection");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("connection_id", connectionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/connections/{connection_id}");

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
    * Get a connection entry
    * <p><b>200</b> - Successful response.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param connectionId The Connection ID.
    * @return Connection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Connection getConnection(Integer connectionId) throws IOException {
        HttpResponse response = getConnectionForHttpResponse(connectionId);
        TypeReference<Connection> typeRef = new TypeReference<Connection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get a connection entry
    * <p><b>200</b> - Successful response.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param connectionId The Connection ID.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Connection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Connection getConnection(Integer connectionId, Map<String, Object> params) throws IOException {
        HttpResponse response = getConnectionForHttpResponse(connectionId, params);
        TypeReference<Connection> typeRef = new TypeReference<Connection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse getConnectionForHttpResponse(Integer connectionId) throws IOException {
        // verify the required parameter 'connectionId' is set
        if (connectionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'connectionId' when calling getConnection");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("connection_id", connectionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/connections/{connection_id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse getConnectionForHttpResponse(Integer connectionId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'connectionId' is set
        if (connectionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'connectionId' when calling getConnection");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("connection_id", connectionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/connections/{connection_id}");

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
    * Get all connection entries
    * <p><b>200</b> - List of connection entry.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param limit The numbers of items to return.
    * @param offset The number of items to skip before starting to collect the result set.
    * @return ConnectionCollection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ConnectionCollection getConnections(Integer limit, Integer offset) throws IOException {
        HttpResponse response = getConnectionsForHttpResponse(limit, offset);
        TypeReference<ConnectionCollection> typeRef = new TypeReference<ConnectionCollection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get all connection entries
    * <p><b>200</b> - List of connection entry.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ConnectionCollection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ConnectionCollection getConnections(Map<String, Object> params) throws IOException {
        HttpResponse response = getConnectionsForHttpResponse(params);
        TypeReference<ConnectionCollection> typeRef = new TypeReference<ConnectionCollection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse getConnectionsForHttpResponse(Integer limit, Integer offset) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/connections");
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

    public HttpResponse getConnectionsForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/connections");

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
    * Update a connection entry
    * <p><b>200</b> - Successful response.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param connectionId The Connection ID.
    * @param connection The connection parameter
    * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields. 
    * @return Connection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Connection updateConnection(Integer connectionId, Connection connection, List<String> updateMask) throws IOException {
        HttpResponse response = updateConnectionForHttpResponse(connectionId, connection, updateMask);
        TypeReference<Connection> typeRef = new TypeReference<Connection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update a connection entry
    * <p><b>200</b> - Successful response.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param connectionId The Connection ID.
    * @param connection The connection parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Connection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Connection updateConnection(Integer connectionId, Connection connection, Map<String, Object> params) throws IOException {
        HttpResponse response = updateConnectionForHttpResponse(connectionId, connection, params);
        TypeReference<Connection> typeRef = new TypeReference<Connection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse updateConnectionForHttpResponse(Integer connectionId, Connection connection, List<String> updateMask) throws IOException {
        // verify the required parameter 'connectionId' is set
        if (connectionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'connectionId' when calling updateConnection");
        }// verify the required parameter 'connection' is set
        if (connection == null) {
            throw new IllegalArgumentException("Missing the required parameter 'connection' when calling updateConnection");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("connection_id", connectionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/connections/{connection_id}");
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

        HttpContent content = apiClient.new JacksonJsonHttpContent(connection);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
    }

      public HttpResponse updateConnectionForHttpResponse(Integer connectionId, java.io.InputStream connection, List<String> updateMask, String mediaType) throws IOException {
          // verify the required parameter 'connectionId' is set
              if (connectionId == null) {
              throw new IllegalArgumentException("Missing the required parameter 'connectionId' when calling updateConnection");
              }// verify the required parameter 'connection' is set
              if (connection == null) {
              throw new IllegalArgumentException("Missing the required parameter 'connection' when calling updateConnection");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("connection_id", connectionId);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/connections/{connection_id}");
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

              HttpContent content = connection == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, connection);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
      }

    public HttpResponse updateConnectionForHttpResponse(Integer connectionId, Connection connection, Map<String, Object> params) throws IOException {
        // verify the required parameter 'connectionId' is set
        if (connectionId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'connectionId' when calling updateConnection");
        }// verify the required parameter 'connection' is set
        if (connection == null) {
            throw new IllegalArgumentException("Missing the required parameter 'connection' when calling updateConnection");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("connection_id", connectionId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/connections/{connection_id}");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(connection);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.PATCH, genericUrl, content).execute();
    }


}
