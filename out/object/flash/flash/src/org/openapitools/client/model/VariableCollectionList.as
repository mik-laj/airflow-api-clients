package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.VariableCollectionItem;

    public class VariableCollectionList implements ListWrapper {
        // This declaration below of _VariableCollection_obj_class is to force flash compiler to include this class
        private var _variableCollection_obj_class: org.openapitools.client.model.VariableCollection = null;
        [XmlElements(name="variableCollection", type="org.openapitools.client.model.VariableCollection")]
        public var variableCollection: Array = new Array();

        public function getList(): Array{
            return variableCollection;
        }

}

}
