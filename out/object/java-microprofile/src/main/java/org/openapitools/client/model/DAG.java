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

import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.OneOfScheduleInterval;
import org.openapitools.client.model.Tag;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.json.bind.annotation.JsonbProperty;

public class DAG  {
  
  private String dagId;

  private String rootDagId;

  private Boolean isPaused;

  private Boolean isSubdag;

  private String fileloc;

 /**
   * The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change. 
  **/
  private String fileToken;

  private List<String> owners = null;

  private String description;

  private OneOfScheduleInterval scheduleInterval = null;

  private List<Tag> tags = null;
  
 /**
   * Get dagId
   * @return dagId
  **/
  @JsonbProperty("dag_id")
  public String getDagId() {
    return dagId;
  }


 /**
   * Get rootDagId
   * @return rootDagId
  **/
  @JsonbProperty("root_dag_id")
  public String getRootDagId() {
    return rootDagId;
  }


 /**
   * Get isPaused
   * @return isPaused
  **/
  @JsonbProperty("is_paused")
  public Boolean getIsPaused() {
    return isPaused;
  }

  /**
    * Set isPaused
  **/
  public void setIsPaused(Boolean isPaused) {
    this.isPaused = isPaused;
  }

  public DAG isPaused(Boolean isPaused) {
    this.isPaused = isPaused;
    return this;
  }

 /**
   * Get isSubdag
   * @return isSubdag
  **/
  @JsonbProperty("is_subdag")
  public Boolean getIsSubdag() {
    return isSubdag;
  }


 /**
   * Get fileloc
   * @return fileloc
  **/
  @JsonbProperty("fileloc")
  public String getFileloc() {
    return fileloc;
  }


 /**
   * The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change. 
   * @return fileToken
  **/
  @JsonbProperty("file_token")
  public String getFileToken() {
    return fileToken;
  }


 /**
   * Get owners
   * @return owners
  **/
  @JsonbProperty("owners")
  public List<String> getOwners() {
    return owners;
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
   * Get scheduleInterval
   * @return scheduleInterval
  **/
  @JsonbProperty("schedule_interval")
  public OneOfScheduleInterval getScheduleInterval() {
    return scheduleInterval;
  }


 /**
   * Get tags
   * @return tags
  **/
  @JsonbProperty("tags")
  public List<Tag> getTags() {
    return tags;
  }



  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DAG {\n");
    
    sb.append("    dagId: ").append(toIndentedString(dagId)).append("\n");
    sb.append("    rootDagId: ").append(toIndentedString(rootDagId)).append("\n");
    sb.append("    isPaused: ").append(toIndentedString(isPaused)).append("\n");
    sb.append("    isSubdag: ").append(toIndentedString(isSubdag)).append("\n");
    sb.append("    fileloc: ").append(toIndentedString(fileloc)).append("\n");
    sb.append("    fileToken: ").append(toIndentedString(fileToken)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    scheduleInterval: ").append(toIndentedString(scheduleInterval)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

