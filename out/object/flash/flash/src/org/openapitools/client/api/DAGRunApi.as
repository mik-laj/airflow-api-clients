package org.openapitools.client.api {

import org.openapitools.common.ApiInvoker;
import org.openapitools.exception.ApiErrorCodes;
import org.openapitools.exception.ApiError;
import org.openapitools.common.ApiUserCredentials;
import org.openapitools.event.Response;
import org.openapitools.common.OpenApi;
import org.openapitools.client.model.DAGRun;
import org.openapitools.client.model.DAGRunCollection;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.ListDagRunsForm;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class DAGRunApi extends OpenApi {
    /**
    * Constructor for the DAGRunApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function DAGRunApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_create_dag_run: String = "create_dag_run";
        public static const event_delete_dag_run: String = "delete_dag_run";
        public static const event_get_dag_run: String = "get_dag_run";
        public static const event_get_dag_runs: String = "get_dag_runs";
        public static const event_get_dag_runs_batch: String = "get_dag_runs_batch";
        public static const event_update_dag_run: String = "update_dag_run";


    /*
     * Returns DAGRun 
     */
    public function create_dag_run (dagId: String, dagRunId: String, dAGRun: DAGRun): String {
        // create path and map variables
        var path: String = "/dags/{dag_id}/dagRuns/{dag_run_id}".replace(/{format}/g,"xml").replace("{" + "dag_id" + "}", getApiInvoker().escapeString(dagId)).replace("{" + "dag_run_id" + "}", getApiInvoker().escapeString(dagRunId));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, dAGRun, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "create_dag_run";

        token.returnType = DAGRun;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function delete_dag_run (dagId: String, dagRunId: String): String {
        // create path and map variables
        var path: String = "/dags/{dag_id}/dagRuns/{dag_run_id}".replace(/{format}/g,"xml").replace("{" + "dag_id" + "}", getApiInvoker().escapeString(dagId)).replace("{" + "dag_run_id" + "}", getApiInvoker().escapeString(dagRunId));

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

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "DELETE", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "delete_dag_run";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns DAGRun 
     */
    public function get_dag_run (dagId: String, dagRunId: String): String {
        // create path and map variables
        var path: String = "/dags/{dag_id}/dagRuns/{dag_run_id}".replace(/{format}/g,"xml").replace("{" + "dag_id" + "}", getApiInvoker().escapeString(dagId)).replace("{" + "dag_run_id" + "}", getApiInvoker().escapeString(dagRunId));

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
        token.completionEventType = "get_dag_run";

        token.returnType = DAGRun;
        return requestId;

    }

    /*
     * Returns DAGRunCollection 
     */
    public function get_dag_runs (dagId: String, limit: Number, offset: Number, executionDateGte: Date, executionDateLte: Date, startDateGte: Date, startDateLte: Date, endDateGte: Date, endDateLte: Date): String {
        // create path and map variables
        var path: String = "/dags/{dag_id}/dagRuns".replace(/{format}/g,"xml").replace("{" + "dag_id" + "}", getApiInvoker().escapeString(dagId));

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

        if("null" != String(limit))
            queryParams["limit"] = toPathValue(limit);
if("null" != String(offset))
            queryParams["offset"] = toPathValue(offset);
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

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_dag_runs";

        token.returnType = DAGRunCollection;
        return requestId;

    }

    /*
     * Returns DAGRunCollection 
     */
    public function get_dag_runs_batch (listDagRunsForm: ListDagRunsForm): String {
        // create path and map variables
        var path: String = "/dags/~/dagRuns/list".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, listDagRunsForm, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_dag_runs_batch";

        token.returnType = DAGRunCollection;
        return requestId;

    }

    /*
     * Returns DAGRun 
     */
    public function update_dag_run (dagId: String, dagRunId: String, dAGRun: DAGRun, updateMask: Array): String {
        // create path and map variables
        var path: String = "/dags/{dag_id}/dagRuns/{dag_run_id}".replace(/{format}/g,"xml").replace("{" + "dag_id" + "}", getApiInvoker().escapeString(dagId)).replace("{" + "dag_run_id" + "}", getApiInvoker().escapeString(dagRunId));

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

        if("null" != String(updateMask))
            queryParams["update_mask"] = toPathValue(updateMask);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "PATCH", queryParams, dAGRun, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "update_dag_run";

        token.returnType = DAGRun;
        return requestId;

    }
}
}
