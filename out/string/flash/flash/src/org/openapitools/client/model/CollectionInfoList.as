package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class CollectionInfoList implements ListWrapper {
        // This declaration below of _CollectionInfo_obj_class is to force flash compiler to include this class
        private var _collectionInfo_obj_class: org.openapitools.client.model.CollectionInfo = null;
        [XmlElements(name="collectionInfo", type="org.openapitools.client.model.CollectionInfo")]
        public var collectionInfo: Array = new Array();

        public function getList(): Array{
            return collectionInfo;
        }

}

}
