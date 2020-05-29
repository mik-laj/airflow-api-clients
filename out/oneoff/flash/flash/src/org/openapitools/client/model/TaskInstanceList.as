package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.SLAMiss;
import org.openapitools.client.model.TaskState;

    public class TaskInstanceList implements ListWrapper {
        // This declaration below of _TaskInstance_obj_class is to force flash compiler to include this class
        private var _taskInstance_obj_class: org.openapitools.client.model.TaskInstance = null;
        [XmlElements(name="taskInstance", type="org.openapitools.client.model.TaskInstance")]
        public var taskInstance: Array = new Array();

        public function getList(): Array{
            return taskInstance;
        }

}

}
