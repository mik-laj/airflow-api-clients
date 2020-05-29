package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.SLAMiss;

    public class SLAMissCollectionList implements ListWrapper {
        // This declaration below of _SLAMissCollection_obj_class is to force flash compiler to include this class
        private var _sLAMissCollection_obj_class: org.openapitools.client.model.SLAMissCollection = null;
        [XmlElements(name="sLAMissCollection", type="org.openapitools.client.model.SLAMissCollection")]
        public var sLAMissCollection: Array = new Array();

        public function getList(): Array{
            return sLAMissCollection;
        }

}

}
