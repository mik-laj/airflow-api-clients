package org.openapitools.client.model {

import org.openapitools.client.model.TaskInstanceReference;

    [XmlRootNode(name="TaskInstanceReferenceCollection")]
    public class TaskInstanceReferenceCollection {
                // This declaration below of _taskInstances_obj_class is to force flash compiler to include this class
        private var _taskInstances_obj_class: Array = null;
        [XmlElementWrapper(name="task_instances")]
        [XmlElements(name="taskInstances", type="Array")]
                public var taskInstances: Array = new Array();

    public function toString(): String {
        var str: String = "TaskInstanceReferenceCollection: ";
        str += " (taskInstances: " + taskInstances + ")";
        return str;
    }

}

}
