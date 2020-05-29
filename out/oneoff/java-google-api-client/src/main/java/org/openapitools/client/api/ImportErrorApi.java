package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.ImportError;
import org.openapitools.client.model.ImportErrorCollection;

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
public class ImportErrorApi {
    private ApiClient apiClient;

    public ImportErrorApi() {
        this(new ApiClient());
    }

    public ImportErrorApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Delete an import error
    * <p><b>204</b> - No content.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param importErrorId The Import Error ID.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void deleteImportError(Integer importErrorId) throws IOException {
        deleteImportErrorForHttpResponse(importErrorId);
    }

  /**
    * Delete an import error
    * <p><b>204</b> - No content.
    * <p><b>400</b> - Client specified an invalid argument.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param importErrorId The Import Error ID.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public void deleteImportError(Integer importErrorId, Map<String, Object> params) throws IOException {
        deleteImportErrorForHttpResponse(importErrorId, params);
    }

    public HttpResponse deleteImportErrorForHttpResponse(Integer importErrorId) throws IOException {
        // verify the required parameter 'importErrorId' is set
        if (importErrorId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'importErrorId' when calling deleteImportError");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("import_error_id", importErrorId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/importErrors/{import_error_id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.DELETE, genericUrl, content).execute();
    }

    public HttpResponse deleteImportErrorForHttpResponse(Integer importErrorId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'importErrorId' is set
        if (importErrorId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'importErrorId' when calling deleteImportError");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("import_error_id", importErrorId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/importErrors/{import_error_id}");

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
    * Get an import error
    * <p><b>200</b> - Successful response.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param importErrorId The Import Error ID.
    * @return ImportError
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ImportError getImportError(Integer importErrorId) throws IOException {
        HttpResponse response = getImportErrorForHttpResponse(importErrorId);
        TypeReference<ImportError> typeRef = new TypeReference<ImportError>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get an import error
    * <p><b>200</b> - Successful response.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param importErrorId The Import Error ID.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ImportError
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ImportError getImportError(Integer importErrorId, Map<String, Object> params) throws IOException {
        HttpResponse response = getImportErrorForHttpResponse(importErrorId, params);
        TypeReference<ImportError> typeRef = new TypeReference<ImportError>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse getImportErrorForHttpResponse(Integer importErrorId) throws IOException {
        // verify the required parameter 'importErrorId' is set
        if (importErrorId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'importErrorId' when calling getImportError");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("import_error_id", importErrorId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/importErrors/{import_error_id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse getImportErrorForHttpResponse(Integer importErrorId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'importErrorId' is set
        if (importErrorId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'importErrorId' when calling getImportError");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("import_error_id", importErrorId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/importErrors/{import_error_id}");

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
    * Get all import errors
    * <p><b>200</b> - List of import errors.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param limit The numbers of items to return.
    * @param offset The number of items to skip before starting to collect the result set.
    * @return ImportErrorCollection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ImportErrorCollection getImportErrors(Integer limit, Integer offset) throws IOException {
        HttpResponse response = getImportErrorsForHttpResponse(limit, offset);
        TypeReference<ImportErrorCollection> typeRef = new TypeReference<ImportErrorCollection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get all import errors
    * <p><b>200</b> - List of import errors.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ImportErrorCollection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ImportErrorCollection getImportErrors(Map<String, Object> params) throws IOException {
        HttpResponse response = getImportErrorsForHttpResponse(params);
        TypeReference<ImportErrorCollection> typeRef = new TypeReference<ImportErrorCollection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse getImportErrorsForHttpResponse(Integer limit, Integer offset) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/importErrors");
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

    public HttpResponse getImportErrorsForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/importErrors");

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
