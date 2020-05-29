package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.ConfigOption;

    public class ConfigSectionList implements ListWrapper {
        // This declaration below of _ConfigSection_obj_class is to force flash compiler to include this class
        private var _configSection_obj_class: org.openapitools.client.model.ConfigSection = null;
        [XmlElements(name="configSection", type="org.openapitools.client.model.ConfigSection")]
        public var configSection: Array = new Array();

        public function getList(): Array{
            return configSection;
        }

}

}
