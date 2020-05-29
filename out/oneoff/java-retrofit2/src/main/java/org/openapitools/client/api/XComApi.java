package org.openapitools.client.api;

import org.openapitools.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.XCom;
import org.openapitools.client.model.XComCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface XComApi {
  /**
   * Delete an XCom entry
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @param key The XCom Key. (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}")
  Call<Void> deleteXComValue(
    @retrofit2.http.Path("dag_id") String dagId, @retrofit2.http.Path("dag_run_id") String dagRunId, @retrofit2.http.Path("task_id") String taskId, @retrofit2.http.Path("key") String key
  );

  /**
   * Get all XCom entries
   * This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id, task_id to retrieve XCOM entries for for all DAGs, DAG Runs and task instances.
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @param limit The numbers of items to return. (optional, default to 100)
   * @param offset The number of items to skip before starting to collect the result set. (optional)
   * @return Call&lt;XComCollection&gt;
   */
  @GET("dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries")
  Call<XComCollection> getXComEntry(
    @retrofit2.http.Path("dag_id") String dagId, @retrofit2.http.Path("dag_run_id") String dagRunId, @retrofit2.http.Path("task_id") String taskId, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Get an XCom entry
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @param key The XCom Key. (required)
   * @return Call&lt;XCom&gt;
   */
  @GET("dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}")
  Call<XCom> getXComValue(
    @retrofit2.http.Path("dag_id") String dagId, @retrofit2.http.Path("dag_run_id") String dagRunId, @retrofit2.http.Path("task_id") String taskId, @retrofit2.http.Path("key") String key
  );

  /**
   * Create an XCom entry
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @param xcom  (required)
   * @return Call&lt;XCom&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries")
  Call<XCom> updateXComEntry(
    @retrofit2.http.Path("dag_id") String dagId, @retrofit2.http.Path("dag_run_id") String dagRunId, @retrofit2.http.Path("task_id") String taskId, @retrofit2.http.Body XCom xcom
  );

  /**
   * Update an XCom entry
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @param key The XCom Key. (required)
   * @param xcom  (required)
   * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;String&gt;())
   * @return Call&lt;XCom&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}")
  Call<XCom> updateXComValue(
    @retrofit2.http.Path("dag_id") String dagId, @retrofit2.http.Path("dag_run_id") String dagRunId, @retrofit2.http.Path("task_id") String taskId, @retrofit2.http.Path("key") String key, @retrofit2.http.Body XCom xcom, @retrofit2.http.Query("update_mask") CSVParams updateMask
  );

}
