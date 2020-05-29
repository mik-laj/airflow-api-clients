package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.Variable;
import org.openapitools.client.model.VariableCollection;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VariableApi
 */
public class VariableApiTest {

    private VariableApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(VariableApi.class);
    }

    
    /**
     * Create a variable
     *
     * 
     */
    @Test
    public void createVariableTest() {
        Variable variable = null;
        // Variable response = api.createVariable(variable);

        // TODO: test validations
    }

    
    /**
     * Delete variable
     *
     * 
     */
    @Test
    public void deleteVariableTest() {
        String variableKey = null;
        // api.deleteVariable(variableKey);

        // TODO: test validations
    }

    
    /**
     * Get a variable by key
     *
     * 
     */
    @Test
    public void getVariableTest() {
        String variableKey = null;
        // Variable response = api.getVariable(variableKey);

        // TODO: test validations
    }

    
    /**
     * Get all variables
     *
     * The collection does not contain data. To get data, you must get a single entity.
     */
    @Test
    public void getVariablesTest() {
        Integer limit = null;
        Integer offset = null;
        // VariableCollection response = api.getVariables(limit, offset);

        // TODO: test validations
    }

    /**
     * Get all variables
     *
     * The collection does not contain data. To get data, you must get a single entity.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getVariablesTestQueryMap() {
        VariableApi.GetVariablesQueryParams queryParams = new VariableApi.GetVariablesQueryParams()
            .limit(null)
            .offset(null);
        // VariableCollection response = api.getVariables(queryParams);

    // TODO: test validations
    }
    
    /**
     * Update a variable by key
     *
     * 
     */
    @Test
    public void updateVariableTest() {
        String variableKey = null;
        Variable variable = null;
        List<String> updateMask = null;
        // Variable response = api.updateVariable(variableKey, variable, updateMask);

        // TODO: test validations
    }

    /**
     * Update a variable by key
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void updateVariableTestQueryMap() {
        String variableKey = null;
        Variable variable = null;
        VariableApi.UpdateVariableQueryParams queryParams = new VariableApi.UpdateVariableQueryParams()
            .updateMask(null);
        // Variable response = api.updateVariable(variableKey, variable, queryParams);

    // TODO: test validations
    }
    
}
