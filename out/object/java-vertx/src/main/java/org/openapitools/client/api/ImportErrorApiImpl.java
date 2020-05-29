package org.openapitools.client.api;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.ImportError;
import org.openapitools.client.model.ImportErrorCollection;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.MultiMap;
import io.vertx.core.json.JsonObject;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.*;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:06:30.200Z[GMT]")
public class ImportErrorApiImpl implements ImportErrorApi {

    private ApiClient apiClient;

    public ImportErrorApiImpl() {
        this(null);
    }

    public ImportErrorApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient != null ? apiClient : Configuration.getDefaultApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete an import error
     * 
     * @param importErrorId The Import Error ID. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void deleteImportError(Integer importErrorId, Handler<AsyncResult<Void>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'importErrorId' is set
        if (importErrorId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'importErrorId' when calling deleteImportError"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/importErrors/{import_error_id}".replaceAll("\\{" + "import_error_id" + "\\}", importErrorId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] {  };

        apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, null, resultHandler);
    }
    /**
     * Get an import error
     * 
     * @param importErrorId The Import Error ID. (required)
     * @param resultHandler Asynchronous result handler
     */
    public void getImportError(Integer importErrorId, Handler<AsyncResult<ImportError>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'importErrorId' is set
        if (importErrorId == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'importErrorId' when calling getImportError"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/importErrors/{import_error_id}".replaceAll("\\{" + "import_error_id" + "\\}", importErrorId.toString());

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] {  };
        TypeReference<ImportError> localVarReturnType = new TypeReference<ImportError>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Get all import errors
     * 
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void getImportErrors(Integer limit, Integer offset, Handler<AsyncResult<ImportErrorCollection>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/importErrors";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // cookie params
        MultiMap localVarCookieParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] {  };
        TypeReference<ImportErrorCollection> localVarReturnType = new TypeReference<ImportErrorCollection>() {};
        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
}
