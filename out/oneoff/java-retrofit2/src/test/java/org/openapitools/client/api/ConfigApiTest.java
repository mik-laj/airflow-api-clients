package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.Config;
import org.openapitools.client.model.Error;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConfigApi
 */
public class ConfigApiTest {

    private ConfigApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ConfigApi.class);
    }

    /**
     * Get current configuration
     *
     * 
     */
    @Test
    public void getConfigTest() {
        Integer limit = null;
        Integer offset = null;
        // Config response = api.getConfig(limit, offset);

        // TODO: test validations
    }
}
