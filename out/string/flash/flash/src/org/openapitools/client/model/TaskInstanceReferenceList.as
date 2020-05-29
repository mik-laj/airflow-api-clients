package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class TaskInstanceReferenceList implements ListWrapper {
        // This declaration below of _TaskInstanceReference_obj_class is to force flash compiler to include this class
        private var _taskInstanceReference_obj_class: org.openapitools.client.model.TaskInstanceReference = null;
        [XmlElements(name="taskInstanceReference", type="org.openapitools.client.model.TaskInstanceReference")]
        public var taskInstanceReference: Array = new Array();

        public function getList(): Array{
            return taskInstanceReference;
        }

}

}
