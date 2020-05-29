package org.openapitools.client.api.rxjava;

import java.math.BigDecimal;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.ExtraLinkCollection;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.ListTaskInstanceForm;
import org.threeten.bp.OffsetDateTime;
import org.openapitools.client.model.TaskInstance;
import org.openapitools.client.model.TaskInstanceCollection;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:06:30.200Z[GMT]")
public class TaskInstanceApi {

	private final org.openapitools.client.api.TaskInstanceApi delegate;

	public TaskInstanceApi(org.openapitools.client.api.TaskInstanceApi delegate) {
	    this.delegate = delegate;
    }

	public org.openapitools.client.api.TaskInstanceApi getDelegate() {
	    return delegate;
	}

    /**
     * Get extra links for task instance
     * 
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param taskId The Task ID. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getExtraLinks(String dagId, String dagRunId, String taskId, Handler<AsyncResult<ExtraLinkCollection>> resultHandler) {
        delegate.getExtraLinks(dagId, dagRunId, taskId, resultHandler);
    }

    /**
     * Get extra links for task instance
     * 
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param taskId The Task ID. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<ExtraLinkCollection> rxGetExtraLinks(String dagId, String dagRunId, String taskId) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getExtraLinks(dagId, dagRunId, taskId, fut);
        }));
    }
    /**
     * Get logs for a task instance
     * Get logs for a specific task instance and its try number
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param taskId The Task ID. (required)
     * @param taskTryNumber The Task Try Number. (required)
     * @param fullContent A full content will be returned. By default, only the first fragment will be returned.  (optional)
     * @param token A token that allows you to continue fetching logs. If passed, it will specify the location from which the download should be continued.  (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getLogs(String dagId, String dagRunId, String taskId, Integer taskTryNumber, Boolean fullContent, String token, Handler<AsyncResult<InlineResponse200>> resultHandler) {
        delegate.getLogs(dagId, dagRunId, taskId, taskTryNumber, fullContent, token, resultHandler);
    }

    /**
     * Get logs for a task instance
     * Get logs for a specific task instance and its try number
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param taskId The Task ID. (required)
     * @param taskTryNumber The Task Try Number. (required)
     * @param fullContent A full content will be returned. By default, only the first fragment will be returned.  (optional)
     * @param token A token that allows you to continue fetching logs. If passed, it will specify the location from which the download should be continued.  (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<InlineResponse200> rxGetLogs(String dagId, String dagRunId, String taskId, Integer taskTryNumber, Boolean fullContent, String token) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getLogs(dagId, dagRunId, taskId, taskTryNumber, fullContent, token, fut);
        }));
    }
    /**
     * Get a task instance
     * 
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param taskId The Task ID. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getTaskInstance(String dagId, String dagRunId, String taskId, Handler<AsyncResult<TaskInstance>> resultHandler) {
        delegate.getTaskInstance(dagId, dagRunId, taskId, resultHandler);
    }

    /**
     * Get a task instance
     * 
     * @param dagId The DAG ID. (required)
     * @param dagRunId The DAG Run ID. (required)
     * @param taskId The Task ID. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TaskInstance> rxGetTaskInstance(String dagId, String dagRunId, String taskId) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getTaskInstance(dagId, dagRunId, taskId, fut);
        }));
    }
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
     * @param state The value can be repeated to retrieve multiple matching values (OR condition). (optional, default to new ArrayList&lt;&gt;())
     * @param pool The value can be repeated to retrieve multiple matching values (OR condition). (optional, default to new ArrayList&lt;&gt;())
     * @param queue The value can be repeated to retrieve multiple matching values (OR condition). (optional, default to new ArrayList&lt;&gt;())
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getTaskInstances(String dagId, String dagRunId, OffsetDateTime executionDateGte, OffsetDateTime executionDateLte, OffsetDateTime startDateGte, OffsetDateTime startDateLte, OffsetDateTime endDateGte, OffsetDateTime endDateLte, BigDecimal durationGte, BigDecimal durationLte, List<String> state, List<String> pool, List<String> queue, Integer limit, Integer offset, Handler<AsyncResult<TaskInstanceCollection>> resultHandler) {
        delegate.getTaskInstances(dagId, dagRunId, executionDateGte, executionDateLte, startDateGte, startDateLte, endDateGte, endDateLte, durationGte, durationLte, state, pool, queue, limit, offset, resultHandler);
    }

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
     * @param state The value can be repeated to retrieve multiple matching values (OR condition). (optional, default to new ArrayList&lt;&gt;())
     * @param pool The value can be repeated to retrieve multiple matching values (OR condition). (optional, default to new ArrayList&lt;&gt;())
     * @param queue The value can be repeated to retrieve multiple matching values (OR condition). (optional, default to new ArrayList&lt;&gt;())
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TaskInstanceCollection> rxGetTaskInstances(String dagId, String dagRunId, OffsetDateTime executionDateGte, OffsetDateTime executionDateLte, OffsetDateTime startDateGte, OffsetDateTime startDateLte, OffsetDateTime endDateGte, OffsetDateTime endDateLte, BigDecimal durationGte, BigDecimal durationLte, List<String> state, List<String> pool, List<String> queue, Integer limit, Integer offset) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getTaskInstances(dagId, dagRunId, executionDateGte, executionDateLte, startDateGte, startDateLte, endDateGte, endDateLte, durationGte, durationLte, state, pool, queue, limit, offset, fut);
        }));
    }
    /**
     * Get list of task instances from all DAGs and DAG Runs.
     * This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits 
     * @param listTaskInstanceForm  (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getTaskInstancesBatch(ListTaskInstanceForm listTaskInstanceForm, Handler<AsyncResult<TaskInstanceCollection>> resultHandler) {
        delegate.getTaskInstancesBatch(listTaskInstanceForm, resultHandler);
    }

    /**
     * Get list of task instances from all DAGs and DAG Runs.
     * This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits 
     * @param listTaskInstanceForm  (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<TaskInstanceCollection> rxGetTaskInstancesBatch(ListTaskInstanceForm listTaskInstanceForm) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getTaskInstancesBatch(listTaskInstanceForm, fut);
        }));
    }

    public static TaskInstanceApi newInstance(org.openapitools.client.api.TaskInstanceApi arg) {
        return arg != null ? new TaskInstanceApi(arg) : null;
    }
}
