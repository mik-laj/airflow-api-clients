package org.openapitools.client.model {


    [XmlRootNode(name="VariableAllOf")]
    public class VariableAllOf {
                [XmlElement(name="value")]
        public var value: String = null;

    public function toString(): String {
        var str: String = "VariableAllOf: ";
        str += " (value: " + value + ")";
        return str;
    }

}

}
