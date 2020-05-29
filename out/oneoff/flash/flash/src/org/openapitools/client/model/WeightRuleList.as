package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class WeightRuleList implements ListWrapper {
        // This declaration below of _WeightRule_obj_class is to force flash compiler to include this class
        private var _weightRule_obj_class: org.openapitools.client.model.WeightRule = null;
        [XmlElements(name="weightRule", type="org.openapitools.client.model.WeightRule")]
        public var weightRule: Array = new Array();

        public function getList(): Array{
            return weightRule;
        }

}

}
