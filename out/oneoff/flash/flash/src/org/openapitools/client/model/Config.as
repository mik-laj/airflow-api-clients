package org.openapitools.client.model {

import org.openapitools.client.model.ConfigSection;

    [XmlRootNode(name="Config")]
    public class Config {
                // This declaration below of _sections_obj_class is to force flash compiler to include this class
        private var _sections_obj_class: Array = null;
        [XmlElementWrapper(name="sections")]
        [XmlElements(name="sections", type="Array")]
                public var sections: Array = new Array();

    public function toString(): String {
        var str: String = "Config: ";
        str += " (sections: " + sections + ")";
        return str;
    }

}

}
