# dag_detail.DAGDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dag_id** | **str** |  | [optional] [readonly] 
**root_dag_id** | **str** |  | [optional] [readonly] 
**is_paused** | **bool** |  | [optional] 
**is_subdag** | **bool** |  | [optional] [readonly] 
**fileloc** | **str** |  | [optional] [readonly] 
**file_token** | **str** | The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change.  | [optional] [readonly] 
**owners** | **[str]** |  | [optional] [readonly] 
**description** | **str** |  | [optional] [readonly] 
**schedule_interval** | [**one_of_schedule_interval.OneOfScheduleInterval**](OneOfScheduleInterval.md) |  | [optional] [readonly] 
**tags** | [**[tag.Tag]**](Tag.md) |  | [optional] [readonly] 
**timezone** | **str** |  | [optional] 
**catchup** | **bool** |  | [optional] [readonly] 
**orientation** | **str** |  | [optional] [readonly] 
**concurrency** | **float** |  | [optional] [readonly] 
**start_date** | **datetime** |  | [optional] [readonly] 
**dag_run_timeout** | [**time_delta.TimeDelta**](TimeDelta.md) |  | [optional] 
**doc_md** | **str** |  | [optional] [readonly] 
**default_view** | **str** |  | [optional] [readonly] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


