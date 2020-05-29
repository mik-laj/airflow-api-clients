package org.openapitools.client.model {


    [XmlRootNode(name="ClearTaskInstance")]
    public class ClearTaskInstance {
        /* If set, don&#39;t actually run this operation. The response will contain a list of task instances planned to be cleaned, but not modified in any way.  */
        [XmlElement(name="dry_run")]
        public var dryRun: Boolean = false;
        /* The minimum execution date to clear. */
        [XmlElement(name="start_date")]
        public var startDate: String = null;
        /* The maximum execution date to clear. */
        [XmlElement(name="end_date")]
        public var endDate: String = null;
        /* Only clear failed tasks. */
        [XmlElement(name="only_failed")]
        public var onlyFailed: String = null;
        /* Only clear running tasks. */
        [XmlElement(name="only_running")]
        public var onlyRunning: String = null;
        /* Clear tasks in subdags and clear external tasks indicated by ExternalTaskMarker. */
        [XmlElement(name="include_subdags")]
        public var includeSubdags: Boolean = false;
        /* Clear tasks in the parent dag of the subdag. */
        [XmlElement(name="include_parentdag")]
        public var includeParentdag: Boolean = false;
        /* Set state of DAG Runs to RUNNING. */
        [XmlElement(name="reset_dag_runs")]
        public var resetDagRuns: Boolean = false;

    public function toString(): String {
        var str: String = "ClearTaskInstance: ";
        str += " (dryRun: " + dryRun + ")";
        str += " (startDate: " + startDate + ")";
        str += " (endDate: " + endDate + ")";
        str += " (onlyFailed: " + onlyFailed + ")";
        str += " (onlyRunning: " + onlyRunning + ")";
        str += " (includeSubdags: " + includeSubdags + ")";
        str += " (includeParentdag: " + includeParentdag + ")";
        str += " (resetDagRuns: " + resetDagRuns + ")";
        return str;
    }

}

}
