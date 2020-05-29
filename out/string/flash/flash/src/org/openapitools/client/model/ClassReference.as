package org.openapitools.client.model {


    [XmlRootNode(name="ClassReference")]
    public class ClassReference {
                [XmlElement(name="module_path")]
        public var modulePath: String = null;
                [XmlElement(name="class_name")]
        public var className: String = null;

    public function toString(): String {
        var str: String = "ClassReference: ";
        str += " (modulePath: " + modulePath + ")";
        str += " (className: " + className + ")";
        return str;
    }

}

}
