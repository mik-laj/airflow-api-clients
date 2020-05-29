package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.ClassReference;

    public class TaskExtraLinksList implements ListWrapper {
        // This declaration below of _Task_extra_links_obj_class is to force flash compiler to include this class
        private var _taskExtraLinks_obj_class: org.openapitools.client.model.TaskExtraLinks = null;
        [XmlElements(name="taskExtraLinks", type="org.openapitools.client.model.TaskExtraLinks")]
        public var taskExtraLinks: Array = new Array();

        public function getList(): Array{
            return taskExtraLinks;
        }

}

}
