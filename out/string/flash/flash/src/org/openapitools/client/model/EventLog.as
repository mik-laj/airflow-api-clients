package org.openapitools.client.model {


    [XmlRootNode(name="EventLog")]
    public class EventLog {
                [XmlElement(name="event_log_id")]
        public var eventLogId: Number = 0;
                [XmlElement(name="when")]
        public var when: String = null;
                [XmlElement(name="dag_id")]
        public var dagId: String = null;
                [XmlElement(name="task_id")]
        public var taskId: String = null;
                [XmlElement(name="event")]
        public var event: String = null;
                [XmlElement(name="execution_date")]
        public var executionDate: String = null;
                [XmlElement(name="owner")]
        public var owner: String = null;
                [XmlElement(name="extra")]
        public var extra: String = null;

    public function toString(): String {
        var str: String = "EventLog: ";
        str += " (eventLogId: " + eventLogId + ")";
        str += " (when: " + when + ")";
        str += " (dagId: " + dagId + ")";
        str += " (taskId: " + taskId + ")";
        str += " (event: " + event + ")";
        str += " (executionDate: " + executionDate + ")";
        str += " (owner: " + owner + ")";
        str += " (extra: " + extra + ")";
        return str;
    }

}

}
