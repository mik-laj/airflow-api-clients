# Airflow API (Stable) Bash client

## Overview

This is a Bash client script for accessing Airflow API (Stable) service.

The script uses cURL underneath for making all REST calls.

## Usage

```shell
# Make sure the script has executable rights
$ chmod u+x 

# Print the list of operations available on the service
$ ./ -h

# Print the service description
$ ./ --about

# Print detailed information about specific operation
$ ./ <operationId> -h

# Make GET request
./ --host http://<hostname>:<port> --accept xml <operationId> <queryParam1>=<value1> <header_key1>:<header_value2>

# Make GET request using arbitrary curl options (must be passed before <operationId>) to an SSL service using username:password
 -k -sS --tlsv1.2 --host https://<hostname> -u <user>:<password> --accept xml <operationId> <queryParam1>=<value1> <header_key1>:<header_value2>

# Make POST request
$ echo '<body_content>' |  --host <hostname> --content-type json <operationId> -

# Make POST request with simple JSON content, e.g.:
# {
#   "key1": "value1",
#   "key2": "value2",
#   "key3": 23
# }
$ echo '<body_content>' |  --host <hostname> --content-type json <operationId> key1==value1 key2=value2 key3:=23 -

# Preview the cURL command without actually executing it
$  --host http://<hostname>:<port> --dry-run <operationid>

```

## Docker image

You can easily create a Docker image containing a preconfigured environment
for using the REST Bash client including working autocompletion and short
welcome message with basic instructions, using the generated Dockerfile:

```shell
docker build -t my-rest-client .
docker run -it my-rest-client
```

By default you will be logged into a Zsh environment which has much more
advanced auto completion, but you can switch to Bash, where basic autocompletion
is also available.

## Shell completion

### Bash

The generated bash-completion script can be either directly loaded to the current Bash session using:

```shell
source .bash-completion
```

Alternatively, the script can be copied to the `/etc/bash-completion.d` (or on OSX with Homebrew to `/usr/local/etc/bash-completion.d`):

```shell
sudo cp .bash-completion /etc/bash-completion.d/
```

#### OS X

On OSX you might need to install bash-completion using Homebrew:

```shell
brew install bash-completion
```

and add the following to the `~/.bashrc`:

```shell
if [ -f $(brew --prefix)/etc/bash_completion ]; then
  . $(brew --prefix)/etc/bash_completion
fi
```

### Zsh

In Zsh, the generated `_` Zsh completion file must be copied to one of the folders under `$FPATH` variable.

## Documentation for API Endpoints

All URIs are relative to */api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ConfigApi* | [**getConfig**](docs/ConfigApi.md#getconfig) | **GET** /config | Get current configuration
*ConnectionApi* | [**createConnection**](docs/ConnectionApi.md#createconnection) | **POST** /connections | Create connection entry
*ConnectionApi* | [**deleteConnection**](docs/ConnectionApi.md#deleteconnection) | **DELETE** /connections/{connection_id} | Delete a connection entry
*ConnectionApi* | [**getConnection**](docs/ConnectionApi.md#getconnection) | **GET** /connections/{connection_id} | Get a connection entry
*ConnectionApi* | [**getConnections**](docs/ConnectionApi.md#getconnections) | **GET** /connections | Get all connection entries
*ConnectionApi* | [**updateConnection**](docs/ConnectionApi.md#updateconnection) | **PATCH** /connections/{connection_id} | Update a connection entry
*DAGApi* | [**clearTaskInstance**](docs/DAGApi.md#cleartaskinstance) | **POST** /dags/{dag_id}/clearTaskInstances | Clears a set of task instances associated with the DAG for a specified date range.
*DAGApi* | [**getDag**](docs/DAGApi.md#getdag) | **GET** /dags/{dag_id} | Get basic information about a DAG
*DAGApi* | [**getDagDetail**](docs/DAGApi.md#getdagdetail) | **GET** /dags/{dag_id}/details | Get a simplified representation of DAG.
*DAGApi* | [**getDagSource**](docs/DAGApi.md#getdagsource) | **GET** /dagSources/{file_token} | Get source code using file token
*DAGApi* | [**getDags**](docs/DAGApi.md#getdags) | **GET** /dags | Get all DAGs
*DAGApi* | [**getTask**](docs/DAGApi.md#gettask) | **GET** /dags/{dag_id}/tasks/{task_id} | Get simplified representation of a task.
*DAGApi* | [**getTasks**](docs/DAGApi.md#gettasks) | **GET** /dags/{dag_id}/tasks | Get tasks for DAG
*DAGApi* | [**updateDag**](docs/DAGApi.md#updatedag) | **PATCH** /dags/{dag_id} | Update a DAG
*DAGRunApi* | [**createDagRun**](docs/DAGRunApi.md#createdagrun) | **POST** /dags/{dag_id}/dagRuns/{dag_run_id} | Trigger a DAG Run
*DAGRunApi* | [**deleteDagRun**](docs/DAGRunApi.md#deletedagrun) | **DELETE** /dags/{dag_id}/dagRuns/{dag_run_id} | Delete a DAG Run
*DAGRunApi* | [**getDagRun**](docs/DAGRunApi.md#getdagrun) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id} | Get a DAG Run
*DAGRunApi* | [**getDagRuns**](docs/DAGRunApi.md#getdagruns) | **GET** /dags/{dag_id}/dagRuns | Get all DAG Runs
*DAGRunApi* | [**getDagRunsBatch**](docs/DAGRunApi.md#getdagrunsbatch) | **POST** /dags/~/dagRuns/list | Get all DAG Runs from aall DAGs.
*DAGRunApi* | [**updateDagRun**](docs/DAGRunApi.md#updatedagrun) | **PATCH** /dags/{dag_id}/dagRuns/{dag_run_id} | Update a DAG Run
*EventLogApi* | [**getEventLog**](docs/EventLogApi.md#geteventlog) | **GET** /eventLogs | Get all log entries from event log
*EventLogApi* | [**getEventLogEntry**](docs/EventLogApi.md#geteventlogentry) | **GET** /eventLogs/{event_log_id} | Get a log entry
*ImportErrorApi* | [**deleteImportError**](docs/ImportErrorApi.md#deleteimporterror) | **DELETE** /importErrors/{import_error_id} | Delete an import error
*ImportErrorApi* | [**getImportError**](docs/ImportErrorApi.md#getimporterror) | **GET** /importErrors/{import_error_id} | Get an import error
*ImportErrorApi* | [**getImportErrors**](docs/ImportErrorApi.md#getimporterrors) | **GET** /importErrors | Get all import errors
*PoolApi* | [**createPool**](docs/PoolApi.md#createpool) | **POST** /pools | Create a pool
*PoolApi* | [**deletePool**](docs/PoolApi.md#deletepool) | **DELETE** /pools/{pool_name} | Delete a pool
*PoolApi* | [**getPool**](docs/PoolApi.md#getpool) | **GET** /pools/{pool_name} | Get a pool
*PoolApi* | [**getPools**](docs/PoolApi.md#getpools) | **GET** /pools | Get all pools
*PoolApi* | [**updatePool**](docs/PoolApi.md#updatepool) | **PATCH** /pools/{pool_name} | Update a pool
*TaskInstanceApi* | [**getExtraLinks**](docs/TaskInstanceApi.md#getextralinks) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/links | Get extra links for task instance
*TaskInstanceApi* | [**getLogs**](docs/TaskInstanceApi.md#getlogs) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/logs/{task_try_number} | Get logs for a task instance
*TaskInstanceApi* | [**getTaskInstance**](docs/TaskInstanceApi.md#gettaskinstance) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id} | Get a task instance
*TaskInstanceApi* | [**getTaskInstances**](docs/TaskInstanceApi.md#gettaskinstances) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances | Get a list of task instance of DAG.
*TaskInstanceApi* | [**getTaskInstancesBatch**](docs/TaskInstanceApi.md#gettaskinstancesbatch) | **POST** /dags/~/dagRuns/~/taskInstances/list | Get list of task instances from all DAGs and DAG Runs.
*VariableApi* | [**createVariable**](docs/VariableApi.md#createvariable) | **POST** /variables | Create a variable
*VariableApi* | [**deleteVariable**](docs/VariableApi.md#deletevariable) | **DELETE** /variables/{variable_key} | Delete variable
*VariableApi* | [**getVariable**](docs/VariableApi.md#getvariable) | **GET** /variables/{variable_key} | Get a variable by key
*VariableApi* | [**getVariables**](docs/VariableApi.md#getvariables) | **GET** /variables | Get all variables
*VariableApi* | [**updateVariable**](docs/VariableApi.md#updatevariable) | **PATCH** /variables/{variable_key} | Update a variable by key
*XComApi* | [**deleteXComValue**](docs/XComApi.md#deletexcomvalue) | **DELETE** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key} | Delete an XCom entry
*XComApi* | [**getXComEntry**](docs/XComApi.md#getxcomentry) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries | Get all XCom entries
*XComApi* | [**getXComValue**](docs/XComApi.md#getxcomvalue) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key} | Get an XCom entry
*XComApi* | [**updateXComEntry**](docs/XComApi.md#updatexcomentry) | **POST** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries | Create an XCom entry
*XComApi* | [**updateXComValue**](docs/XComApi.md#updatexcomvalue) | **PATCH** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key} | Update an XCom entry


## Documentation For Models

 - [ClassReference](docs/ClassReference.md)
 - [ClearTaskInstance](docs/ClearTaskInstance.md)
 - [CollectionInfo](docs/CollectionInfo.md)
 - [Config](docs/Config.md)
 - [ConfigOption](docs/ConfigOption.md)
 - [ConfigSection](docs/ConfigSection.md)
 - [Connection](docs/Connection.md)
 - [ConnectionAllOf](docs/ConnectionAllOf.md)
 - [ConnectionCollection](docs/ConnectionCollection.md)
 - [ConnectionCollectionItem](docs/ConnectionCollectionItem.md)
 - [CronExpression](docs/CronExpression.md)
 - [DAG](docs/DAG.md)
 - [DAGCollection](docs/DAGCollection.md)
 - [DAGDetail](docs/DAGDetail.md)
 - [DAGDetailAllOf](docs/DAGDetailAllOf.md)
 - [DAGRun](docs/DAGRun.md)
 - [DAGRunCollection](docs/DAGRunCollection.md)
 - [DagState](docs/DagState.md)
 - [Error](docs/Error.md)
 - [EventLog](docs/EventLog.md)
 - [EventLogCollection](docs/EventLogCollection.md)
 - [ExtraLink](docs/ExtraLink.md)
 - [ExtraLinkCollection](docs/ExtraLinkCollection.md)
 - [ImportError](docs/ImportError.md)
 - [ImportErrorCollection](docs/ImportErrorCollection.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [ListDagRunsForm](docs/ListDagRunsForm.md)
 - [ListTaskInstanceForm](docs/ListTaskInstanceForm.md)
 - [Pool](docs/Pool.md)
 - [PoolCollection](docs/PoolCollection.md)
 - [RelativeDelta](docs/RelativeDelta.md)
 - [SLAMiss](docs/SLAMiss.md)
 - [SLAMissCollection](docs/SLAMissCollection.md)
 - [ScheduleInterval](docs/ScheduleInterval.md)
 - [Tag](docs/Tag.md)
 - [Task](docs/Task.md)
 - [TaskCollection](docs/TaskCollection.md)
 - [TaskExtraLinks](docs/TaskExtraLinks.md)
 - [TaskFail](docs/TaskFail.md)
 - [TaskInstance](docs/TaskInstance.md)
 - [TaskInstanceCollection](docs/TaskInstanceCollection.md)
 - [TaskInstanceReference](docs/TaskInstanceReference.md)
 - [TaskInstanceReferenceCollection](docs/TaskInstanceReferenceCollection.md)
 - [TaskState](docs/TaskState.md)
 - [TimeDelta](docs/TimeDelta.md)
 - [TriggerRule](docs/TriggerRule.md)
 - [Variable](docs/Variable.md)
 - [VariableAllOf](docs/VariableAllOf.md)
 - [VariableCollection](docs/VariableCollection.md)
 - [VariableCollectionItem](docs/VariableCollectionItem.md)
 - [WeightRule](docs/WeightRule.md)
 - [XCom](docs/XCom.md)
 - [XComCollection](docs/XComCollection.md)
 - [XComCollectionItem](docs/XComCollectionItem.md)


## Documentation For Authorization

 All endpoints do not require authorization.

