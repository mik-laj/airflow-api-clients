package org.openapitools.client.api {

import org.openapitools.common.ApiInvoker;
import org.openapitools.exception.ApiErrorCodes;
import org.openapitools.exception.ApiError;
import org.openapitools.common.ApiUserCredentials;
import org.openapitools.event.Response;
import org.openapitools.common.OpenApi;
import org.openapitools.client.model.ClearTaskInstance;
import org.openapitools.client.model.DAG;
import org.openapitools.client.model.DAGCollection;
import org.openapitools.client.model.DAGDetail;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.InlineResponse2001;
import org.openapitools.client.model.Task;
import org.openapitools.client.model.TaskCollection;
import org.openapitools.client.model.TaskInstanceReferenceCollection;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class DAGApi extends OpenApi {
    /**
    * Constructor for the DAGApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function DAGApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_clear_task_instance: String = "clear_task_instance";
        public static const event_get_dag: String = "get_dag";
        public static const event_get_dag_detail: String = "get_dag_detail";
        public static const event_get_dag_source: String = "get_dag_source";
        public static const event_get_dags: String = "get_dags";
        public static const event_get_task: String = "get_task";
        public static const event_get_tasks: String = "get_tasks";
        public static const event_update_dag: String = "update_dag";


    /*
     * Returns TaskInstanceReferenceCollection 
     */
    public function clear_task_instance (dagId: String, clearTaskInstance: ClearTaskInstance): String {
        // create path and map variables
        var path: String = "/dags/{dag_id}/clearTaskInstances".replace(/{format}/g,"xml").replace("{" + "dag_id" + "}", getApiInvoker().escapeString(dagId));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, clearTaskInstance, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "clear_task_instance";

        token.returnType = TaskInstanceReferenceCollection;
        return requestId;

    }

    /*
     * Returns DAG 
     */
    public function get_dag (dagId: String): String {
        // create path and map variables
        var path: String = "/dags/{dag_id}".replace(/{format}/g,"xml").replace("{" + "dag_id" + "}", getApiInvoker().escapeString(dagId));

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
        token.completionEventType = "get_dag";

        token.returnType = DAG;
        return requestId;

    }

    /*
     * Returns DAGDetail 
     */
    public function get_dag_detail (dagId: String): String {
        // create path and map variables
        var path: String = "/dags/{dag_id}/details".replace(/{format}/g,"xml").replace("{" + "dag_id" + "}", getApiInvoker().escapeString(dagId));

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
        token.completionEventType = "get_dag_detail";

        token.returnType = DAGDetail;
        return requestId;

    }

    /*
     * Returns InlineResponse2001 
     */
    public function get_dag_source (fileToken: String): String {
        // create path and map variables
        var path: String = "/dagSources/{file_token}".replace(/{format}/g,"xml").replace("{" + "file_token" + "}", getApiInvoker().escapeString(fileToken));

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
        token.completionEventType = "get_dag_source";

        token.returnType = InlineResponse2001;
        return requestId;

    }

    /*
     * Returns DAGCollection 
     */
    public function get_dags (limit: Number, offset: Number): String {
        // create path and map variables
        var path: String = "/dags".replace(/{format}/g,"xml");

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
        token.completionEventType = "get_dags";

        token.returnType = DAGCollection;
        return requestId;

    }

    /*
     * Returns Task 
     */
    public function get_task (dagId: String, taskId: String): String {
        // create path and map variables
        var path: String = "/dags/{dag_id}/tasks/{task_id}".replace(/{format}/g,"xml").replace("{" + "dag_id" + "}", getApiInvoker().escapeString(dagId)).replace("{" + "task_id" + "}", getApiInvoker().escapeString(taskId));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_task";

        token.returnType = Task;
        return requestId;

    }

    /*
     * Returns TaskCollection 
     */
    public function get_tasks (dagId: String): String {
        // create path and map variables
        var path: String = "/dags/{dag_id}/tasks".replace(/{format}/g,"xml").replace("{" + "dag_id" + "}", getApiInvoker().escapeString(dagId));

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
        token.completionEventType = "get_tasks";

        token.returnType = TaskCollection;
        return requestId;

    }

    /*
     * Returns DAG 
     */
    public function update_dag (dagId: String, dag: DAG): String {
        // create path and map variables
        var path: String = "/dags/{dag_id}".replace(/{format}/g,"xml").replace("{" + "dag_id" + "}", getApiInvoker().escapeString(dagId));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PATCH", queryParams, dag, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "update_dag";

        token.returnType = DAG;
        return requestId;

    }
}
}
