package org.openapitools.client.model {


    [XmlRootNode(name="SLAMiss")]
    public class SLAMiss {
                [XmlElement(name="task_id")]
        public var taskId: String = null;
                [XmlElement(name="dag_id")]
        public var dagId: String = null;
                [XmlElement(name="execution_date")]
        public var executionDate: String = null;
                [XmlElement(name="email_sent")]
        public var emailSent: Boolean = false;
                [XmlElement(name="timestamp")]
        public var timestamp: String = null;
                [XmlElement(name="description")]
        public var description: String = null;
                [XmlElement(name="notification_sent")]
        public var notificationSent: Boolean = false;

    public function toString(): String {
        var str: String = "SLAMiss: ";
        str += " (taskId: " + taskId + ")";
        str += " (dagId: " + dagId + ")";
        str += " (executionDate: " + executionDate + ")";
        str += " (emailSent: " + emailSent + ")";
        str += " (timestamp: " + timestamp + ")";
        str += " (description: " + description + ")";
        str += " (notificationSent: " + notificationSent + ")";
        return str;
    }

}

}
