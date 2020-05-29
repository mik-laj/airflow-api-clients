# EventLogApi

All URIs are relative to */api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEventLog**](EventLogApi.md#getEventLog) | **GET** /eventLogs | Get all log entries from event log
[**getEventLogEntry**](EventLogApi.md#getEventLogEntry) | **GET** /eventLogs/{event_log_id} | Get a log entry



## getEventLog

Get all log entries from event log

### Example

```bash
 getEventLog  limit=value  offset=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer** | The numbers of items to return. | [optional] [default to 100]
 **offset** | **integer** | The number of items to skip before starting to collect the result set. | [optional] [default to null]

### Return type

[**EventLogCollection**](EventLogCollection.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getEventLogEntry

Get a log entry

### Example

```bash
 getEventLogEntry event_log_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventLogId** | **integer** | The Event Log ID. | [default to null]

### Return type

[**EventLog**](EventLog.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

