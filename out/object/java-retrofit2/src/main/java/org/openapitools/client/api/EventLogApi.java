package org.openapitools.client.api;

import org.openapitools.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.EventLog;
import org.openapitools.client.model.EventLogCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface EventLogApi {
  /**
   * Get all log entries from event log
   * 
   * @param limit The numbers of items to return. (optional, default to 100)
   * @param offset The number of items to skip before starting to collect the result set. (optional)
   * @return Call&lt;EventLogCollection&gt;
   */
  @GET("eventLogs")
  Call<EventLogCollection> getEventLog(
    @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Get a log entry
   * 
   * @param eventLogId The Event Log ID. (required)
   * @return Call&lt;EventLog&gt;
   */
  @GET("eventLogs/{event_log_id}")
  Call<EventLog> getEventLogEntry(
    @retrofit2.http.Path("event_log_id") Integer eventLogId
  );

}
