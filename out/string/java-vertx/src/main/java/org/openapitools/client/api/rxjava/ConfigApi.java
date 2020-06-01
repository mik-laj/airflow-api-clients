package org.openapitools.client.api.rxjava;

import org.openapitools.client.model.Config;
import org.openapitools.client.model.Error;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-31T07:37:24.519Z[GMT]")
public class ConfigApi {

	private final org.openapitools.client.api.ConfigApi delegate;

	public ConfigApi(org.openapitools.client.api.ConfigApi delegate) {
	    this.delegate = delegate;
    }

	public org.openapitools.client.api.ConfigApi getDelegate() {
	    return delegate;
	}

    /**
     * Get current configuration
     * 
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getConfig(Integer limit, Integer offset, Handler<AsyncResult<Config>> resultHandler) {
        delegate.getConfig(limit, offset, resultHandler);
    }

    /**
     * Get current configuration
     * 
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<Config> rxGetConfig(Integer limit, Integer offset) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getConfig(limit, offset, fut);
        }));
    }

    public static ConfigApi newInstance(org.openapitools.client.api.ConfigApi arg) {
        return arg != null ? new ConfigApi(arg) : null;
    }
}
