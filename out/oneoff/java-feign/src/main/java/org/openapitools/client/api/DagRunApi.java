package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;

import org.openapitools.client.model.DAGRun;
import org.openapitools.client.model.DAGRunCollection;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.ListDagRunsForm;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-30T18:48:09.710Z[GMT]")
public interface DagRunApi extends ApiClient.Api {


  /**
   * Trigger a DAG Run
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param daGRun  (required)
   * @return DAGRun
   */
  @RequestLine("POST /dags/{dagId}/dagRuns/{dagRunId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DAGRun createDagRun(@Param("dagId") String dagId, @Param("dagRunId") String dagRunId, DAGRun daGRun);

  /**
   * Delete a DAG Run
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   */
  @RequestLine("DELETE /dags/{dagId}/dagRuns/{dagRunId}")
  @Headers({
    "Accept: application/json",
  })
  void deleteDagRun(@Param("dagId") String dagId, @Param("dagRunId") String dagRunId);

  /**
   * Get a DAG Run
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @return DAGRun
   */
  @RequestLine("GET /dags/{dagId}/dagRuns/{dagRunId}")
  @Headers({
    "Accept: application/json",
  })
  DAGRun getDagRun(@Param("dagId") String dagId, @Param("dagRunId") String dagRunId);

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
   */
  @RequestLine("GET /dags/{dagId}/dagRuns?limit={limit}&offset={offset}&execution_date_gte={executionDateGte}&execution_date_lte={executionDateLte}&start_date_gte={startDateGte}&start_date_lte={startDateLte}&end_date_gte={endDateGte}&end_date_lte={endDateLte}")
  @Headers({
    "Accept: application/json",
  })
  DAGRunCollection getDagRuns(@Param("dagId") String dagId, @Param("limit") Integer limit, @Param("offset") Integer offset, @Param("executionDateGte") OffsetDateTime executionDateGte, @Param("executionDateLte") OffsetDateTime executionDateLte, @Param("startDateGte") OffsetDateTime startDateGte, @Param("startDateLte") OffsetDateTime startDateLte, @Param("endDateGte") OffsetDateTime endDateGte, @Param("endDateLte") OffsetDateTime endDateLte);

  /**
   * Get all DAG Runs
   * This endpoint allows specifying &#x60;~&#x60; as the dag_id to retrieve DAG Runs for all DAGs. 
   * Note, this is equivalent to the other <code>getDagRuns</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDagRunsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param dagId The DAG ID. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>limit - The numbers of items to return. (optional, default to 100)</li>
   *   <li>offset - The number of items to skip before starting to collect the result set. (optional)</li>
   *   <li>executionDateGte - Returns objects greater or equal to the specified date. This can be combined with execution_date_lte parameter to receive only the selected period.  (optional)</li>
   *   <li>executionDateLte - Returns objects less than or equal to the specified date. This can be combined with execution_date_gte parameter to receive only the selected period.  (optional)</li>
   *   <li>startDateGte - Returns objects greater or equal the specified date. This can be combined with startd_ate_lte parameter to receive only the selected period.  (optional)</li>
   *   <li>startDateLte - Returns objects less or equal the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  (optional)</li>
   *   <li>endDateGte - Returns objects greater or equal the specified date. This can be combined with start_date_lte parameter to receive only the selected period.  (optional)</li>
   *   <li>endDateLte - Returns objects less than or equal to the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  (optional)</li>
   *   </ul>
   * @return DAGRunCollection
   */
  @RequestLine("GET /dags/{dagId}/dagRuns?limit={limit}&offset={offset}&execution_date_gte={executionDateGte}&execution_date_lte={executionDateLte}&start_date_gte={startDateGte}&start_date_lte={startDateLte}&end_date_gte={endDateGte}&end_date_lte={endDateLte}")
  @Headers({
  "Accept: application/json",
  })
  DAGRunCollection getDagRuns(@Param("dagId") String dagId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getDagRuns</code> method in a fluent style.
   */
  public static class GetDagRunsQueryParams extends HashMap<String, Object> {
    public GetDagRunsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetDagRunsQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
    public GetDagRunsQueryParams executionDateGte(final OffsetDateTime value) {
      put("execution_date_gte", EncodingUtils.encode(value));
      return this;
    }
    public GetDagRunsQueryParams executionDateLte(final OffsetDateTime value) {
      put("execution_date_lte", EncodingUtils.encode(value));
      return this;
    }
    public GetDagRunsQueryParams startDateGte(final OffsetDateTime value) {
      put("start_date_gte", EncodingUtils.encode(value));
      return this;
    }
    public GetDagRunsQueryParams startDateLte(final OffsetDateTime value) {
      put("start_date_lte", EncodingUtils.encode(value));
      return this;
    }
    public GetDagRunsQueryParams endDateGte(final OffsetDateTime value) {
      put("end_date_gte", EncodingUtils.encode(value));
      return this;
    }
    public GetDagRunsQueryParams endDateLte(final OffsetDateTime value) {
      put("end_date_lte", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get all DAG Runs from aall DAGs.
   * This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits 
   * @param listDagRunsForm  (required)
   * @return DAGRunCollection
   */
  @RequestLine("POST /dags/~/dagRuns/list")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DAGRunCollection getDagRunsBatch(ListDagRunsForm listDagRunsForm);

  /**
   * Update a DAG Run
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param daGRun  (required)
   * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional)
   * @return DAGRun
   */
  @RequestLine("PATCH /dags/{dagId}/dagRuns/{dagRunId}?update_mask={updateMask}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DAGRun updateDagRun(@Param("dagId") String dagId, @Param("dagRunId") String dagRunId, DAGRun daGRun, @Param("updateMask") List<String> updateMask);

  /**
   * Update a DAG Run
   * 
   * Note, this is equivalent to the other <code>updateDagRun</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateDagRunQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param daGRun  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>updateMask - The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional)</li>
   *   </ul>
   * @return DAGRun
   */
  @RequestLine("PATCH /dags/{dagId}/dagRuns/{dagRunId}?update_mask={updateMask}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DAGRun updateDagRun(@Param("dagId") String dagId, @Param("dagRunId") String dagRunId, DAGRun daGRun, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>updateDagRun</code> method in a fluent style.
   */
  public static class UpdateDagRunQueryParams extends HashMap<String, Object> {
    public UpdateDagRunQueryParams updateMask(final List<String> value) {
      put("update_mask", EncodingUtils.encodeCollection(value, "csv"));
      return this;
    }
  }
}
