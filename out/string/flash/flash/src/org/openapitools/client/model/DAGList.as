package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.OneOfScheduleInterval;
import org.openapitools.client.model.Tag;

    public class DAGList implements ListWrapper {
        // This declaration below of _DAG_obj_class is to force flash compiler to include this class
        private var _dag_obj_class: org.openapitools.client.model.DAG = null;
        [XmlElements(name="dag", type="org.openapitools.client.model.DAG")]
        public var dag: Array = new Array();

        public function getList(): Array{
            return dag;
        }

}

}
