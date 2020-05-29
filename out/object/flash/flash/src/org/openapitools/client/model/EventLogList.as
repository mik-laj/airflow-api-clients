package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class EventLogList implements ListWrapper {
        // This declaration below of _EventLog_obj_class is to force flash compiler to include this class
        private var _eventLog_obj_class: org.openapitools.client.model.EventLog = null;
        [XmlElements(name="eventLog", type="org.openapitools.client.model.EventLog")]
        public var eventLog: Array = new Array();

        public function getList(): Array{
            return eventLog;
        }

}

}
