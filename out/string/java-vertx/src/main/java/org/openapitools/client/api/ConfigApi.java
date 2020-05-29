package org.openapitools.client.api;

import org.openapitools.client.model.Config;
import org.openapitools.client.model.Error;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface ConfigApi {

    void getConfig(Integer limit, Integer offset, Handler<AsyncResult<Config>> handler);

}
