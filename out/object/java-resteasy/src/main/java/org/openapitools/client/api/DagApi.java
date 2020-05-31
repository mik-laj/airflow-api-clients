package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.ClearTaskInstance;
import org.openapitools.client.model.DAG;
import org.openapitools.client.model.DAGCollection;
import org.openapitools.client.model.DAGDetail;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.InlineResponse2001;
import org.openapitools.client.model.Task;
import org.openapitools.client.model.TaskCollection;
import org.openapitools.client.model.TaskInstanceReferenceCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-31T07:53:16.755Z[GMT]")
public class DagApi {
  private ApiClient apiClient;

  public DagApi() {
    this(Configuration.getDefaultApiClient());
  }

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
   * @param dagId The DAG ID. (required)
   * @param clearTaskInstance Parameters of action (required)
   * @return a {@code TaskInstanceReferenceCollection}
   * @throws ApiException if fails to make API call
   */
  public TaskInstanceReferenceCollection clearTaskInstance(String dagId, ClearTaskInstance clearTaskInstance) throws ApiException {
    Object localVarPostBody = clearTaskInstance;
    
    // verify the required parameter 'dagId' is set
    if (dagId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagId' when calling clearTaskInstance");
    }
    
    // verify the required parameter 'clearTaskInstance' is set
    if (clearTaskInstance == null) {
      throw new ApiException(400, "Missing the required parameter 'clearTaskInstance' when calling clearTaskInstance");
    }
    
    // create path and map variables
    String localVarPath = "/dags/{dag_id}/clearTaskInstances".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dag_id" + "\\}", apiClient.escapeString(dagId.toString()));

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

    GenericType<TaskInstanceReferenceCollection> localVarReturnType = new GenericType<TaskInstanceReferenceCollection>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get basic information about a DAG
   * Presents only information available in database (DAGModel). If you need detailed information, consider using GET /dags/{dag_id}/detail. 
   * @param dagId The DAG ID. (required)
   * @return a {@code DAG}
   * @throws ApiException if fails to make API call
   */
  public DAG getDag(String dagId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dagId' is set
    if (dagId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagId' when calling getDag");
    }
    
    // create path and map variables
    String localVarPath = "/dags/{dag_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dag_id" + "\\}", apiClient.escapeString(dagId.toString()));

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

    GenericType<DAG> localVarReturnType = new GenericType<DAG>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a simplified representation of DAG.
   * The response contains many DAG attributes, so the response can be large. If possible, consider using GET /dags/{dag_id}. 
   * @param dagId The DAG ID. (required)
   * @return a {@code DAGDetail}
   * @throws ApiException if fails to make API call
   */
  public DAGDetail getDagDetail(String dagId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dagId' is set
    if (dagId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagId' when calling getDagDetail");
    }
    
    // create path and map variables
    String localVarPath = "/dags/{dag_id}/details".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dag_id" + "\\}", apiClient.escapeString(dagId.toString()));

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

    GenericType<DAGDetail> localVarReturnType = new GenericType<DAGDetail>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get source code using file token
   * 
   * @param fileToken The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change.  (required)
   * @return a {@code InlineResponse2001}
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2001 getDagSource(String fileToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fileToken' is set
    if (fileToken == null) {
      throw new ApiException(400, "Missing the required parameter 'fileToken' when calling getDagSource");
    }
    
    // create path and map variables
    String localVarPath = "/dagSources/{file_token}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "file_token" + "\\}", apiClient.escapeString(fileToken.toString()));

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

    GenericType<InlineResponse2001> localVarReturnType = new GenericType<InlineResponse2001>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all DAGs
   * 
   * @param limit The numbers of items to return. (optional, default to 100)
   * @param offset The number of items to skip before starting to collect the result set. (optional)
   * @return a {@code DAGCollection}
   * @throws ApiException if fails to make API call
   */
  public DAGCollection getDags(Integer limit, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/dags".replaceAll("\\{format\\}","json");

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

    GenericType<DAGCollection> localVarReturnType = new GenericType<DAGCollection>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get simplified representation of a task.
   * 
   * @param dagId The DAG ID. (required)
   * @param taskId The Task ID. (required)
   * @return a {@code Task}
   * @throws ApiException if fails to make API call
   */
  public Task getTask(String dagId, String taskId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dagId' is set
    if (dagId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagId' when calling getTask");
    }
    
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskId' when calling getTask");
    }
    
    // create path and map variables
    String localVarPath = "/dags/{dag_id}/tasks/{task_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dag_id" + "\\}", apiClient.escapeString(dagId.toString()))
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Task> localVarReturnType = new GenericType<Task>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get tasks for DAG
   * 
   * @param dagId The DAG ID. (required)
   * @return a {@code TaskCollection}
   * @throws ApiException if fails to make API call
   */
  public TaskCollection getTasks(String dagId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dagId' is set
    if (dagId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagId' when calling getTasks");
    }
    
    // create path and map variables
    String localVarPath = "/dags/{dag_id}/tasks".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dag_id" + "\\}", apiClient.escapeString(dagId.toString()));

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

    GenericType<TaskCollection> localVarReturnType = new GenericType<TaskCollection>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update a DAG
   * 
   * @param dagId The DAG ID. (required)
   * @param DAG  (required)
   * @return a {@code DAG}
   * @throws ApiException if fails to make API call
   */
  public DAG updateDag(String dagId, DAG DAG) throws ApiException {
    Object localVarPostBody = DAG;
    
    // verify the required parameter 'dagId' is set
    if (dagId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagId' when calling updateDag");
    }
    
    // verify the required parameter 'DAG' is set
    if (DAG == null) {
      throw new ApiException(400, "Missing the required parameter 'DAG' when calling updateDag");
    }
    
    // create path and map variables
    String localVarPath = "/dags/{dag_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dag_id" + "\\}", apiClient.escapeString(dagId.toString()));

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

    GenericType<DAG> localVarReturnType = new GenericType<DAG>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
