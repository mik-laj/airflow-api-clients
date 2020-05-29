package org.openapitools.client.api;

import org.openapitools.client.model.DAGRun;
import org.openapitools.client.model.DAGRunCollection;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.ListDagRunsForm;
import org.threeten.bp.OffsetDateTime;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface DagRunApi {

    void createDagRun(String dagId, String dagRunId, DAGRun daGRun, Handler<AsyncResult<DAGRun>> handler);

    void deleteDagRun(String dagId, String dagRunId, Handler<AsyncResult<Void>> handler);

    void getDagRun(String dagId, String dagRunId, Handler<AsyncResult<DAGRun>> handler);

    void getDagRuns(String dagId, Integer limit, Integer offset, OffsetDateTime executionDateGte, OffsetDateTime executionDateLte, OffsetDateTime startDateGte, OffsetDateTime startDateLte, OffsetDateTime endDateGte, OffsetDateTime endDateLte, Handler<AsyncResult<DAGRunCollection>> handler);

    void getDagRunsBatch(ListDagRunsForm listDagRunsForm, Handler<AsyncResult<DAGRunCollection>> handler);

    void updateDagRun(String dagId, String dagRunId, DAGRun daGRun, List<String> updateMask, Handler<AsyncResult<DAGRun>> handler);

}
