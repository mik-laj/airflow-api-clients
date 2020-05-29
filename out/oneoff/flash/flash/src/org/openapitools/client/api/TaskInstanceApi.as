package org.openapitools.client.api {

import org.openapitools.common.ApiInvoker;
import org.openapitools.exception.ApiErrorCodes;
import org.openapitools.exception.ApiError;
import org.openapitools.common.ApiUserCredentials;
import org.openapitools.event.Response;
import org.openapitools.common.OpenApi;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.ExtraLinkCollection;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.ListTaskInstanceForm;
import org.openapitools.client.model.TaskInstance;
import org.openapitools.client.model.TaskInstanceCollection;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class TaskInstanceApi extends OpenApi {
    /**
    * Constructor for the TaskInstanceApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function TaskInstanceApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_get_extra_links: String = "get_extra_links";
        public static const event_get_logs: String = "get_logs";
        public static const event_get_task_instance: String = "get_task_instance";
        public static const event_get_task_instances: String = "get_task_instances";
        public static const event_get_task_instances_batch: String = "get_task_instances_batch";


    /*
     * Returns ExtraLinkCollection 
     */
    public function get_extra_links (dagId: String, dagRunId: String, taskId: String): String {
        // create path and map variables
        var path: String = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/links".replace(/{format}/g,"xml").replace("{" + "dag_id" + "}", getApiInvoker().escapeString(dagId)).replace("{" + "dag_run_id" + "}", getApiInvoker().escapeString(dagRunId)).replace("{" + "task_id" + "}", getApiInvoker().escapeString(taskId));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_extra_links";

        token.returnType = ExtraLinkCollection;
        return requestId;

    }

    /*
     * Returns InlineResponse200 
     */
    public function get_logs (dagId: String, dagRunId: String, taskId: String, taskTryNumber: Number, fullContent: Boolean, token: String): String {
        // create path and map variables
        var path: String = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/logs/{task_try_number}".replace(/{format}/g,"xml").replace("{" + "dag_id" + "}", getApiInvoker().escapeString(dagId)).replace("{" + "dag_run_id" + "}", getApiInvoker().escapeString(dagRunId)).replace("{" + "task_id" + "}", getApiInvoker().escapeString(taskId)).replace("{" + "task_try_number" + "}", getApiInvoker().escapeString(taskTryNumber));

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

        if("null" != String(fullContent))
            queryParams["full_content"] = toPathValue(fullContent);
if("null" != String(token))
            queryParams["token"] = toPathValue(token);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_logs";

        token.returnType = InlineResponse200;
        return requestId;

    }

    /*
     * Returns TaskInstance 
     */
    public function get_task_instance (dagId: String, dagRunId: String, taskId: String): String {
        // create path and map variables
        var path: String = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}".replace(/{format}/g,"xml").replace("{" + "dag_id" + "}", getApiInvoker().escapeString(dagId)).replace("{" + "dag_run_id" + "}", getApiInvoker().escapeString(dagRunId)).replace("{" + "task_id" + "}", getApiInvoker().escapeString(taskId));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_task_instance";

        token.returnType = TaskInstance;
        return requestId;

    }

    /*
     * Returns TaskInstanceCollection 
     */
    public function get_task_instances (dagId: String, dagRunId: String, executionDateGte: Date, executionDateLte: Date, startDateGte: Date, startDateLte: Date, endDateGte: Date, endDateLte: Date, durationGte: Number, durationLte: Number, state: Array, pool: Array, queue: Array, limit: Number, offset: Number): String {
        // create path and map variables
        var path: String = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances".replace(/{format}/g,"xml").replace("{" + "dag_id" + "}", getApiInvoker().escapeString(dagId)).replace("{" + "dag_run_id" + "}", getApiInvoker().escapeString(dagRunId));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
        if(        // verify required params are set
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

        if("null" != String(executionDateGte))
            queryParams["execution_date_gte"] = toPathValue(executionDateGte);
if("null" != String(executionDateLte))
            queryParams["execution_date_lte"] = toPathValue(executionDateLte);
if("null" != String(startDateGte))
            queryParams["start_date_gte"] = toPathValue(startDateGte);
if("null" != String(startDateLte))
            queryParams["start_date_lte"] = toPathValue(startDateLte);
if("null" != String(endDateGte))
            queryParams["end_date_gte"] = toPathValue(endDateGte);
if("null" != String(endDateLte))
            queryParams["end_date_lte"] = toPathValue(endDateLte);
if("null" != String(durationGte))
            queryParams["duration_gte"] = toPathValue(durationGte);
if("null" != String(durationLte))
            queryParams["duration_lte"] = toPathValue(durationLte);
if("null" != String(state))
            queryParams["state"] = toPathValue(state);
if("null" != String(pool))
            queryParams["pool"] = toPathValue(pool);
if("null" != String(queue))
            queryParams["Queue"] = toPathValue(queue);
if("null" != String(limit))
            queryParams["limit"] = toPathValue(limit);
if("null" != String(offset))
            queryParams["offset"] = toPathValue(offset);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_task_instances";

        token.returnType = TaskInstanceCollection;
        return requestId;

    }

    /*
     * Returns TaskInstanceCollection 
     */
    public function get_task_instances_batch (listTaskInstanceForm: ListTaskInstanceForm): String {
        // create path and map variables
        var path: String = "/dags/~/dagRuns/~/taskInstances/list".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, listTaskInstanceForm, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_task_instances_batch";

        token.returnType = TaskInstanceCollection;
        return requestId;

    }
}
}
