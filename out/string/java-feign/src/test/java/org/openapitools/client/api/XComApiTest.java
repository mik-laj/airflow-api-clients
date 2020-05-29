package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.XCom;
import org.openapitools.client.model.XComCollection;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for XComApi
 */
public class XComApiTest {

    private XComApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(XComApi.class);
    }

    
    /**
     * Delete an XCom entry
     *
     * 
     */
    @Test
    public void deleteXComValueTest() {
        String dagId = null;
        String dagRunId = null;
        String taskId = null;
        String key = null;
        // api.deleteXComValue(dagId, dagRunId, taskId, key);

        // TODO: test validations
    }

    
    /**
     * Get all XCom entries
     *
     * This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id, task_id to retrieve XCOM entries for for all DAGs, DAG Runs and task instances.
     */
    @Test
    public void getXComEntryTest() {
        String dagId = null;
        String dagRunId = null;
        String taskId = null;
        Integer limit = null;
        Integer offset = null;
        // XComCollection response = api.getXComEntry(dagId, dagRunId, taskId, limit, offset);

        // TODO: test validations
    }

    /**
     * Get all XCom entries
     *
     * This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id, task_id to retrieve XCOM entries for for all DAGs, DAG Runs and task instances.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getXComEntryTestQueryMap() {
        String dagId = null;
        String dagRunId = null;
        String taskId = null;
        XComApi.GetXComEntryQueryParams queryParams = new XComApi.GetXComEntryQueryParams()
            .limit(null)
            .offset(null);
        // XComCollection response = api.getXComEntry(dagId, dagRunId, taskId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get an XCom entry
     *
     * 
     */
    @Test
    public void getXComValueTest() {
        String dagId = null;
        String dagRunId = null;
        String taskId = null;
        String key = null;
        // XCom response = api.getXComValue(dagId, dagRunId, taskId, key);

        // TODO: test validations
    }

    
    /**
     * Create an XCom entry
     *
     * 
     */
    @Test
    public void updateXComEntryTest() {
        String dagId = null;
        String dagRunId = null;
        String taskId = null;
        XCom xcom = null;
        // XCom response = api.updateXComEntry(dagId, dagRunId, taskId, xcom);

        // TODO: test validations
    }

    
    /**
     * Update an XCom entry
     *
     * 
     */
    @Test
    public void updateXComValueTest() {
        String dagId = null;
        String dagRunId = null;
        String taskId = null;
        String key = null;
        XCom xcom = null;
        List<String> updateMask = null;
        // XCom response = api.updateXComValue(dagId, dagRunId, taskId, key, xcom, updateMask);

        // TODO: test validations
    }

    /**
     * Update an XCom entry
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void updateXComValueTestQueryMap() {
        String dagId = null;
        String dagRunId = null;
        String taskId = null;
        String key = null;
        XCom xcom = null;
        XComApi.UpdateXComValueQueryParams queryParams = new XComApi.UpdateXComValueQueryParams()
            .updateMask(null);
        // XCom response = api.updateXComValue(dagId, dagRunId, taskId, key, xcom, queryParams);

    // TODO: test validations
    }
    
}
