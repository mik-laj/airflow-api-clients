package org.openapitools.client.model {

import org.openapitools.client.model.ConnectionCollectionItem;

    [XmlRootNode(name="ConnectionCollection")]
    public class ConnectionCollection {
                // This declaration below of _connections_obj_class is to force flash compiler to include this class
        private var _connections_obj_class: Array = null;
        [XmlElementWrapper(name="connections")]
        [XmlElements(name="connections", type="Array")]
                public var connections: Array = new Array();

    public function toString(): String {
        var str: String = "ConnectionCollection: ";
        str += " (connections: " + connections + ")";
        return str;
    }

}

}
