package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.TaskInstanceReference;

    public class TaskInstanceReferenceCollectionList implements ListWrapper {
        // This declaration below of _TaskInstanceReferenceCollection_obj_class is to force flash compiler to include this class
        private var _taskInstanceReferenceCollection_obj_class: org.openapitools.client.model.TaskInstanceReferenceCollection = null;
        [XmlElements(name="taskInstanceReferenceCollection", type="org.openapitools.client.model.TaskInstanceReferenceCollection")]
        public var taskInstanceReferenceCollection: Array = new Array();

        public function getList(): Array{
            return taskInstanceReferenceCollection;
        }

}

}
