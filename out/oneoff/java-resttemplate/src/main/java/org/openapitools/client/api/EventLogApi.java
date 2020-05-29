package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.EventLog;
import org.openapitools.client.model.EventLogCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:09:53.101Z[GMT]")
@Component("org.openapitools.client.api.EventLogApi")
public class EventLogApi {
    private ApiClient apiClient;

    public EventLogApi() {
        this(new ApiClient());
    }

    @Autowired
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
     * 
     * <p><b>200</b> - List of log entries.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @return EventLogCollection
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EventLogCollection getEventLog(Integer limit, Integer offset) throws RestClientException {
        return getEventLogWithHttpInfo(limit, offset).getBody();
    }

    /**
     * Get all log entries from event log
     * 
     * <p><b>200</b> - List of log entries.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @return ResponseEntity&lt;EventLogCollection&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EventLogCollection> getEventLogWithHttpInfo(Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/eventLogs", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<EventLogCollection> returnType = new ParameterizedTypeReference<EventLogCollection>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a log entry
     * 
     * <p><b>200</b> - Successful response.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param eventLogId The Event Log ID. (required)
     * @return EventLog
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EventLog getEventLogEntry(Integer eventLogId) throws RestClientException {
        return getEventLogEntryWithHttpInfo(eventLogId).getBody();
    }

    /**
     * Get a log entry
     * 
     * <p><b>200</b> - Successful response.
     * <p><b>401</b> - Request not authenticated due to missing, invalid, authentication info.
     * <p><b>403</b> - Client does not have sufficient permission.
     * <p><b>404</b> - A specified resource is not found.
     * @param eventLogId The Event Log ID. (required)
     * @return ResponseEntity&lt;EventLog&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EventLog> getEventLogEntryWithHttpInfo(Integer eventLogId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'eventLogId' is set
        if (eventLogId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'eventLogId' when calling getEventLogEntry");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("event_log_id", eventLogId);
        String path = apiClient.expandPath("/eventLogs/{event_log_id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<EventLog> returnType = new ParameterizedTypeReference<EventLog>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
