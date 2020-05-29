package org.openapitools.client.model {

import org.openapitools.client.model.ClassReference;

    [XmlRootNode(name="ExtraLink")]
    public class ExtraLink {
                [XmlElement(name="class_ref")]
        public var classRef: ClassReference = NaN;
                [XmlElement(name="name")]
        public var name: String = null;
                [XmlElement(name="href")]
        public var href: String = null;

    public function toString(): String {
        var str: String = "ExtraLink: ";
        str += " (classRef: " + classRef + ")";
        str += " (name: " + name + ")";
        str += " (href: " + href + ")";
        return str;
    }

}

}
