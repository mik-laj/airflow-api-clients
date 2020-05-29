package org.openapitools.client.api {

import org.openapitools.common.ApiInvoker;
import org.openapitools.exception.ApiErrorCodes;
import org.openapitools.exception.ApiError;
import org.openapitools.common.ApiUserCredentials;
import org.openapitools.event.Response;
import org.openapitools.common.OpenApi;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.ImportError;
import org.openapitools.client.model.ImportErrorCollection;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class ImportErrorApi extends OpenApi {
    /**
    * Constructor for the ImportErrorApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function ImportErrorApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_delete_import_error: String = "delete_import_error";
        public static const event_get_import_error: String = "get_import_error";
        public static const event_get_import_errors: String = "get_import_errors";


    /*
     * Returns void 
     */
    public function delete_import_error (importErrorId: Number): String {
        // create path and map variables
        var path: String = "/importErrors/{import_error_id}".replace(/{format}/g,"xml").replace("{" + "import_error_id" + "}", getApiInvoker().escapeString(importErrorId));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "DELETE", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "delete_import_error";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns ImportError 
     */
    public function get_import_error (importErrorId: Number): String {
        // create path and map variables
        var path: String = "/importErrors/{import_error_id}".replace(/{format}/g,"xml").replace("{" + "import_error_id" + "}", getApiInvoker().escapeString(importErrorId));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_import_error";

        token.returnType = ImportError;
        return requestId;

    }

    /*
     * Returns ImportErrorCollection 
     */
    public function get_import_errors (limit: Number, offset: Number): String {
        // create path and map variables
        var path: String = "/importErrors".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }

        if("null" != String(limit))
            queryParams["limit"] = toPathValue(limit);
if("null" != String(offset))
            queryParams["offset"] = toPathValue(offset);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_import_errors";

        token.returnType = ImportErrorCollection;
        return requestId;

    }
}
}
