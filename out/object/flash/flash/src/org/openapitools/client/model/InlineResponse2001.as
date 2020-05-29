package org.openapitools.client.model {


    [XmlRootNode(name="InlineResponse2001")]
    public class InlineResponse2001 {
                [XmlElement(name="content")]
        public var content: String = null;

    public function toString(): String {
        var str: String = "InlineResponse2001: ";
        str += " (content: " + content + ")";
        return str;
    }

}

}
