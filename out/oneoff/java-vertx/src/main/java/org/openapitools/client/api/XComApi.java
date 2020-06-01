package org.openapitools.client.api;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.XCom;
import org.openapitools.client.model.XComCollection;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface XComApi {

    void deleteXComValue(String dagId, String dagRunId, String taskId, String key, Handler<AsyncResult<Void>> handler);

    void getXComEntry(String dagId, String dagRunId, String taskId, Integer limit, Integer offset, Handler<AsyncResult<XComCollection>> handler);

    void getXComValue(String dagId, String dagRunId, String taskId, String key, Handler<AsyncResult<XCom>> handler);

    void updateXComEntry(String dagId, String dagRunId, String taskId, XCom xcom, Handler<AsyncResult<XCom>> handler);

    void updateXComValue(String dagId, String dagRunId, String taskId, String key, XCom xcom, List<String> updateMask, Handler<AsyncResult<XCom>> handler);

}
