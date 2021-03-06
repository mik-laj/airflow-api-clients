/*
 * Airflow API (Stable)
 * Apache Airflow management API.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: dev@airflow.apache.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.model.DAGRun;
import org.openapitools.client.model.DAGRunCollection;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.ListDagRunsForm;
import java.time.OffsetDateTime;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DagRunApi
 */
@Ignore
public class DagRunApiTest {

    private final DagRunApi api = new DagRunApi();

    
    /**
     * Trigger a DAG Run
     *
     * 
     */
    @Test
    public void createDagRunTest()  {
        String dagId = null;
        String dagRunId = null;
        DAGRun daGRun = null;
        DAGRun response = api.createDagRun(dagId, dagRunId, daGRun).block();

        // TODO: test validations
    }
    
    /**
     * Delete a DAG Run
     *
     * 
     */
    @Test
    public void deleteDagRunTest()  {
        String dagId = null;
        String dagRunId = null;
        api.deleteDagRun(dagId, dagRunId).block();

        // TODO: test validations
    }
    
    /**
     * Get a DAG Run
     *
     * 
     */
    @Test
    public void getDagRunTest()  {
        String dagId = null;
        String dagRunId = null;
        DAGRun response = api.getDagRun(dagId, dagRunId).block();

        // TODO: test validations
    }
    
    /**
     * Get all DAG Runs
     *
     * This endpoint allows specifying &#x60;~&#x60; as the dag_id to retrieve DAG Runs for all DAGs. 
     */
    @Test
    public void getDagRunsTest()  {
        String dagId = null;
        Integer limit = null;
        Integer offset = null;
        OffsetDateTime executionDateGte = null;
        OffsetDateTime executionDateLte = null;
        OffsetDateTime startDateGte = null;
        OffsetDateTime startDateLte = null;
        OffsetDateTime endDateGte = null;
        OffsetDateTime endDateLte = null;
        DAGRunCollection response = api.getDagRuns(dagId, limit, offset, executionDateGte, executionDateLte, startDateGte, startDateLte, endDateGte, endDateLte).block();

        // TODO: test validations
    }
    
    /**
     * Get all DAG Runs from aall DAGs.
     *
     * This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits 
     */
    @Test
    public void getDagRunsBatchTest()  {
        ListDagRunsForm listDagRunsForm = null;
        DAGRunCollection response = api.getDagRunsBatch(listDagRunsForm).block();

        // TODO: test validations
    }
    
    /**
     * Update a DAG Run
     *
     * 
     */
    @Test
    public void updateDagRunTest()  {
        String dagId = null;
        String dagRunId = null;
        DAGRun daGRun = null;
        List<String> updateMask = null;
        DAGRun response = api.updateDagRun(dagId, dagRunId, daGRun, updateMask).block();

        // TODO: test validations
    }
    
}
