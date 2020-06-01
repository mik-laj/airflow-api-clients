package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;

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
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-31T07:37:09.721Z[GMT]")
public interface TaskInstanceApi extends ApiClient.Api {


  /**
   * Get extra links for task instance
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @return ExtraLinkCollection
   */
  @RequestLine("GET /dags/{dagId}/dagRuns/{dagRunId}/taskInstances/{taskId}/links")
  @Headers({
    "Accept: application/json",
  })
  ExtraLinkCollection getExtraLinks(@Param("dagId") String dagId, @Param("dagRunId") String dagRunId, @Param("taskId") String taskId);

  /**
   * Get logs for a task instance
   * Get logs for a specific task instance and its try number
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @param taskTryNumber The Task Try Number. (required)
   * @param fullContent A full content will be returned. By default, only the first fragment will be returned.  (optional)
   * @param token A token that allows you to continue fetching logs. If passed, it will specify the location from which the download should be continued.  (optional)
   * @return InlineResponse200
   */
  @RequestLine("GET /dags/{dagId}/dagRuns/{dagRunId}/taskInstances/{taskId}/logs/{taskTryNumber}?full_content={fullContent}&token={token}")
  @Headers({
    "Accept: application/json",
  })
  InlineResponse200 getLogs(@Param("dagId") String dagId, @Param("dagRunId") String dagRunId, @Param("taskId") String taskId, @Param("taskTryNumber") Integer taskTryNumber, @Param("fullContent") Boolean fullContent, @Param("token") String token);

  /**
   * Get logs for a task instance
   * Get logs for a specific task instance and its try number
   * Note, this is equivalent to the other <code>getLogs</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetLogsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @param taskTryNumber The Task Try Number. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fullContent - A full content will be returned. By default, only the first fragment will be returned.  (optional)</li>
   *   <li>token - A token that allows you to continue fetching logs. If passed, it will specify the location from which the download should be continued.  (optional)</li>
   *   </ul>
   * @return InlineResponse200
   */
  @RequestLine("GET /dags/{dagId}/dagRuns/{dagRunId}/taskInstances/{taskId}/logs/{taskTryNumber}?full_content={fullContent}&token={token}")
  @Headers({
  "Accept: application/json",
  })
  InlineResponse200 getLogs(@Param("dagId") String dagId, @Param("dagRunId") String dagRunId, @Param("taskId") String taskId, @Param("taskTryNumber") Integer taskTryNumber, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getLogs</code> method in a fluent style.
   */
  public static class GetLogsQueryParams extends HashMap<String, Object> {
    public GetLogsQueryParams fullContent(final Boolean value) {
      put("full_content", EncodingUtils.encode(value));
      return this;
    }
    public GetLogsQueryParams token(final String value) {
      put("token", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a task instance
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @return TaskInstance
   */
  @RequestLine("GET /dags/{dagId}/dagRuns/{dagRunId}/taskInstances/{taskId}")
  @Headers({
    "Accept: application/json",
  })
  TaskInstance getTaskInstance(@Param("dagId") String dagId, @Param("dagRunId") String dagRunId, @Param("taskId") String taskId);

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
   * @param state The value can be repeated to retrieve multiple matching values (OR condition). (optional)
   * @param pool The value can be repeated to retrieve multiple matching values (OR condition). (optional)
   * @param queue The value can be repeated to retrieve multiple matching values (OR condition). (optional)
   * @param limit The numbers of items to return. (optional, default to 100)
   * @param offset The number of items to skip before starting to collect the result set. (optional)
   * @return TaskInstanceCollection
   */
  @RequestLine("GET /dags/{dagId}/dagRuns/{dagRunId}/taskInstances?execution_date_gte={executionDateGte}&execution_date_lte={executionDateLte}&start_date_gte={startDateGte}&start_date_lte={startDateLte}&end_date_gte={endDateGte}&end_date_lte={endDateLte}&duration_gte={durationGte}&duration_lte={durationLte}&state={state}&pool={pool}&Queue={queue}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: application/json",
  })
  TaskInstanceCollection getTaskInstances(@Param("dagId") String dagId, @Param("dagRunId") String dagRunId, @Param("executionDateGte") OffsetDateTime executionDateGte, @Param("executionDateLte") OffsetDateTime executionDateLte, @Param("startDateGte") OffsetDateTime startDateGte, @Param("startDateLte") OffsetDateTime startDateLte, @Param("endDateGte") OffsetDateTime endDateGte, @Param("endDateLte") OffsetDateTime endDateLte, @Param("durationGte") BigDecimal durationGte, @Param("durationLte") BigDecimal durationLte, @Param("state") List<String> state, @Param("pool") List<String> pool, @Param("queue") List<String> queue, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Get a list of task instance of DAG.
   * This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id to retrieve DAG Runs for all DAGs and DAG Runs. 
   * Note, this is equivalent to the other <code>getTaskInstances</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetTaskInstancesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>executionDateGte - Returns objects greater or equal to the specified date. This can be combined with execution_date_lte parameter to receive only the selected period.  (optional)</li>
   *   <li>executionDateLte - Returns objects less than or equal to the specified date. This can be combined with execution_date_gte parameter to receive only the selected period.  (optional)</li>
   *   <li>startDateGte - Returns objects greater or equal the specified date. This can be combined with startd_ate_lte parameter to receive only the selected period.  (optional)</li>
   *   <li>startDateLte - Returns objects less or equal the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  (optional)</li>
   *   <li>endDateGte - Returns objects greater or equal the specified date. This can be combined with start_date_lte parameter to receive only the selected period.  (optional)</li>
   *   <li>endDateLte - Returns objects less than or equal to the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  (optional)</li>
   *   <li>durationGte - Returns objects greater than or equal to the specified values. This can be combined with duration_lte parameter to receive only the selected period.  (optional)</li>
   *   <li>durationLte - Returns objects less than or equal to the specified values. This can be combined with duration_gte parameter to receive only the selected range.  (optional)</li>
   *   <li>state - The value can be repeated to retrieve multiple matching values (OR condition). (optional)</li>
   *   <li>pool - The value can be repeated to retrieve multiple matching values (OR condition). (optional)</li>
   *   <li>queue - The value can be repeated to retrieve multiple matching values (OR condition). (optional)</li>
   *   <li>limit - The numbers of items to return. (optional, default to 100)</li>
   *   <li>offset - The number of items to skip before starting to collect the result set. (optional)</li>
   *   </ul>
   * @return TaskInstanceCollection
   */
  @RequestLine("GET /dags/{dagId}/dagRuns/{dagRunId}/taskInstances?execution_date_gte={executionDateGte}&execution_date_lte={executionDateLte}&start_date_gte={startDateGte}&start_date_lte={startDateLte}&end_date_gte={endDateGte}&end_date_lte={endDateLte}&duration_gte={durationGte}&duration_lte={durationLte}&state={state}&pool={pool}&Queue={queue}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: application/json",
  })
  TaskInstanceCollection getTaskInstances(@Param("dagId") String dagId, @Param("dagRunId") String dagRunId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getTaskInstances</code> method in a fluent style.
   */
  public static class GetTaskInstancesQueryParams extends HashMap<String, Object> {
    public GetTaskInstancesQueryParams executionDateGte(final OffsetDateTime value) {
      put("execution_date_gte", EncodingUtils.encode(value));
      return this;
    }
    public GetTaskInstancesQueryParams executionDateLte(final OffsetDateTime value) {
      put("execution_date_lte", EncodingUtils.encode(value));
      return this;
    }
    public GetTaskInstancesQueryParams startDateGte(final OffsetDateTime value) {
      put("start_date_gte", EncodingUtils.encode(value));
      return this;
    }
    public GetTaskInstancesQueryParams startDateLte(final OffsetDateTime value) {
      put("start_date_lte", EncodingUtils.encode(value));
      return this;
    }
    public GetTaskInstancesQueryParams endDateGte(final OffsetDateTime value) {
      put("end_date_gte", EncodingUtils.encode(value));
      return this;
    }
    public GetTaskInstancesQueryParams endDateLte(final OffsetDateTime value) {
      put("end_date_lte", EncodingUtils.encode(value));
      return this;
    }
    public GetTaskInstancesQueryParams durationGte(final BigDecimal value) {
      put("duration_gte", EncodingUtils.encode(value));
      return this;
    }
    public GetTaskInstancesQueryParams durationLte(final BigDecimal value) {
      put("duration_lte", EncodingUtils.encode(value));
      return this;
    }
    public GetTaskInstancesQueryParams state(final List<String> value) {
      put("state", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetTaskInstancesQueryParams pool(final List<String> value) {
      put("pool", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetTaskInstancesQueryParams queue(final List<String> value) {
      put("Queue", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetTaskInstancesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetTaskInstancesQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get list of task instances from all DAGs and DAG Runs.
   * This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits 
   * @param listTaskInstanceForm  (required)
   * @return TaskInstanceCollection
   */
  @RequestLine("POST /dags/~/dagRuns/~/taskInstances/list")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TaskInstanceCollection getTaskInstancesBatch(ListTaskInstanceForm listTaskInstanceForm);
}
