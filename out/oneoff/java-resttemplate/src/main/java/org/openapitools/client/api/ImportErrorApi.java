package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.ImportError;
import org.openapitools.client.model.ImportErrorCollection;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-31T07:39:31.501Z[GMT]")
@Component("org.openapitools.client.api.ImportErrorApi")
public class ImportErrorApi {
    private ApiClient apiClient;

    public ImportErrorApi() {
        this(new ApiClient());
    }

    @Autowired
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
     * 
     * <p><b>204</b> - No content.
     * <p><b>400</b> - Client specified an invalid argument.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * @param importErrorId The Import Error ID. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteImportError(Integer importErrorId) throws RestClientException {
        deleteImportErrorWithHttpInfo(importErrorId);
    }

    /**
     * Delete an import error
     * 
     * <p><b>204</b> - No content.
     * <p><b>400</b> - Client specified an invalid argument.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * @param importErrorId The Import Error ID. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteImportErrorWithHttpInfo(Integer importErrorId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'importErrorId' is set
        if (importErrorId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'importErrorId' when calling deleteImportError");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("import_error_id", importErrorId);
        String path = apiClient.expandPath("/importErrors/{import_error_id}", uriVariables);

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

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get an import error
     * 
     * <p><b>200</b> - Successful response.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param importErrorId The Import Error ID. (required)
     * @return ImportError
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ImportError getImportError(Integer importErrorId) throws RestClientException {
        return getImportErrorWithHttpInfo(importErrorId).getBody();
    }

    /**
     * Get an import error
     * 
     * <p><b>200</b> - Successful response.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param importErrorId The Import Error ID. (required)
     * @return ResponseEntity&lt;ImportError&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ImportError> getImportErrorWithHttpInfo(Integer importErrorId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'importErrorId' is set
        if (importErrorId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'importErrorId' when calling getImportError");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("import_error_id", importErrorId);
        String path = apiClient.expandPath("/importErrors/{import_error_id}", uriVariables);

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

        ParameterizedTypeReference<ImportError> returnType = new ParameterizedTypeReference<ImportError>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get all import errors
     * 
     * <p><b>200</b> - List of import errors.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @return ImportErrorCollection
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ImportErrorCollection getImportErrors(Integer limit, Integer offset) throws RestClientException {
        return getImportErrorsWithHttpInfo(limit, offset).getBody();
    }

    /**
     * Get all import errors
     * 
     * <p><b>200</b> - List of import errors.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @return ResponseEntity&lt;ImportErrorCollection&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ImportErrorCollection> getImportErrorsWithHttpInfo(Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/importErrors", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ImportErrorCollection> returnType = new ParameterizedTypeReference<ImportErrorCollection>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
