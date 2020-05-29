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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.OneOfScheduleInterval;
import org.openapitools.client.model.Tag;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DAG
 */
@JsonPropertyOrder({
  DAG.JSON_PROPERTY_DAG_ID,
  DAG.JSON_PROPERTY_ROOT_DAG_ID,
  DAG.JSON_PROPERTY_IS_PAUSED,
  DAG.JSON_PROPERTY_IS_SUBDAG,
  DAG.JSON_PROPERTY_FILELOC,
  DAG.JSON_PROPERTY_FILE_TOKEN,
  DAG.JSON_PROPERTY_OWNERS,
  DAG.JSON_PROPERTY_DESCRIPTION,
  DAG.JSON_PROPERTY_SCHEDULE_INTERVAL,
  DAG.JSON_PROPERTY_TAGS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:06:56.947Z[GMT]")
public class DAG {
  public static final String JSON_PROPERTY_DAG_ID = "dag_id";
  private String dagId;

  public static final String JSON_PROPERTY_ROOT_DAG_ID = "root_dag_id";
  private String rootDagId;

  public static final String JSON_PROPERTY_IS_PAUSED = "is_paused";
  private Boolean isPaused;

  public static final String JSON_PROPERTY_IS_SUBDAG = "is_subdag";
  private Boolean isSubdag;

  public static final String JSON_PROPERTY_FILELOC = "fileloc";
  private String fileloc;

  public static final String JSON_PROPERTY_FILE_TOKEN = "file_token";
  private String fileToken;

  public static final String JSON_PROPERTY_OWNERS = "owners";
  private List<String> owners = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_SCHEDULE_INTERVAL = "schedule_interval";
  private OneOfScheduleInterval scheduleInterval = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<Tag> tags = null;


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




   /**
   * Get rootDagId
   * @return rootDagId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ROOT_DAG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRootDagId() {
    return rootDagId;
  }




  public DAG isPaused(Boolean isPaused) {
    
    this.isPaused = isPaused;
    return this;
  }

   /**
   * Get isPaused
   * @return isPaused
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_PAUSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsPaused() {
    return isPaused;
  }


  public void setIsPaused(Boolean isPaused) {
    this.isPaused = isPaused;
  }


   /**
   * Get isSubdag
   * @return isSubdag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_SUBDAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsSubdag() {
    return isSubdag;
  }




   /**
   * Get fileloc
   * @return fileloc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILELOC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileloc() {
    return fileloc;
  }




   /**
   * The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change. 
   * @return fileToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change. ")
  @JsonProperty(JSON_PROPERTY_FILE_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileToken() {
    return fileToken;
  }




   /**
   * Get owners
   * @return owners
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OWNERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getOwners() {
    return owners;
  }




   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }




   /**
   * Get scheduleInterval
   * @return scheduleInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULE_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OneOfScheduleInterval getScheduleInterval() {
    return scheduleInterval;
  }




   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Tag> getTags() {
    return tags;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DAG DAG = (DAG) o;
    return Objects.equals(this.dagId, DAG.dagId) &&
        Objects.equals(this.rootDagId, DAG.rootDagId) &&
        Objects.equals(this.isPaused, DAG.isPaused) &&
        Objects.equals(this.isSubdag, DAG.isSubdag) &&
        Objects.equals(this.fileloc, DAG.fileloc) &&
        Objects.equals(this.fileToken, DAG.fileToken) &&
        Objects.equals(this.owners, DAG.owners) &&
        Objects.equals(this.description, DAG.description) &&
        Objects.equals(this.scheduleInterval, DAG.scheduleInterval) &&
        Objects.equals(this.tags, DAG.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dagId, rootDagId, isPaused, isSubdag, fileloc, fileToken, owners, description, scheduleInterval, tags);
  }


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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

