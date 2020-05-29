package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class ConfigOptionList implements ListWrapper {
        // This declaration below of _ConfigOption_obj_class is to force flash compiler to include this class
        private var _configOption_obj_class: org.openapitools.client.model.ConfigOption = null;
        [XmlElements(name="configOption", type="org.openapitools.client.model.ConfigOption")]
        public var configOption: Array = new Array();

        public function getList(): Array{
            return configOption;
        }

}

}
