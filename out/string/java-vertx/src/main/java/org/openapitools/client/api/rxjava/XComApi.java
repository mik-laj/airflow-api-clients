package org.openapitools.client.api.rxjava;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.XCom;
import org.openapitools.client.model.XComCollection;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-30T18:46:07.346Z[GMT]")
public class XComApi {

	private final org.openapitools.client.api.XComApi delegate;

	public XComApi(org.openapitools.client.api.XComApi delegate) {
	    this.delegate = delegate;
    }

	public org.openapitools.client.api.XComApi getDelegate() {
	    return delegate;
	}

    /**
     * Delete an XCom entry
     * 
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param taskId The Task ID. (required)
     * @param xcomKey The XCom Key. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void deleteXComValue(String dagId, String dagRunId, String taskId, String xcomKey, Handler<AsyncResult<Void>> resultHandler) {
        delegate.deleteXComValue(dagId, dagRunId, taskId, xcomKey, resultHandler);
    }

    /**
     * Delete an XCom entry
     * 
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param taskId The Task ID. (required)
     * @param xcomKey The XCom Key. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<Void> rxDeleteXComValue(String dagId, String dagRunId, String taskId, String xcomKey) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.deleteXComValue(dagId, dagRunId, taskId, xcomKey, fut);
        }));
    }
    /**
     * Get all XCom entries
     * This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id, task_id to retrieve XCOM entries for for all DAGs, DAG Runs and task instances.
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param taskId The Task ID. (required)
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getXComEntry(String dagId, String dagRunId, String taskId, Integer limit, Integer offset, Handler<AsyncResult<XComCollection>> resultHandler) {
        delegate.getXComEntry(dagId, dagRunId, taskId, limit, offset, resultHandler);
    }

    /**
     * Get all XCom entries
     * This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id, task_id to retrieve XCOM entries for for all DAGs, DAG Runs and task instances.
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param taskId The Task ID. (required)
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<XComCollection> rxGetXComEntry(String dagId, String dagRunId, String taskId, Integer limit, Integer offset) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getXComEntry(dagId, dagRunId, taskId, limit, offset, fut);
        }));
    }
    /**
     * Get an XCom entry
     * 
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param taskId The Task ID. (required)
     * @param xcomKey The XCom Key. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getXComValue(String dagId, String dagRunId, String taskId, String xcomKey, Handler<AsyncResult<XCom>> resultHandler) {
        delegate.getXComValue(dagId, dagRunId, taskId, xcomKey, resultHandler);
    }

    /**
     * Get an XCom entry
     * 
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param taskId The Task ID. (required)
     * @param xcomKey The XCom Key. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<XCom> rxGetXComValue(String dagId, String dagRunId, String taskId, String xcomKey) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getXComValue(dagId, dagRunId, taskId, xcomKey, fut);
        }));
    }
    /**
     * Create an XCom entry
     * 
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param taskId The Task ID. (required)
     * @param xcom  (required)
     * @param resultHandler Asynchronous result handler
     */
    public void updateXComEntry(String dagId, String dagRunId, String taskId, XCom xcom, Handler<AsyncResult<XCom>> resultHandler) {
        delegate.updateXComEntry(dagId, dagRunId, taskId, xcom, resultHandler);
    }

    /**
     * Create an XCom entry
     * 
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param taskId The Task ID. (required)
     * @param xcom  (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<XCom> rxUpdateXComEntry(String dagId, String dagRunId, String taskId, XCom xcom) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.updateXComEntry(dagId, dagRunId, taskId, xcom, fut);
        }));
    }
    /**
     * Update an XCom entry
     * 
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param taskId The Task ID. (required)
     * @param xcomKey The XCom Key. (required)
     * @param xcom  (required)
     * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;&gt;())
     * @param resultHandler Asynchronous result handler
     */
    public void updateXComValue(String dagId, String dagRunId, String taskId, String xcomKey, XCom xcom, List<String> updateMask, Handler<AsyncResult<XCom>> resultHandler) {
        delegate.updateXComValue(dagId, dagRunId, taskId, xcomKey, xcom, updateMask, resultHandler);
    }

    /**
     * Update an XCom entry
     * 
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param taskId The Task ID. (required)
     * @param xcomKey The XCom Key. (required)
     * @param xcom  (required)
     * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;&gt;())
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<XCom> rxUpdateXComValue(String dagId, String dagRunId, String taskId, String xcomKey, XCom xcom, List<String> updateMask) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.updateXComValue(dagId, dagRunId, taskId, xcomKey, xcom, updateMask, fut);
        }));
    }

    public static XComApi newInstance(org.openapitools.client.api.XComApi arg) {
        return arg != null ? new XComApi(arg) : null;
    }
}
