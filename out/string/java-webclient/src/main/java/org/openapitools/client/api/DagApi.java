package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ClearTaskInstance;
import org.openapitools.client.model.DAG;
import org.openapitools.client.model.DAGCollection;
import org.openapitools.client.model.DAGDetail;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.InlineResponse2001;
import org.openapitools.client.model.Task;
import org.openapitools.client.model.TaskCollection;
import org.openapitools.client.model.TaskInstanceReferenceCollection;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-30T18:46:02.616Z[GMT]")
public class DagApi {
    private ApiClient apiClient;

    public DagApi() {
        this(new ApiClient());
    }

    @Autowired
    public DagApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Clears a set of task instances associated with the DAG for a specified date range.
     * 
     * <p><b>200</b> - A list of cleared task references
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param dagId The DAG ID.
     * @param clearTaskInstance Parameters of action
     * @return TaskInstanceReferenceCollection
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TaskInstanceReferenceCollection> clearTaskInstance(String dagId, ClearTaskInstance clearTaskInstance) throws WebClientResponseException {
        Object postBody = clearTaskInstance;
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagId' when calling clearTaskInstance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'clearTaskInstance' is set
        if (clearTaskInstance == null) {
            throw new WebClientResponseException("Missing the required parameter 'clearTaskInstance' when calling clearTaskInstance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("dag_id", dagId);

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

        ParameterizedTypeReference<TaskInstanceReferenceCollection> localVarReturnType = new ParameterizedTypeReference<TaskInstanceReferenceCollection>() {};
        return apiClient.invokeAPI("/dags/{dag_id}/clearTaskInstances", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get basic information about a DAG
     * Presents only information available in database (DAGModel). If you need detailed information, consider using GET /dags/{dag_id}/detail. 
     * <p><b>200</b> - Successful response.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param dagId The DAG ID.
     * @return DAG
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DAG> getDag(String dagId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagId' when calling getDag", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("dag_id", dagId);

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

        ParameterizedTypeReference<DAG> localVarReturnType = new ParameterizedTypeReference<DAG>() {};
        return apiClient.invokeAPI("/dags/{dag_id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get a simplified representation of DAG.
     * The response contains many DAG attributes, so the response can be large. If possible, consider using GET /dags/{dag_id}. 
     * <p><b>200</b> - Successful response.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param dagId The DAG ID.
     * @return DAGDetail
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DAGDetail> getDagDetail(String dagId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagId' when calling getDagDetail", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("dag_id", dagId);

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

        ParameterizedTypeReference<DAGDetail> localVarReturnType = new ParameterizedTypeReference<DAGDetail>() {};
        return apiClient.invokeAPI("/dags/{dag_id}/details", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get source code using file token
     * 
     * <p><b>200</b> - Successful response.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param fileToken The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change. 
     * @return InlineResponse2001
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<InlineResponse2001> getDagSource(String fileToken) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'fileToken' is set
        if (fileToken == null) {
            throw new WebClientResponseException("Missing the required parameter 'fileToken' when calling getDagSource", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("file_token", fileToken);

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

        ParameterizedTypeReference<InlineResponse2001> localVarReturnType = new ParameterizedTypeReference<InlineResponse2001>() {};
        return apiClient.invokeAPI("/dagSources/{file_token}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get all DAGs
     * 
     * <p><b>200</b> - List of DAGs.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * @param limit The numbers of items to return.
     * @param offset The number of items to skip before starting to collect the result set.
     * @return DAGCollection
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DAGCollection> getDags(Integer limit, Integer offset) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

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

        ParameterizedTypeReference<DAGCollection> localVarReturnType = new ParameterizedTypeReference<DAGCollection>() {};
        return apiClient.invokeAPI("/dags", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get simplified representation of a task.
     * 
     * <p><b>200</b> - Successful response.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param dagId The DAG ID.
     * @param taskId The Task ID.
     * @return Task
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Task> getTask(String dagId, String taskId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagId' when calling getTask", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new WebClientResponseException("Missing the required parameter 'taskId' when calling getTask", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("dag_id", dagId);
        pathParams.put("task_id", taskId);

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

        ParameterizedTypeReference<Task> localVarReturnType = new ParameterizedTypeReference<Task>() {};
        return apiClient.invokeAPI("/dags/{dag_id}/tasks/{task_id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get tasks for DAG
     * 
     * <p><b>200</b> - Successful response.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param dagId The DAG ID.
     * @return TaskCollection
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TaskCollection> getTasks(String dagId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagId' when calling getTasks", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("dag_id", dagId);

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

        ParameterizedTypeReference<TaskCollection> localVarReturnType = new ParameterizedTypeReference<TaskCollection>() {};
        return apiClient.invokeAPI("/dags/{dag_id}/tasks", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Update a DAG
     * 
     * <p><b>200</b> - Successful response.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param dagId The DAG ID.
     * @param DAG The DAG parameter
     * @return DAG
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DAG> updateDag(String dagId, DAG DAG) throws WebClientResponseException {
        Object postBody = DAG;
        // verify the required parameter 'dagId' is set
        if (dagId == null) {
            throw new WebClientResponseException("Missing the required parameter 'dagId' when calling updateDag", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'DAG' is set
        if (DAG == null) {
            throw new WebClientResponseException("Missing the required parameter 'DAG' when calling updateDag", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("dag_id", dagId);

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

        ParameterizedTypeReference<DAG> localVarReturnType = new ParameterizedTypeReference<DAG>() {};
        return apiClient.invokeAPI("/dags/{dag_id}", HttpMethod.PATCH, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
