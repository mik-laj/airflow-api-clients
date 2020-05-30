package org.openapitools.client.api.rxjava;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.Pool;
import org.openapitools.client.model.PoolCollection;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-30T18:47:16.120Z[GMT]")
public class PoolApi {

	private final org.openapitools.client.api.PoolApi delegate;

	public PoolApi(org.openapitools.client.api.PoolApi delegate) {
	    this.delegate = delegate;
    }

	public org.openapitools.client.api.PoolApi getDelegate() {
	    return delegate;
	}

    /**
     * Create a pool
     * 
     * @param pool  (required)
     * @param resultHandler Asynchronous result handler
     */
    public void createPool(Pool pool, Handler<AsyncResult<Pool>> resultHandler) {
        delegate.createPool(pool, resultHandler);
    }

    /**
     * Create a pool
     * 
     * @param pool  (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<Pool> rxCreatePool(Pool pool) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.createPool(pool, fut);
        }));
    }
    /**
     * Delete a pool
     * 
     * @param poolName The Pool name. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void deletePool(String poolName, Handler<AsyncResult<Void>> resultHandler) {
        delegate.deletePool(poolName, resultHandler);
    }

    /**
     * Delete a pool
     * 
     * @param poolName The Pool name. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<Void> rxDeletePool(String poolName) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.deletePool(poolName, fut);
        }));
    }
    /**
     * Get a pool
     * 
     * @param poolName The Pool name. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getPool(String poolName, Handler<AsyncResult<Pool>> resultHandler) {
        delegate.getPool(poolName, resultHandler);
    }

    /**
     * Get a pool
     * 
     * @param poolName The Pool name. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<Pool> rxGetPool(String poolName) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getPool(poolName, fut);
        }));
    }
    /**
     * Get all pools
     * 
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getPools(Integer limit, Integer offset, Handler<AsyncResult<PoolCollection>> resultHandler) {
        delegate.getPools(limit, offset, resultHandler);
    }

    /**
     * Get all pools
     * 
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<PoolCollection> rxGetPools(Integer limit, Integer offset) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getPools(limit, offset, fut);
        }));
    }
    /**
     * Update a pool
     * 
     * @param poolName The Pool name. (required)
     * @param pool  (required)
     * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;&gt;())
     * @param resultHandler Asynchronous result handler
     */
    public void updatePool(String poolName, Pool pool, List<String> updateMask, Handler<AsyncResult<Pool>> resultHandler) {
        delegate.updatePool(poolName, pool, updateMask, resultHandler);
    }

    /**
     * Update a pool
     * 
     * @param poolName The Pool name. (required)
     * @param pool  (required)
     * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;&gt;())
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<Pool> rxUpdatePool(String poolName, Pool pool, List<String> updateMask) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.updatePool(poolName, pool, updateMask, fut);
        }));
    }

    public static PoolApi newInstance(org.openapitools.client.api.PoolApi arg) {
        return arg != null ? new PoolApi(arg) : null;
    }
}
