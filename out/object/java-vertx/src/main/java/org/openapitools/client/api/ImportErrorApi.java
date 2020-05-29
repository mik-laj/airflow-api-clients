package org.openapitools.client.api;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.ImportError;
import org.openapitools.client.model.ImportErrorCollection;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface ImportErrorApi {

    void deleteImportError(Integer importErrorId, Handler<AsyncResult<Void>> handler);

    void getImportError(Integer importErrorId, Handler<AsyncResult<ImportError>> handler);

    void getImportErrors(Integer limit, Integer offset, Handler<AsyncResult<ImportErrorCollection>> handler);

}
