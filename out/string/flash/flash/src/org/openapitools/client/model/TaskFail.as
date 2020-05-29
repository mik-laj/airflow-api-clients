package org.openapitools.client.model {


    [XmlRootNode(name="TaskFail")]
    public class TaskFail {
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
        public var duration: Number = 0;

    public function toString(): String {
        var str: String = "TaskFail: ";
        str += " (taskId: " + taskId + ")";
        str += " (dagId: " + dagId + ")";
        str += " (executionDate: " + executionDate + ")";
        str += " (startDate: " + startDate + ")";
        str += " (endDate: " + endDate + ")";
        str += " (duration: " + duration + ")";
        return str;
    }

}

}
