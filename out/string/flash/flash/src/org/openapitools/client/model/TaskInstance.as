package org.openapitools.client.model {

import org.openapitools.client.model.SLAMiss;
import org.openapitools.client.model.TaskState;

    [XmlRootNode(name="TaskInstance")]
    public class TaskInstance {
                [XmlElement(name="task_id")]
        public var taskId: String = null;
                [XmlElement(name="dag_id")]
        public var dagId: String = null;
                [XmlElement(name="execution_date")]
        public var executionDate: String = null;
                [XmlElement(name="start_date")]
        public var startDate: String = null;
                [XmlElement(name="end_date")]
        public var endDate: String = null;
                [XmlElement(name="duration")]
        public var duration: Number = 0.0;
                [XmlElement(name="state")]
        public var state: TaskState = NaN;
                [XmlElement(name="try_number")]
        public var tryNumber: Number = 0;
                [XmlElement(name="max_tries")]
        public var maxTries: Number = 0;
                [XmlElement(name="hostname")]
        public var hostname: String = null;
                [XmlElement(name="unixname")]
        public var unixname: String = null;
                [XmlElement(name="pool")]
        public var pool: String = null;
                [XmlElement(name="pool_slots")]
        public var poolSlots: Number = 0;
                [XmlElement(name="queue")]
        public var queue: String = null;
                [XmlElement(name="priority_weight")]
        public var priorityWeight: Number = 0;
                [XmlElement(name="operator")]
        public var operator: String = null;
                [XmlElement(name="queued_when")]
        public var queuedWhen: String = null;
                [XmlElement(name="pid")]
        public var pid: Number = 0;
                [XmlElement(name="executor_config")]
        public var executorConfig: String = null;
                [XmlElement(name="sla_miss")]
        public var slaMiss: SLAMiss = NaN;

    public function toString(): String {
        var str: String = "TaskInstance: ";
        str += " (taskId: " + taskId + ")";
        str += " (dagId: " + dagId + ")";
        str += " (executionDate: " + executionDate + ")";
        str += " (startDate: " + startDate + ")";
        str += " (endDate: " + endDate + ")";
        str += " (duration: " + duration + ")";
        str += " (state: " + state + ")";
        str += " (tryNumber: " + tryNumber + ")";
        str += " (maxTries: " + maxTries + ")";
        str += " (hostname: " + hostname + ")";
        str += " (unixname: " + unixname + ")";
        str += " (pool: " + pool + ")";
        str += " (poolSlots: " + poolSlots + ")";
        str += " (queue: " + queue + ")";
        str += " (priorityWeight: " + priorityWeight + ")";
        str += " (operator: " + operator + ")";
        str += " (queuedWhen: " + queuedWhen + ")";
        str += " (pid: " + pid + ")";
        str += " (executorConfig: " + executorConfig + ")";
        str += " (slaMiss: " + slaMiss + ")";
        return str;
    }

}

}
