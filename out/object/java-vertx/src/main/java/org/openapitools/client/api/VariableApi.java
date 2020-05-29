package org.openapitools.client.api;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.Variable;
import org.openapitools.client.model.VariableCollection;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

import java.util.*;

public interface VariableApi {

    void createVariable(Variable variable, Handler<AsyncResult<Variable>> handler);

    void deleteVariable(String variableKey, Handler<AsyncResult<Void>> handler);

    void getVariable(String variableKey, Handler<AsyncResult<Variable>> handler);

    void getVariables(Integer limit, Integer offset, Handler<AsyncResult<VariableCollection>> handler);

    void updateVariable(String variableKey, Variable variable, List<String> updateMask, Handler<AsyncResult<Variable>> handler);

}
