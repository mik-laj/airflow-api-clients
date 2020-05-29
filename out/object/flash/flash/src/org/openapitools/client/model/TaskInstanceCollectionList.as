package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.TaskInstance;

    public class TaskInstanceCollectionList implements ListWrapper {
        // This declaration below of _TaskInstanceCollection_obj_class is to force flash compiler to include this class
        private var _taskInstanceCollection_obj_class: org.openapitools.client.model.TaskInstanceCollection = null;
        [XmlElements(name="taskInstanceCollection", type="org.openapitools.client.model.TaskInstanceCollection")]
        public var taskInstanceCollection: Array = new Array();

        public function getList(): Array{
            return taskInstanceCollection;
        }

}

}
