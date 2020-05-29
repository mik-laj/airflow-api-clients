package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.ConfigSection;

    public class ConfigList implements ListWrapper {
        // This declaration below of _Config_obj_class is to force flash compiler to include this class
        private var _config_obj_class: org.openapitools.client.model.Config = null;
        [XmlElements(name="config", type="org.openapitools.client.model.Config")]
        public var config: Array = new Array();

        public function getList(): Array{
            return config;
        }

}

}
