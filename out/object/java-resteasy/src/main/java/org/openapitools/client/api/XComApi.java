package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.XCom;
import org.openapitools.client.model.XComCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-30T18:47:13.626Z[GMT]")
public class XComApi {
  private ApiClient apiClient;

  public XComApi() {
    this(Configuration.getDefaultApiClient());
  }

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
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @param xcomKey The XCom Key. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteXComValue(String dagId, String dagRunId, String taskId, String xcomKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dagId' is set
    if (dagId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagId' when calling deleteXComValue");
    }
    
    // verify the required parameter 'dagRunId' is set
    if (dagRunId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagRunId' when calling deleteXComValue");
    }
    
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskId' when calling deleteXComValue");
    }
    
    // verify the required parameter 'xcomKey' is set
    if (xcomKey == null) {
      throw new ApiException(400, "Missing the required parameter 'xcomKey' when calling deleteXComValue");
    }
    
    // create path and map variables
    String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dag_id" + "\\}", apiClient.escapeString(dagId.toString()))
      .replaceAll("\\{" + "dag_run_id" + "\\}", apiClient.escapeString(dagRunId.toString()))
      .replaceAll("\\{" + "task_id" + "\\}", apiClient.escapeString(taskId.toString()))
      .replaceAll("\\{" + "xcom_key" + "\\}", apiClient.escapeString(xcomKey.toString()));

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
   * Get all XCom entries
   * This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id, task_id to retrieve XCOM entries for for all DAGs, DAG Runs and task instances.
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @param limit The numbers of items to return. (optional, default to 100)
   * @param offset The number of items to skip before starting to collect the result set. (optional)
   * @return a {@code XComCollection}
   * @throws ApiException if fails to make API call
   */
  public XComCollection getXComEntry(String dagId, String dagRunId, String taskId, Integer limit, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dagId' is set
    if (dagId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagId' when calling getXComEntry");
    }
    
    // verify the required parameter 'dagRunId' is set
    if (dagRunId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagRunId' when calling getXComEntry");
    }
    
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskId' when calling getXComEntry");
    }
    
    // create path and map variables
    String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dag_id" + "\\}", apiClient.escapeString(dagId.toString()))
      .replaceAll("\\{" + "dag_run_id" + "\\}", apiClient.escapeString(dagRunId.toString()))
      .replaceAll("\\{" + "task_id" + "\\}", apiClient.escapeString(taskId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<XComCollection> localVarReturnType = new GenericType<XComCollection>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get an XCom entry
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @param xcomKey The XCom Key. (required)
   * @return a {@code XCom}
   * @throws ApiException if fails to make API call
   */
  public XCom getXComValue(String dagId, String dagRunId, String taskId, String xcomKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dagId' is set
    if (dagId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagId' when calling getXComValue");
    }
    
    // verify the required parameter 'dagRunId' is set
    if (dagRunId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagRunId' when calling getXComValue");
    }
    
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskId' when calling getXComValue");
    }
    
    // verify the required parameter 'xcomKey' is set
    if (xcomKey == null) {
      throw new ApiException(400, "Missing the required parameter 'xcomKey' when calling getXComValue");
    }
    
    // create path and map variables
    String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dag_id" + "\\}", apiClient.escapeString(dagId.toString()))
      .replaceAll("\\{" + "dag_run_id" + "\\}", apiClient.escapeString(dagRunId.toString()))
      .replaceAll("\\{" + "task_id" + "\\}", apiClient.escapeString(taskId.toString()))
      .replaceAll("\\{" + "xcom_key" + "\\}", apiClient.escapeString(xcomKey.toString()));

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

    GenericType<XCom> localVarReturnType = new GenericType<XCom>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create an XCom entry
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @param xcom  (required)
   * @return a {@code XCom}
   * @throws ApiException if fails to make API call
   */
  public XCom updateXComEntry(String dagId, String dagRunId, String taskId, XCom xcom) throws ApiException {
    Object localVarPostBody = xcom;
    
    // verify the required parameter 'dagId' is set
    if (dagId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagId' when calling updateXComEntry");
    }
    
    // verify the required parameter 'dagRunId' is set
    if (dagRunId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagRunId' when calling updateXComEntry");
    }
    
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskId' when calling updateXComEntry");
    }
    
    // verify the required parameter 'xcom' is set
    if (xcom == null) {
      throw new ApiException(400, "Missing the required parameter 'xcom' when calling updateXComEntry");
    }
    
    // create path and map variables
    String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dag_id" + "\\}", apiClient.escapeString(dagId.toString()))
      .replaceAll("\\{" + "dag_run_id" + "\\}", apiClient.escapeString(dagRunId.toString()))
      .replaceAll("\\{" + "task_id" + "\\}", apiClient.escapeString(taskId.toString()));

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

    GenericType<XCom> localVarReturnType = new GenericType<XCom>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update an XCom entry
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @param xcomKey The XCom Key. (required)
   * @param xcom  (required)
   * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;String&gt;())
   * @return a {@code XCom}
   * @throws ApiException if fails to make API call
   */
  public XCom updateXComValue(String dagId, String dagRunId, String taskId, String xcomKey, XCom xcom, List<String> updateMask) throws ApiException {
    Object localVarPostBody = xcom;
    
    // verify the required parameter 'dagId' is set
    if (dagId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagId' when calling updateXComValue");
    }
    
    // verify the required parameter 'dagRunId' is set
    if (dagRunId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagRunId' when calling updateXComValue");
    }
    
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskId' when calling updateXComValue");
    }
    
    // verify the required parameter 'xcomKey' is set
    if (xcomKey == null) {
      throw new ApiException(400, "Missing the required parameter 'xcomKey' when calling updateXComValue");
    }
    
    // verify the required parameter 'xcom' is set
    if (xcom == null) {
      throw new ApiException(400, "Missing the required parameter 'xcom' when calling updateXComValue");
    }
    
    // create path and map variables
    String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dag_id" + "\\}", apiClient.escapeString(dagId.toString()))
      .replaceAll("\\{" + "dag_run_id" + "\\}", apiClient.escapeString(dagRunId.toString()))
      .replaceAll("\\{" + "task_id" + "\\}", apiClient.escapeString(taskId.toString()))
      .replaceAll("\\{" + "xcom_key" + "\\}", apiClient.escapeString(xcomKey.toString()));

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

    GenericType<XCom> localVarReturnType = new GenericType<XCom>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
