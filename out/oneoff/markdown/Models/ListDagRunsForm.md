# ListDagRunsForm
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pageUnderscoreoffset** | [**Integer**](integer.md) | The number of items to skip before starting to collect the result set. | [optional] [default to null]
**pageUnderscorelimit** | [**Integer**](integer.md) | The numbers of items to return. | [optional] [default to 100]
**dagUnderscoreids** | [**List**](string.md) | Return objects with specific DAG IDs. The value can be repeated to retrieve multiple matching values (OR condition). | [optional] [default to null]
**executionUnderscoredateUnderscoregte** | [**Date**](DateTime.md) | Returns objects greater or equal to the specified date. This can be combined with execution_date_lte key to receive only the selected period.  | [optional] [default to null]
**executionUnderscoredateUnderscorelte** | [**Date**](DateTime.md) | Returns objects less than or equal to the specified date. This can be combined with execution_date_gte key to receive only the selected period.  | [optional] [default to null]
**startUnderscoredateUnderscoregte** | [**Date**](DateTime.md) | Returns objects greater or equal the specified date. This can be combined with start_date_lte key to receive only the selected period.  | [optional] [default to null]
**startUnderscoredateUnderscorelte** | [**Date**](DateTime.md) | Returns objects less or equal the specified date. This can be combined with start_date_gte parameter to receive only the selected period  | [optional] [default to null]
**endUnderscoredateUnderscoregte** | [**Date**](DateTime.md) | Returns objects greater or equal the specified date. This can be combined with end_date_lte parameter to receive only the selected period.  | [optional] [default to null]
**endUnderscoredateUnderscorelte** | [**Date**](DateTime.md) | Returns objects less than or equal to the specified date. This can be combined with end_date_gte parameter to receive only the selected period.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

