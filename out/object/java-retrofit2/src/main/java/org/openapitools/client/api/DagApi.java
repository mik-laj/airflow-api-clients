package org.openapitools.client.api;

import org.openapitools.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

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

public interface DagApi {
  /**
   * Clears a set of task instances associated with the DAG for a specified date range.
   * 
   * @param dagId The DAG ID. (required)
   * @param clearTaskInstance Parameters of action (required)
   * @return Call&lt;TaskInstanceReferenceCollection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("dags/{dag_id}/clearTaskInstances")
  Call<TaskInstanceReferenceCollection> clearTaskInstance(
    @retrofit2.http.Path("dag_id") String dagId, @retrofit2.http.Body ClearTaskInstance clearTaskInstance
  );

  /**
   * Get basic information about a DAG
   * Presents only information available in database (DAGModel). If you need detailed information, consider using GET /dags/{dag_id}/detail. 
   * @param dagId The DAG ID. (required)
   * @return Call&lt;DAG&gt;
   */
  @GET("dags/{dag_id}")
  Call<DAG> getDag(
    @retrofit2.http.Path("dag_id") String dagId
  );

  /**
   * Get a simplified representation of DAG.
   * The response contains many DAG attributes, so the response can be large. If possible, consider using GET /dags/{dag_id}. 
   * @param dagId The DAG ID. (required)
   * @return Call&lt;DAGDetail&gt;
   */
  @GET("dags/{dag_id}/details")
  Call<DAGDetail> getDagDetail(
    @retrofit2.http.Path("dag_id") String dagId
  );

  /**
   * Get source code using file token
   * 
   * @param fileToken The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change.  (required)
   * @return Call&lt;InlineResponse2001&gt;
   */
  @GET("dagSources/{file_token}")
  Call<InlineResponse2001> getDagSource(
    @retrofit2.http.Path("file_token") String fileToken
  );

  /**
   * Get all DAGs
   * 
   * @param limit The numbers of items to return. (optional, default to 100)
   * @param offset The number of items to skip before starting to collect the result set. (optional)
   * @return Call&lt;DAGCollection&gt;
   */
  @GET("dags")
  Call<DAGCollection> getDags(
    @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Get simplified representation of a task.
   * 
   * @param dagId The DAG ID. (required)
   * @param taskId The Task ID. (required)
   * @return Call&lt;Task&gt;
   */
  @GET("dags/{dag_id}/tasks/{task_id}")
  Call<Task> getTask(
    @retrofit2.http.Path("dag_id") String dagId, @retrofit2.http.Path("task_id") String taskId
  );

  /**
   * Get tasks for DAG
   * 
   * @param dagId The DAG ID. (required)
   * @return Call&lt;TaskCollection&gt;
   */
  @GET("dags/{dag_id}/tasks")
  Call<TaskCollection> getTasks(
    @retrofit2.http.Path("dag_id") String dagId
  );

  /**
   * Update a DAG
   * 
   * @param dagId The DAG ID. (required)
   * @param DAG  (required)
   * @return Call&lt;DAG&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("dags/{dag_id}")
  Call<DAG> updateDag(
    @retrofit2.http.Path("dag_id") String dagId, @retrofit2.http.Body DAG DAG
  );

}
