package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.Pool;
import org.openapitools.client.model.PoolCollection;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PoolApi
 */
public class PoolApiTest {

    private PoolApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PoolApi.class);
    }

    /**
     * Create a pool
     *
     * 
     */
    @Test
    public void createPoolTest() {
        Pool pool = null;
        // Pool response = api.createPool(pool);

        // TODO: test validations
    }
    /**
     * Delete a pool
     *
     * 
     */
    @Test
    public void deletePoolTest() {
        String poolName = null;
        // api.deletePool(poolName);

        // TODO: test validations
    }
    /**
     * Get a pool
     *
     * 
     */
    @Test
    public void getPoolTest() {
        String poolName = null;
        // Pool response = api.getPool(poolName);

        // TODO: test validations
    }
    /**
     * Get all pools
     *
     * 
     */
    @Test
    public void getPoolsTest() {
        Integer limit = null;
        Integer offset = null;
        // PoolCollection response = api.getPools(limit, offset);

        // TODO: test validations
    }
    /**
     * Update a pool
     *
     * 
     */
    @Test
    public void updatePoolTest() {
        String poolName = null;
        Pool pool = null;
        List<String> updateMask = null;
        // Pool response = api.updatePool(poolName, pool, updateMask);

        // TODO: test validations
    }
}
