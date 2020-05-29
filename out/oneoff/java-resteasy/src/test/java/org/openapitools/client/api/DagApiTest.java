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

import org.openapitools.client.ApiException;
import org.openapitools.client.model.ClearTaskInstance;
import org.openapitools.client.model.DAG;
import org.openapitools.client.model.DAGCollection;
import org.openapitools.client.model.DAGDetail;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.InlineResponse2001;
import org.openapitools.client.model.Task;
import org.openapitools.client.model.TaskCollection;
import org.openapitools.client.model.TaskInstanceReferenceCollection;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DagApi
 */
public class DagApiTest {

    private final DagApi api = new DagApi();

    /**
     * Clears a set of task instances associated with the DAG for a specified date range.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clearTaskInstanceTest() throws ApiException {
        //
        //String dagId = null;
        //
        //ClearTaskInstance clearTaskInstance = null;
        //
        //TaskInstanceReferenceCollection response = api.clearTaskInstance(dagId, clearTaskInstance);

        // TODO: test validations
    }
    /**
     * Get basic information about a DAG
     *
     * Presents only information available in database (DAGModel). If you need detailed information, consider using GET /dags/{dag_id}/detail. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDagTest() throws ApiException {
        //
        //String dagId = null;
        //
        //DAG response = api.getDag(dagId);

        // TODO: test validations
    }
    /**
     * Get a simplified representation of DAG.
     *
     * The response contains many DAG attributes, so the response can be large. If possible, consider using GET /dags/{dag_id}. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDagDetailTest() throws ApiException {
        //
        //String dagId = null;
        //
        //DAGDetail response = api.getDagDetail(dagId);

        // TODO: test validations
    }
    /**
     * Get source code using file token
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDagSourceTest() throws ApiException {
        //
        //String fileToken = null;
        //
        //InlineResponse2001 response = api.getDagSource(fileToken);

        // TODO: test validations
    }
    /**
     * Get all DAGs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDagsTest() throws ApiException {
        //
        //Integer limit = null;
        //
        //Integer offset = null;
        //
        //DAGCollection response = api.getDags(limit, offset);

        // TODO: test validations
    }
    /**
     * Get simplified representation of a task.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTaskTest() throws ApiException {
        //
        //String dagId = null;
        //
        //String taskId = null;
        //
        //Task response = api.getTask(dagId, taskId);

        // TODO: test validations
    }
    /**
     * Get tasks for DAG
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTasksTest() throws ApiException {
        //
        //String dagId = null;
        //
        //TaskCollection response = api.getTasks(dagId);

        // TODO: test validations
    }
    /**
     * Update a DAG
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDagTest() throws ApiException {
        //
        //String dagId = null;
        //
        //DAG DAG = null;
        //
        //DAG response = api.updateDag(dagId, DAG);

        // TODO: test validations
    }
}
