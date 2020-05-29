# DAGRun
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dagUnderscorerunUnderscoreid** | [**String**](string.md) | Run ID. The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error. If not provided, a value will be generated based on execution_date. If the specified dag_run_id is in use, the creation request fails with an ALREADY_EXISTS error. This together with DAG_ID are a unique key.  | [optional] [default to null]
**dagUnderscoreid** | [**String**](string.md) |  | [default to null]
**executionUnderscoredate** | [**Date**](DateTime.md) | The execution date. This is the time when the DAG run should be started according to the DAG definition. The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error. This together with DAG_ID are a unique key.  | [optional] [default to null]
**startUnderscoredate** | [**Date**](DateTime.md) | The start time. The time when DAG Run was actually created..  | [optional] [default to null]
**endUnderscoredate** | [**Date**](DateTime.md) |  | [optional] [default to null]
**state** | [**DagState**](DagState.md) |  | [optional] [default to null]
**externalUnderscoretrigger** | [**Boolean**](boolean.md) |  | [optional] [default to true]
**conf** | [**oneOf&lt;object,string&gt;**](oneOf&lt;object,string&gt;.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

