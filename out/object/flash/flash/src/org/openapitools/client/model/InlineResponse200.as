package org.openapitools.client.model {


    [XmlRootNode(name="InlineResponse200")]
    public class InlineResponse200 {
                [XmlElement(name="continuation_token")]
        public var continuationToken: String = null;
                [XmlElement(name="content")]
        public var content: String = null;

    public function toString(): String {
        var str: String = "InlineResponse200: ";
        str += " (continuationToken: " + continuationToken + ")";
        str += " (content: " + content + ")";
        return str;
    }

}

}
