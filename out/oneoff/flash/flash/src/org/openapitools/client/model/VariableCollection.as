package org.openapitools.client.model {

import org.openapitools.client.model.VariableCollectionItem;

    [XmlRootNode(name="VariableCollection")]
    public class VariableCollection {
                // This declaration below of _variables_obj_class is to force flash compiler to include this class
        private var _variables_obj_class: Array = null;
        [XmlElementWrapper(name="variables")]
        [XmlElements(name="variables", type="Array")]
                public var variables: Array = new Array();

    public function toString(): String {
        var str: String = "VariableCollection: ";
        str += " (variables: " + variables + ")";
        return str;
    }

}

}
