package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.Pool;

    public class PoolCollectionList implements ListWrapper {
        // This declaration below of _PoolCollection_obj_class is to force flash compiler to include this class
        private var _poolCollection_obj_class: org.openapitools.client.model.PoolCollection = null;
        [XmlElements(name="poolCollection", type="org.openapitools.client.model.PoolCollection")]
        public var poolCollection: Array = new Array();

        public function getList(): Array{
            return poolCollection;
        }

}

}
