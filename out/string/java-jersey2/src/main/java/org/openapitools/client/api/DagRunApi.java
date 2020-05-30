package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.DAGRun;
import org.openapitools.client.model.DAGRunCollection;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.ListDagRunsForm;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-30T18:45:50.802Z[GMT]")
public class DagRunApi {
  private ApiClient apiClient;

  public DagRunApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DagRunApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API cilent
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API cilent
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Trigger a DAG Run
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param daGRun  (required)
   * @return DAGRun
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Client specified an invalid argument. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Request not authenticated due to missing, invalid, authentication info. </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> The resource that a client tried to create already exists. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Client does not have sufficient permission. </td><td>  -  </td></tr>
     </table>
   */
  public DAGRun createDagRun(String dagId, String dagRunId, DAGRun daGRun) throws ApiException {
    return createDagRunWithHttpInfo(dagId, dagRunId, daGRun).getData();
  }

  /**
   * Trigger a DAG Run
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param daGRun  (required)
   * @return ApiResponse&lt;DAGRun&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Client specified an invalid argument. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Request not authenticated due to missing, invalid, authentication info. </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> The resource that a client tried to create already exists. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Client does not have sufficient permission. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DAGRun> createDagRunWithHttpInfo(String dagId, String dagRunId, DAGRun daGRun) throws ApiException {
    Object localVarPostBody = daGRun;
    
    // verify the required parameter 'dagId' is set
    if (dagId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagId' when calling createDagRun");
    }
    
    // verify the required parameter 'dagRunId' is set
    if (dagRunId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagRunId' when calling createDagRun");
    }
    
    // verify the required parameter 'daGRun' is set
    if (daGRun == null) {
      throw new ApiException(400, "Missing the required parameter 'daGRun' when calling createDagRun");
    }
    
    // create path and map variables
    String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}"
      .replaceAll("\\{" + "dag_id" + "\\}", apiClient.escapeString(dagId.toString()))
      .replaceAll("\\{" + "dag_run_id" + "\\}", apiClient.escapeString(dagRunId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<DAGRun> localVarReturnType = new GenericType<DAGRun>() {};

    return apiClient.invokeAPI("DagRunApi.createDagRun", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, null);
  }
  /**
   * Delete a DAG Run
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No content. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Client specified an invalid argument. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Request not authenticated due to missing, invalid, authentication info. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Client does not have sufficient permission. </td><td>  -  </td></tr>
     </table>
   */
  public void deleteDagRun(String dagId, String dagRunId) throws ApiException {
    deleteDagRunWithHttpInfo(dagId, dagRunId);
  }

  /**
   * Delete a DAG Run
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No content. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Client specified an invalid argument. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Request not authenticated due to missing, invalid, authentication info. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Client does not have sufficient permission. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteDagRunWithHttpInfo(String dagId, String dagRunId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dagId' is set
    if (dagId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagId' when calling deleteDagRun");
    }
    
    // verify the required parameter 'dagRunId' is set
    if (dagRunId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagRunId' when calling deleteDagRun");
    }
    
    // create path and map variables
    String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}"
      .replaceAll("\\{" + "dag_id" + "\\}", apiClient.escapeString(dagId.toString()))
      .replaceAll("\\{" + "dag_run_id" + "\\}", apiClient.escapeString(dagRunId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    return apiClient.invokeAPI("DagRunApi.deleteDagRun", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, null);
  }
  /**
   * Get a DAG Run
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @return DAGRun
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Request not authenticated due to missing, invalid, authentication info. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Client does not have sufficient permission. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> A specified resource is not found. </td><td>  -  </td></tr>
     </table>
   */
  public DAGRun getDagRun(String dagId, String dagRunId) throws ApiException {
    return getDagRunWithHttpInfo(dagId, dagRunId).getData();
  }

  /**
   * Get a DAG Run
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @return ApiResponse&lt;DAGRun&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Request not authenticated due to missing, invalid, authentication info. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Client does not have sufficient permission. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> A specified resource is not found. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DAGRun> getDagRunWithHttpInfo(String dagId, String dagRunId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dagId' is set
    if (dagId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagId' when calling getDagRun");
    }
    
    // verify the required parameter 'dagRunId' is set
    if (dagRunId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagRunId' when calling getDagRun");
    }
    
    // create path and map variables
    String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}"
      .replaceAll("\\{" + "dag_id" + "\\}", apiClient.escapeString(dagId.toString()))
      .replaceAll("\\{" + "dag_run_id" + "\\}", apiClient.escapeString(dagRunId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<DAGRun> localVarReturnType = new GenericType<DAGRun>() {};

    return apiClient.invokeAPI("DagRunApi.getDagRun", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, null);
  }
  /**
   * Get all DAG Runs
   * This endpoint allows specifying &#x60;~&#x60; as the dag_id to retrieve DAG Runs for all DAGs. 
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
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List of DAG Runs. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Request not authenticated due to missing, invalid, authentication info. </td><td>  -  </td></tr>
     </table>
   */
  public DAGRunCollection getDagRuns(String dagId, Integer limit, Integer offset, OffsetDateTime executionDateGte, OffsetDateTime executionDateLte, OffsetDateTime startDateGte, OffsetDateTime startDateLte, OffsetDateTime endDateGte, OffsetDateTime endDateLte) throws ApiException {
    return getDagRunsWithHttpInfo(dagId, limit, offset, executionDateGte, executionDateLte, startDateGte, startDateLte, endDateGte, endDateLte).getData();
  }

  /**
   * Get all DAG Runs
   * This endpoint allows specifying &#x60;~&#x60; as the dag_id to retrieve DAG Runs for all DAGs. 
   * @param dagId The DAG ID. (required)
   * @param limit The numbers of items to return. (optional, default to 100)
   * @param offset The number of items to skip before starting to collect the result set. (optional)
   * @param executionDateGte Returns objects greater or equal to the specified date. This can be combined with execution_date_lte parameter to receive only the selected period.  (optional)
   * @param executionDateLte Returns objects less than or equal to the specified date. This can be combined with execution_date_gte parameter to receive only the selected period.  (optional)
   * @param startDateGte Returns objects greater or equal the specified date. This can be combined with startd_ate_lte parameter to receive only the selected period.  (optional)
   * @param startDateLte Returns objects less or equal the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  (optional)
   * @param endDateGte Returns objects greater or equal the specified date. This can be combined with start_date_lte parameter to receive only the selected period.  (optional)
   * @param endDateLte Returns objects less than or equal to the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  (optional)
   * @return ApiResponse&lt;DAGRunCollection&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List of DAG Runs. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Request not authenticated due to missing, invalid, authentication info. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DAGRunCollection> getDagRunsWithHttpInfo(String dagId, Integer limit, Integer offset, OffsetDateTime executionDateGte, OffsetDateTime executionDateLte, OffsetDateTime startDateGte, OffsetDateTime startDateLte, OffsetDateTime endDateGte, OffsetDateTime endDateLte) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dagId' is set
    if (dagId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagId' when calling getDagRuns");
    }
    
    // create path and map variables
    String localVarPath = "/dags/{dag_id}/dagRuns"
      .replaceAll("\\{" + "dag_id" + "\\}", apiClient.escapeString(dagId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "execution_date_gte", executionDateGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "execution_date_lte", executionDateLte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date_gte", startDateGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date_lte", startDateLte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date_gte", endDateGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date_lte", endDateLte));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<DAGRunCollection> localVarReturnType = new GenericType<DAGRunCollection>() {};

    return apiClient.invokeAPI("DagRunApi.getDagRuns", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, null);
  }
  /**
   * Get all DAG Runs from aall DAGs.
   * This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits 
   * @param listDagRunsForm  (required)
   * @return DAGRunCollection
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List of DAG Runs. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Client specified an invalid argument. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Request not authenticated due to missing, invalid, authentication info. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Client does not have sufficient permission. </td><td>  -  </td></tr>
     </table>
   */
  public DAGRunCollection getDagRunsBatch(ListDagRunsForm listDagRunsForm) throws ApiException {
    return getDagRunsBatchWithHttpInfo(listDagRunsForm).getData();
  }

  /**
   * Get all DAG Runs from aall DAGs.
   * This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits 
   * @param listDagRunsForm  (required)
   * @return ApiResponse&lt;DAGRunCollection&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List of DAG Runs. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Client specified an invalid argument. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Request not authenticated due to missing, invalid, authentication info. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Client does not have sufficient permission. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DAGRunCollection> getDagRunsBatchWithHttpInfo(ListDagRunsForm listDagRunsForm) throws ApiException {
    Object localVarPostBody = listDagRunsForm;
    
    // verify the required parameter 'listDagRunsForm' is set
    if (listDagRunsForm == null) {
      throw new ApiException(400, "Missing the required parameter 'listDagRunsForm' when calling getDagRunsBatch");
    }
    
    // create path and map variables
    String localVarPath = "/dags/~/dagRuns/list";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<DAGRunCollection> localVarReturnType = new GenericType<DAGRunCollection>() {};

    return apiClient.invokeAPI("DagRunApi.getDagRunsBatch", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, null);
  }
  /**
   * Update a DAG Run
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param daGRun  (required)
   * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;String&gt;())
   * @return DAGRun
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Client specified an invalid argument. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Request not authenticated due to missing, invalid, authentication info. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Client does not have sufficient permission. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> A specified resource is not found. </td><td>  -  </td></tr>
     </table>
   */
  public DAGRun updateDagRun(String dagId, String dagRunId, DAGRun daGRun, List<String> updateMask) throws ApiException {
    return updateDagRunWithHttpInfo(dagId, dagRunId, daGRun, updateMask).getData();
  }

  /**
   * Update a DAG Run
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param daGRun  (required)
   * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;String&gt;())
   * @return ApiResponse&lt;DAGRun&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Client specified an invalid argument. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Request not authenticated due to missing, invalid, authentication info. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Client does not have sufficient permission. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> A specified resource is not found. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DAGRun> updateDagRunWithHttpInfo(String dagId, String dagRunId, DAGRun daGRun, List<String> updateMask) throws ApiException {
    Object localVarPostBody = daGRun;
    
    // verify the required parameter 'dagId' is set
    if (dagId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagId' when calling updateDagRun");
    }
    
    // verify the required parameter 'dagRunId' is set
    if (dagRunId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagRunId' when calling updateDagRun");
    }
    
    // verify the required parameter 'daGRun' is set
    if (daGRun == null) {
      throw new ApiException(400, "Missing the required parameter 'daGRun' when calling updateDagRun");
    }
    
    // create path and map variables
    String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}"
      .replaceAll("\\{" + "dag_id" + "\\}", apiClient.escapeString(dagId.toString()))
      .replaceAll("\\{" + "dag_run_id" + "\\}", apiClient.escapeString(dagRunId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "update_mask", updateMask));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<DAGRun> localVarReturnType = new GenericType<DAGRun>() {};

    return apiClient.invokeAPI("DagRunApi.updateDagRun", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, null);
  }
}
