package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class SLAMissList implements ListWrapper {
        // This declaration below of _SLAMiss_obj_class is to force flash compiler to include this class
        private var _sLAMiss_obj_class: org.openapitools.client.model.SLAMiss = null;
        [XmlElements(name="sLAMiss", type="org.openapitools.client.model.SLAMiss")]
        public var sLAMiss: Array = new Array();

        public function getList(): Array{
            return sLAMiss;
        }

}

}
