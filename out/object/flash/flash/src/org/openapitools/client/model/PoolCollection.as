package org.openapitools.client.model {

import org.openapitools.client.model.Pool;

    [XmlRootNode(name="PoolCollection")]
    public class PoolCollection {
                // This declaration below of _pools_obj_class is to force flash compiler to include this class
        private var _pools_obj_class: Array = null;
        [XmlElementWrapper(name="pools")]
        [XmlElements(name="pools", type="Array")]
                public var pools: Array = new Array();

    public function toString(): String {
        var str: String = "PoolCollection: ";
        str += " (pools: " + pools + ")";
        return str;
    }

}

}
