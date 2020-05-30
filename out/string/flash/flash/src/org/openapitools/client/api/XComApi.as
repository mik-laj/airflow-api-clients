package org.openapitools.client.api {

import org.openapitools.common.ApiInvoker;
import org.openapitools.exception.ApiErrorCodes;
import org.openapitools.exception.ApiError;
import org.openapitools.common.ApiUserCredentials;
import org.openapitools.event.Response;
import org.openapitools.common.OpenApi;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.XCom;
import org.openapitools.client.model.XComCollection;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class XComApi extends OpenApi {
    /**
    * Constructor for the XComApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function XComApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_delete_x_com_value: String = "delete_x_com_value";
        public static const event_get_x_com_entry: String = "get_x_com_entry";
        public static const event_get_x_com_value: String = "get_x_com_value";
        public static const event_update_x_com_entry: String = "update_x_com_entry";
        public static const event_update_x_com_value: String = "update_x_com_value";


    /*
     * Returns void 
     */
    public function delete_x_com_value (dagId: String, dagRunId: String, taskId: String, xcomKey: String): String {
        // create path and map variables
        var path: String = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}".replace(/{format}/g,"xml").replace("{" + "dag_id" + "}", getApiInvoker().escapeString(dagId)).replace("{" + "dag_run_id" + "}", getApiInvoker().escapeString(dagRunId)).replace("{" + "task_id" + "}", getApiInvoker().escapeString(taskId)).replace("{" + "xcom_key" + "}", getApiInvoker().escapeString(xcomKey));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
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
) {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "DELETE", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "delete_x_com_value";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns XComCollection 
     */
    public function get_x_com_entry (dagId: String, dagRunId: String, taskId: String, limit: Number, offset: Number): String {
        // create path and map variables
        var path: String = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries".replace(/{format}/g,"xml").replace("{" + "dag_id" + "}", getApiInvoker().escapeString(dagId)).replace("{" + "dag_run_id" + "}", getApiInvoker().escapeString(dagRunId)).replace("{" + "task_id" + "}", getApiInvoker().escapeString(taskId));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
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
) {
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
        token.completionEventType = "get_x_com_entry";

        token.returnType = XComCollection;
        return requestId;

    }

    /*
     * Returns XCom 
     */
    public function get_x_com_value (dagId: String, dagRunId: String, taskId: String, xcomKey: String): String {
        // create path and map variables
        var path: String = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}".replace(/{format}/g,"xml").replace("{" + "dag_id" + "}", getApiInvoker().escapeString(dagId)).replace("{" + "dag_run_id" + "}", getApiInvoker().escapeString(dagRunId)).replace("{" + "task_id" + "}", getApiInvoker().escapeString(taskId)).replace("{" + "xcom_key" + "}", getApiInvoker().escapeString(xcomKey));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
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
) {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_x_com_value";

        token.returnType = XCom;
        return requestId;

    }

    /*
     * Returns XCom 
     */
    public function update_x_com_entry (dagId: String, dagRunId: String, taskId: String, xCom: XCom): String {
        // create path and map variables
        var path: String = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries".replace(/{format}/g,"xml").replace("{" + "dag_id" + "}", getApiInvoker().escapeString(dagId)).replace("{" + "dag_run_id" + "}", getApiInvoker().escapeString(dagRunId)).replace("{" + "task_id" + "}", getApiInvoker().escapeString(taskId));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
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
) {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, xCom, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "update_x_com_entry";

        token.returnType = XCom;
        return requestId;

    }

    /*
     * Returns XCom 
     */
    public function update_x_com_value (dagId: String, dagRunId: String, taskId: String, xcomKey: String, xCom: XCom, updateMask: Array): String {
        // create path and map variables
        var path: String = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}".replace(/{format}/g,"xml").replace("{" + "dag_id" + "}", getApiInvoker().escapeString(dagId)).replace("{" + "dag_run_id" + "}", getApiInvoker().escapeString(dagRunId)).replace("{" + "task_id" + "}", getApiInvoker().escapeString(taskId)).replace("{" + "xcom_key" + "}", getApiInvoker().escapeString(xcomKey));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
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
) {
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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PATCH", queryParams, xCom, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "update_x_com_value";

        token.returnType = XCom;
        return requestId;

    }
}
}
