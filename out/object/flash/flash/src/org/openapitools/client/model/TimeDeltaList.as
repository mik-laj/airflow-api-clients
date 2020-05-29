package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class TimeDeltaList implements ListWrapper {
        // This declaration below of _TimeDelta_obj_class is to force flash compiler to include this class
        private var _timeDelta_obj_class: org.openapitools.client.model.TimeDelta = null;
        [XmlElements(name="timeDelta", type="org.openapitools.client.model.TimeDelta")]
        public var timeDelta: Array = new Array();

        public function getList(): Array{
            return timeDelta;
        }

}

}
