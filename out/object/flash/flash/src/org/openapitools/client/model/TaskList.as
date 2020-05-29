package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.ClassReference;
import org.openapitools.client.model.DAG;
import org.openapitools.client.model.TaskExtraLinks;
import org.openapitools.client.model.TimeDelta;
import org.openapitools.client.model.TriggerRule;
import org.openapitools.client.model.WeightRule;

    public class TaskList implements ListWrapper {
        // This declaration below of _Task_obj_class is to force flash compiler to include this class
        private var _task_obj_class: org.openapitools.client.model.Task = null;
        [XmlElements(name="task", type="org.openapitools.client.model.Task")]
        public var task: Array = new Array();

        public function getList(): Array{
            return task;
        }

}

}
