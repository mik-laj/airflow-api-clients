package org.openapitools.client.api.rxjava;

import org.openapitools.client.model.DAGRun;
import org.openapitools.client.model.DAGRunCollection;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.ListDagRunsForm;
import org.threeten.bp.OffsetDateTime;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:06:30.200Z[GMT]")
public class DagRunApi {

	private final org.openapitools.client.api.DagRunApi delegate;

	public DagRunApi(org.openapitools.client.api.DagRunApi delegate) {
	    this.delegate = delegate;
    }

	public org.openapitools.client.api.DagRunApi getDelegate() {
	    return delegate;
	}

    /**
     * Trigger a DAG Run
     * 
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param daGRun  (required)
     * @param resultHandler Asynchronous result handler
     */
    public void createDagRun(String dagId, String dagRunId, DAGRun daGRun, Handler<AsyncResult<DAGRun>> resultHandler) {
        delegate.createDagRun(dagId, dagRunId, daGRun, resultHandler);
    }

    /**
     * Trigger a DAG Run
     * 
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param daGRun  (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<DAGRun> rxCreateDagRun(String dagId, String dagRunId, DAGRun daGRun) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.createDagRun(dagId, dagRunId, daGRun, fut);
        }));
    }
    /**
     * Delete a DAG Run
     * 
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void deleteDagRun(String dagId, String dagRunId, Handler<AsyncResult<Void>> resultHandler) {
        delegate.deleteDagRun(dagId, dagRunId, resultHandler);
    }

    /**
     * Delete a DAG Run
     * 
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<Void> rxDeleteDagRun(String dagId, String dagRunId) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.deleteDagRun(dagId, dagRunId, fut);
        }));
    }
    /**
     * Get a DAG Run
     * 
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getDagRun(String dagId, String dagRunId, Handler<AsyncResult<DAGRun>> resultHandler) {
        delegate.getDagRun(dagId, dagRunId, resultHandler);
    }

    /**
     * Get a DAG Run
     * 
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<DAGRun> rxGetDagRun(String dagId, String dagRunId) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getDagRun(dagId, dagRunId, fut);
        }));
    }
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
     * @param resultHandler Asynchronous result handler
     */
    public void getDagRuns(String dagId, Integer limit, Integer offset, OffsetDateTime executionDateGte, OffsetDateTime executionDateLte, OffsetDateTime startDateGte, OffsetDateTime startDateLte, OffsetDateTime endDateGte, OffsetDateTime endDateLte, Handler<AsyncResult<DAGRunCollection>> resultHandler) {
        delegate.getDagRuns(dagId, limit, offset, executionDateGte, executionDateLte, startDateGte, startDateLte, endDateGte, endDateLte, resultHandler);
    }

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
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<DAGRunCollection> rxGetDagRuns(String dagId, Integer limit, Integer offset, OffsetDateTime executionDateGte, OffsetDateTime executionDateLte, OffsetDateTime startDateGte, OffsetDateTime startDateLte, OffsetDateTime endDateGte, OffsetDateTime endDateLte) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getDagRuns(dagId, limit, offset, executionDateGte, executionDateLte, startDateGte, startDateLte, endDateGte, endDateLte, fut);
        }));
    }
    /**
     * Get all DAG Runs from aall DAGs.
     * This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits 
     * @param listDagRunsForm  (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getDagRunsBatch(ListDagRunsForm listDagRunsForm, Handler<AsyncResult<DAGRunCollection>> resultHandler) {
        delegate.getDagRunsBatch(listDagRunsForm, resultHandler);
    }

    /**
     * Get all DAG Runs from aall DAGs.
     * This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits 
     * @param listDagRunsForm  (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<DAGRunCollection> rxGetDagRunsBatch(ListDagRunsForm listDagRunsForm) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getDagRunsBatch(listDagRunsForm, fut);
        }));
    }
    /**
     * Update a DAG Run
     * 
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param daGRun  (required)
     * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;&gt;())
     * @param resultHandler Asynchronous result handler
     */
    public void updateDagRun(String dagId, String dagRunId, DAGRun daGRun, List<String> updateMask, Handler<AsyncResult<DAGRun>> resultHandler) {
        delegate.updateDagRun(dagId, dagRunId, daGRun, updateMask, resultHandler);
    }

    /**
     * Update a DAG Run
     * 
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param daGRun  (required)
     * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;&gt;())
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<DAGRun> rxUpdateDagRun(String dagId, String dagRunId, DAGRun daGRun, List<String> updateMask) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.updateDagRun(dagId, dagRunId, daGRun, updateMask, fut);
        }));
    }

    public static DagRunApi newInstance(org.openapitools.client.api.DagRunApi arg) {
        return arg != null ? new DagRunApi(arg) : null;
    }
}
