package org.openapitools.client.model {


    [XmlRootNode(name="ConfigOption")]
    public class ConfigOption {
                [XmlElement(name="key")]
        public var key: String = null;
                [XmlElement(name="value")]
        public var value: String = null;

    public function toString(): String {
        var str: String = "ConfigOption: ";
        str += " (key: " + key + ")";
        str += " (value: " + value + ")";
        return str;
    }

}

}
