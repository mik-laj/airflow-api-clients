package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class XComCollectionItemList implements ListWrapper {
        // This declaration below of _XComCollectionItem_obj_class is to force flash compiler to include this class
        private var _xComCollectionItem_obj_class: org.openapitools.client.model.XComCollectionItem = null;
        [XmlElements(name="xComCollectionItem", type="org.openapitools.client.model.XComCollectionItem")]
        public var xComCollectionItem: Array = new Array();

        public function getList(): Array{
            return xComCollectionItem;
        }

}

}
