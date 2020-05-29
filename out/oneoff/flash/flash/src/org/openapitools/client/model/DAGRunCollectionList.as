package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.DAGRun;

    public class DAGRunCollectionList implements ListWrapper {
        // This declaration below of _DAGRunCollection_obj_class is to force flash compiler to include this class
        private var _dAGRunCollection_obj_class: org.openapitools.client.model.DAGRunCollection = null;
        [XmlElements(name="dAGRunCollection", type="org.openapitools.client.model.DAGRunCollection")]
        public var dAGRunCollection: Array = new Array();

        public function getList(): Array{
            return dAGRunCollection;
        }

}

}
