package org.openapitools.client.model {

import org.openapitools.client.model.EventLog;

    [XmlRootNode(name="EventLogCollection")]
    public class EventLogCollection {
                // This declaration below of _eventLogs_obj_class is to force flash compiler to include this class
        private var _eventLogs_obj_class: Array = null;
        [XmlElementWrapper(name="event_logs")]
        [XmlElements(name="eventLogs", type="Array")]
                public var eventLogs: Array = new Array();

    public function toString(): String {
        var str: String = "EventLogCollection: ";
        str += " (eventLogs: " + eventLogs + ")";
        return str;
    }

}

}
