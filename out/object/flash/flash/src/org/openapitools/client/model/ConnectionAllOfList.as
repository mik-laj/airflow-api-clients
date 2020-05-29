package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class ConnectionAllOfList implements ListWrapper {
        // This declaration below of _Connection_allOf_obj_class is to force flash compiler to include this class
        private var _connectionAllOf_obj_class: org.openapitools.client.model.ConnectionAllOf = null;
        [XmlElements(name="connectionAllOf", type="org.openapitools.client.model.ConnectionAllOf")]
        public var connectionAllOf: Array = new Array();

        public function getList(): Array{
            return connectionAllOf;
        }

}

}
