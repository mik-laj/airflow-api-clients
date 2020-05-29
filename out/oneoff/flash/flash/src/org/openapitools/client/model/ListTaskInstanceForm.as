package org.openapitools.client.model {


    [XmlRootNode(name="ListTaskInstanceForm")]
    public class ListTaskInstanceForm {
        /* Return objects with specific DAG IDs. The value can be repeated to retrieve multiple matching values (OR condition). */
        // This declaration below of _dagIds_obj_class is to force flash compiler to include this class
        private var _dagIds_obj_class: Array = null;
        [XmlElementWrapper(name="dag_ids")]
        [XmlElements(name="dagIds", type="Array")]
                public var dagIds: Array = new Array();
        /* Returns objects greater or equal to the specified date. This can be combined with execution_date_lte parameter to receive only the selected period.  */
        [XmlElement(name="execution_date_gte")]
        public var executionDateGte: Date = null;
        /* Returns objects less than or equal to the specified date. This can be combined with execution_date_gte parameter to receive only the selected period.  */
        [XmlElement(name="execution_date_lte")]
        public var executionDateLte: Date = null;
        /* Returns objects greater or equal the specified date. This can be combined with startd_ate_lte parameter to receive only the selected period.  */
        [XmlElement(name="start_date_gte")]
        public var startDateGte: Date = null;
        /* Returns objects less or equal the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  */
        [XmlElement(name="start_date_lte")]
        public var startDateLte: Date = null;
        /* Returns objects greater or equal the specified date. This can be combined with start_date_lte parameter to receive only the selected period.  */
        [XmlElement(name="end_date_gte")]
        public var endDateGte: Date = null;
        /* Returns objects less than or equal to the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  */
        [XmlElement(name="end_date_lte")]
        public var endDateLte: Date = null;
        /* Returns objects greater than or equal to the specified values. This can be combined with duration_lte parameter to receive only the selected period.  */
        [XmlElement(name="duration_gte")]
        public var durationGte: Number = 0.0;
        /* Returns objects less than or equal to the specified values. This can be combined with duration_gte parameter to receive only the selected range.  */
        [XmlElement(name="duration_lte")]
        public var durationLte: Number = 0.0;
        /* The value can be repeated to retrieve multiple matching values (OR condition). */
        // This declaration below of _state_obj_class is to force flash compiler to include this class
        private var _state_obj_class: Array = null;
        [XmlElementWrapper(name="State")]
        [XmlElements(name="state", type="Array")]
                public var state: Array = new Array();
        /* The value can be repeated to retrieve multiple matching values (OR condition). */
        // This declaration below of _pool_obj_class is to force flash compiler to include this class
        private var _pool_obj_class: Array = null;
        [XmlElementWrapper(name="Pool")]
        [XmlElements(name="pool", type="Array")]
                public var pool: Array = new Array();
        /* The value can be repeated to retrieve multiple matching values (OR condition). */
        // This declaration below of _queue_obj_class is to force flash compiler to include this class
        private var _queue_obj_class: Array = null;
        [XmlElementWrapper(name="Queue")]
        [XmlElements(name="queue", type="Array")]
                public var queue: Array = new Array();

    public function toString(): String {
        var str: String = "ListTaskInstanceForm: ";
        str += " (dagIds: " + dagIds + ")";
        str += " (executionDateGte: " + executionDateGte + ")";
        str += " (executionDateLte: " + executionDateLte + ")";
        str += " (startDateGte: " + startDateGte + ")";
        str += " (startDateLte: " + startDateLte + ")";
        str += " (endDateGte: " + endDateGte + ")";
        str += " (endDateLte: " + endDateLte + ")";
        str += " (durationGte: " + durationGte + ")";
        str += " (durationLte: " + durationLte + ")";
        str += " (state: " + state + ")";
        str += " (pool: " + pool + ")";
        str += " (queue: " + queue + ")";
        return str;
    }

}

}
