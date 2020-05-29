package org.openapitools.client.api {

import org.openapitools.common.ApiInvoker;
import org.openapitools.exception.ApiErrorCodes;
import org.openapitools.exception.ApiError;
import org.openapitools.common.ApiUserCredentials;
import org.openapitools.event.Response;
import org.openapitools.common.OpenApi;
import org.openapitools.client.model.Connection;
import org.openapitools.client.model.ConnectionCollection;
import org.openapitools.client.model.Error;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class ConnectionApi extends OpenApi {
    /**
    * Constructor for the ConnectionApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function ConnectionApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_create_connection: String = "create_connection";
        public static const event_delete_connection: String = "delete_connection";
        public static const event_get_connection: String = "get_connection";
        public static const event_get_connections: String = "get_connections";
        public static const event_update_connection: String = "update_connection";


    /*
     * Returns Connection 
     */
    public function create_connection (connection: Connection): String {
        // create path and map variables
        var path: String = "/connections".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, connection, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "create_connection";

        token.returnType = Connection;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function delete_connection (connectionId: Number): String {
        // create path and map variables
        var path: String = "/connections/{connection_id}".replace(/{format}/g,"xml").replace("{" + "connection_id" + "}", getApiInvoker().escapeString(connectionId));

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
        token.completionEventType = "delete_connection";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns Connection 
     */
    public function get_connection (connectionId: Number): String {
        // create path and map variables
        var path: String = "/connections/{connection_id}".replace(/{format}/g,"xml").replace("{" + "connection_id" + "}", getApiInvoker().escapeString(connectionId));

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
        token.completionEventType = "get_connection";

        token.returnType = Connection;
        return requestId;

    }

    /*
     * Returns ConnectionCollection 
     */
    public function get_connections (limit: Number, offset: Number): String {
        // create path and map variables
        var path: String = "/connections".replace(/{format}/g,"xml");

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
        token.completionEventType = "get_connections";

        token.returnType = ConnectionCollection;
        return requestId;

    }

    /*
     * Returns Connection 
     */
    public function update_connection (connectionId: Number, connection: Connection, updateMask: Array): String {
        // create path and map variables
        var path: String = "/connections/{connection_id}".replace(/{format}/g,"xml").replace("{" + "connection_id" + "}", getApiInvoker().escapeString(connectionId));

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PATCH", queryParams, connection, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "update_connection";

        token.returnType = Connection;
        return requestId;

    }
}
}
