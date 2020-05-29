package org.openapitools.client.model {


    [XmlRootNode(name="Tag")]
    public class Tag {
                [XmlElement(name="name")]
        public var name: String = null;

    public function toString(): String {
        var str: String = "Tag: ";
        str += " (name: " + name + ")";
        return str;
    }

}

}
