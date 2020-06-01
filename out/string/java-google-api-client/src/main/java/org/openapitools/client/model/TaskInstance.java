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
import org.openapitools.client.model.SLAMiss;
import org.openapitools.client.model.TaskState;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * TaskInstance
 */
@JsonPropertyOrder({
  TaskInstance.JSON_PROPERTY_TASK_ID,
  TaskInstance.JSON_PROPERTY_DAG_ID,
  TaskInstance.JSON_PROPERTY_EXECUTION_DATE,
  TaskInstance.JSON_PROPERTY_START_DATE,
  TaskInstance.JSON_PROPERTY_END_DATE,
  TaskInstance.JSON_PROPERTY_DURATION,
  TaskInstance.JSON_PROPERTY_STATE,
  TaskInstance.JSON_PROPERTY_TRY_NUMBER,
  TaskInstance.JSON_PROPERTY_MAX_TRIES,
  TaskInstance.JSON_PROPERTY_HOSTNAME,
  TaskInstance.JSON_PROPERTY_UNIXNAME,
  TaskInstance.JSON_PROPERTY_POOL,
  TaskInstance.JSON_PROPERTY_POOL_SLOTS,
  TaskInstance.JSON_PROPERTY_QUEUE,
  TaskInstance.JSON_PROPERTY_PRIORITY_WEIGHT,
  TaskInstance.JSON_PROPERTY_OPERATOR,
  TaskInstance.JSON_PROPERTY_QUEUED_WHEN,
  TaskInstance.JSON_PROPERTY_PID,
  TaskInstance.JSON_PROPERTY_EXECUTOR_CONFIG,
  TaskInstance.JSON_PROPERTY_SLA_MISS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-31T07:37:27.206Z[GMT]")
public class TaskInstance {
  public static final String JSON_PROPERTY_TASK_ID = "task_id";
  private String taskId;

  public static final String JSON_PROPERTY_DAG_ID = "dag_id";
  private String dagId;

  public static final String JSON_PROPERTY_EXECUTION_DATE = "execution_date";
  private String executionDate;

  public static final String JSON_PROPERTY_START_DATE = "start_date";
  private String startDate;

  public static final String JSON_PROPERTY_END_DATE = "end_date";
  private String endDate;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private BigDecimal duration;

  public static final String JSON_PROPERTY_STATE = "state";
  private TaskState state;

  public static final String JSON_PROPERTY_TRY_NUMBER = "try_number";
  private Integer tryNumber;

  public static final String JSON_PROPERTY_MAX_TRIES = "max_tries";
  private Integer maxTries;

  public static final String JSON_PROPERTY_HOSTNAME = "hostname";
  private String hostname;

  public static final String JSON_PROPERTY_UNIXNAME = "unixname";
  private String unixname;

  public static final String JSON_PROPERTY_POOL = "pool";
  private String pool;

  public static final String JSON_PROPERTY_POOL_SLOTS = "pool_slots";
  private Integer poolSlots;

  public static final String JSON_PROPERTY_QUEUE = "queue";
  private String queue;

  public static final String JSON_PROPERTY_PRIORITY_WEIGHT = "priority_weight";
  private Integer priorityWeight;

  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private String operator;

  public static final String JSON_PROPERTY_QUEUED_WHEN = "queued_when";
  private String queuedWhen;

  public static final String JSON_PROPERTY_PID = "pid";
  private Integer pid;

  public static final String JSON_PROPERTY_EXECUTOR_CONFIG = "executor_config";
  private String executorConfig;

  public static final String JSON_PROPERTY_SLA_MISS = "sla_miss";
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
  @JsonProperty(JSON_PROPERTY_TASK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_DAG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_EXECUTION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_TRY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_MAX_TRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_HOSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_UNIXNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_POOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_POOL_SLOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_QUEUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_PRIORITY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_QUEUED_WHEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_PID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_EXECUTOR_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_SLA_MISS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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

