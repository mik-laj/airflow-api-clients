package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.XCom;
import org.openapitools.client.model.XComCollection;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-31T07:53:14.226Z[GMT]")
public class XComApi {
    private ApiClient apiClient;

    public XComApi() {
        this(new ApiClient());
    }

    @Autowired
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
     * 
     * <p><b>204</b> - No content.
     * <p><b>400</b> - Client specified an invalid argument.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * @param dagId The DAG ID.
     * @param dagRunId The DAG Run ID.
     * @param taskId The Task ID.
     * @param xcomKey The XCom Key.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> deleteXComValue(String dagId, String dagRunId, String taskId, String xcomKey) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagId' when calling deleteXComValue", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagRunId' when calling deleteXComValue", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new WebClientResponseException("Missing the required parameter 'taskId' when calling deleteXComValue", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'xcomKey' is set
        if (xcomKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'xcomKey' when calling deleteXComValue", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("dag_id", dagId);
        pathParams.put("dag_run_id", dagRunId);
        pathParams.put("task_id", taskId);
        pathParams.put("xcom_key", xcomKey);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<XComCollection> getXComEntry(String dagId, String dagRunId, String taskId, Integer limit, Integer offset) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagId' when calling getXComEntry", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagRunId' when calling getXComEntry", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new WebClientResponseException("Missing the required parameter 'taskId' when calling getXComEntry", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("dag_id", dagId);
        pathParams.put("dag_run_id", dagRunId);
        pathParams.put("task_id", taskId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<XComCollection> localVarReturnType = new ParameterizedTypeReference<XComCollection>() {};
        return apiClient.invokeAPI("/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get an XCom entry
     * 
     * <p><b>200</b> - Successful response.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param dagId The DAG ID.
     * @param dagRunId The DAG Run ID.
     * @param taskId The Task ID.
     * @param xcomKey The XCom Key.
     * @return XCom
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<XCom> getXComValue(String dagId, String dagRunId, String taskId, String xcomKey) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagId' when calling getXComValue", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagRunId' when calling getXComValue", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new WebClientResponseException("Missing the required parameter 'taskId' when calling getXComValue", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'xcomKey' is set
        if (xcomKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'xcomKey' when calling getXComValue", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("dag_id", dagId);
        pathParams.put("dag_run_id", dagRunId);
        pathParams.put("task_id", taskId);
        pathParams.put("xcom_key", xcomKey);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<XCom> localVarReturnType = new ParameterizedTypeReference<XCom>() {};
        return apiClient.invokeAPI("/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Create an XCom entry
     * 
     * <p><b>200</b> - Successful response.
     * <p><b>400</b> - Client specified an invalid argument.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * @param dagId The DAG ID.
     * @param dagRunId The DAG Run ID.
     * @param taskId The Task ID.
     * @param xcom The xcom parameter
     * @return XCom
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<XCom> updateXComEntry(String dagId, String dagRunId, String taskId, XCom xcom) throws WebClientResponseException {
        Object postBody = xcom;
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagId' when calling updateXComEntry", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagRunId' when calling updateXComEntry", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new WebClientResponseException("Missing the required parameter 'taskId' when calling updateXComEntry", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'xcom' is set
        if (xcom == null) {
            throw new WebClientResponseException("Missing the required parameter 'xcom' when calling updateXComEntry", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("dag_id", dagId);
        pathParams.put("dag_run_id", dagRunId);
        pathParams.put("task_id", taskId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<XCom> localVarReturnType = new ParameterizedTypeReference<XCom>() {};
        return apiClient.invokeAPI("/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Update an XCom entry
     * 
     * <p><b>200</b> - Successful response.
     * <p><b>400</b> - Client specified an invalid argument.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param dagId The DAG ID.
     * @param dagRunId The DAG Run ID.
     * @param taskId The Task ID.
     * @param xcomKey The XCom Key.
     * @param xcom The xcom parameter
     * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields. 
     * @return XCom
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<XCom> updateXComValue(String dagId, String dagRunId, String taskId, String xcomKey, XCom xcom, List<String> updateMask) throws WebClientResponseException {
        Object postBody = xcom;
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagId' when calling updateXComValue", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagRunId' when calling updateXComValue", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new WebClientResponseException("Missing the required parameter 'taskId' when calling updateXComValue", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'xcomKey' is set
        if (xcomKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'xcomKey' when calling updateXComValue", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'xcom' is set
        if (xcom == null) {
            throw new WebClientResponseException("Missing the required parameter 'xcom' when calling updateXComValue", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("dag_id", dagId);
        pathParams.put("dag_run_id", dagRunId);
        pathParams.put("task_id", taskId);
        pathParams.put("xcom_key", xcomKey);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "update_mask", updateMask));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<XCom> localVarReturnType = new ParameterizedTypeReference<XCom>() {};
        return apiClient.invokeAPI("/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}", HttpMethod.PATCH, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
