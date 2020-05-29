package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class TriggerRuleList implements ListWrapper {
        // This declaration below of _TriggerRule_obj_class is to force flash compiler to include this class
        private var _triggerRule_obj_class: org.openapitools.client.model.TriggerRule = null;
        [XmlElements(name="triggerRule", type="org.openapitools.client.model.TriggerRule")]
        public var triggerRule: Array = new Array();

        public function getList(): Array{
            return triggerRule;
        }

}

}
