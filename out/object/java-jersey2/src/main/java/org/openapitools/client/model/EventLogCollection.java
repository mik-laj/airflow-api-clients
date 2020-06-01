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
import org.openapitools.client.model.EventLog;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * EventLogCollection
 */
@JsonPropertyOrder({
  EventLogCollection.JSON_PROPERTY_EVENT_LOGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-31T07:53:02.054Z[GMT]")
public class EventLogCollection {
  public static final String JSON_PROPERTY_EVENT_LOGS = "event_logs";
  private List<EventLog> eventLogs = null;


  public EventLogCollection eventLogs(List<EventLog> eventLogs) {
    
    this.eventLogs = eventLogs;
    return this;
  }

  public EventLogCollection addEventLogsItem(EventLog eventLogsItem) {
    if (this.eventLogs == null) {
      this.eventLogs = new ArrayList<EventLog>();
    }
    this.eventLogs.add(eventLogsItem);
    return this;
  }

   /**
   * Get eventLogs
   * @return eventLogs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EVENT_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EventLog> getEventLogs() {
    return eventLogs;
  }


  public void setEventLogs(List<EventLog> eventLogs) {
    this.eventLogs = eventLogs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventLogCollection eventLogCollection = (EventLogCollection) o;
    return Objects.equals(this.eventLogs, eventLogCollection.eventLogs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventLogs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventLogCollection {\n");
    sb.append("    eventLogs: ").append(toIndentedString(eventLogs)).append("\n");
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

