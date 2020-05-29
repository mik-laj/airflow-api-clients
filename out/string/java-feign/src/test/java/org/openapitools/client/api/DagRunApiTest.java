package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.DAGRun;
import org.openapitools.client.model.DAGRunCollection;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.ListDagRunsForm;
import org.threeten.bp.OffsetDateTime;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DagRunApi
 */
public class DagRunApiTest {

    private DagRunApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(DagRunApi.class);
    }

    
    /**
     * Trigger a DAG Run
     *
     * 
     */
    @Test
    public void createDagRunTest() {
        String dagId = null;
        String dagRunId = null;
        DAGRun daGRun = null;
        // DAGRun response = api.createDagRun(dagId, dagRunId, daGRun);

        // TODO: test validations
    }

    
    /**
     * Delete a DAG Run
     *
     * 
     */
    @Test
    public void deleteDagRunTest() {
        String dagId = null;
        String dagRunId = null;
        // api.deleteDagRun(dagId, dagRunId);

        // TODO: test validations
    }

    
    /**
     * Get a DAG Run
     *
     * 
     */
    @Test
    public void getDagRunTest() {
        String dagId = null;
        String dagRunId = null;
        // DAGRun response = api.getDagRun(dagId, dagRunId);

        // TODO: test validations
    }

    
    /**
     * Get all DAG Runs
     *
     * This endpoint allows specifying &#x60;~&#x60; as the dag_id to retrieve DAG Runs for all DAGs. 
     */
    @Test
    public void getDagRunsTest() {
        String dagId = null;
        Integer limit = null;
        Integer offset = null;
        OffsetDateTime executionDateGte = null;
        OffsetDateTime executionDateLte = null;
        OffsetDateTime startDateGte = null;
        OffsetDateTime startDateLte = null;
        OffsetDateTime endDateGte = null;
        OffsetDateTime endDateLte = null;
        // DAGRunCollection response = api.getDagRuns(dagId, limit, offset, executionDateGte, executionDateLte, startDateGte, startDateLte, endDateGte, endDateLte);

        // TODO: test validations
    }

    /**
     * Get all DAG Runs
     *
     * This endpoint allows specifying &#x60;~&#x60; as the dag_id to retrieve DAG Runs for all DAGs. 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getDagRunsTestQueryMap() {
        String dagId = null;
        DagRunApi.GetDagRunsQueryParams queryParams = new DagRunApi.GetDagRunsQueryParams()
            .limit(null)
            .offset(null)
            .executionDateGte(null)
            .executionDateLte(null)
            .startDateGte(null)
            .startDateLte(null)
            .endDateGte(null)
            .endDateLte(null);
        // DAGRunCollection response = api.getDagRuns(dagId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Get all DAG Runs from aall DAGs.
     *
     * This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits 
     */
    @Test
    public void getDagRunsBatchTest() {
        ListDagRunsForm listDagRunsForm = null;
        // DAGRunCollection response = api.getDagRunsBatch(listDagRunsForm);

        // TODO: test validations
    }

    
    /**
     * Update a DAG Run
     *
     * 
     */
    @Test
    public void updateDagRunTest() {
        String dagId = null;
        String dagRunId = null;
        DAGRun daGRun = null;
        List<String> updateMask = null;
        // DAGRun response = api.updateDagRun(dagId, dagRunId, daGRun, updateMask);

        // TODO: test validations
    }

    /**
     * Update a DAG Run
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void updateDagRunTestQueryMap() {
        String dagId = null;
        String dagRunId = null;
        DAGRun daGRun = null;
        DagRunApi.UpdateDagRunQueryParams queryParams = new DagRunApi.UpdateDagRunQueryParams()
            .updateMask(null);
        // DAGRun response = api.updateDagRun(dagId, dagRunId, daGRun, queryParams);

    // TODO: test validations
    }
    
}
