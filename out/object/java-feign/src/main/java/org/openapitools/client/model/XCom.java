/*
 * Airflow API (Stable)
 * Apache Airflow management API.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: dev@airflow.apache.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.client.model.VariableAllOf;
import org.openapitools.client.model.XComCollectionItem;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * XCom
 */
@JsonPropertyOrder({
  XCom.JSON_PROPERTY_KEY,
  XCom.JSON_PROPERTY_TIMESTAMP,
  XCom.JSON_PROPERTY_EXECUTION_DATE,
  XCom.JSON_PROPERTY_TASK_ID,
  XCom.JSON_PROPERTY_DAG_ID,
  XCom.JSON_PROPERTY_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:05:04.083Z[GMT]")
public class XCom {
  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private String timestamp;

  public static final String JSON_PROPERTY_EXECUTION_DATE = "execution_date";
  private String executionDate;

  public static final String JSON_PROPERTY_TASK_ID = "task_id";
  private String taskId;

  public static final String JSON_PROPERTY_DAG_ID = "dag_id";
  private String dagId;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;


  public XCom key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public XCom timestamp(String timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public XCom executionDate(String executionDate) {
    
    this.executionDate = executionDate;
    return this;
  }

   /**
   * Get executionDate
   * @return executionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXECUTION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExecutionDate() {
    return executionDate;
  }


  public void setExecutionDate(String executionDate) {
    this.executionDate = executionDate;
  }


  public XCom taskId(String taskId) {
    
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TASK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaskId() {
    return taskId;
  }


  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }


  public XCom dagId(String dagId) {
    
    this.dagId = dagId;
    return this;
  }

   /**
   * Get dagId
   * @return dagId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DAG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDagId() {
    return dagId;
  }


  public void setDagId(String dagId) {
    this.dagId = dagId;
  }


  public XCom value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XCom xcom = (XCom) o;
    return Objects.equals(this.key, xcom.key) &&
        Objects.equals(this.timestamp, xcom.timestamp) &&
        Objects.equals(this.executionDate, xcom.executionDate) &&
        Objects.equals(this.taskId, xcom.taskId) &&
        Objects.equals(this.dagId, xcom.dagId) &&
        Objects.equals(this.value, xcom.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, timestamp, executionDate, taskId, dagId, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XCom {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    dagId: ").append(toIndentedString(dagId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

