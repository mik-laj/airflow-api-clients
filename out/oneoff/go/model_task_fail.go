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
// TaskFail struct for TaskFail
type TaskFail struct {
	TaskId string `json:"task_id,omitempty"`
	DagId string `json:"dag_id,omitempty"`
	ExecutionDate string `json:"execution_date,omitempty"`
	StartDate string `json:"start_date,omitempty"`
	EndDate string `json:"end_date,omitempty"`
	Duration int32 `json:"duration,omitempty"`
}
