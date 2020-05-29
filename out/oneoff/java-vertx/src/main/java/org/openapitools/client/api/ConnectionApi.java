package org.openapitools.client.api;

import org.openapitools.client.model.Connection;
import org.openapitools.client.model.ConnectionCollection;
import org.openapitools.client.model.Error;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface ConnectionApi {

    void createConnection(Connection connection, Handler<AsyncResult<Connection>> handler);

    void deleteConnection(Integer connectionId, Handler<AsyncResult<Void>> handler);

    void getConnection(Integer connectionId, Handler<AsyncResult<Connection>> handler);

    void getConnections(Integer limit, Integer offset, Handler<AsyncResult<ConnectionCollection>> handler);

    void updateConnection(Integer connectionId, Connection connection, List<String> updateMask, Handler<AsyncResult<Connection>> handler);

}
