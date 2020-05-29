package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class ClearTaskInstanceList implements ListWrapper {
        // This declaration below of _ClearTaskInstance_obj_class is to force flash compiler to include this class
        private var _clearTaskInstance_obj_class: org.openapitools.client.model.ClearTaskInstance = null;
        [XmlElements(name="clearTaskInstance", type="org.openapitools.client.model.ClearTaskInstance")]
        public var clearTaskInstance: Array = new Array();

        public function getList(): Array{
            return clearTaskInstance;
        }

}

}
