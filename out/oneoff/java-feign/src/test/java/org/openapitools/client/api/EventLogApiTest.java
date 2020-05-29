package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.EventLog;
import org.openapitools.client.model.EventLogCollection;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EventLogApi
 */
public class EventLogApiTest {

    private EventLogApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(EventLogApi.class);
    }

    
    /**
     * Get all log entries from event log
     *
     * 
     */
    @Test
    public void getEventLogTest() {
        Integer limit = null;
        Integer offset = null;
        // EventLogCollection response = api.getEventLog(limit, offset);

        // TODO: test validations
    }

    /**
     * Get all log entries from event log
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getEventLogTestQueryMap() {
        EventLogApi.GetEventLogQueryParams queryParams = new EventLogApi.GetEventLogQueryParams()
            .limit(null)
            .offset(null);
        // EventLogCollection response = api.getEventLog(queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a log entry
     *
     * 
     */
    @Test
    public void getEventLogEntryTest() {
        Integer eventLogId = null;
        // EventLog response = api.getEventLogEntry(eventLogId);

        // TODO: test validations
    }

    
}
