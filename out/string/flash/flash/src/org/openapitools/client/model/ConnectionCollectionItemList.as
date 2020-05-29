package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class ConnectionCollectionItemList implements ListWrapper {
        // This declaration below of _ConnectionCollectionItem_obj_class is to force flash compiler to include this class
        private var _connectionCollectionItem_obj_class: org.openapitools.client.model.ConnectionCollectionItem = null;
        [XmlElements(name="connectionCollectionItem", type="org.openapitools.client.model.ConnectionCollectionItem")]
        public var connectionCollectionItem: Array = new Array();

        public function getList(): Array{
            return connectionCollectionItem;
        }

}

}
