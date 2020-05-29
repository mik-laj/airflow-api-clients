package org.openapitools.client.model {


    [XmlRootNode(name="XComCollectionItem")]
    public class XComCollectionItem {
                [XmlElement(name="key")]
        public var key: String = null;
                [XmlElement(name="timestamp")]
        public var timestamp: String = null;
                [XmlElement(name="execution_date")]
        public var executionDate: String = null;
                [XmlElement(name="task_id")]
        public var taskId: String = null;
                [XmlElement(name="dag_id")]
        public var dagId: String = null;

    public function toString(): String {
        var str: String = "XComCollectionItem: ";
        str += " (key: " + key + ")";
        str += " (timestamp: " + timestamp + ")";
        str += " (executionDate: " + executionDate + ")";
        str += " (taskId: " + taskId + ")";
        str += " (dagId: " + dagId + ")";
        return str;
    }

}

}
