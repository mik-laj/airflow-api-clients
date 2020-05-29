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

import org.openapitools.client.model.Connection;
import org.openapitools.client.model.ConnectionCollection;
import org.openapitools.client.model.Error;

import org.openapitools.client.Configuration;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.runner.RunWith;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;
import io.vertx.core.Vertx;
import io.vertx.ext.unit.junit.VertxUnitRunner;
import io.vertx.ext.unit.junit.RunTestOnContext;
import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.Async;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConnectionApi
 */
@RunWith(VertxUnitRunner.class)
@Ignore
public class ConnectionApiTest {

    private ConnectionApi api;

    @Rule
    public RunTestOnContext rule = new RunTestOnContext();

    @BeforeClass
    public void setupApiClient() {
        JsonObject config = new JsonObject();
        Vertx vertx = rule.vertx();
        Configuration.setupDefaultApiClient(vertx, config);

        api = new ConnectionApiImpl();
    }
    
    /**
     * Create connection entry
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void createConnectionTest(TestContext context) {
        Async async = context.async();
        Connection connection = null;
        api.createConnection(connection, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Delete a connection entry
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void deleteConnectionTest(TestContext context) {
        Async async = context.async();
        Integer connectionId = null;
        api.deleteConnection(connectionId, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Get a connection entry
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void getConnectionTest(TestContext context) {
        Async async = context.async();
        Integer connectionId = null;
        api.getConnection(connectionId, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Get all connection entries
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void getConnectionsTest(TestContext context) {
        Async async = context.async();
        Integer limit = null;
        Integer offset = null;
        api.getConnections(limit, offset, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
    /**
     * Update a connection entry
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void updateConnectionTest(TestContext context) {
        Async async = context.async();
        Integer connectionId = null;
        Connection connection = null;
        List<String> updateMask = null;
        api.updateConnection(connectionId, connection, updateMask, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    
}
