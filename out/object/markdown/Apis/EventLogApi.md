# EventLogApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEventLog**](EventLogApi.md#getEventLog) | **GET** /eventLogs | Get all log entries from event log
[**getEventLogEntry**](EventLogApi.md#getEventLogEntry) | **GET** /eventLogs/{event_log_id} | Get a log entry


<a name="getEventLog"></a>
# **getEventLog**
> EventLogCollection getEventLog(limit, offset)

Get all log entries from event log

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| The numbers of items to return. | [optional] [default to 100]
 **offset** | **Integer**| The number of items to skip before starting to collect the result set. | [optional] [default to null]

### Return type

[**EventLogCollection**](..//Models/EventLogCollection.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getEventLogEntry"></a>
# **getEventLogEntry**
> EventLog getEventLogEntry(eventLogId)

Get a log entry

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventLogId** | **Integer**| The Event Log ID. | [default to null]

### Return type

[**EventLog**](..//Models/EventLog.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

