# DAG
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dagUnderscoreid** | [**String**](string.md) |  | [optional] [default to null]
**rootUnderscoredagUnderscoreid** | [**String**](string.md) |  | [optional] [default to null]
**isUnderscorepaused** | [**Boolean**](boolean.md) |  | [optional] [default to null]
**isUnderscoresubdag** | [**Boolean**](boolean.md) |  | [optional] [default to null]
**fileloc** | [**String**](string.md) |  | [optional] [default to null]
**fileUnderscoretoken** | [**String**](string.md) | The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change.  | [optional] [default to null]
**owners** | [**List**](string.md) |  | [optional] [default to null]
**description** | [**String**](string.md) |  | [optional] [default to null]
**scheduleUnderscoreinterval** | [**oneOf&lt;ScheduleInterval&gt;**](oneOf&lt;ScheduleInterval&gt;.md) |  | [optional] [default to null]
**tags** | [**List**](Tag.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

