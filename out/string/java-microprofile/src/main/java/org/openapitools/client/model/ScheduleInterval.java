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

import org.openapitools.client.model.CronExpression;
import org.openapitools.client.model.RelativeDelta;
import org.openapitools.client.model.TimeDelta;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.json.bind.annotation.JsonbProperty;

public class ScheduleInterval  {
  
  private String type;

  private Integer days;

  private Integer seconds;

  private Integer microsecond;

  private Integer years;

  private Integer months;

  private Integer leapdays;

  private Integer hours;

  private Integer minutes;

  private Integer microseconds;

  private Integer year;

  private Integer month;

  private Integer day;

  private Integer hour;

  private Integer minute;

  private Integer second;

  private String value;
  
 /**
   * Get type
   * @return type
  **/
  @JsonbProperty("__type")
  public String getType() {
    return type;
  }

  /**
    * Set type
  **/
  public void setType(String type) {
    this.type = type;
  }

  public ScheduleInterval type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Get days
   * @return days
  **/
  @JsonbProperty("days")
  public Integer getDays() {
    return days;
  }

  /**
    * Set days
  **/
  public void setDays(Integer days) {
    this.days = days;
  }

  public ScheduleInterval days(Integer days) {
    this.days = days;
    return this;
  }

 /**
   * Get seconds
   * @return seconds
  **/
  @JsonbProperty("seconds")
  public Integer getSeconds() {
    return seconds;
  }

  /**
    * Set seconds
  **/
  public void setSeconds(Integer seconds) {
    this.seconds = seconds;
  }

  public ScheduleInterval seconds(Integer seconds) {
    this.seconds = seconds;
    return this;
  }

 /**
   * Get microsecond
   * @return microsecond
  **/
  @JsonbProperty("microsecond")
  public Integer getMicrosecond() {
    return microsecond;
  }

  /**
    * Set microsecond
  **/
  public void setMicrosecond(Integer microsecond) {
    this.microsecond = microsecond;
  }

  public ScheduleInterval microsecond(Integer microsecond) {
    this.microsecond = microsecond;
    return this;
  }

 /**
   * Get years
   * @return years
  **/
  @JsonbProperty("years")
  public Integer getYears() {
    return years;
  }

  /**
    * Set years
  **/
  public void setYears(Integer years) {
    this.years = years;
  }

  public ScheduleInterval years(Integer years) {
    this.years = years;
    return this;
  }

 /**
   * Get months
   * @return months
  **/
  @JsonbProperty("months")
  public Integer getMonths() {
    return months;
  }

  /**
    * Set months
  **/
  public void setMonths(Integer months) {
    this.months = months;
  }

  public ScheduleInterval months(Integer months) {
    this.months = months;
    return this;
  }

 /**
   * Get leapdays
   * @return leapdays
  **/
  @JsonbProperty("leapdays")
  public Integer getLeapdays() {
    return leapdays;
  }

  /**
    * Set leapdays
  **/
  public void setLeapdays(Integer leapdays) {
    this.leapdays = leapdays;
  }

  public ScheduleInterval leapdays(Integer leapdays) {
    this.leapdays = leapdays;
    return this;
  }

 /**
   * Get hours
   * @return hours
  **/
  @JsonbProperty("hours")
  public Integer getHours() {
    return hours;
  }

  /**
    * Set hours
  **/
  public void setHours(Integer hours) {
    this.hours = hours;
  }

  public ScheduleInterval hours(Integer hours) {
    this.hours = hours;
    return this;
  }

 /**
   * Get minutes
   * @return minutes
  **/
  @JsonbProperty("minutes")
  public Integer getMinutes() {
    return minutes;
  }

  /**
    * Set minutes
  **/
  public void setMinutes(Integer minutes) {
    this.minutes = minutes;
  }

  public ScheduleInterval minutes(Integer minutes) {
    this.minutes = minutes;
    return this;
  }

 /**
   * Get microseconds
   * @return microseconds
  **/
  @JsonbProperty("microseconds")
  public Integer getMicroseconds() {
    return microseconds;
  }

  /**
    * Set microseconds
  **/
  public void setMicroseconds(Integer microseconds) {
    this.microseconds = microseconds;
  }

  public ScheduleInterval microseconds(Integer microseconds) {
    this.microseconds = microseconds;
    return this;
  }

 /**
   * Get year
   * @return year
  **/
  @JsonbProperty("year")
  public Integer getYear() {
    return year;
  }

  /**
    * Set year
  **/
  public void setYear(Integer year) {
    this.year = year;
  }

  public ScheduleInterval year(Integer year) {
    this.year = year;
    return this;
  }

 /**
   * Get month
   * @return month
  **/
  @JsonbProperty("month")
  public Integer getMonth() {
    return month;
  }

  /**
    * Set month
  **/
  public void setMonth(Integer month) {
    this.month = month;
  }

  public ScheduleInterval month(Integer month) {
    this.month = month;
    return this;
  }

 /**
   * Get day
   * @return day
  **/
  @JsonbProperty("day")
  public Integer getDay() {
    return day;
  }

  /**
    * Set day
  **/
  public void setDay(Integer day) {
    this.day = day;
  }

  public ScheduleInterval day(Integer day) {
    this.day = day;
    return this;
  }

 /**
   * Get hour
   * @return hour
  **/
  @JsonbProperty("hour")
  public Integer getHour() {
    return hour;
  }

  /**
    * Set hour
  **/
  public void setHour(Integer hour) {
    this.hour = hour;
  }

  public ScheduleInterval hour(Integer hour) {
    this.hour = hour;
    return this;
  }

 /**
   * Get minute
   * @return minute
  **/
  @JsonbProperty("minute")
  public Integer getMinute() {
    return minute;
  }

  /**
    * Set minute
  **/
  public void setMinute(Integer minute) {
    this.minute = minute;
  }

  public ScheduleInterval minute(Integer minute) {
    this.minute = minute;
    return this;
  }

 /**
   * Get second
   * @return second
  **/
  @JsonbProperty("second")
  public Integer getSecond() {
    return second;
  }

  /**
    * Set second
  **/
  public void setSecond(Integer second) {
    this.second = second;
  }

  public ScheduleInterval second(Integer second) {
    this.second = second;
    return this;
  }

 /**
   * Get value
   * @return value
  **/
  @JsonbProperty("value")
  public String getValue() {
    return value;
  }

  /**
    * Set value
  **/
  public void setValue(String value) {
    this.value = value;
  }

  public ScheduleInterval value(String value) {
    this.value = value;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleInterval {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
    sb.append("    microsecond: ").append(toIndentedString(microsecond)).append("\n");
    sb.append("    years: ").append(toIndentedString(years)).append("\n");
    sb.append("    months: ").append(toIndentedString(months)).append("\n");
    sb.append("    leapdays: ").append(toIndentedString(leapdays)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    minutes: ").append(toIndentedString(minutes)).append("\n");
    sb.append("    microseconds: ").append(toIndentedString(microseconds)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
    sb.append("    second: ").append(toIndentedString(second)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

