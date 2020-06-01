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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ConnectionCollectionItem
 */
@JsonPropertyOrder({
  ConnectionCollectionItem.JSON_PROPERTY_CONNECTION_ID,
  ConnectionCollectionItem.JSON_PROPERTY_CONN_TYPE,
  ConnectionCollectionItem.JSON_PROPERTY_HOST,
  ConnectionCollectionItem.JSON_PROPERTY_LOGIN,
  ConnectionCollectionItem.JSON_PROPERTY_SCHEMA,
  ConnectionCollectionItem.JSON_PROPERTY_PORT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-31T07:53:16.755Z[GMT]")
public class ConnectionCollectionItem {
  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private String connectionId;

  public static final String JSON_PROPERTY_CONN_TYPE = "conn_type";
  private String connType;

  public static final String JSON_PROPERTY_HOST = "host";
  private String host;

  public static final String JSON_PROPERTY_LOGIN = "login";
  private String login;

  public static final String JSON_PROPERTY_SCHEMA = "schema";
  private String schema;

  public static final String JSON_PROPERTY_PORT = "port";
  private Integer port;


  public ConnectionCollectionItem connectionId(String connectionId) {
    
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Get connectionId
   * @return connectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectionId() {
    return connectionId;
  }


  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  public ConnectionCollectionItem connType(String connType) {
    
    this.connType = connType;
    return this;
  }

   /**
   * Get connType
   * @return connType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnType() {
    return connType;
  }


  public void setConnType(String connType) {
    this.connType = connType;
  }


  public ConnectionCollectionItem host(String host) {
    
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HOST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHost() {
    return host;
  }


  public void setHost(String host) {
    this.host = host;
  }


  public ConnectionCollectionItem login(String login) {
    
    this.login = login;
    return this;
  }

   /**
   * Get login
   * @return login
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLogin() {
    return login;
  }


  public void setLogin(String login) {
    this.login = login;
  }


  public ConnectionCollectionItem schema(String schema) {
    
    this.schema = schema;
    return this;
  }

   /**
   * Get schema
   * @return schema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSchema() {
    return schema;
  }


  public void setSchema(String schema) {
    this.schema = schema;
  }


  public ConnectionCollectionItem port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionCollectionItem connectionCollectionItem = (ConnectionCollectionItem) o;
    return Objects.equals(this.connectionId, connectionCollectionItem.connectionId) &&
        Objects.equals(this.connType, connectionCollectionItem.connType) &&
        Objects.equals(this.host, connectionCollectionItem.host) &&
        Objects.equals(this.login, connectionCollectionItem.login) &&
        Objects.equals(this.schema, connectionCollectionItem.schema) &&
        Objects.equals(this.port, connectionCollectionItem.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionId, connType, host, login, schema, port);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionCollectionItem {\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    connType: ").append(toIndentedString(connType)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

