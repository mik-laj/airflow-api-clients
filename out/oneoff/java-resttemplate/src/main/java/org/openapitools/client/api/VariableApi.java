package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.Variable;
import org.openapitools.client.model.VariableCollection;

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
@Component("org.openapitools.client.api.VariableApi")
public class VariableApi {
    private ApiClient apiClient;

    public VariableApi() {
        this(new ApiClient());
    }

    @Autowired
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
     * 
     * <p><b>200</b> - Successful response.
     * <p><b>400</b> - Client specified an invalid argument.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * @param variable  (required)
     * @return Variable
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Variable createVariable(Variable variable) throws RestClientException {
        return createVariableWithHttpInfo(variable).getBody();
    }

    /**
     * Create a variable
     * 
     * <p><b>200</b> - Successful response.
     * <p><b>400</b> - Client specified an invalid argument.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * @param variable  (required)
     * @return ResponseEntity&lt;Variable&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Variable> createVariableWithHttpInfo(Variable variable) throws RestClientException {
        Object postBody = variable;
        
        // verify the required parameter 'variable' is set
        if (variable == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'variable' when calling createVariable");
        }
        
        String path = apiClient.expandPath("/variables", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Variable> returnType = new ParameterizedTypeReference<Variable>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Delete variable
     * 
     * <p><b>204</b> - No content.
     * <p><b>400</b> - Client specified an invalid argument.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * @param variableKey The Variable Key. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteVariable(String variableKey) throws RestClientException {
        deleteVariableWithHttpInfo(variableKey);
    }

    /**
     * Delete variable
     * 
     * <p><b>204</b> - No content.
     * <p><b>400</b> - Client specified an invalid argument.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * @param variableKey The Variable Key. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteVariableWithHttpInfo(String variableKey) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'variableKey' is set
        if (variableKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'variableKey' when calling deleteVariable");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("variable_key", variableKey);
        String path = apiClient.expandPath("/variables/{variable_key}", uriVariables);

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
     * Get a variable by key
     * 
     * <p><b>200</b> - Successful response.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param variableKey The Variable Key. (required)
     * @return Variable
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Variable getVariable(String variableKey) throws RestClientException {
        return getVariableWithHttpInfo(variableKey).getBody();
    }

    /**
     * Get a variable by key
     * 
     * <p><b>200</b> - Successful response.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param variableKey The Variable Key. (required)
     * @return ResponseEntity&lt;Variable&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Variable> getVariableWithHttpInfo(String variableKey) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'variableKey' is set
        if (variableKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'variableKey' when calling getVariable");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("variable_key", variableKey);
        String path = apiClient.expandPath("/variables/{variable_key}", uriVariables);

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

        ParameterizedTypeReference<Variable> returnType = new ParameterizedTypeReference<Variable>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get all variables
     * The collection does not contain data. To get data, you must get a single entity.
     * <p><b>200</b> - List of variables.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @return VariableCollection
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VariableCollection getVariables(Integer limit, Integer offset) throws RestClientException {
        return getVariablesWithHttpInfo(limit, offset).getBody();
    }

    /**
     * Get all variables
     * The collection does not contain data. To get data, you must get a single entity.
     * <p><b>200</b> - List of variables.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @return ResponseEntity&lt;VariableCollection&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VariableCollection> getVariablesWithHttpInfo(Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/variables", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<VariableCollection> returnType = new ParameterizedTypeReference<VariableCollection>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update a variable by key
     * 
     * <p><b>200</b> - Successful response.
     * <p><b>400</b> - Client specified an invalid argument.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param variableKey The Variable Key. (required)
     * @param variable  (required)
     * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;String&gt;())
     * @return Variable
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Variable updateVariable(String variableKey, Variable variable, List<String> updateMask) throws RestClientException {
        return updateVariableWithHttpInfo(variableKey, variable, updateMask).getBody();
    }

    /**
     * Update a variable by key
     * 
     * <p><b>200</b> - Successful response.
     * <p><b>400</b> - Client specified an invalid argument.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param variableKey The Variable Key. (required)
     * @param variable  (required)
     * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;String&gt;())
     * @return ResponseEntity&lt;Variable&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Variable> updateVariableWithHttpInfo(String variableKey, Variable variable, List<String> updateMask) throws RestClientException {
        Object postBody = variable;
        
        // verify the required parameter 'variableKey' is set
        if (variableKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'variableKey' when calling updateVariable");
        }
        
        // verify the required parameter 'variable' is set
        if (variable == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'variable' when calling updateVariable");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("variable_key", variableKey);
        String path = apiClient.expandPath("/variables/{variable_key}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "update_mask", updateMask));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Variable> returnType = new ParameterizedTypeReference<Variable>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
