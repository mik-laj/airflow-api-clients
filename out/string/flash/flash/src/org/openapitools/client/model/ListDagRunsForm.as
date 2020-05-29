package org.openapitools.client.model {


    [XmlRootNode(name="ListDagRunsForm")]
    public class ListDagRunsForm {
        /* The number of items to skip before starting to collect the result set. */
        [XmlElement(name="page_offset")]
        public var pageOffset: Number = 0;
        /* The numbers of items to return. */
        [XmlElement(name="page_limit")]
        public var pageLimit: Number = 100;
        /* Return objects with specific DAG IDs. The value can be repeated to retrieve multiple matching values (OR condition). */
        // This declaration below of _dagIds_obj_class is to force flash compiler to include this class
        private var _dagIds_obj_class: Array = null;
        [XmlElementWrapper(name="dag_ids")]
        [XmlElements(name="dagIds", type="Array")]
                public var dagIds: Array = new Array();
        /* Returns objects greater or equal to the specified date. This can be combined with execution_date_lte key to receive only the selected period.  */
        [XmlElement(name="execution_date_gte")]
        public var executionDateGte: Date = null;
        /* Returns objects less than or equal to the specified date. This can be combined with execution_date_gte key to receive only the selected period.  */
        [XmlElement(name="execution_date_lte")]
        public var executionDateLte: Date = null;
        /* Returns objects greater or equal the specified date. This can be combined with start_date_lte key to receive only the selected period.  */
        [XmlElement(name="start_date_gte")]
        public var startDateGte: Date = null;
        /* Returns objects less or equal the specified date. This can be combined with start_date_gte parameter to receive only the selected period  */
        [XmlElement(name="start_date_lte")]
        public var startDateLte: Date = null;
        /* Returns objects greater or equal the specified date. This can be combined with end_date_lte parameter to receive only the selected period.  */
        [XmlElement(name="end_date_gte")]
        public var endDateGte: Date = null;
        /* Returns objects less than or equal to the specified date. This can be combined with end_date_gte parameter to receive only the selected period.  */
        [XmlElement(name="end_date_lte")]
        public var endDateLte: Date = null;

    public function toString(): String {
        var str: String = "ListDagRunsForm: ";
        str += " (pageOffset: " + pageOffset + ")";
        str += " (pageLimit: " + pageLimit + ")";
        str += " (dagIds: " + dagIds + ")";
        str += " (executionDateGte: " + executionDateGte + ")";
        str += " (executionDateLte: " + executionDateLte + ")";
        str += " (startDateGte: " + startDateGte + ")";
        str += " (startDateLte: " + startDateLte + ")";
        str += " (endDateGte: " + endDateGte + ")";
        str += " (endDateLte: " + endDateLte + ")";
        return str;
    }

}

}
