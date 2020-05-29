package org.openapitools.client.api {

import org.openapitools.common.ApiInvoker;
import org.openapitools.exception.ApiErrorCodes;
import org.openapitools.exception.ApiError;
import org.openapitools.common.ApiUserCredentials;
import org.openapitools.event.Response;
import org.openapitools.common.OpenApi;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.Variable;
import org.openapitools.client.model.VariableCollection;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class VariableApi extends OpenApi {
    /**
    * Constructor for the VariableApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function VariableApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_create_variable: String = "create_variable";
        public static const event_delete_variable: String = "delete_variable";
        public static const event_get_variable: String = "get_variable";
        public static const event_get_variables: String = "get_variables";
        public static const event_update_variable: String = "update_variable";


    /*
     * Returns Variable 
     */
    public function create_variable (variable: Variable): String {
        // create path and map variables
        var path: String = "/variables".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, variable, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "create_variable";

        token.returnType = Variable;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function delete_variable (variableKey: String): String {
        // create path and map variables
        var path: String = "/variables/{variable_key}".replace(/{format}/g,"xml").replace("{" + "variable_key" + "}", getApiInvoker().escapeString(variableKey));

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
        token.completionEventType = "delete_variable";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns Variable 
     */
    public function get_variable (variableKey: String): String {
        // create path and map variables
        var path: String = "/variables/{variable_key}".replace(/{format}/g,"xml").replace("{" + "variable_key" + "}", getApiInvoker().escapeString(variableKey));

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
        token.completionEventType = "get_variable";

        token.returnType = Variable;
        return requestId;

    }

    /*
     * Returns VariableCollection 
     */
    public function get_variables (limit: Number, offset: Number): String {
        // create path and map variables
        var path: String = "/variables".replace(/{format}/g,"xml");

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
        token.completionEventType = "get_variables";

        token.returnType = VariableCollection;
        return requestId;

    }

    /*
     * Returns Variable 
     */
    public function update_variable (variableKey: String, variable: Variable, updateMask: Array): String {
        // create path and map variables
        var path: String = "/variables/{variable_key}".replace(/{format}/g,"xml").replace("{" + "variable_key" + "}", getApiInvoker().escapeString(variableKey));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }

        if("null" != String(updateMask))
            queryParams["update_mask"] = toPathValue(updateMask);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PATCH", queryParams, variable, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "update_variable";

        token.returnType = Variable;
        return requestId;

    }
}
}
