package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class ErrorList implements ListWrapper {
        // This declaration below of _Error_obj_class is to force flash compiler to include this class
        private var _error_obj_class: org.openapitools.client.model.Error = null;
        [XmlElements(name="error", type="org.openapitools.client.model.Error")]
        public var error: Array = new Array();

        public function getList(): Array{
            return error;
        }

}

}
