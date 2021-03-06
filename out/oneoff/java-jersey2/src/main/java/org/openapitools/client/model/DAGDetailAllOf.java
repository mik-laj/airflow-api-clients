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
import java.math.BigDecimal;
import org.openapitools.client.model.TimeDelta;
import org.threeten.bp.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DAGDetailAllOf
 */
@JsonPropertyOrder({
  DAGDetailAllOf.JSON_PROPERTY_TIMEZONE,
  DAGDetailAllOf.JSON_PROPERTY_CATCHUP,
  DAGDetailAllOf.JSON_PROPERTY_ORIENTATION,
  DAGDetailAllOf.JSON_PROPERTY_CONCURRENCY,
  DAGDetailAllOf.JSON_PROPERTY_START_DATE,
  DAGDetailAllOf.JSON_PROPERTY_DAG_RUN_TIMEOUT,
  DAGDetailAllOf.JSON_PROPERTY_DOC_MD,
  DAGDetailAllOf.JSON_PROPERTY_DEFAULT_VIEW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-31T07:39:21.588Z[GMT]")
public class DAGDetailAllOf {
  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_CATCHUP = "catchup";
  private Boolean catchup;

  public static final String JSON_PROPERTY_ORIENTATION = "orientation";
  private String orientation;

  public static final String JSON_PROPERTY_CONCURRENCY = "concurrency";
  private BigDecimal concurrency;

  public static final String JSON_PROPERTY_START_DATE = "start_date";
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_DAG_RUN_TIMEOUT = "dag_run_timeout";
  private TimeDelta dagRunTimeout;

  public static final String JSON_PROPERTY_DOC_MD = "doc_md";
  private String docMd;

  public static final String JSON_PROPERTY_DEFAULT_VIEW = "default_view";
  private String defaultView;


  public DAGDetailAllOf timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


   /**
   * Get catchup
   * @return catchup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATCHUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCatchup() {
    return catchup;
  }




   /**
   * Get orientation
   * @return orientation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORIENTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrientation() {
    return orientation;
  }




   /**
   * Get concurrency
   * @return concurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONCURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getConcurrency() {
    return concurrency;
  }




   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartDate() {
    return startDate;
  }




  public DAGDetailAllOf dagRunTimeout(TimeDelta dagRunTimeout) {
    
    this.dagRunTimeout = dagRunTimeout;
    return this;
  }

   /**
   * Get dagRunTimeout
   * @return dagRunTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DAG_RUN_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TimeDelta getDagRunTimeout() {
    return dagRunTimeout;
  }


  public void setDagRunTimeout(TimeDelta dagRunTimeout) {
    this.dagRunTimeout = dagRunTimeout;
  }


   /**
   * Get docMd
   * @return docMd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DOC_MD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDocMd() {
    return docMd;
  }




   /**
   * Get defaultView
   * @return defaultView
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEFAULT_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultView() {
    return defaultView;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DAGDetailAllOf daGDetailAllOf = (DAGDetailAllOf) o;
    return Objects.equals(this.timezone, daGDetailAllOf.timezone) &&
        Objects.equals(this.catchup, daGDetailAllOf.catchup) &&
        Objects.equals(this.orientation, daGDetailAllOf.orientation) &&
        Objects.equals(this.concurrency, daGDetailAllOf.concurrency) &&
        Objects.equals(this.startDate, daGDetailAllOf.startDate) &&
        Objects.equals(this.dagRunTimeout, daGDetailAllOf.dagRunTimeout) &&
        Objects.equals(this.docMd, daGDetailAllOf.docMd) &&
        Objects.equals(this.defaultView, daGDetailAllOf.defaultView);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timezone, catchup, orientation, concurrency, startDate, dagRunTimeout, docMd, defaultView);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DAGDetailAllOf {\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    catchup: ").append(toIndentedString(catchup)).append("\n");
    sb.append("    orientation: ").append(toIndentedString(orientation)).append("\n");
    sb.append("    concurrency: ").append(toIndentedString(concurrency)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    dagRunTimeout: ").append(toIndentedString(dagRunTimeout)).append("\n");
    sb.append("    docMd: ").append(toIndentedString(docMd)).append("\n");
    sb.append("    defaultView: ").append(toIndentedString(defaultView)).append("\n");
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

