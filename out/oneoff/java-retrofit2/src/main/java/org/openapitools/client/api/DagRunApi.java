package org.openapitools.client.api;

import org.openapitools.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.openapitools.client.model.DAGRun;
import org.openapitools.client.model.DAGRunCollection;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.ListDagRunsForm;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DagRunApi {
  /**
   * Trigger a DAG Run
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param daGRun  (required)
   * @return Call&lt;DAGRun&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("dags/{dag_id}/dagRuns/{dag_run_id}")
  Call<DAGRun> createDagRun(
    @retrofit2.http.Path("dag_id") String dagId, @retrofit2.http.Path("dag_run_id") String dagRunId, @retrofit2.http.Body DAGRun daGRun
  );

  /**
   * Delete a DAG Run
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("dags/{dag_id}/dagRuns/{dag_run_id}")
  Call<Void> deleteDagRun(
    @retrofit2.http.Path("dag_id") String dagId, @retrofit2.http.Path("dag_run_id") String dagRunId
  );

  /**
   * Get a DAG Run
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @return Call&lt;DAGRun&gt;
   */
  @GET("dags/{dag_id}/dagRuns/{dag_run_id}")
  Call<DAGRun> getDagRun(
    @retrofit2.http.Path("dag_id") String dagId, @retrofit2.http.Path("dag_run_id") String dagRunId
  );

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
   * @return Call&lt;DAGRunCollection&gt;
   */
  @GET("dags/{dag_id}/dagRuns")
  Call<DAGRunCollection> getDagRuns(
    @retrofit2.http.Path("dag_id") String dagId, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("execution_date_gte") OffsetDateTime executionDateGte, @retrofit2.http.Query("execution_date_lte") OffsetDateTime executionDateLte, @retrofit2.http.Query("start_date_gte") OffsetDateTime startDateGte, @retrofit2.http.Query("start_date_lte") OffsetDateTime startDateLte, @retrofit2.http.Query("end_date_gte") OffsetDateTime endDateGte, @retrofit2.http.Query("end_date_lte") OffsetDateTime endDateLte
  );

  /**
   * Get all DAG Runs from aall DAGs.
   * This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits 
   * @param listDagRunsForm  (required)
   * @return Call&lt;DAGRunCollection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("dags/~/dagRuns/list")
  Call<DAGRunCollection> getDagRunsBatch(
    @retrofit2.http.Body ListDagRunsForm listDagRunsForm
  );

  /**
   * Update a DAG Run
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param daGRun  (required)
   * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;String&gt;())
   * @return Call&lt;DAGRun&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("dags/{dag_id}/dagRuns/{dag_run_id}")
  Call<DAGRun> updateDagRun(
    @retrofit2.http.Path("dag_id") String dagId, @retrofit2.http.Path("dag_run_id") String dagRunId, @retrofit2.http.Body DAGRun daGRun, @retrofit2.http.Query("update_mask") CSVParams updateMask
  );

}
