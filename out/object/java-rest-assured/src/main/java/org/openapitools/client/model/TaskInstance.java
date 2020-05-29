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
import java.math.BigDecimal;
import org.openapitools.client.model.SLAMiss;
import org.openapitools.client.model.TaskState;

/**
 * TaskInstance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:06:49.093Z[GMT]")
public class TaskInstance {
  public static final String SERIALIZED_NAME_TASK_ID = "task_id";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private String taskId;

  public static final String SERIALIZED_NAME_DAG_ID = "dag_id";
  @SerializedName(SERIALIZED_NAME_DAG_ID)
  private String dagId;

  public static final String SERIALIZED_NAME_EXECUTION_DATE = "execution_date";
  @SerializedName(SERIALIZED_NAME_EXECUTION_DATE)
  private String executionDate;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private BigDecimal duration;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private TaskState state;

  public static final String SERIALIZED_NAME_TRY_NUMBER = "try_number";
  @SerializedName(SERIALIZED_NAME_TRY_NUMBER)
  private Integer tryNumber;

  public static final String SERIALIZED_NAME_MAX_TRIES = "max_tries";
  @SerializedName(SERIALIZED_NAME_MAX_TRIES)
  private Integer maxTries;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_UNIXNAME = "unixname";
  @SerializedName(SERIALIZED_NAME_UNIXNAME)
  private String unixname;

  public static final String SERIALIZED_NAME_POOL = "pool";
  @SerializedName(SERIALIZED_NAME_POOL)
  private String pool;

  public static final String SERIALIZED_NAME_POOL_SLOTS = "pool_slots";
  @SerializedName(SERIALIZED_NAME_POOL_SLOTS)
  private Integer poolSlots;

  public static final String SERIALIZED_NAME_QUEUE = "queue";
  @SerializedName(SERIALIZED_NAME_QUEUE)
  private String queue;

  public static final String SERIALIZED_NAME_PRIORITY_WEIGHT = "priority_weight";
  @SerializedName(SERIALIZED_NAME_PRIORITY_WEIGHT)
  private Integer priorityWeight;

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private String operator;

  public static final String SERIALIZED_NAME_QUEUED_WHEN = "queued_when";
  @SerializedName(SERIALIZED_NAME_QUEUED_WHEN)
  private String queuedWhen;

  public static final String SERIALIZED_NAME_PID = "pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private Integer pid;

  public static final String SERIALIZED_NAME_EXECUTOR_CONFIG = "executor_config";
  @SerializedName(SERIALIZED_NAME_EXECUTOR_CONFIG)
  private String executorConfig;

  public static final String SERIALIZED_NAME_SLA_MISS = "sla_miss";
  @SerializedName(SERIALIZED_NAME_SLA_MISS)
  private SLAMiss slaMiss;


  public TaskInstance taskId(String taskId) {
    
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaskId() {
    return taskId;
  }


  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }


  public TaskInstance dagId(String dagId) {
    
    this.dagId = dagId;
    return this;
  }

   /**
   * Get dagId
   * @return dagId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDagId() {
    return dagId;
  }


  public void setDagId(String dagId) {
    this.dagId = dagId;
  }


  public TaskInstance executionDate(String executionDate) {
    
    this.executionDate = executionDate;
    return this;
  }

   /**
   * Get executionDate
   * @return executionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExecutionDate() {
    return executionDate;
  }


  public void setExecutionDate(String executionDate) {
    this.executionDate = executionDate;
  }


  public TaskInstance startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public TaskInstance endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public TaskInstance duration(BigDecimal duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getDuration() {
    return duration;
  }


  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }


  public TaskInstance state(TaskState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaskState getState() {
    return state;
  }


  public void setState(TaskState state) {
    this.state = state;
  }


  public TaskInstance tryNumber(Integer tryNumber) {
    
    this.tryNumber = tryNumber;
    return this;
  }

   /**
   * Get tryNumber
   * @return tryNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTryNumber() {
    return tryNumber;
  }


  public void setTryNumber(Integer tryNumber) {
    this.tryNumber = tryNumber;
  }


  public TaskInstance maxTries(Integer maxTries) {
    
    this.maxTries = maxTries;
    return this;
  }

   /**
   * Get maxTries
   * @return maxTries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxTries() {
    return maxTries;
  }


  public void setMaxTries(Integer maxTries) {
    this.maxTries = maxTries;
  }


  public TaskInstance hostname(String hostname) {
    
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostname() {
    return hostname;
  }


  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public TaskInstance unixname(String unixname) {
    
    this.unixname = unixname;
    return this;
  }

   /**
   * Get unixname
   * @return unixname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUnixname() {
    return unixname;
  }


  public void setUnixname(String unixname) {
    this.unixname = unixname;
  }


  public TaskInstance pool(String pool) {
    
    this.pool = pool;
    return this;
  }

   /**
   * Get pool
   * @return pool
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPool() {
    return pool;
  }


  public void setPool(String pool) {
    this.pool = pool;
  }


  public TaskInstance poolSlots(Integer poolSlots) {
    
    this.poolSlots = poolSlots;
    return this;
  }

   /**
   * Get poolSlots
   * @return poolSlots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPoolSlots() {
    return poolSlots;
  }


  public void setPoolSlots(Integer poolSlots) {
    this.poolSlots = poolSlots;
  }


  public TaskInstance queue(String queue) {
    
    this.queue = queue;
    return this;
  }

   /**
   * Get queue
   * @return queue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getQueue() {
    return queue;
  }


  public void setQueue(String queue) {
    this.queue = queue;
  }


  public TaskInstance priorityWeight(Integer priorityWeight) {
    
    this.priorityWeight = priorityWeight;
    return this;
  }

   /**
   * Get priorityWeight
   * @return priorityWeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPriorityWeight() {
    return priorityWeight;
  }


  public void setPriorityWeight(Integer priorityWeight) {
    this.priorityWeight = priorityWeight;
  }


  public TaskInstance operator(String operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOperator() {
    return operator;
  }


  public void setOperator(String operator) {
    this.operator = operator;
  }


  public TaskInstance queuedWhen(String queuedWhen) {
    
    this.queuedWhen = queuedWhen;
    return this;
  }

   /**
   * Get queuedWhen
   * @return queuedWhen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getQueuedWhen() {
    return queuedWhen;
  }


  public void setQueuedWhen(String queuedWhen) {
    this.queuedWhen = queuedWhen;
  }


  public TaskInstance pid(Integer pid) {
    
    this.pid = pid;
    return this;
  }

   /**
   * Get pid
   * @return pid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPid() {
    return pid;
  }


  public void setPid(Integer pid) {
    this.pid = pid;
  }


  public TaskInstance executorConfig(String executorConfig) {
    
    this.executorConfig = executorConfig;
    return this;
  }

   /**
   * Get executorConfig
   * @return executorConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExecutorConfig() {
    return executorConfig;
  }


  public void setExecutorConfig(String executorConfig) {
    this.executorConfig = executorConfig;
  }


  public TaskInstance slaMiss(SLAMiss slaMiss) {
    
    this.slaMiss = slaMiss;
    return this;
  }

   /**
   * Get slaMiss
   * @return slaMiss
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SLAMiss getSlaMiss() {
    return slaMiss;
  }


  public void setSlaMiss(SLAMiss slaMiss) {
    this.slaMiss = slaMiss;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskInstance taskInstance = (TaskInstance) o;
    return Objects.equals(this.taskId, taskInstance.taskId) &&
        Objects.equals(this.dagId, taskInstance.dagId) &&
        Objects.equals(this.executionDate, taskInstance.executionDate) &&
        Objects.equals(this.startDate, taskInstance.startDate) &&
        Objects.equals(this.endDate, taskInstance.endDate) &&
        Objects.equals(this.duration, taskInstance.duration) &&
        Objects.equals(this.state, taskInstance.state) &&
        Objects.equals(this.tryNumber, taskInstance.tryNumber) &&
        Objects.equals(this.maxTries, taskInstance.maxTries) &&
        Objects.equals(this.hostname, taskInstance.hostname) &&
        Objects.equals(this.unixname, taskInstance.unixname) &&
        Objects.equals(this.pool, taskInstance.pool) &&
        Objects.equals(this.poolSlots, taskInstance.poolSlots) &&
        Objects.equals(this.queue, taskInstance.queue) &&
        Objects.equals(this.priorityWeight, taskInstance.priorityWeight) &&
        Objects.equals(this.operator, taskInstance.operator) &&
        Objects.equals(this.queuedWhen, taskInstance.queuedWhen) &&
        Objects.equals(this.pid, taskInstance.pid) &&
        Objects.equals(this.executorConfig, taskInstance.executorConfig) &&
        Objects.equals(this.slaMiss, taskInstance.slaMiss);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskId, dagId, executionDate, startDate, endDate, duration, state, tryNumber, maxTries, hostname, unixname, pool, poolSlots, queue, priorityWeight, operator, queuedWhen, pid, executorConfig, slaMiss);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskInstance {\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    dagId: ").append(toIndentedString(dagId)).append("\n");
    sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    tryNumber: ").append(toIndentedString(tryNumber)).append("\n");
    sb.append("    maxTries: ").append(toIndentedString(maxTries)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    unixname: ").append(toIndentedString(unixname)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
    sb.append("    poolSlots: ").append(toIndentedString(poolSlots)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    priorityWeight: ").append(toIndentedString(priorityWeight)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    queuedWhen: ").append(toIndentedString(queuedWhen)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    executorConfig: ").append(toIndentedString(executorConfig)).append("\n");
    sb.append("    slaMiss: ").append(toIndentedString(slaMiss)).append("\n");
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

