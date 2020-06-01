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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.EventLog;

/**
 * EventLogCollection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-31T07:37:12.038Z[GMT]")
public class EventLogCollection {
  public static final String SERIALIZED_NAME_EVENT_LOGS = "event_logs";
  @SerializedName(SERIALIZED_NAME_EVENT_LOGS)
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

