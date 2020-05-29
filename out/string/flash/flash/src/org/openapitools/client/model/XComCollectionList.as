package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.XComCollectionItem;

    public class XComCollectionList implements ListWrapper {
        // This declaration below of _XComCollection_obj_class is to force flash compiler to include this class
        private var _xComCollection_obj_class: org.openapitools.client.model.XComCollection = null;
        [XmlElements(name="xComCollection", type="org.openapitools.client.model.XComCollection")]
        public var xComCollection: Array = new Array();

        public function getList(): Array{
            return xComCollection;
        }

}

}
