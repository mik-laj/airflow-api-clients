package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-30T18:48:22.158Z[GMT]")
public class DagRunApi {
  private ApiClient apiClient;

  public DagRunApi() {
    this(Configuration.getDefaultApiClient());
  }

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
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param daGRun  (required)
   * @return a {@code DAGRun}
   * @throws ApiException if fails to make API call
   */
  public DAGRun createDagRun(String dagId, String dagRunId, DAGRun daGRun) throws ApiException {
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
    String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}".replaceAll("\\{format\\}","json")
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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a DAG Run
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDagRun(String dagId, String dagRunId) throws ApiException {
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
    String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}".replaceAll("\\{format\\}","json")
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


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get a DAG Run
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @return a {@code DAGRun}
   * @throws ApiException if fails to make API call
   */
  public DAGRun getDagRun(String dagId, String dagRunId) throws ApiException {
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
    String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}".replaceAll("\\{format\\}","json")
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
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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
   * @return a {@code DAGRunCollection}
   * @throws ApiException if fails to make API call
   */
  public DAGRunCollection getDagRuns(String dagId, Integer limit, Integer offset, OffsetDateTime executionDateGte, OffsetDateTime executionDateLte, OffsetDateTime startDateGte, OffsetDateTime startDateLte, OffsetDateTime endDateGte, OffsetDateTime endDateLte) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dagId' is set
    if (dagId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagId' when calling getDagRuns");
    }
    
    // create path and map variables
    String localVarPath = "/dags/{dag_id}/dagRuns".replaceAll("\\{format\\}","json")
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
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all DAG Runs from aall DAGs.
   * This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits 
   * @param listDagRunsForm  (required)
   * @return a {@code DAGRunCollection}
   * @throws ApiException if fails to make API call
   */
  public DAGRunCollection getDagRunsBatch(ListDagRunsForm listDagRunsForm) throws ApiException {
    Object localVarPostBody = listDagRunsForm;
    
    // verify the required parameter 'listDagRunsForm' is set
    if (listDagRunsForm == null) {
      throw new ApiException(400, "Missing the required parameter 'listDagRunsForm' when calling getDagRunsBatch");
    }
    
    // create path and map variables
    String localVarPath = "/dags/~/dagRuns/list".replaceAll("\\{format\\}","json");

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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update a DAG Run
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param daGRun  (required)
   * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;String&gt;())
   * @return a {@code DAGRun}
   * @throws ApiException if fails to make API call
   */
  public DAGRun updateDagRun(String dagId, String dagRunId, DAGRun daGRun, List<String> updateMask) throws ApiException {
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
    String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}".replaceAll("\\{format\\}","json")
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
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
