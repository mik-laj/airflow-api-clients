package org.openapitools.client.model {

import org.openapitools.client.model.VariableAllOf;
import org.openapitools.client.model.VariableCollectionItem;

    [XmlRootNode(name="Variable")]
    public class Variable {
                [XmlElement(name="key")]
        public var key: String = null;
                [XmlElement(name="value")]
        public var value: String = null;

    public function toString(): String {
        var str: String = "Variable: ";
        str += " (key: " + key + ")";
        str += " (value: " + value + ")";
        return str;
    }

}

}
