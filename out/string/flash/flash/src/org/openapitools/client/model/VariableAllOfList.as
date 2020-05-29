package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class VariableAllOfList implements ListWrapper {
        // This declaration below of _Variable_allOf_obj_class is to force flash compiler to include this class
        private var _variableAllOf_obj_class: org.openapitools.client.model.VariableAllOf = null;
        [XmlElements(name="variableAllOf", type="org.openapitools.client.model.VariableAllOf")]
        public var variableAllOf: Array = new Array();

        public function getList(): Array{
            return variableAllOf;
        }

}

}
