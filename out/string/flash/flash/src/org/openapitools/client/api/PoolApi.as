package org.openapitools.client.api {

import org.openapitools.common.ApiInvoker;
import org.openapitools.exception.ApiErrorCodes;
import org.openapitools.exception.ApiError;
import org.openapitools.common.ApiUserCredentials;
import org.openapitools.event.Response;
import org.openapitools.common.OpenApi;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.Pool;
import org.openapitools.client.model.PoolCollection;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class PoolApi extends OpenApi {
    /**
    * Constructor for the PoolApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function PoolApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_create_pool: String = "create_pool";
        public static const event_delete_pool: String = "delete_pool";
        public static const event_get_pool: String = "get_pool";
        public static const event_get_pools: String = "get_pools";
        public static const event_update_pool: String = "update_pool";


    /*
     * Returns Pool 
     */
    public function create_pool (pool: Pool): String {
        // create path and map variables
        var path: String = "/pools".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, pool, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "create_pool";

        token.returnType = Pool;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function delete_pool (poolName: String): String {
        // create path and map variables
        var path: String = "/pools/{pool_name}".replace(/{format}/g,"xml").replace("{" + "pool_name" + "}", getApiInvoker().escapeString(poolName));

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
        token.completionEventType = "delete_pool";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns Pool 
     */
    public function get_pool (poolName: String): String {
        // create path and map variables
        var path: String = "/pools/{pool_name}".replace(/{format}/g,"xml").replace("{" + "pool_name" + "}", getApiInvoker().escapeString(poolName));

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
        token.completionEventType = "get_pool";

        token.returnType = Pool;
        return requestId;

    }

    /*
     * Returns PoolCollection 
     */
    public function get_pools (limit: Number, offset: Number): String {
        // create path and map variables
        var path: String = "/pools".replace(/{format}/g,"xml");

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
        token.completionEventType = "get_pools";

        token.returnType = PoolCollection;
        return requestId;

    }

    /*
     * Returns Pool 
     */
    public function update_pool (poolName: String, pool: Pool, updateMask: Array): String {
        // create path and map variables
        var path: String = "/pools/{pool_name}".replace(/{format}/g,"xml").replace("{" + "pool_name" + "}", getApiInvoker().escapeString(poolName));

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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PATCH", queryParams, pool, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "update_pool";

        token.returnType = Pool;
        return requestId;

    }
}
}
