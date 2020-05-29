package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class TaskFailList implements ListWrapper {
        // This declaration below of _TaskFail_obj_class is to force flash compiler to include this class
        private var _taskFail_obj_class: org.openapitools.client.model.TaskFail = null;
        [XmlElements(name="taskFail", type="org.openapitools.client.model.TaskFail")]
        public var taskFail: Array = new Array();

        public function getList(): Array{
            return taskFail;
        }

}

}
