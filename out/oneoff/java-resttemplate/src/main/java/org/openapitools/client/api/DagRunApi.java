package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.DAGRun;
import org.openapitools.client.model.DAGRunCollection;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.ListDagRunsForm;
import org.threeten.bp.OffsetDateTime;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:09:53.101Z[GMT]")
@Component("org.openapitools.client.api.DagRunApi")
public class DagRunApi {
    private ApiClient apiClient;

    public DagRunApi() {
        this(new ApiClient());
    }

    @Autowired
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
     * 
     * <p><b>200</b> - Successful response.
     * <p><b>400</b> - Client specified an invalid argument.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>409</b> - The resource that a client tried to create already exists.
     * <p><b>403</b> - Client does not have sufficient permission.
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param daGRun  (required)
     * @return DAGRun
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DAGRun createDagRun(String dagId, String dagRunId, DAGRun daGRun) throws RestClientException {
        return createDagRunWithHttpInfo(dagId, dagRunId, daGRun).getBody();
    }

    /**
     * Trigger a DAG Run
     * 
     * <p><b>200</b> - Successful response.
     * <p><b>400</b> - Client specified an invalid argument.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>409</b> - The resource that a client tried to create already exists.
     * <p><b>403</b> - Client does not have sufficient permission.
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param daGRun  (required)
     * @return ResponseEntity&lt;DAGRun&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DAGRun> createDagRunWithHttpInfo(String dagId, String dagRunId, DAGRun daGRun) throws RestClientException {
        Object postBody = daGRun;
        
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dagId' when calling createDagRun");
        }
        
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dagRunId' when calling createDagRun");
        }
        
        // verify the required parameter 'daGRun' is set
        if (daGRun == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'daGRun' when calling createDagRun");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        String path = apiClient.expandPath("/dags/{dag_id}/dagRuns/{dag_run_id}", uriVariables);

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

        ParameterizedTypeReference<DAGRun> returnType = new ParameterizedTypeReference<DAGRun>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Delete a DAG Run
     * 
     * <p><b>204</b> - No content.
     * <p><b>400</b> - Client specified an invalid argument.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteDagRun(String dagId, String dagRunId) throws RestClientException {
        deleteDagRunWithHttpInfo(dagId, dagRunId);
    }

    /**
     * Delete a DAG Run
     * 
     * <p><b>204</b> - No content.
     * <p><b>400</b> - Client specified an invalid argument.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteDagRunWithHttpInfo(String dagId, String dagRunId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dagId' when calling deleteDagRun");
        }
        
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dagRunId' when calling deleteDagRun");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        String path = apiClient.expandPath("/dags/{dag_id}/dagRuns/{dag_run_id}", uriVariables);

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
     * Get a DAG Run
     * 
     * <p><b>200</b> - Successful response.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @return DAGRun
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DAGRun getDagRun(String dagId, String dagRunId) throws RestClientException {
        return getDagRunWithHttpInfo(dagId, dagRunId).getBody();
    }

    /**
     * Get a DAG Run
     * 
     * <p><b>200</b> - Successful response.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @return ResponseEntity&lt;DAGRun&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DAGRun> getDagRunWithHttpInfo(String dagId, String dagRunId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dagId' when calling getDagRun");
        }
        
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dagRunId' when calling getDagRun");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        String path = apiClient.expandPath("/dags/{dag_id}/dagRuns/{dag_run_id}", uriVariables);

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

        ParameterizedTypeReference<DAGRun> returnType = new ParameterizedTypeReference<DAGRun>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get all DAG Runs
     * This endpoint allows specifying &#x60;~&#x60; as the dag_id to retrieve DAG Runs for all DAGs. 
     * <p><b>200</b> - List of DAG Runs.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * @param dagId The DAG ID. (required)
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @param executionDateGte Returns objects greater or equal to the specified date. This can be combined with execution_date_lte parameter to receive only the selected period.  (optional)
     * @param executionDateLte Returns objects less than or equal to the specified date. This can be combined with execution_date_gte parameter to receive only the selected period.  (optional)
     * @param startDateGte Returns objects greater or equal the specified date. This can be combined with startd_ate_lte parameter to receive only the selected period.  (optional)
     * @param startDateLte Returns objects less or equal the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  (optional)
     * @param endDateGte Returns objects greater or equal the specified date. This can be combined with start_date_lte parameter to receive only the selected period.  (optional)
     * @param endDateLte Returns objects less than or equal to the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  (optional)
     * @return DAGRunCollection
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DAGRunCollection getDagRuns(String dagId, Integer limit, Integer offset, OffsetDateTime executionDateGte, OffsetDateTime executionDateLte, OffsetDateTime startDateGte, OffsetDateTime startDateLte, OffsetDateTime endDateGte, OffsetDateTime endDateLte) throws RestClientException {
        return getDagRunsWithHttpInfo(dagId, limit, offset, executionDateGte, executionDateLte, startDateGte, startDateLte, endDateGte, endDateLte).getBody();
    }

    /**
     * Get all DAG Runs
     * This endpoint allows specifying &#x60;~&#x60; as the dag_id to retrieve DAG Runs for all DAGs. 
     * <p><b>200</b> - List of DAG Runs.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * @param dagId The DAG ID. (required)
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @param executionDateGte Returns objects greater or equal to the specified date. This can be combined with execution_date_lte parameter to receive only the selected period.  (optional)
     * @param executionDateLte Returns objects less than or equal to the specified date. This can be combined with execution_date_gte parameter to receive only the selected period.  (optional)
     * @param startDateGte Returns objects greater or equal the specified date. This can be combined with startd_ate_lte parameter to receive only the selected period.  (optional)
     * @param startDateLte Returns objects less or equal the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  (optional)
     * @param endDateGte Returns objects greater or equal the specified date. This can be combined with start_date_lte parameter to receive only the selected period.  (optional)
     * @param endDateLte Returns objects less than or equal to the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  (optional)
     * @return ResponseEntity&lt;DAGRunCollection&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DAGRunCollection> getDagRunsWithHttpInfo(String dagId, Integer limit, Integer offset, OffsetDateTime executionDateGte, OffsetDateTime executionDateLte, OffsetDateTime startDateGte, OffsetDateTime startDateLte, OffsetDateTime endDateGte, OffsetDateTime endDateLte) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dagId' when calling getDagRuns");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        String path = apiClient.expandPath("/dags/{dag_id}/dagRuns", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "execution_date_gte", executionDateGte));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "execution_date_lte", executionDateLte));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date_gte", startDateGte));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date_lte", startDateLte));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date_gte", endDateGte));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date_lte", endDateLte));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<DAGRunCollection> returnType = new ParameterizedTypeReference<DAGRunCollection>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get all DAG Runs from aall DAGs.
     * This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits 
     * <p><b>200</b> - List of DAG Runs.
     * <p><b>400</b> - Client specified an invalid argument.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * @param listDagRunsForm  (required)
     * @return DAGRunCollection
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DAGRunCollection getDagRunsBatch(ListDagRunsForm listDagRunsForm) throws RestClientException {
        return getDagRunsBatchWithHttpInfo(listDagRunsForm).getBody();
    }

    /**
     * Get all DAG Runs from aall DAGs.
     * This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits 
     * <p><b>200</b> - List of DAG Runs.
     * <p><b>400</b> - Client specified an invalid argument.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * @param listDagRunsForm  (required)
     * @return ResponseEntity&lt;DAGRunCollection&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DAGRunCollection> getDagRunsBatchWithHttpInfo(ListDagRunsForm listDagRunsForm) throws RestClientException {
        Object postBody = listDagRunsForm;
        
        // verify the required parameter 'listDagRunsForm' is set
        if (listDagRunsForm == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'listDagRunsForm' when calling getDagRunsBatch");
        }
        
        String path = apiClient.expandPath("/dags/~/dagRuns/list", Collections.<String, Object>emptyMap());

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

        ParameterizedTypeReference<DAGRunCollection> returnType = new ParameterizedTypeReference<DAGRunCollection>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update a DAG Run
     * 
     * <p><b>200</b> - Successful response.
     * <p><b>400</b> - Client specified an invalid argument.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param daGRun  (required)
     * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;String&gt;())
     * @return DAGRun
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DAGRun updateDagRun(String dagId, String dagRunId, DAGRun daGRun, List<String> updateMask) throws RestClientException {
        return updateDagRunWithHttpInfo(dagId, dagRunId, daGRun, updateMask).getBody();
    }

    /**
     * Update a DAG Run
     * 
     * <p><b>200</b> - Successful response.
     * <p><b>400</b> - Client specified an invalid argument.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param daGRun  (required)
     * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;String&gt;())
     * @return ResponseEntity&lt;DAGRun&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DAGRun> updateDagRunWithHttpInfo(String dagId, String dagRunId, DAGRun daGRun, List<String> updateMask) throws RestClientException {
        Object postBody = daGRun;
        
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dagId' when calling updateDagRun");
        }
        
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dagRunId' when calling updateDagRun");
        }
        
        // verify the required parameter 'daGRun' is set
        if (daGRun == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'daGRun' when calling updateDagRun");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dag_id", dagId);
        uriVariables.put("dag_run_id", dagRunId);
        String path = apiClient.expandPath("/dags/{dag_id}/dagRuns/{dag_run_id}", uriVariables);

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

        ParameterizedTypeReference<DAGRun> returnType = new ParameterizedTypeReference<DAGRun>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
