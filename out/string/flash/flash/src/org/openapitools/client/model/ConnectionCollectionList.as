package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.ConnectionCollectionItem;

    public class ConnectionCollectionList implements ListWrapper {
        // This declaration below of _ConnectionCollection_obj_class is to force flash compiler to include this class
        private var _connectionCollection_obj_class: org.openapitools.client.model.ConnectionCollection = null;
        [XmlElements(name="connectionCollection", type="org.openapitools.client.model.ConnectionCollection")]
        public var connectionCollection: Array = new Array();

        public function getList(): Array{
            return connectionCollection;
        }

}

}
