package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.Task;

    public class TaskCollectionList implements ListWrapper {
        // This declaration below of _TaskCollection_obj_class is to force flash compiler to include this class
        private var _taskCollection_obj_class: org.openapitools.client.model.TaskCollection = null;
        [XmlElements(name="taskCollection", type="org.openapitools.client.model.TaskCollection")]
        public var taskCollection: Array = new Array();

        public function getList(): Array{
            return taskCollection;
        }

}

}
