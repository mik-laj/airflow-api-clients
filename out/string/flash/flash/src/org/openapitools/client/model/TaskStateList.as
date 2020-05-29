package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class TaskStateList implements ListWrapper {
        // This declaration below of _TaskState_obj_class is to force flash compiler to include this class
        private var _taskState_obj_class: org.openapitools.client.model.TaskState = null;
        [XmlElements(name="taskState", type="org.openapitools.client.model.TaskState")]
        public var taskState: Array = new Array();

        public function getList(): Array{
            return taskState;
        }

}

}
