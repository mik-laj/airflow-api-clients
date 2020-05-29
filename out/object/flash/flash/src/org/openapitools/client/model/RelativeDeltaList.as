package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class RelativeDeltaList implements ListWrapper {
        // This declaration below of _RelativeDelta_obj_class is to force flash compiler to include this class
        private var _relativeDelta_obj_class: org.openapitools.client.model.RelativeDelta = null;
        [XmlElements(name="relativeDelta", type="org.openapitools.client.model.RelativeDelta")]
        public var relativeDelta: Array = new Array();

        public function getList(): Array{
            return relativeDelta;
        }

}

}
