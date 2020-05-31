package org.openapitools.client.model {

import org.openapitools.client.model.ScheduleInterval;
import org.openapitools.client.model.Tag;

    [XmlRootNode(name="DAG")]
    public class DAG {
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
        public var scheduleInterval: ScheduleInterval = NaN;
                // This declaration below of _tags_obj_class is to force flash compiler to include this class
        private var _tags_obj_class: Array = null;
        [XmlElementWrapper(name="tags")]
        [XmlElements(name="tags", type="Array")]
                public var tags: Array = new Array();

    public function toString(): String {
        var str: String = "DAG: ";
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
        return str;
    }

}

}
