package org.openapitools.client.model {

import org.openapitools.client.model.SLAMiss;

    [XmlRootNode(name="SLAMissCollection")]
    public class SLAMissCollection {
                // This declaration below of _slaMisses_obj_class is to force flash compiler to include this class
        private var _slaMisses_obj_class: Array = null;
        [XmlElementWrapper(name="sla_misses")]
        [XmlElements(name="slaMisses", type="Array")]
                public var slaMisses: Array = new Array();

    public function toString(): String {
        var str: String = "SLAMissCollection: ";
        str += " (slaMisses: " + slaMisses + ")";
        return str;
    }

}

}
