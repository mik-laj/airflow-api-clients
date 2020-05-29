package org.openapitools.client.model {


    [XmlRootNode(name="ConnectionAllOf")]
    public class ConnectionAllOf {
                [XmlElement(name="password")]
        public var password: String = null;
                [XmlElement(name="extra")]
        public var extra: String = null;

    public function toString(): String {
        var str: String = "ConnectionAllOf: ";
        str += " (password: " + password + ")";
        str += " (extra: " + extra + ")";
        return str;
    }

}

}
