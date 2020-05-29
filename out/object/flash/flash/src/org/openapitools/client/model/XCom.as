package org.openapitools.client.model {

import org.openapitools.client.model.VariableAllOf;
import org.openapitools.client.model.XComCollectionItem;

    [XmlRootNode(name="XCom")]
    public class XCom {
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
                [XmlElement(name="value")]
        public var value: String = null;

    public function toString(): String {
        var str: String = "XCom: ";
        str += " (key: " + key + ")";
        str += " (timestamp: " + timestamp + ")";
        str += " (executionDate: " + executionDate + ")";
        str += " (taskId: " + taskId + ")";
        str += " (dagId: " + dagId + ")";
        str += " (value: " + value + ")";
        return str;
    }

}

}
