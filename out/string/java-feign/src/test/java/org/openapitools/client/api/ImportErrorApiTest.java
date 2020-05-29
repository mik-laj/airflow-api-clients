package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.ImportError;
import org.openapitools.client.model.ImportErrorCollection;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ImportErrorApi
 */
public class ImportErrorApiTest {

    private ImportErrorApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ImportErrorApi.class);
    }

    
    /**
     * Delete an import error
     *
     * 
     */
    @Test
    public void deleteImportErrorTest() {
        Integer importErrorId = null;
        // api.deleteImportError(importErrorId);

        // TODO: test validations
    }

    
    /**
     * Get an import error
     *
     * 
     */
    @Test
    public void getImportErrorTest() {
        Integer importErrorId = null;
        // ImportError response = api.getImportError(importErrorId);

        // TODO: test validations
    }

    
    /**
     * Get all import errors
     *
     * 
     */
    @Test
    public void getImportErrorsTest() {
        Integer limit = null;
        Integer offset = null;
        // ImportErrorCollection response = api.getImportErrors(limit, offset);

        // TODO: test validations
    }

    /**
     * Get all import errors
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getImportErrorsTestQueryMap() {
        ImportErrorApi.GetImportErrorsQueryParams queryParams = new ImportErrorApi.GetImportErrorsQueryParams()
            .limit(null)
            .offset(null);
        // ImportErrorCollection response = api.getImportErrors(queryParams);

    // TODO: test validations
    }
    
}
