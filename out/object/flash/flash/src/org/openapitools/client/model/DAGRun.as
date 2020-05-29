package org.openapitools.client.model {

import org.openapitools.client.model.DagState;
import org.openapitools.client.model.Object;

    [XmlRootNode(name="DAGRun")]
    public class DAGRun {
        /* Run ID. The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error. If not provided, a value will be generated based on execution_date. If the specified dag_run_id is in use, the creation request fails with an ALREADY_EXISTS error. This together with DAG_ID are a unique key.  */
        [XmlElement(name="dag_run_id")]
        public var dagRunId: String = null;
                [XmlElement(name="dag_id")]
        public var dagId: String = null;
        /* The execution date. This is the time when the DAG run should be started according to the DAG definition. The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error. This together with DAG_ID are a unique key.  */
        [XmlElement(name="execution_date")]
        public var executionDate: Date = null;
        /* The start time. The time when DAG Run was actually created..  */
        [XmlElement(name="start_date")]
        public var startDate: Date = null;
                [XmlElement(name="end_date")]
        public var endDate: Date = null;
                [XmlElement(name="state")]
        public var state: DagState = NaN;
                [XmlElement(name="external_trigger")]
        public var externalTrigger: Boolean = false;
                [XmlElement(name="conf")]
        public var conf: Object = NaN;

    public function toString(): String {
        var str: String = "DAGRun: ";
        str += " (dagRunId: " + dagRunId + ")";
        str += " (dagId: " + dagId + ")";
        str += " (executionDate: " + executionDate + ")";
        str += " (startDate: " + startDate + ")";
        str += " (endDate: " + endDate + ")";
        str += " (state: " + state + ")";
        str += " (externalTrigger: " + externalTrigger + ")";
        str += " (conf: " + conf + ")";
        return str;
    }

}

}
