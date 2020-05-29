package org.openapitools.client.model {

import org.openapitools.client.model.Task;

    [XmlRootNode(name="TaskCollection")]
    public class TaskCollection {
                // This declaration below of _tasks_obj_class is to force flash compiler to include this class
        private var _tasks_obj_class: Array = null;
        [XmlElementWrapper(name="tasks")]
        [XmlElements(name="tasks", type="Array")]
                public var tasks: Array = new Array();

    public function toString(): String {
        var str: String = "TaskCollection: ";
        str += " (tasks: " + tasks + ")";
        return str;
    }

}

}
