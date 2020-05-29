package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import java.math.BigDecimal;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.ExtraLinkCollection;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.ListTaskInstanceForm;
import org.threeten.bp.OffsetDateTime;
import org.openapitools.client.model.TaskInstance;
import org.openapitools.client.model.TaskInstanceCollection;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TaskInstanceApi
 */
public class TaskInstanceApiTest {

    private TaskInstanceApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(TaskInstanceApi.class);
    }

    
    /**
     * Get extra links for task instance
     *
     * 
     */
    @Test
    public void getExtraLinksTest() {
        String dagId = null;
        String dagRunId = null;
        String taskId = null;
        // ExtraLinkCollection response = api.getExtraLinks(dagId, dagRunId, taskId);

        // TODO: test validations
    }

    
    /**
     * Get logs for a task instance
     *
     * Get logs for a specific task instance and its try number
     */
    @Test
    public void getLogsTest() {
        String dagId = null;
        String dagRunId = null;
        String taskId = null;
        Integer taskTryNumber = null;
        Boolean fullContent = null;
        String token = null;
        // InlineResponse200 response = api.getLogs(dagId, dagRunId, taskId, taskTryNumber, fullContent, token);

        // TODO: test validations
    }

    /**
     * Get logs for a task instance
     *
     * Get logs for a specific task instance and its try number
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getLogsTestQueryMap() {
        String dagId = null;
        String dagRunId = null;
        String taskId = null;
        Integer taskTryNumber = null;
        TaskInstanceApi.GetLogsQueryParams queryParams = new TaskInstanceApi.GetLogsQueryParams()
            .fullContent(null)
            .token(null);
        // InlineResponse200 response = api.getLogs(dagId, dagRunId, taskId, taskTryNumber, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get a task instance
     *
     * 
     */
    @Test
    public void getTaskInstanceTest() {
        String dagId = null;
        String dagRunId = null;
        String taskId = null;
        // TaskInstance response = api.getTaskInstance(dagId, dagRunId, taskId);

        // TODO: test validations
    }

    
    /**
     * Get a list of task instance of DAG.
     *
     * This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id to retrieve DAG Runs for all DAGs and DAG Runs. 
     */
    @Test
    public void getTaskInstancesTest() {
        String dagId = null;
        String dagRunId = null;
        OffsetDateTime executionDateGte = null;
        OffsetDateTime executionDateLte = null;
        OffsetDateTime startDateGte = null;
        OffsetDateTime startDateLte = null;
        OffsetDateTime endDateGte = null;
        OffsetDateTime endDateLte = null;
        BigDecimal durationGte = null;
        BigDecimal durationLte = null;
        List<String> state = null;
        List<String> pool = null;
        List<String> queue = null;
        Integer limit = null;
        Integer offset = null;
        // TaskInstanceCollection response = api.getTaskInstances(dagId, dagRunId, executionDateGte, executionDateLte, startDateGte, startDateLte, endDateGte, endDateLte, durationGte, durationLte, state, pool, queue, limit, offset);

        // TODO: test validations
    }

    /**
     * Get a list of task instance of DAG.
     *
     * This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id to retrieve DAG Runs for all DAGs and DAG Runs. 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getTaskInstancesTestQueryMap() {
        String dagId = null;
        String dagRunId = null;
        TaskInstanceApi.GetTaskInstancesQueryParams queryParams = new TaskInstanceApi.GetTaskInstancesQueryParams()
            .executionDateGte(null)
            .executionDateLte(null)
            .startDateGte(null)
            .startDateLte(null)
            .endDateGte(null)
            .endDateLte(null)
            .durationGte(null)
            .durationLte(null)
            .state(null)
            .pool(null)
            .queue(null)
            .limit(null)
            .offset(null);
        // TaskInstanceCollection response = api.getTaskInstances(dagId, dagRunId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get list of task instances from all DAGs and DAG Runs.
     *
     * This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits 
     */
    @Test
    public void getTaskInstancesBatchTest() {
        ListTaskInstanceForm listTaskInstanceForm = null;
        // TaskInstanceCollection response = api.getTaskInstancesBatch(listTaskInstanceForm);

        // TODO: test validations
    }

    
}
