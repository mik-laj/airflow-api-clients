package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.VariableAllOf;
import org.openapitools.client.model.VariableCollectionItem;

    public class VariableList implements ListWrapper {
        // This declaration below of _Variable_obj_class is to force flash compiler to include this class
        private var _variable_obj_class: org.openapitools.client.model.Variable = null;
        [XmlElements(name="variable", type="org.openapitools.client.model.Variable")]
        public var variable: Array = new Array();

        public function getList(): Array{
            return variable;
        }

}

}
