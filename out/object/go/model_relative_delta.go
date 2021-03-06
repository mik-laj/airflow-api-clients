/*
 * Airflow API (Stable)
 *
 * Apache Airflow management API.
 *
 * API version: 1.0.0
 * Contact: dev@airflow.apache.org
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi
// RelativeDelta struct for RelativeDelta
type RelativeDelta struct {
	Type string `json:"__type"`
	Years int32 `json:"years,omitempty"`
	Months int32 `json:"months,omitempty"`
	Days int32 `json:"days,omitempty"`
	Leapdays int32 `json:"leapdays,omitempty"`
	Hours int32 `json:"hours,omitempty"`
	Minutes int32 `json:"minutes,omitempty"`
	Seconds int32 `json:"seconds,omitempty"`
	Microseconds int32 `json:"microseconds,omitempty"`
	Year int32 `json:"year,omitempty"`
	Month int32 `json:"month,omitempty"`
	Day int32 `json:"day,omitempty"`
	Hour int32 `json:"hour,omitempty"`
	Minute int32 `json:"minute,omitempty"`
	Second int32 `json:"second,omitempty"`
	Microsecond int32 `json:"microsecond,omitempty"`
}
