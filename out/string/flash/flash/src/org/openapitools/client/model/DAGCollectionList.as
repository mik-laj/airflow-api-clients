package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.DAG;

    public class DAGCollectionList implements ListWrapper {
        // This declaration below of _DAGCollection_obj_class is to force flash compiler to include this class
        private var _dAGCollection_obj_class: org.openapitools.client.model.DAGCollection = null;
        [XmlElements(name="dAGCollection", type="org.openapitools.client.model.DAGCollection")]
        public var dAGCollection: Array = new Array();

        public function getList(): Array{
            return dAGCollection;
        }

}

}
