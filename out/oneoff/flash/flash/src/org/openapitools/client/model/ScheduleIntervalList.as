package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.CronExpression;
import org.openapitools.client.model.RelativeDelta;
import org.openapitools.client.model.TimeDelta;

    public class ScheduleIntervalList implements ListWrapper {
        // This declaration below of _ScheduleInterval_obj_class is to force flash compiler to include this class
        private var _scheduleInterval_obj_class: org.openapitools.client.model.ScheduleInterval = null;
        [XmlElements(name="scheduleInterval", type="org.openapitools.client.model.ScheduleInterval")]
        public var scheduleInterval: Array = new Array();

        public function getList(): Array{
            return scheduleInterval;
        }

}

}
