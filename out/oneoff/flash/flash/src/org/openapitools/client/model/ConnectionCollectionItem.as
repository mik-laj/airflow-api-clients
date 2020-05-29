package org.openapitools.client.model {


    [XmlRootNode(name="ConnectionCollectionItem")]
    public class ConnectionCollectionItem {
                [XmlElement(name="connection_id")]
        public var connectionId: String = null;
                [XmlElement(name="conn_type")]
        public var connType: String = null;
                [XmlElement(name="host")]
        public var host: String = null;
                [XmlElement(name="login")]
        public var login: String = null;
                [XmlElement(name="schema")]
        public var schema: String = null;
                [XmlElement(name="port")]
        public var port: Number = 0;

    public function toString(): String {
        var str: String = "ConnectionCollectionItem: ";
        str += " (connectionId: " + connectionId + ")";
        str += " (connType: " + connType + ")";
        str += " (host: " + host + ")";
        str += " (login: " + login + ")";
        str += " (schema: " + schema + ")";
        str += " (port: " + port + ")";
        return str;
    }

}

}
