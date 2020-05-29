package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.DagState;
import org.openapitools.client.model.Object;

    public class DAGRunList implements ListWrapper {
        // This declaration below of _DAGRun_obj_class is to force flash compiler to include this class
        private var _dAGRun_obj_class: org.openapitools.client.model.DAGRun = null;
        [XmlElements(name="dAGRun", type="org.openapitools.client.model.DAGRun")]
        public var dAGRun: Array = new Array();

        public function getList(): Array{
            return dAGRun;
        }

}

}
