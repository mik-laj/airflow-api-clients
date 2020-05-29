package org.openapitools.client.model {

import org.openapitools.client.model.TimeDelta;

    [XmlRootNode(name="DAGDetailAllOf")]
    public class DAGDetailAllOf {
                [XmlElement(name="timezone")]
        public var timezone: String = null;
                [XmlElement(name="catchup")]
        public var catchup: Boolean = false;
                [XmlElement(name="orientation")]
        public var orientation: String = null;
                [XmlElement(name="concurrency")]
        public var concurrency: Number = 0.0;
                [XmlElement(name="start_date")]
        public var startDate: Date = null;
                [XmlElement(name="dag_run_timeout")]
        public var dagRunTimeout: TimeDelta = NaN;
                [XmlElement(name="doc_md")]
        public var docMd: String = null;
                [XmlElement(name="default_view")]
        public var defaultView: String = null;

    public function toString(): String {
        var str: String = "DAGDetailAllOf: ";
        str += " (timezone: " + timezone + ")";
        str += " (catchup: " + catchup + ")";
        str += " (orientation: " + orientation + ")";
        str += " (concurrency: " + concurrency + ")";
        str += " (startDate: " + startDate + ")";
        str += " (dagRunTimeout: " + dagRunTimeout + ")";
        str += " (docMd: " + docMd + ")";
        str += " (defaultView: " + defaultView + ")";
        return str;
    }

}

}
