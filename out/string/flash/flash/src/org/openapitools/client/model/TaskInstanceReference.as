package org.openapitools.client.model {


    [XmlRootNode(name="TaskInstanceReference")]
    public class TaskInstanceReference {
                [XmlElement(name="task_id")]
        public var taskId: String = null;
                [XmlElement(name="dag_id")]
        public var dagId: String = null;
                [XmlElement(name="execution_date")]
        public var executionDate: String = null;
                [XmlElement(name="dag_run_id")]
        public var dagRunId: String = null;

    public function toString(): String {
        var str: String = "TaskInstanceReference: ";
        str += " (taskId: " + taskId + ")";
        str += " (dagId: " + dagId + ")";
        str += " (executionDate: " + executionDate + ")";
        str += " (dagRunId: " + dagRunId + ")";
        return str;
    }

}

}
