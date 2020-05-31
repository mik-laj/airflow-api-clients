package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;

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
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-31T07:37:09.721Z[GMT]")
public interface DagApi extends ApiClient.Api {


  /**
   * Clears a set of task instances associated with the DAG for a specified date range.
   * 
   * @param dagId The DAG ID. (required)
   * @param clearTaskInstance Parameters of action (required)
   * @return TaskInstanceReferenceCollection
   */
  @RequestLine("POST /dags/{dagId}/clearTaskInstances")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TaskInstanceReferenceCollection clearTaskInstance(@Param("dagId") String dagId, ClearTaskInstance clearTaskInstance);

  /**
   * Get basic information about a DAG
   * Presents only information available in database (DAGModel). If you need detailed information, consider using GET /dags/{dag_id}/detail. 
   * @param dagId The DAG ID. (required)
   * @return DAG
   */
  @RequestLine("GET /dags/{dagId}")
  @Headers({
    "Accept: application/json",
  })
  DAG getDag(@Param("dagId") String dagId);

  /**
   * Get a simplified representation of DAG.
   * The response contains many DAG attributes, so the response can be large. If possible, consider using GET /dags/{dag_id}. 
   * @param dagId The DAG ID. (required)
   * @return DAGDetail
   */
  @RequestLine("GET /dags/{dagId}/details")
  @Headers({
    "Accept: application/json",
  })
  DAGDetail getDagDetail(@Param("dagId") String dagId);

  /**
   * Get source code using file token
   * 
   * @param fileToken The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change.  (required)
   * @return InlineResponse2001
   */
  @RequestLine("GET /dagSources/{fileToken}")
  @Headers({
    "Accept: application/json",
  })
  InlineResponse2001 getDagSource(@Param("fileToken") String fileToken);

  /**
   * Get all DAGs
   * 
   * @param limit The numbers of items to return. (optional, default to 100)
   * @param offset The number of items to skip before starting to collect the result set. (optional)
   * @return DAGCollection
   */
  @RequestLine("GET /dags?limit={limit}&offset={offset}")
  @Headers({
    "Accept: application/json",
  })
  DAGCollection getDags(@Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Get all DAGs
   * 
   * Note, this is equivalent to the other <code>getDags</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetDagsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>limit - The numbers of items to return. (optional, default to 100)</li>
   *   <li>offset - The number of items to skip before starting to collect the result set. (optional)</li>
   *   </ul>
   * @return DAGCollection
   */
  @RequestLine("GET /dags?limit={limit}&offset={offset}")
  @Headers({
  "Accept: application/json",
  })
  DAGCollection getDags(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getDags</code> method in a fluent style.
   */
  public static class GetDagsQueryParams extends HashMap<String, Object> {
    public GetDagsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetDagsQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get simplified representation of a task.
   * 
   * @param dagId The DAG ID. (required)
   * @param taskId The Task ID. (required)
   * @return Task
   */
  @RequestLine("GET /dags/{dagId}/tasks/{taskId}")
  @Headers({
    "Accept: application/json",
  })
  Task getTask(@Param("dagId") String dagId, @Param("taskId") String taskId);

  /**
   * Get tasks for DAG
   * 
   * @param dagId The DAG ID. (required)
   * @return TaskCollection
   */
  @RequestLine("GET /dags/{dagId}/tasks")
  @Headers({
    "Accept: application/json",
  })
  TaskCollection getTasks(@Param("dagId") String dagId);

  /**
   * Update a DAG
   * 
   * @param dagId The DAG ID. (required)
   * @param DAG  (required)
   * @return DAG
   */
  @RequestLine("PATCH /dags/{dagId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DAG updateDag(@Param("dagId") String dagId, DAG DAG);
}
