package org.openapitools.client.api;

import org.openapitools.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import java.math.BigDecimal;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.ExtraLinkCollection;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.ListTaskInstanceForm;
import org.threeten.bp.OffsetDateTime;
import org.openapitools.client.model.TaskInstance;
import org.openapitools.client.model.TaskInstanceCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface TaskInstanceApi {
  /**
   * Get extra links for task instance
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @return Call&lt;ExtraLinkCollection&gt;
   */
  @GET("dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/links")
  Call<ExtraLinkCollection> getExtraLinks(
    @retrofit2.http.Path("dag_id") String dagId, @retrofit2.http.Path("dag_run_id") String dagRunId, @retrofit2.http.Path("task_id") String taskId
  );

  /**
   * Get logs for a task instance
   * Get logs for a specific task instance and its try number
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @param taskTryNumber The Task Try Number. (required)
   * @param fullContent A full content will be returned. By default, only the first fragment will be returned.  (optional)
   * @param token A token that allows you to continue fetching logs. If passed, it will specify the location from which the download should be continued.  (optional)
   * @return Call&lt;InlineResponse200&gt;
   */
  @GET("dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/logs/{task_try_number}")
  Call<InlineResponse200> getLogs(
    @retrofit2.http.Path("dag_id") String dagId, @retrofit2.http.Path("dag_run_id") String dagRunId, @retrofit2.http.Path("task_id") String taskId, @retrofit2.http.Path("task_try_number") Integer taskTryNumber, @retrofit2.http.Query("full_content") Boolean fullContent, @retrofit2.http.Query("token") String token
  );

  /**
   * Get a task instance
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @return Call&lt;TaskInstance&gt;
   */
  @GET("dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}")
  Call<TaskInstance> getTaskInstance(
    @retrofit2.http.Path("dag_id") String dagId, @retrofit2.http.Path("dag_run_id") String dagRunId, @retrofit2.http.Path("task_id") String taskId
  );

  /**
   * Get a list of task instance of DAG.
   * This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id to retrieve DAG Runs for all DAGs and DAG Runs. 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param executionDateGte Returns objects greater or equal to the specified date. This can be combined with execution_date_lte parameter to receive only the selected period.  (optional)
   * @param executionDateLte Returns objects less than or equal to the specified date. This can be combined with execution_date_gte parameter to receive only the selected period.  (optional)
   * @param startDateGte Returns objects greater or equal the specified date. This can be combined with startd_ate_lte parameter to receive only the selected period.  (optional)
   * @param startDateLte Returns objects less or equal the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  (optional)
   * @param endDateGte Returns objects greater or equal the specified date. This can be combined with start_date_lte parameter to receive only the selected period.  (optional)
   * @param endDateLte Returns objects less than or equal to the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  (optional)
   * @param durationGte Returns objects greater than or equal to the specified values. This can be combined with duration_lte parameter to receive only the selected period.  (optional)
   * @param durationLte Returns objects less than or equal to the specified values. This can be combined with duration_gte parameter to receive only the selected range.  (optional)
   * @param state The value can be repeated to retrieve multiple matching values (OR condition). (optional, default to new ArrayList&lt;String&gt;())
   * @param pool The value can be repeated to retrieve multiple matching values (OR condition). (optional, default to new ArrayList&lt;String&gt;())
   * @param queue The value can be repeated to retrieve multiple matching values (OR condition). (optional, default to new ArrayList&lt;String&gt;())
   * @param limit The numbers of items to return. (optional, default to 100)
   * @param offset The number of items to skip before starting to collect the result set. (optional)
   * @return Call&lt;TaskInstanceCollection&gt;
   */
  @GET("dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances")
  Call<TaskInstanceCollection> getTaskInstances(
    @retrofit2.http.Path("dag_id") String dagId, @retrofit2.http.Path("dag_run_id") String dagRunId, @retrofit2.http.Query("execution_date_gte") OffsetDateTime executionDateGte, @retrofit2.http.Query("execution_date_lte") OffsetDateTime executionDateLte, @retrofit2.http.Query("start_date_gte") OffsetDateTime startDateGte, @retrofit2.http.Query("start_date_lte") OffsetDateTime startDateLte, @retrofit2.http.Query("end_date_gte") OffsetDateTime endDateGte, @retrofit2.http.Query("end_date_lte") OffsetDateTime endDateLte, @retrofit2.http.Query("duration_gte") BigDecimal durationGte, @retrofit2.http.Query("duration_lte") BigDecimal durationLte, @retrofit2.http.Query("state") List<String> state, @retrofit2.http.Query("pool") List<String> pool, @retrofit2.http.Query("Queue") List<String> queue, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Get list of task instances from all DAGs and DAG Runs.
   * This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits 
   * @param listTaskInstanceForm  (required)
   * @return Call&lt;TaskInstanceCollection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("dags/~/dagRuns/~/taskInstances/list")
  Call<TaskInstanceCollection> getTaskInstancesBatch(
    @retrofit2.http.Body ListTaskInstanceForm listTaskInstanceForm
  );

}
