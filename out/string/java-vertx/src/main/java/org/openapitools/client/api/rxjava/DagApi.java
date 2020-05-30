package org.openapitools.client.api.rxjava;

import org.openapitools.client.model.ClearTaskInstance;
import org.openapitools.client.model.DAG;
import org.openapitools.client.model.DAGCollection;
import org.openapitools.client.model.DAGDetail;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.InlineResponse2001;
import org.openapitools.client.model.Task;
import org.openapitools.client.model.TaskCollection;
import org.openapitools.client.model.TaskInstanceReferenceCollection;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-30T18:46:07.346Z[GMT]")
public class DagApi {

	private final org.openapitools.client.api.DagApi delegate;

	public DagApi(org.openapitools.client.api.DagApi delegate) {
	    this.delegate = delegate;
    }

	public org.openapitools.client.api.DagApi getDelegate() {
	    return delegate;
	}

    /**
     * Clears a set of task instances associated with the DAG for a specified date range.
     * 
     * @param dagId The DAG ID. (required)
     * @param clearTaskInstance Parameters of action (required)
     * @param resultHandler Asynchronous result handler
     */
    public void clearTaskInstance(String dagId, ClearTaskInstance clearTaskInstance, Handler<AsyncResult<TaskInstanceReferenceCollection>> resultHandler) {
        delegate.clearTaskInstance(dagId, clearTaskInstance, resultHandler);
    }

    /**
     * Clears a set of task instances associated with the DAG for a specified date range.
     * 
     * @param dagId The DAG ID. (required)
     * @param clearTaskInstance Parameters of action (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TaskInstanceReferenceCollection> rxClearTaskInstance(String dagId, ClearTaskInstance clearTaskInstance) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.clearTaskInstance(dagId, clearTaskInstance, fut);
        }));
    }
    /**
     * Get basic information about a DAG
     * Presents only information available in database (DAGModel). If you need detailed information, consider using GET /dags/{dag_id}/detail. 
     * @param dagId The DAG ID. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getDag(String dagId, Handler<AsyncResult<DAG>> resultHandler) {
        delegate.getDag(dagId, resultHandler);
    }

    /**
     * Get basic information about a DAG
     * Presents only information available in database (DAGModel). If you need detailed information, consider using GET /dags/{dag_id}/detail. 
     * @param dagId The DAG ID. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<DAG> rxGetDag(String dagId) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getDag(dagId, fut);
        }));
    }
    /**
     * Get a simplified representation of DAG.
     * The response contains many DAG attributes, so the response can be large. If possible, consider using GET /dags/{dag_id}. 
     * @param dagId The DAG ID. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getDagDetail(String dagId, Handler<AsyncResult<DAGDetail>> resultHandler) {
        delegate.getDagDetail(dagId, resultHandler);
    }

    /**
     * Get a simplified representation of DAG.
     * The response contains many DAG attributes, so the response can be large. If possible, consider using GET /dags/{dag_id}. 
     * @param dagId The DAG ID. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<DAGDetail> rxGetDagDetail(String dagId) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getDagDetail(dagId, fut);
        }));
    }
    /**
     * Get source code using file token
     * 
     * @param fileToken The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change.  (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getDagSource(String fileToken, Handler<AsyncResult<InlineResponse2001>> resultHandler) {
        delegate.getDagSource(fileToken, resultHandler);
    }

    /**
     * Get source code using file token
     * 
     * @param fileToken The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change.  (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<InlineResponse2001> rxGetDagSource(String fileToken) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getDagSource(fileToken, fut);
        }));
    }
    /**
     * Get all DAGs
     * 
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getDags(Integer limit, Integer offset, Handler<AsyncResult<DAGCollection>> resultHandler) {
        delegate.getDags(limit, offset, resultHandler);
    }

    /**
     * Get all DAGs
     * 
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<DAGCollection> rxGetDags(Integer limit, Integer offset) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getDags(limit, offset, fut);
        }));
    }
    /**
     * Get simplified representation of a task.
     * 
     * @param dagId The DAG ID. (required)
     * @param taskId The Task ID. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getTask(String dagId, String taskId, Handler<AsyncResult<Task>> resultHandler) {
        delegate.getTask(dagId, taskId, resultHandler);
    }

    /**
     * Get simplified representation of a task.
     * 
     * @param dagId The DAG ID. (required)
     * @param taskId The Task ID. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<Task> rxGetTask(String dagId, String taskId) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getTask(dagId, taskId, fut);
        }));
    }
    /**
     * Get tasks for DAG
     * 
     * @param dagId The DAG ID. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getTasks(String dagId, Handler<AsyncResult<TaskCollection>> resultHandler) {
        delegate.getTasks(dagId, resultHandler);
    }

    /**
     * Get tasks for DAG
     * 
     * @param dagId The DAG ID. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TaskCollection> rxGetTasks(String dagId) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getTasks(dagId, fut);
        }));
    }
    /**
     * Update a DAG
     * 
     * @param dagId The DAG ID. (required)
     * @param DAG  (required)
     * @param resultHandler Asynchronous result handler
     */
    public void updateDag(String dagId, DAG DAG, Handler<AsyncResult<DAG>> resultHandler) {
        delegate.updateDag(dagId, DAG, resultHandler);
    }

    /**
     * Update a DAG
     * 
     * @param dagId The DAG ID. (required)
     * @param DAG  (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<DAG> rxUpdateDag(String dagId, DAG DAG) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.updateDag(dagId, DAG, fut);
        }));
    }

    public static DagApi newInstance(org.openapitools.client.api.DagApi arg) {
        return arg != null ? new DagApi(arg) : null;
    }
}
