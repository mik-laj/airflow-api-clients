package org.openapitools.client.api;

import java.math.BigDecimal;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.ExtraLinkCollection;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.ListTaskInstanceForm;
import org.threeten.bp.OffsetDateTime;
import org.openapitools.client.model.TaskInstance;
import org.openapitools.client.model.TaskInstanceCollection;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface TaskInstanceApi {

    void getExtraLinks(String dagId, String dagRunId, String taskId, Handler<AsyncResult<ExtraLinkCollection>> handler);

    void getLogs(String dagId, String dagRunId, String taskId, Integer taskTryNumber, Boolean fullContent, String token, Handler<AsyncResult<InlineResponse200>> handler);

    void getTaskInstance(String dagId, String dagRunId, String taskId, Handler<AsyncResult<TaskInstance>> handler);

    void getTaskInstances(String dagId, String dagRunId, OffsetDateTime executionDateGte, OffsetDateTime executionDateLte, OffsetDateTime startDateGte, OffsetDateTime startDateLte, OffsetDateTime endDateGte, OffsetDateTime endDateLte, BigDecimal durationGte, BigDecimal durationLte, List<String> state, List<String> pool, List<String> queue, Integer limit, Integer offset, Handler<AsyncResult<TaskInstanceCollection>> handler);

    void getTaskInstancesBatch(ListTaskInstanceForm listTaskInstanceForm, Handler<AsyncResult<TaskInstanceCollection>> handler);

}
