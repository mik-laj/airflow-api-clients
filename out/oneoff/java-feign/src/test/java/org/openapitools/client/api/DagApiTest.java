package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.ClearTaskInstance;
import org.openapitools.client.model.DAG;
import org.openapitools.client.model.DAGCollection;
import org.openapitools.client.model.DAGDetail;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.InlineResponse2001;
import org.openapitools.client.model.Task;
import org.openapitools.client.model.TaskCollection;
import org.openapitools.client.model.TaskInstanceReferenceCollection;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DagApi
 */
public class DagApiTest {

    private DagApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(DagApi.class);
    }

    
    /**
     * Clears a set of task instances associated with the DAG for a specified date range.
     *
     * 
     */
    @Test
    public void clearTaskInstanceTest() {
        String dagId = null;
        ClearTaskInstance clearTaskInstance = null;
        // TaskInstanceReferenceCollection response = api.clearTaskInstance(dagId, clearTaskInstance);

        // TODO: test validations
    }

    
    /**
     * Get basic information about a DAG
     *
     * Presents only information available in database (DAGModel). If you need detailed information, consider using GET /dags/{dag_id}/detail. 
     */
    @Test
    public void getDagTest() {
        String dagId = null;
        // DAG response = api.getDag(dagId);

        // TODO: test validations
    }

    
    /**
     * Get a simplified representation of DAG.
     *
     * The response contains many DAG attributes, so the response can be large. If possible, consider using GET /dags/{dag_id}. 
     */
    @Test
    public void getDagDetailTest() {
        String dagId = null;
        // DAGDetail response = api.getDagDetail(dagId);

        // TODO: test validations
    }

    
    /**
     * Get source code using file token
     *
     * 
     */
    @Test
    public void getDagSourceTest() {
        String fileToken = null;
        // InlineResponse2001 response = api.getDagSource(fileToken);

        // TODO: test validations
    }

    
    /**
     * Get all DAGs
     *
     * 
     */
    @Test
    public void getDagsTest() {
        Integer limit = null;
        Integer offset = null;
        // DAGCollection response = api.getDags(limit, offset);

        // TODO: test validations
    }

    /**
     * Get all DAGs
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getDagsTestQueryMap() {
        DagApi.GetDagsQueryParams queryParams = new DagApi.GetDagsQueryParams()
            .limit(null)
            .offset(null);
        // DAGCollection response = api.getDags(queryParams);

    // TODO: test validations
    }
    
    /**
     * Get simplified representation of a task.
     *
     * 
     */
    @Test
    public void getTaskTest() {
        String dagId = null;
        String taskId = null;
        // Task response = api.getTask(dagId, taskId);

        // TODO: test validations
    }

    
    /**
     * Get tasks for DAG
     *
     * 
     */
    @Test
    public void getTasksTest() {
        String dagId = null;
        // TaskCollection response = api.getTasks(dagId);

        // TODO: test validations
    }

    
    /**
     * Update a DAG
     *
     * 
     */
    @Test
    public void updateDagTest() {
        String dagId = null;
        DAG DAG = null;
        // DAG response = api.updateDag(dagId, DAG);

        // TODO: test validations
    }

    
}
