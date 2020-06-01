package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.DAGRun;
import org.openapitools.client.model.DAGRunCollection;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.ListDagRunsForm;
import java.time.OffsetDateTime;

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
     * @param dagId The DAG ID.
     * @param dagRunId The DAG Run ID.
     * @param daGRun The daGRun parameter
     * @return DAGRun
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DAGRun> createDagRun(String dagId, String dagRunId, DAGRun daGRun) throws WebClientResponseException {
        Object postBody = daGRun;
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagId' when calling createDagRun", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagRunId' when calling createDagRun", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'daGRun' is set
        if (daGRun == null) {
            throw new WebClientResponseException("Missing the required parameter 'daGRun' when calling createDagRun", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("dag_id", dagId);
        pathParams.put("dag_run_id", dagRunId);

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

        ParameterizedTypeReference<DAGRun> localVarReturnType = new ParameterizedTypeReference<DAGRun>() {};
        return apiClient.invokeAPI("/dags/{dag_id}/dagRuns/{dag_run_id}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Delete a DAG Run
     * 
     * <p><b>204</b> - No content.
     * <p><b>400</b> - Client specified an invalid argument.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * @param dagId The DAG ID.
     * @param dagRunId The DAG Run ID.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> deleteDagRun(String dagId, String dagRunId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagId' when calling deleteDagRun", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagRunId' when calling deleteDagRun", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("dag_id", dagId);
        pathParams.put("dag_run_id", dagRunId);

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
        return apiClient.invokeAPI("/dags/{dag_id}/dagRuns/{dag_run_id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get a DAG Run
     * 
     * <p><b>200</b> - Successful response.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param dagId The DAG ID.
     * @param dagRunId The DAG Run ID.
     * @return DAGRun
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DAGRun> getDagRun(String dagId, String dagRunId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagId' when calling getDagRun", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagRunId' when calling getDagRun", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("dag_id", dagId);
        pathParams.put("dag_run_id", dagRunId);

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

        ParameterizedTypeReference<DAGRun> localVarReturnType = new ParameterizedTypeReference<DAGRun>() {};
        return apiClient.invokeAPI("/dags/{dag_id}/dagRuns/{dag_run_id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DAGRunCollection> getDagRuns(String dagId, Integer limit, Integer offset, OffsetDateTime executionDateGte, OffsetDateTime executionDateLte, OffsetDateTime startDateGte, OffsetDateTime startDateLte, OffsetDateTime endDateGte, OffsetDateTime endDateLte) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagId' when calling getDagRuns", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("dag_id", dagId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "execution_date_gte", executionDateGte));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "execution_date_lte", executionDateLte));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date_gte", startDateGte));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date_lte", startDateLte));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date_gte", endDateGte));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date_lte", endDateLte));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<DAGRunCollection> localVarReturnType = new ParameterizedTypeReference<DAGRunCollection>() {};
        return apiClient.invokeAPI("/dags/{dag_id}/dagRuns", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DAGRunCollection> getDagRunsBatch(ListDagRunsForm listDagRunsForm) throws WebClientResponseException {
        Object postBody = listDagRunsForm;
        // verify the required parameter 'listDagRunsForm' is set
        if (listDagRunsForm == null) {
            throw new WebClientResponseException("Missing the required parameter 'listDagRunsForm' when calling getDagRunsBatch", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

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

        ParameterizedTypeReference<DAGRunCollection> localVarReturnType = new ParameterizedTypeReference<DAGRunCollection>() {};
        return apiClient.invokeAPI("/dags/~/dagRuns/list", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Update a DAG Run
     * 
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
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DAGRun> updateDagRun(String dagId, String dagRunId, DAGRun daGRun, List<String> updateMask) throws WebClientResponseException {
        Object postBody = daGRun;
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagId' when calling updateDagRun", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'dagRunId' is set
        if (dagRunId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagRunId' when calling updateDagRun", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'daGRun' is set
        if (daGRun == null) {
            throw new WebClientResponseException("Missing the required parameter 'daGRun' when calling updateDagRun", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("dag_id", dagId);
        pathParams.put("dag_run_id", dagRunId);

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

        ParameterizedTypeReference<DAGRun> localVarReturnType = new ParameterizedTypeReference<DAGRun>() {};
        return apiClient.invokeAPI("/dags/{dag_id}/dagRuns/{dag_run_id}", HttpMethod.PATCH, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
