package org.openapitools.client.api.rxjava;

import org.openapitools.client.model.Connection;
import org.openapitools.client.model.ConnectionCollection;
import org.openapitools.client.model.Error;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-30T18:47:16.120Z[GMT]")
public class ConnectionApi {

	private final org.openapitools.client.api.ConnectionApi delegate;

	public ConnectionApi(org.openapitools.client.api.ConnectionApi delegate) {
	    this.delegate = delegate;
    }

	public org.openapitools.client.api.ConnectionApi getDelegate() {
	    return delegate;
	}

    /**
     * Create connection entry
     * 
     * @param connection  (required)
     * @param resultHandler Asynchronous result handler
     */
    public void createConnection(Connection connection, Handler<AsyncResult<Connection>> resultHandler) {
        delegate.createConnection(connection, resultHandler);
    }

    /**
     * Create connection entry
     * 
     * @param connection  (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<Connection> rxCreateConnection(Connection connection) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.createConnection(connection, fut);
        }));
    }
    /**
     * Delete a connection entry
     * 
     * @param connectionId The Connection ID. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void deleteConnection(Integer connectionId, Handler<AsyncResult<Void>> resultHandler) {
        delegate.deleteConnection(connectionId, resultHandler);
    }

    /**
     * Delete a connection entry
     * 
     * @param connectionId The Connection ID. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<Void> rxDeleteConnection(Integer connectionId) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.deleteConnection(connectionId, fut);
        }));
    }
    /**
     * Get a connection entry
     * 
     * @param connectionId The Connection ID. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getConnection(Integer connectionId, Handler<AsyncResult<Connection>> resultHandler) {
        delegate.getConnection(connectionId, resultHandler);
    }

    /**
     * Get a connection entry
     * 
     * @param connectionId The Connection ID. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<Connection> rxGetConnection(Integer connectionId) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getConnection(connectionId, fut);
        }));
    }
    /**
     * Get all connection entries
     * 
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getConnections(Integer limit, Integer offset, Handler<AsyncResult<ConnectionCollection>> resultHandler) {
        delegate.getConnections(limit, offset, resultHandler);
    }

    /**
     * Get all connection entries
     * 
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<ConnectionCollection> rxGetConnections(Integer limit, Integer offset) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getConnections(limit, offset, fut);
        }));
    }
    /**
     * Update a connection entry
     * 
     * @param connectionId The Connection ID. (required)
     * @param connection  (required)
     * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;&gt;())
     * @param resultHandler Asynchronous result handler
     */
    public void updateConnection(Integer connectionId, Connection connection, List<String> updateMask, Handler<AsyncResult<Connection>> resultHandler) {
        delegate.updateConnection(connectionId, connection, updateMask, resultHandler);
    }

    /**
     * Update a connection entry
     * 
     * @param connectionId The Connection ID. (required)
     * @param connection  (required)
     * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;&gt;())
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<Connection> rxUpdateConnection(Integer connectionId, Connection connection, List<String> updateMask) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.updateConnection(connectionId, connection, updateMask, fut);
        }));
    }

    public static ConnectionApi newInstance(org.openapitools.client.api.ConnectionApi arg) {
        return arg != null ? new ConnectionApi(arg) : null;
    }
}
