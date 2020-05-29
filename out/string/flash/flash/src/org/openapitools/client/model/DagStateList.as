package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class DagStateList implements ListWrapper {
        // This declaration below of _DagState_obj_class is to force flash compiler to include this class
        private var _dagState_obj_class: org.openapitools.client.model.DagState = null;
        [XmlElements(name="dagState", type="org.openapitools.client.model.DagState")]
        public var dagState: Array = new Array();

        public function getList(): Array{
            return dagState;
        }

}

}
