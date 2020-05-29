package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.TimeDelta;

    public class DAGDetailAllOfList implements ListWrapper {
        // This declaration below of _DAGDetail_allOf_obj_class is to force flash compiler to include this class
        private var _dAGDetailAllOf_obj_class: org.openapitools.client.model.DAGDetailAllOf = null;
        [XmlElements(name="dAGDetailAllOf", type="org.openapitools.client.model.DAGDetailAllOf")]
        public var dAGDetailAllOf: Array = new Array();

        public function getList(): Array{
            return dAGDetailAllOf;
        }

}

}
