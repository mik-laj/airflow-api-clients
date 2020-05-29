package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.ConnectionAllOf;
import org.openapitools.client.model.ConnectionCollectionItem;

    public class ConnectionList implements ListWrapper {
        // This declaration below of _Connection_obj_class is to force flash compiler to include this class
        private var _connection_obj_class: org.openapitools.client.model.Connection = null;
        [XmlElements(name="connection", type="org.openapitools.client.model.Connection")]
        public var connection: Array = new Array();

        public function getList(): Array{
            return connection;
        }

}

}
