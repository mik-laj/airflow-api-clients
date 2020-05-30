package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.XCom;
import org.openapitools.client.model.XComCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-30T18:47:01.071Z[GMT]")
public interface XComApi extends ApiClient.Api {


  /**
   * Delete an XCom entry
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @param xcomKey The XCom Key. (required)
   */
  @RequestLine("DELETE /dags/{dagId}/dagRuns/{dagRunId}/taskInstances/{taskId}/xcomEntries/{key}")
  @Headers({
    "Accept: application/json",
  })
  void deleteXComValue(@Param("dagId") String dagId, @Param("dagRunId") String dagRunId, @Param("taskId") String taskId, @Param("xcomKey") String xcomKey);

  /**
   * Get all XCom entries
   * This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id, task_id to retrieve XCOM entries for for all DAGs, DAG Runs and task instances.
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @param limit The numbers of items to return. (optional, default to 100)
   * @param offset The number of items to skip before starting to collect the result set. (optional)
   * @return XComCollection
   */
  @RequestLine("GET /dags/{dagId}/dagRuns/{dagRunId}/taskInstances/{taskId}/xcomEntries?limit={limit}&offset={offset}")
  @Headers({
    "Accept: application/json",
  })
  XComCollection getXComEntry(@Param("dagId") String dagId, @Param("dagRunId") String dagRunId, @Param("taskId") String taskId, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Get all XCom entries
   * This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id, task_id to retrieve XCOM entries for for all DAGs, DAG Runs and task instances.
   * Note, this is equivalent to the other <code>getXComEntry</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetXComEntryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>limit - The numbers of items to return. (optional, default to 100)</li>
   *   <li>offset - The number of items to skip before starting to collect the result set. (optional)</li>
   *   </ul>
   * @return XComCollection
   */
  @RequestLine("GET /dags/{dagId}/dagRuns/{dagRunId}/taskInstances/{taskId}/xcomEntries?limit={limit}&offset={offset}")
  @Headers({
  "Accept: application/json",
  })
  XComCollection getXComEntry(@Param("dagId") String dagId, @Param("dagRunId") String dagRunId, @Param("taskId") String taskId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getXComEntry</code> method in a fluent style.
   */
  public static class GetXComEntryQueryParams extends HashMap<String, Object> {
    public GetXComEntryQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetXComEntryQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get an XCom entry
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @param xcomKey The XCom Key. (required)
   * @return XCom
   */
  @RequestLine("GET /dags/{dagId}/dagRuns/{dagRunId}/taskInstances/{taskId}/xcomEntries/{key}")
  @Headers({
    "Accept: application/json",
  })
  XCom getXComValue(@Param("dagId") String dagId, @Param("dagRunId") String dagRunId, @Param("taskId") String taskId, @Param("xcomKey") String xcomKey);

  /**
   * Create an XCom entry
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @param xcom  (required)
   * @return XCom
   */
  @RequestLine("POST /dags/{dagId}/dagRuns/{dagRunId}/taskInstances/{taskId}/xcomEntries")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  XCom updateXComEntry(@Param("dagId") String dagId, @Param("dagRunId") String dagRunId, @Param("taskId") String taskId, XCom xcom);

  /**
   * Update an XCom entry
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @param xcomKey The XCom Key. (required)
   * @param xcom  (required)
   * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional)
   * @return XCom
   */
  @RequestLine("PATCH /dags/{dagId}/dagRuns/{dagRunId}/taskInstances/{taskId}/xcomEntries/{key}?update_mask={updateMask}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  XCom updateXComValue(@Param("dagId") String dagId, @Param("dagRunId") String dagRunId, @Param("taskId") String taskId, @Param("xcomKey") String xcomKey, XCom xcom, @Param("updateMask") List<String> updateMask);

  /**
   * Update an XCom entry
   * 
   * Note, this is equivalent to the other <code>updateXComValue</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateXComValueQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @param xcomKey The XCom Key. (required)
   * @param xcom  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>updateMask - The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional)</li>
   *   </ul>
   * @return XCom
   */
  @RequestLine("PATCH /dags/{dagId}/dagRuns/{dagRunId}/taskInstances/{taskId}/xcomEntries/{key}?update_mask={updateMask}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  XCom updateXComValue(@Param("dagId") String dagId, @Param("dagRunId") String dagRunId, @Param("taskId") String taskId, @Param("xcomKey") String xcomKey, XCom xcom, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>updateXComValue</code> method in a fluent style.
   */
  public static class UpdateXComValueQueryParams extends HashMap<String, Object> {
    public UpdateXComValueQueryParams updateMask(final List<String> value) {
      put("update_mask", EncodingUtils.encodeCollection(value, "csv"));
      return this;
    }
  }
}
