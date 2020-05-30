package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.EventLog;
import org.openapitools.client.model.EventLogCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-30T18:48:09.710Z[GMT]")
public interface EventLogApi extends ApiClient.Api {


  /**
   * Get all log entries from event log
   * 
   * @param limit The numbers of items to return. (optional, default to 100)
   * @param offset The number of items to skip before starting to collect the result set. (optional)
   * @return EventLogCollection
   */
  @RequestLine("GET /eventLogs?limit={limit}&offset={offset}")
  @Headers({
    "Accept: application/json",
  })
  EventLogCollection getEventLog(@Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Get all log entries from event log
   * 
   * Note, this is equivalent to the other <code>getEventLog</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetEventLogQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>limit - The numbers of items to return. (optional, default to 100)</li>
   *   <li>offset - The number of items to skip before starting to collect the result set. (optional)</li>
   *   </ul>
   * @return EventLogCollection
   */
  @RequestLine("GET /eventLogs?limit={limit}&offset={offset}")
  @Headers({
  "Accept: application/json",
  })
  EventLogCollection getEventLog(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getEventLog</code> method in a fluent style.
   */
  public static class GetEventLogQueryParams extends HashMap<String, Object> {
    public GetEventLogQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetEventLogQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get a log entry
   * 
   * @param eventLogId The Event Log ID. (required)
   * @return EventLog
   */
  @RequestLine("GET /eventLogs/{eventLogId}")
  @Headers({
    "Accept: application/json",
  })
  EventLog getEventLogEntry(@Param("eventLogId") Integer eventLogId);
}
