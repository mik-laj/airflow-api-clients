package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class VariableCollectionItemList implements ListWrapper {
        // This declaration below of _VariableCollectionItem_obj_class is to force flash compiler to include this class
        private var _variableCollectionItem_obj_class: org.openapitools.client.model.VariableCollectionItem = null;
        [XmlElements(name="variableCollectionItem", type="org.openapitools.client.model.VariableCollectionItem")]
        public var variableCollectionItem: Array = new Array();

        public function getList(): Array{
            return variableCollectionItem;
        }

}

}
