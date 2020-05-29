package org.openapitools.client.model {

import org.openapitools.client.model.ConfigOption;

    [XmlRootNode(name="ConfigSection")]
    public class ConfigSection {
                [XmlElement(name="name")]
        public var name: String = null;
                // This declaration below of _options_obj_class is to force flash compiler to include this class
        private var _options_obj_class: Array = null;
        [XmlElementWrapper(name="options")]
        [XmlElements(name="options", type="Array")]
                public var options: Array = new Array();

    public function toString(): String {
        var str: String = "ConfigSection: ";
        str += " (name: " + name + ")";
        str += " (options: " + options + ")";
        return str;
    }

}

}
