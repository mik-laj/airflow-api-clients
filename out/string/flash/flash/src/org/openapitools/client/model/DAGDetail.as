package org.openapitools.client.model {

import org.openapitools.client.model.DAG;
import org.openapitools.client.model.DAGDetailAllOf;
import org.openapitools.client.model.OneOfScheduleInterval;
import org.openapitools.client.model.Tag;
import org.openapitools.client.model.TimeDelta;

    [XmlRootNode(name="DAGDetail")]
    public class DAGDetail {
                [XmlElement(name="dag_id")]
        public var dagId: String = null;
                [XmlElement(name="root_dag_id")]
        public var rootDagId: String = null;
                [XmlElement(name="is_paused")]
        public var isPaused: Boolean = false;
                [XmlElement(name="is_subdag")]
        public var isSubdag: Boolean = false;
                [XmlElement(name="fileloc")]
        public var fileloc: String = null;
        /* The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change.  */
        [XmlElement(name="file_token")]
        public var fileToken: String = null;
                // This declaration below of _owners_obj_class is to force flash compiler to include this class
        private var _owners_obj_class: Array = null;
        [XmlElementWrapper(name="owners")]
        [XmlElements(name="owners", type="Array")]
                public var owners: Array = new Array();
                [XmlElement(name="description")]
        public var description: String = null;
                [XmlElement(name="schedule_interval")]
        public var scheduleInterval: OneOfScheduleInterval = NaN;
                // This declaration below of _tags_obj_class is to force flash compiler to include this class
        private var _tags_obj_class: Array = null;
        [XmlElementWrapper(name="tags")]
        [XmlElements(name="tags", type="Array")]
                public var tags: Array = new Array();
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
        var str: String = "DAGDetail: ";
        str += " (dagId: " + dagId + ")";
        str += " (rootDagId: " + rootDagId + ")";
        str += " (isPaused: " + isPaused + ")";
        str += " (isSubdag: " + isSubdag + ")";
        str += " (fileloc: " + fileloc + ")";
        str += " (fileToken: " + fileToken + ")";
        str += " (owners: " + owners + ")";
        str += " (description: " + description + ")";
        str += " (scheduleInterval: " + scheduleInterval + ")";
        str += " (tags: " + tags + ")";
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
