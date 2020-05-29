package org.openapitools.client.api;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.EventLog;
import org.openapitools.client.model.EventLogCollection;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface EventLogApi {

    void getEventLog(Integer limit, Integer offset, Handler<AsyncResult<EventLogCollection>> handler);

    void getEventLogEntry(Integer eventLogId, Handler<AsyncResult<EventLog>> handler);

}
