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
import org.openapitools.client.model.ClassReference;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * TaskExtraLinks
 */
@JsonPropertyOrder({
  TaskExtraLinks.JSON_PROPERTY_CLASS_REF
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-31T07:37:19.187Z[GMT]")
public class TaskExtraLinks {
  public static final String JSON_PROPERTY_CLASS_REF = "class_ref";
  private ClassReference classRef;


  public TaskExtraLinks classRef(ClassReference classRef) {
    
    this.classRef = classRef;
    return this;
  }

   /**
   * Get classRef
   * @return classRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLASS_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ClassReference getClassRef() {
    return classRef;
  }


  public void setClassRef(ClassReference classRef) {
    this.classRef = classRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskExtraLinks taskExtraLinks = (TaskExtraLinks) o;
    return Objects.equals(this.classRef, taskExtraLinks.classRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskExtraLinks {\n");
    sb.append("    classRef: ").append(toIndentedString(classRef)).append("\n");
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

