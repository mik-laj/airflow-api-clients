package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Config;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-30T18:47:18.700Z[GMT]")
public class ConfigApi {
    private ApiClient apiClient;

    public ConfigApi() {
        this(new ApiClient());
    }

    public ConfigApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Get current configuration
    * <p><b>200</b> - Return current configuration.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param limit The numbers of items to return.
    * @param offset The number of items to skip before starting to collect the result set.
    * @return Config
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Config getConfig(Integer limit, Integer offset) throws IOException {
        HttpResponse response = getConfigForHttpResponse(limit, offset);
        TypeReference<Config> typeRef = new TypeReference<Config>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get current configuration
    * <p><b>200</b> - Return current configuration.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Config
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Config getConfig(Map<String, Object> params) throws IOException {
        HttpResponse response = getConfigForHttpResponse(params);
        TypeReference<Config> typeRef = new TypeReference<Config>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse getConfigForHttpResponse(Integer limit, Integer offset) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/config");
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

    public HttpResponse getConfigForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/config");

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


}
