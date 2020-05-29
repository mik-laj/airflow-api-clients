package org.openapitools.client.model {

import org.openapitools.client.model.ClassReference;
import org.openapitools.client.model.DAG;
import org.openapitools.client.model.TaskExtraLinks;
import org.openapitools.client.model.TimeDelta;
import org.openapitools.client.model.TriggerRule;
import org.openapitools.client.model.WeightRule;

    [XmlRootNode(name="Task")]
    public class Task {
                [XmlElement(name="class_ref")]
        public var classRef: ClassReference = NaN;
                [XmlElement(name="task_id")]
        public var taskId: String = null;
                [XmlElement(name="owner")]
        public var owner: String = null;
                [XmlElement(name="start_date")]
        public var startDate: Date = null;
                [XmlElement(name="end_date")]
        public var endDate: Date = null;
                [XmlElement(name="trigger_rule")]
        public var triggerRule: TriggerRule = NaN;
                // This declaration below of _extraLinks_obj_class is to force flash compiler to include this class
        private var _extraLinks_obj_class: Array = null;
        [XmlElementWrapper(name="extra_links")]
        [XmlElements(name="extraLinks", type="Array")]
                public var extraLinks: Array = new Array();
                [XmlElement(name="depends_on_past")]
        public var dependsOnPast: Boolean = false;
                [XmlElement(name="wait_for_downstream")]
        public var waitForDownstream: Boolean = false;
                [XmlElement(name="retries")]
        public var retries: Number = 0.0;
                [XmlElement(name="queue")]
        public var queue: String = null;
                [XmlElement(name="pool")]
        public var pool: String = null;
                [XmlElement(name="pool_slots")]
        public var poolSlots: Number = 0.0;
                [XmlElement(name="execution_timeout")]
        public var executionTimeout: TimeDelta = NaN;
                [XmlElement(name="retry_delay")]
        public var retryDelay: TimeDelta = NaN;
                [XmlElement(name="retry_exponential_backoff")]
        public var retryExponentialBackoff: Boolean = false;
                [XmlElement(name="priority_weight")]
        public var priorityWeight: Number = 0.0;
                [XmlElement(name="weight_rule")]
        public var weightRule: WeightRule = NaN;
                [XmlElement(name="ui_color")]
        public var uiColor: String = null;
                [XmlElement(name="ui_fgcolor")]
        public var uiFgcolor: String = null;
                // This declaration below of _templateFields_obj_class is to force flash compiler to include this class
        private var _templateFields_obj_class: Array = null;
        [XmlElementWrapper(name="template_fields")]
        [XmlElements(name="templateFields", type="Array")]
                public var templateFields: Array = new Array();
                [XmlElement(name="sub_dag")]
        public var subDag: DAG = NaN;
                // This declaration below of _downstreamTaskIds_obj_class is to force flash compiler to include this class
        private var _downstreamTaskIds_obj_class: Array = null;
        [XmlElementWrapper(name="downstream_task_ids")]
        [XmlElements(name="downstreamTaskIds", type="Array")]
                public var downstreamTaskIds: Array = new Array();

    public function toString(): String {
        var str: String = "Task: ";
        str += " (classRef: " + classRef + ")";
        str += " (taskId: " + taskId + ")";
        str += " (owner: " + owner + ")";
        str += " (startDate: " + startDate + ")";
        str += " (endDate: " + endDate + ")";
        str += " (triggerRule: " + triggerRule + ")";
        str += " (extraLinks: " + extraLinks + ")";
        str += " (dependsOnPast: " + dependsOnPast + ")";
        str += " (waitForDownstream: " + waitForDownstream + ")";
        str += " (retries: " + retries + ")";
        str += " (queue: " + queue + ")";
        str += " (pool: " + pool + ")";
        str += " (poolSlots: " + poolSlots + ")";
        str += " (executionTimeout: " + executionTimeout + ")";
        str += " (retryDelay: " + retryDelay + ")";
        str += " (retryExponentialBackoff: " + retryExponentialBackoff + ")";
        str += " (priorityWeight: " + priorityWeight + ")";
        str += " (weightRule: " + weightRule + ")";
        str += " (uiColor: " + uiColor + ")";
        str += " (uiFgcolor: " + uiFgcolor + ")";
        str += " (templateFields: " + templateFields + ")";
        str += " (subDag: " + subDag + ")";
        str += " (downstreamTaskIds: " + downstreamTaskIds + ")";
        return str;
    }

}

}
