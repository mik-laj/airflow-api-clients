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
import org.openapitools.client.model.VariableCollectionItem;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * VariableCollection
 */
@JsonPropertyOrder({
  VariableCollection.JSON_PROPERTY_VARIABLES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:01:10.438Z[GMT]")
public class VariableCollection {
  public static final String JSON_PROPERTY_VARIABLES = "variables";
  private List<VariableCollectionItem> variables = null;


  public VariableCollection variables(List<VariableCollectionItem> variables) {
    
    this.variables = variables;
    return this;
  }

  public VariableCollection addVariablesItem(VariableCollectionItem variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<VariableCollectionItem>();
    }
    this.variables.add(variablesItem);
    return this;
  }

   /**
   * Get variables
   * @return variables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<VariableCollectionItem> getVariables() {
    return variables;
  }


  public void setVariables(List<VariableCollectionItem> variables) {
    this.variables = variables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableCollection variableCollection = (VariableCollection) o;
    return Objects.equals(this.variables, variableCollection.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variables);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableCollection {\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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

