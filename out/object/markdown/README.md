# Documentation for Airflow API (Stable)

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ConfigApi* | [**getConfig**](Apis/ConfigApi.md#getconfig) | **GET** /config | Get current configuration
*ConnectionApi* | [**createConnection**](Apis/ConnectionApi.md#createconnection) | **POST** /connections | Create connection entry
*ConnectionApi* | [**deleteConnection**](Apis/ConnectionApi.md#deleteconnection) | **DELETE** /connections/{connection_id} | Delete a connection entry
*ConnectionApi* | [**getConnection**](Apis/ConnectionApi.md#getconnection) | **GET** /connections/{connection_id} | Get a connection entry
*ConnectionApi* | [**getConnections**](Apis/ConnectionApi.md#getconnections) | **GET** /connections | Get all connection entries
*ConnectionApi* | [**updateConnection**](Apis/ConnectionApi.md#updateconnection) | **PATCH** /connections/{connection_id} | Update a connection entry
*DAGApi* | [**clearTaskInstance**](Apis/DAGApi.md#cleartaskinstance) | **POST** /dags/{dag_id}/clearTaskInstances | Clears a set of task instances associated with the DAG for a specified date range.
*DAGApi* | [**getDag**](Apis/DAGApi.md#getdag) | **GET** /dags/{dag_id} | Get basic information about a DAG
*DAGApi* | [**getDagDetail**](Apis/DAGApi.md#getdagdetail) | **GET** /dags/{dag_id}/details | Get a simplified representation of DAG.
*DAGApi* | [**getDagSource**](Apis/DAGApi.md#getdagsource) | **GET** /dagSources/{file_token} | Get source code using file token
*DAGApi* | [**getDags**](Apis/DAGApi.md#getdags) | **GET** /dags | Get all DAGs
*DAGApi* | [**getTask**](Apis/DAGApi.md#gettask) | **GET** /dags/{dag_id}/tasks/{task_id} | Get simplified representation of a task.
*DAGApi* | [**getTasks**](Apis/DAGApi.md#gettasks) | **GET** /dags/{dag_id}/tasks | Get tasks for DAG
*DAGApi* | [**updateDag**](Apis/DAGApi.md#updatedag) | **PATCH** /dags/{dag_id} | Update a DAG
*DAGRunApi* | [**createDagRun**](Apis/DAGRunApi.md#createdagrun) | **POST** /dags/{dag_id}/dagRuns/{dag_run_id} | Trigger a DAG Run
*DAGRunApi* | [**deleteDagRun**](Apis/DAGRunApi.md#deletedagrun) | **DELETE** /dags/{dag_id}/dagRuns/{dag_run_id} | Delete a DAG Run
*DAGRunApi* | [**getDagRun**](Apis/DAGRunApi.md#getdagrun) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id} | Get a DAG Run
*DAGRunApi* | [**getDagRuns**](Apis/DAGRunApi.md#getdagruns) | **GET** /dags/{dag_id}/dagRuns | Get all DAG Runs
*DAGRunApi* | [**getDagRunsBatch**](Apis/DAGRunApi.md#getdagrunsbatch) | **POST** /dags/~/dagRuns/list | Get all DAG Runs from aall DAGs.
*DAGRunApi* | [**updateDagRun**](Apis/DAGRunApi.md#updatedagrun) | **PATCH** /dags/{dag_id}/dagRuns/{dag_run_id} | Update a DAG Run
*EventLogApi* | [**getEventLog**](Apis/EventLogApi.md#geteventlog) | **GET** /eventLogs | Get all log entries from event log
*EventLogApi* | [**getEventLogEntry**](Apis/EventLogApi.md#geteventlogentry) | **GET** /eventLogs/{event_log_id} | Get a log entry
*ImportErrorApi* | [**deleteImportError**](Apis/ImportErrorApi.md#deleteimporterror) | **DELETE** /importErrors/{import_error_id} | Delete an import error
*ImportErrorApi* | [**getImportError**](Apis/ImportErrorApi.md#getimporterror) | **GET** /importErrors/{import_error_id} | Get an import error
*ImportErrorApi* | [**getImportErrors**](Apis/ImportErrorApi.md#getimporterrors) | **GET** /importErrors | Get all import errors
*PoolApi* | [**createPool**](Apis/PoolApi.md#createpool) | **POST** /pools | Create a pool
*PoolApi* | [**deletePool**](Apis/PoolApi.md#deletepool) | **DELETE** /pools/{pool_name} | Delete a pool
*PoolApi* | [**getPool**](Apis/PoolApi.md#getpool) | **GET** /pools/{pool_name} | Get a pool
*PoolApi* | [**getPools**](Apis/PoolApi.md#getpools) | **GET** /pools | Get all pools
*PoolApi* | [**updatePool**](Apis/PoolApi.md#updatepool) | **PATCH** /pools/{pool_name} | Update a pool
*TaskInstanceApi* | [**getExtraLinks**](Apis/TaskInstanceApi.md#getextralinks) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/links | Get extra links for task instance
*TaskInstanceApi* | [**getLogs**](Apis/TaskInstanceApi.md#getlogs) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/logs/{task_try_number} | Get logs for a task instance
*TaskInstanceApi* | [**getTaskInstance**](Apis/TaskInstanceApi.md#gettaskinstance) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id} | Get a task instance
*TaskInstanceApi* | [**getTaskInstances**](Apis/TaskInstanceApi.md#gettaskinstances) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances | Get a list of task instance of DAG.
*TaskInstanceApi* | [**getTaskInstancesBatch**](Apis/TaskInstanceApi.md#gettaskinstancesbatch) | **POST** /dags/~/dagRuns/~/taskInstances/list | Get list of task instances from all DAGs and DAG Runs.
*VariableApi* | [**createVariable**](Apis/VariableApi.md#createvariable) | **POST** /variables | Create a variable
*VariableApi* | [**deleteVariable**](Apis/VariableApi.md#deletevariable) | **DELETE** /variables/{variable_key} | Delete variable
*VariableApi* | [**getVariable**](Apis/VariableApi.md#getvariable) | **GET** /variables/{variable_key} | Get a variable by key
*VariableApi* | [**getVariables**](Apis/VariableApi.md#getvariables) | **GET** /variables | Get all variables
*VariableApi* | [**updateVariable**](Apis/VariableApi.md#updatevariable) | **PATCH** /variables/{variable_key} | Update a variable by key
*XComApi* | [**deleteXComValue**](Apis/XComApi.md#deletexcomvalue) | **DELETE** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key} | Delete an XCom entry
*XComApi* | [**getXComEntry**](Apis/XComApi.md#getxcomentry) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries | Get all XCom entries
*XComApi* | [**getXComValue**](Apis/XComApi.md#getxcomvalue) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key} | Get an XCom entry
*XComApi* | [**updateXComEntry**](Apis/XComApi.md#updatexcomentry) | **POST** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries | Create an XCom entry
*XComApi* | [**updateXComValue**](Apis/XComApi.md#updatexcomvalue) | **PATCH** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key} | Update an XCom entry


<a name="documentation-for-models"></a>
## Documentation for Models

 - [ClassReference](.//Models/ClassReference.md)
 - [ClearTaskInstance](.//Models/ClearTaskInstance.md)
 - [CollectionInfo](.//Models/CollectionInfo.md)
 - [Config](.//Models/Config.md)
 - [ConfigOption](.//Models/ConfigOption.md)
 - [ConfigSection](.//Models/ConfigSection.md)
 - [Connection](.//Models/Connection.md)
 - [ConnectionAllOf](.//Models/ConnectionAllOf.md)
 - [ConnectionCollection](.//Models/ConnectionCollection.md)
 - [ConnectionCollectionItem](.//Models/ConnectionCollectionItem.md)
 - [CronExpression](.//Models/CronExpression.md)
 - [DAG](.//Models/DAG.md)
 - [DAGCollection](.//Models/DAGCollection.md)
 - [DAGDetail](.//Models/DAGDetail.md)
 - [DAGDetailAllOf](.//Models/DAGDetailAllOf.md)
 - [DAGRun](.//Models/DAGRun.md)
 - [DAGRunCollection](.//Models/DAGRunCollection.md)
 - [DagState](.//Models/DagState.md)
 - [Error](.//Models/Error.md)
 - [EventLog](.//Models/EventLog.md)
 - [EventLogCollection](.//Models/EventLogCollection.md)
 - [ExtraLink](.//Models/ExtraLink.md)
 - [ExtraLinkCollection](.//Models/ExtraLinkCollection.md)
 - [ImportError](.//Models/ImportError.md)
 - [ImportErrorCollection](.//Models/ImportErrorCollection.md)
 - [InlineResponse200](.//Models/InlineResponse200.md)
 - [InlineResponse2001](.//Models/InlineResponse2001.md)
 - [ListDagRunsForm](.//Models/ListDagRunsForm.md)
 - [ListTaskInstanceForm](.//Models/ListTaskInstanceForm.md)
 - [Pool](.//Models/Pool.md)
 - [PoolCollection](.//Models/PoolCollection.md)
 - [RelativeDelta](.//Models/RelativeDelta.md)
 - [SLAMiss](.//Models/SLAMiss.md)
 - [SLAMissCollection](.//Models/SLAMissCollection.md)
 - [ScheduleInterval](.//Models/ScheduleInterval.md)
 - [Tag](.//Models/Tag.md)
 - [Task](.//Models/Task.md)
 - [TaskCollection](.//Models/TaskCollection.md)
 - [TaskExtraLinks](.//Models/TaskExtraLinks.md)
 - [TaskFail](.//Models/TaskFail.md)
 - [TaskInstance](.//Models/TaskInstance.md)
 - [TaskInstanceCollection](.//Models/TaskInstanceCollection.md)
 - [TaskInstanceReference](.//Models/TaskInstanceReference.md)
 - [TaskInstanceReferenceCollection](.//Models/TaskInstanceReferenceCollection.md)
 - [TaskState](.//Models/TaskState.md)
 - [TimeDelta](.//Models/TimeDelta.md)
 - [TriggerRule](.//Models/TriggerRule.md)
 - [Variable](.//Models/Variable.md)
 - [VariableAllOf](.//Models/VariableAllOf.md)
 - [VariableCollection](.//Models/VariableCollection.md)
 - [VariableCollectionItem](.//Models/VariableCollectionItem.md)
 - [WeightRule](.//Models/WeightRule.md)
 - [XCom](.//Models/XCom.md)
 - [XComCollection](.//Models/XComCollection.md)
 - [XComCollectionItem](.//Models/XComCollectionItem.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
