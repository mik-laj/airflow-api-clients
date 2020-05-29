package org.openapitools.client.api;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.EventLog;
import org.openapitools.client.model.EventLogCollection;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.MultiMap;
import io.vertx.core.json.JsonObject;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.*;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:10:30.163Z[GMT]")
public class EventLogApiImpl implements EventLogApi {

    private ApiClient apiClient;

    public EventLogApiImpl() {
        this(null);
    }

    public EventLogApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient != null ? apiClient : Configuration.getDefaultApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get all log entries from event log
     * 
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getEventLog(Integer limit, Integer offset, Handler<AsyncResult<EventLogCollection>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/eventLogs";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] {  };
        TypeReference<EventLogCollection> localVarReturnType = new TypeReference<EventLogCollection>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Get a log entry
     * 
     * @param eventLogId The Event Log ID. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getEventLogEntry(Integer eventLogId, Handler<AsyncResult<EventLog>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'eventLogId' is set
        if (eventLogId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'eventLogId' when calling getEventLogEntry"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/eventLogs/{event_log_id}".replaceAll("\\{" + "event_log_id" + "\\}", eventLogId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] {  };
        TypeReference<EventLog> localVarReturnType = new TypeReference<EventLog>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
}
