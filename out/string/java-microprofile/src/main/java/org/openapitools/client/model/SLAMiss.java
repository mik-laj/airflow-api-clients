/**
 * Airflow API (Stable)
 * Apache Airflow management API.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: dev@airflow.apache.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openapitools.client.model;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.json.bind.annotation.JsonbProperty;

public class SLAMiss  {
  
  private String taskId;

  private String dagId;

  private String executionDate;

  private Boolean emailSent;

  private String timestamp;

  private String description;

  private Boolean notificationSent;
  
 /**
   * Get taskId
   * @return taskId
  **/
  @JsonbProperty("task_id")
  public String getTaskId() {
    return taskId;
  }


 /**
   * Get dagId
   * @return dagId
  **/
  @JsonbProperty("dag_id")
  public String getDagId() {
    return dagId;
  }

  /**
    * Set dagId
  **/
  public void setDagId(String dagId) {
    this.dagId = dagId;
  }

  public SLAMiss dagId(String dagId) {
    this.dagId = dagId;
    return this;
  }

 /**
   * Get executionDate
   * @return executionDate
  **/
  @JsonbProperty("execution_date")
  public String getExecutionDate() {
    return executionDate;
  }

  /**
    * Set executionDate
  **/
  public void setExecutionDate(String executionDate) {
    this.executionDate = executionDate;
  }

  public SLAMiss executionDate(String executionDate) {
    this.executionDate = executionDate;
    return this;
  }

 /**
   * Get emailSent
   * @return emailSent
  **/
  @JsonbProperty("email_sent")
  public Boolean getEmailSent() {
    return emailSent;
  }

  /**
    * Set emailSent
  **/
  public void setEmailSent(Boolean emailSent) {
    this.emailSent = emailSent;
  }

  public SLAMiss emailSent(Boolean emailSent) {
    this.emailSent = emailSent;
    return this;
  }

 /**
   * Get timestamp
   * @return timestamp
  **/
  @JsonbProperty("timestamp")
  public String getTimestamp() {
    return timestamp;
  }

  /**
    * Set timestamp
  **/
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public SLAMiss timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonbProperty("description")
  public String getDescription() {
    return description;
  }

  /**
    * Set description
  **/
  public void setDescription(String description) {
    this.description = description;
  }

  public SLAMiss description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get notificationSent
   * @return notificationSent
  **/
  @JsonbProperty("notification_sent")
  public Boolean getNotificationSent() {
    return notificationSent;
  }

  /**
    * Set notificationSent
  **/
  public void setNotificationSent(Boolean notificationSent) {
    this.notificationSent = notificationSent;
  }

  public SLAMiss notificationSent(Boolean notificationSent) {
    this.notificationSent = notificationSent;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLAMiss {\n");
    
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    dagId: ").append(toIndentedString(dagId)).append("\n");
    sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
    sb.append("    emailSent: ").append(toIndentedString(emailSent)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    notificationSent: ").append(toIndentedString(notificationSent)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

