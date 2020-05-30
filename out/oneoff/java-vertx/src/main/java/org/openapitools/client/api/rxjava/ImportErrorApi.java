package org.openapitools.client.api.rxjava;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.ImportError;
import org.openapitools.client.model.ImportErrorCollection;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-30T18:48:24.732Z[GMT]")
public class ImportErrorApi {

	private final org.openapitools.client.api.ImportErrorApi delegate;

	public ImportErrorApi(org.openapitools.client.api.ImportErrorApi delegate) {
	    this.delegate = delegate;
    }

	public org.openapitools.client.api.ImportErrorApi getDelegate() {
	    return delegate;
	}

    /**
     * Delete an import error
     * 
     * @param importErrorId The Import Error ID. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void deleteImportError(Integer importErrorId, Handler<AsyncResult<Void>> resultHandler) {
        delegate.deleteImportError(importErrorId, resultHandler);
    }

    /**
     * Delete an import error
     * 
     * @param importErrorId The Import Error ID. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<Void> rxDeleteImportError(Integer importErrorId) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.deleteImportError(importErrorId, fut);
        }));
    }
    /**
     * Get an import error
     * 
     * @param importErrorId The Import Error ID. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getImportError(Integer importErrorId, Handler<AsyncResult<ImportError>> resultHandler) {
        delegate.getImportError(importErrorId, resultHandler);
    }

    /**
     * Get an import error
     * 
     * @param importErrorId The Import Error ID. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<ImportError> rxGetImportError(Integer importErrorId) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getImportError(importErrorId, fut);
        }));
    }
    /**
     * Get all import errors
     * 
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getImportErrors(Integer limit, Integer offset, Handler<AsyncResult<ImportErrorCollection>> resultHandler) {
        delegate.getImportErrors(limit, offset, resultHandler);
    }

    /**
     * Get all import errors
     * 
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<ImportErrorCollection> rxGetImportErrors(Integer limit, Integer offset) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getImportErrors(limit, offset, fut);
        }));
    }

    public static ImportErrorApi newInstance(org.openapitools.client.api.ImportErrorApi arg) {
        return arg != null ? new ImportErrorApi(arg) : null;
    }
}
