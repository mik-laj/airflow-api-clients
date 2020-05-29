package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.EventLog;

    public class EventLogCollectionList implements ListWrapper {
        // This declaration below of _EventLogCollection_obj_class is to force flash compiler to include this class
        private var _eventLogCollection_obj_class: org.openapitools.client.model.EventLogCollection = null;
        [XmlElements(name="eventLogCollection", type="org.openapitools.client.model.EventLogCollection")]
        public var eventLogCollection: Array = new Array();

        public function getList(): Array{
            return eventLogCollection;
        }

}

}
