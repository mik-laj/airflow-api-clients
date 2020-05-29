package org.openapitools.client.model {


    [XmlRootNode(name="ImportError")]
    public class ImportError {
                [XmlElement(name="import_error_id")]
        public var importErrorId: Number = 0;
                [XmlElement(name="timestamp")]
        public var timestamp: String = null;
                [XmlElement(name="filename")]
        public var filename: String = null;
                [XmlElement(name="stack_trace")]
        public var stackTrace: String = null;

    public function toString(): String {
        var str: String = "ImportError: ";
        str += " (importErrorId: " + importErrorId + ")";
        str += " (timestamp: " + timestamp + ")";
        str += " (filename: " + filename + ")";
        str += " (stackTrace: " + stackTrace + ")";
        return str;
    }

}

}
