package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class PoolList implements ListWrapper {
        // This declaration below of _Pool_obj_class is to force flash compiler to include this class
        private var _pool_obj_class: org.openapitools.client.model.Pool = null;
        [XmlElements(name="pool", type="org.openapitools.client.model.Pool")]
        public var pool: Array = new Array();

        public function getList(): Array{
            return pool;
        }

}

}
