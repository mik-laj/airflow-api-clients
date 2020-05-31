package org.openapitools.client.api.rxjava;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.EventLog;
import org.openapitools.client.model.EventLogCollection;

import java.util.*;

import rx.Single;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-31T07:53:19.156Z[GMT]")
public class EventLogApi {

	private final org.openapitools.client.api.EventLogApi delegate;

	public EventLogApi(org.openapitools.client.api.EventLogApi delegate) {
	    this.delegate = delegate;
    }

	public org.openapitools.client.api.EventLogApi getDelegate() {
	    return delegate;
	}

    /**
     * Get all log entries from event log
     * 
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getEventLog(Integer limit, Integer offset, Handler<AsyncResult<EventLogCollection>> resultHandler) {
        delegate.getEventLog(limit, offset, resultHandler);
    }

    /**
     * Get all log entries from event log
     * 
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<EventLogCollection> rxGetEventLog(Integer limit, Integer offset) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getEventLog(limit, offset, fut);
        }));
    }
    /**
     * Get a log entry
     * 
     * @param eventLogId The Event Log ID. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getEventLogEntry(Integer eventLogId, Handler<AsyncResult<EventLog>> resultHandler) {
        delegate.getEventLogEntry(eventLogId, resultHandler);
    }

    /**
     * Get a log entry
     * 
     * @param eventLogId The Event Log ID. (required)
     * @return Asynchronous result handler (RxJava Single)
     */
    public Single<EventLog> rxGetEventLogEntry(Integer eventLogId) {
        return Single.create(new io.vertx.rx.java.SingleOnSubscribeAdapter<>(fut -> {
            delegate.getEventLogEntry(eventLogId, fut);
        }));
    }

    public static EventLogApi newInstance(org.openapitools.client.api.EventLogApi arg) {
        return arg != null ? new EventLogApi(arg) : null;
    }
}
