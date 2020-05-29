package org.openapitools.client.model {


    [XmlRootNode(name="VariableCollectionItem")]
    public class VariableCollectionItem {
                [XmlElement(name="key")]
        public var key: String = null;

    public function toString(): String {
        var str: String = "VariableCollectionItem: ";
        str += " (key: " + key + ")";
        return str;
    }

}

}
