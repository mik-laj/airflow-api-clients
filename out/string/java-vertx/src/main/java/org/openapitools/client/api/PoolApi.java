package org.openapitools.client.api;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.Pool;
import org.openapitools.client.model.PoolCollection;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface PoolApi {

    void createPool(Pool pool, Handler<AsyncResult<Pool>> handler);

    void deletePool(String poolName, Handler<AsyncResult<Void>> handler);

    void getPool(String poolName, Handler<AsyncResult<Pool>> handler);

    void getPools(Integer limit, Integer offset, Handler<AsyncResult<PoolCollection>> handler);

    void updatePool(String poolName, Pool pool, List<String> updateMask, Handler<AsyncResult<Pool>> handler);

}
