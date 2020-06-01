package org.openapitools.client.api.rxjava;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.Variable;
import org.openapitools.client.model.VariableCollection;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-31T07:37:24.519Z[GMT]")
public class VariableApi {

	private final org.openapitools.client.api.VariableApi delegate;

	public VariableApi(org.openapitools.client.api.VariableApi delegate) {
	    this.delegate = delegate;
    }

	public org.openapitools.client.api.VariableApi getDelegate() {
	    return delegate;
	}

    /**
     * Create a variable
     * 
     * @param variable  (required)
     * @param resultHandler Asynchronous result handler
     */
    public void createVariable(Variable variable, Handler<AsyncResult<Variable>> resultHandler) {
        delegate.createVariable(variable, resultHandler);
    }

    /**
     * Create a variable
     * 
     * @param variable  (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<Variable> rxCreateVariable(Variable variable) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.createVariable(variable, fut);
        }));
    }
    /**
     * Delete variable
     * 
     * @param variableKey The Variable Key. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void deleteVariable(String variableKey, Handler<AsyncResult<Void>> resultHandler) {
        delegate.deleteVariable(variableKey, resultHandler);
    }

    /**
     * Delete variable
     * 
     * @param variableKey The Variable Key. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<Void> rxDeleteVariable(String variableKey) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.deleteVariable(variableKey, fut);
        }));
    }
    /**
     * Get a variable by key
     * 
     * @param variableKey The Variable Key. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getVariable(String variableKey, Handler<AsyncResult<Variable>> resultHandler) {
        delegate.getVariable(variableKey, resultHandler);
    }

    /**
     * Get a variable by key
     * 
     * @param variableKey The Variable Key. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<Variable> rxGetVariable(String variableKey) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getVariable(variableKey, fut);
        }));
    }
    /**
     * Get all variables
     * The collection does not contain data. To get data, you must get a single entity.
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getVariables(Integer limit, Integer offset, Handler<AsyncResult<VariableCollection>> resultHandler) {
        delegate.getVariables(limit, offset, resultHandler);
    }

    /**
     * Get all variables
     * The collection does not contain data. To get data, you must get a single entity.
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<VariableCollection> rxGetVariables(Integer limit, Integer offset) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getVariables(limit, offset, fut);
        }));
    }
    /**
     * Update a variable by key
     * 
     * @param variableKey The Variable Key. (required)
     * @param variable  (required)
     * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;&gt;())
     * @param resultHandler Asynchronous result handler
     */
    public void updateVariable(String variableKey, Variable variable, List<String> updateMask, Handler<AsyncResult<Variable>> resultHandler) {
        delegate.updateVariable(variableKey, variable, updateMask, resultHandler);
    }

    /**
     * Update a variable by key
     * 
     * @param variableKey The Variable Key. (required)
     * @param variable  (required)
     * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;&gt;())
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<Variable> rxUpdateVariable(String variableKey, Variable variable, List<String> updateMask) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.updateVariable(variableKey, variable, updateMask, fut);
        }));
    }

    public static VariableApi newInstance(org.openapitools.client.api.VariableApi arg) {
        return arg != null ? new VariableApi(arg) : null;
    }
}
