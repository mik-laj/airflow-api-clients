package org.openapitools.client.api;

import org.openapitools.client.model.ClearTaskInstance;
import org.openapitools.client.model.DAG;
import org.openapitools.client.model.DAGCollection;
import org.openapitools.client.model.DAGDetail;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.InlineResponse2001;
import org.openapitools.client.model.Task;
import org.openapitools.client.model.TaskCollection;
import org.openapitools.client.model.TaskInstanceReferenceCollection;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface DagApi {

    void clearTaskInstance(String dagId, ClearTaskInstance clearTaskInstance, Handler<AsyncResult<TaskInstanceReferenceCollection>> handler);

    void getDag(String dagId, Handler<AsyncResult<DAG>> handler);

    void getDagDetail(String dagId, Handler<AsyncResult<DAGDetail>> handler);

    void getDagSource(String fileToken, Handler<AsyncResult<InlineResponse2001>> handler);

    void getDags(Integer limit, Integer offset, Handler<AsyncResult<DAGCollection>> handler);

    void getTask(String dagId, String taskId, Handler<AsyncResult<Task>> handler);

    void getTasks(String dagId, Handler<AsyncResult<TaskCollection>> handler);

    void updateDag(String dagId, DAG DAG, Handler<AsyncResult<DAG>> handler);

}
