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

import org.openapitools.client.model.Error;
import org.openapitools.client.model.Variable;
import org.openapitools.client.model.VariableCollection;
import org.openapitools.client.ApiClient;
import org.openapitools.client.api.VariableApi;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;
import static io.restassured.config.RestAssuredConfig.config;
import static org.openapitools.client.GsonObjectMapper.gson;

/**
 * API tests for VariableApi
 */
@Ignore
public class VariableApiTest {

    private VariableApi api;

    @Before
    public void createApi() {
        api = ApiClient.api(ApiClient.Config.apiConfig().reqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())))
                        .addFilter(new ErrorLoggingFilter())
                        .setBaseUri("http://localhost/api/v1"))).variable();
    }

    /**
     * Successful response.
     */
    @Test
    public void shouldSee200AfterCreateVariable() {
        Variable variable = null;
        api.createVariable()
                .body(variable).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Client specified an invalid argument.
     */
    @Test
    public void shouldSee400AfterCreateVariable() {
        Variable variable = null;
        api.createVariable()
                .body(variable).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Request not authenticated due to missing, invalid, authentication info.
     */
    @Test
    public void shouldSee401AfterCreateVariable() {
        Variable variable = null;
        api.createVariable()
                .body(variable).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Client does not have sufficient permission.
     */
    @Test
    public void shouldSee403AfterCreateVariable() {
        Variable variable = null;
        api.createVariable()
                .body(variable).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * No content.
     */
    @Test
    public void shouldSee204AfterDeleteVariable() {
        String variableKey = null;
        api.deleteVariable()
                .variableKeyPath(variableKey).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Client specified an invalid argument.
     */
    @Test
    public void shouldSee400AfterDeleteVariable() {
        String variableKey = null;
        api.deleteVariable()
                .variableKeyPath(variableKey).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Request not authenticated due to missing, invalid, authentication info.
     */
    @Test
    public void shouldSee401AfterDeleteVariable() {
        String variableKey = null;
        api.deleteVariable()
                .variableKeyPath(variableKey).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Client does not have sufficient permission.
     */
    @Test
    public void shouldSee403AfterDeleteVariable() {
        String variableKey = null;
        api.deleteVariable()
                .variableKeyPath(variableKey).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Successful response.
     */
    @Test
    public void shouldSee200AfterGetVariable() {
        String variableKey = null;
        api.getVariable()
                .variableKeyPath(variableKey).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Request not authenticated due to missing, invalid, authentication info.
     */
    @Test
    public void shouldSee401AfterGetVariable() {
        String variableKey = null;
        api.getVariable()
                .variableKeyPath(variableKey).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Client does not have sufficient permission.
     */
    @Test
    public void shouldSee403AfterGetVariable() {
        String variableKey = null;
        api.getVariable()
                .variableKeyPath(variableKey).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * A specified resource is not found.
     */
    @Test
    public void shouldSee404AfterGetVariable() {
        String variableKey = null;
        api.getVariable()
                .variableKeyPath(variableKey).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * List of variables.
     */
    @Test
    public void shouldSee200AfterGetVariables() {
        Integer limit = null;
        Integer offset = null;
        api.getVariables().execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Request not authenticated due to missing, invalid, authentication info.
     */
    @Test
    public void shouldSee401AfterGetVariables() {
        Integer limit = null;
        Integer offset = null;
        api.getVariables().execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Client does not have sufficient permission.
     */
    @Test
    public void shouldSee403AfterGetVariables() {
        Integer limit = null;
        Integer offset = null;
        api.getVariables().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Successful response.
     */
    @Test
    public void shouldSee200AfterUpdateVariable() {
        String variableKey = null;
        Variable variable = null;
        List<String> updateMask = null;
        api.updateVariable()
                .variableKeyPath(variableKey)
                .body(variable).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Client specified an invalid argument.
     */
    @Test
    public void shouldSee400AfterUpdateVariable() {
        String variableKey = null;
        Variable variable = null;
        List<String> updateMask = null;
        api.updateVariable()
                .variableKeyPath(variableKey)
                .body(variable).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Request not authenticated due to missing, invalid, authentication info.
     */
    @Test
    public void shouldSee401AfterUpdateVariable() {
        String variableKey = null;
        Variable variable = null;
        List<String> updateMask = null;
        api.updateVariable()
                .variableKeyPath(variableKey)
                .body(variable).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Client does not have sufficient permission.
     */
    @Test
    public void shouldSee403AfterUpdateVariable() {
        String variableKey = null;
        Variable variable = null;
        List<String> updateMask = null;
        api.updateVariable()
                .variableKeyPath(variableKey)
                .body(variable).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * A specified resource is not found.
     */
    @Test
    public void shouldSee404AfterUpdateVariable() {
        String variableKey = null;
        Variable variable = null;
        List<String> updateMask = null;
        api.updateVariable()
                .variableKeyPath(variableKey)
                .body(variable).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

}