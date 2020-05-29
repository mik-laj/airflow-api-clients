# ClearTaskInstance
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dryUnderscorerun** | [**Boolean**](boolean.md) | If set, don&#39;t actually run this operation. The response will contain a list of task instances planned to be cleaned, but not modified in any way.  | [optional] [default to true]
**startUnderscoredate** | [**String**](string.md) | The minimum execution date to clear. | [optional] [default to null]
**endUnderscoredate** | [**String**](string.md) | The maximum execution date to clear. | [optional] [default to null]
**onlyUnderscorefailed** | [**String**](string.md) | Only clear failed tasks. | [optional] [default to null]
**onlyUnderscorerunning** | [**String**](string.md) | Only clear running tasks. | [optional] [default to null]
**includeUnderscoresubdags** | [**Boolean**](boolean.md) | Clear tasks in subdags and clear external tasks indicated by ExternalTaskMarker. | [optional] [default to null]
**includeUnderscoreparentdag** | [**Boolean**](boolean.md) | Clear tasks in the parent dag of the subdag. | [optional] [default to null]
**resetUnderscoredagUnderscoreruns** | [**Boolean**](boolean.md) | Set state of DAG Runs to RUNNING. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

