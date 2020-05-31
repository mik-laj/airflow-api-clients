package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.EventLog;
import org.openapitools.client.model.EventLogCollection;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.api.client.http.EmptyContent;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.InputStreamContent;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.json.Json;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-31T07:53:21.630Z[GMT]")
public class EventLogApi {
    private ApiClient apiClient;

    public EventLogApi() {
        this(new ApiClient());
    }

    public EventLogApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Get all log entries from event log
    * <p><b>200</b> - List of log entries.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param limit The numbers of items to return.
    * @param offset The number of items to skip before starting to collect the result set.
    * @return EventLogCollection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public EventLogCollection getEventLog(Integer limit, Integer offset) throws IOException {
        HttpResponse response = getEventLogForHttpResponse(limit, offset);
        TypeReference<EventLogCollection> typeRef = new TypeReference<EventLogCollection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get all log entries from event log
    * <p><b>200</b> - List of log entries.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return EventLogCollection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public EventLogCollection getEventLog(Map<String, Object> params) throws IOException {
        HttpResponse response = getEventLogForHttpResponse(params);
        TypeReference<EventLogCollection> typeRef = new TypeReference<EventLogCollection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse getEventLogForHttpResponse(Integer limit, Integer offset) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/eventLogs");
        if (limit != null) {
            String key = "limit";
            Object value = limit;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }        if (offset != null) {
            String key = "offset";
            Object value = offset;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse getEventLogForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/eventLogs");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }


  /**
    * Get a log entry
    * <p><b>200</b> - Successful response.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param eventLogId The Event Log ID.
    * @return EventLog
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public EventLog getEventLogEntry(Integer eventLogId) throws IOException {
        HttpResponse response = getEventLogEntryForHttpResponse(eventLogId);
        TypeReference<EventLog> typeRef = new TypeReference<EventLog>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get a log entry
    * <p><b>200</b> - Successful response.
    * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
    * <p><b>403</b> - Client does not have sufficient permission.
    * <p><b>404</b> - A specified resource is not found.
    * @param eventLogId The Event Log ID.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return EventLog
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public EventLog getEventLogEntry(Integer eventLogId, Map<String, Object> params) throws IOException {
        HttpResponse response = getEventLogEntryForHttpResponse(eventLogId, params);
        TypeReference<EventLog> typeRef = new TypeReference<EventLog>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse getEventLogEntryForHttpResponse(Integer eventLogId) throws IOException {
        // verify the required parameter 'eventLogId' is set
        if (eventLogId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'eventLogId' when calling getEventLogEntry");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("event_log_id", eventLogId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/eventLogs/{event_log_id}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse getEventLogEntryForHttpResponse(Integer eventLogId, Map<String, Object> params) throws IOException {
        // verify the required parameter 'eventLogId' is set
        if (eventLogId == null) {
            throw new IllegalArgumentException("Missing the required parameter 'eventLogId' when calling getEventLogEntry");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("event_log_id", eventLogId);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/eventLogs/{event_log_id}");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }


}
