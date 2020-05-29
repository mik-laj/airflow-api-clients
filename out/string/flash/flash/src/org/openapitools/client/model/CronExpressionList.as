package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class CronExpressionList implements ListWrapper {
        // This declaration below of _CronExpression_obj_class is to force flash compiler to include this class
        private var _cronExpression_obj_class: org.openapitools.client.model.CronExpression = null;
        [XmlElements(name="cronExpression", type="org.openapitools.client.model.CronExpression")]
        public var cronExpression: Array = new Array();

        public function getList(): Array{
            return cronExpression;
        }

}

}
