package org.openapitools.client.model {

import org.openapitools.client.model.ConnectionAllOf;
import org.openapitools.client.model.ConnectionCollectionItem;

    [XmlRootNode(name="Connection")]
    public class Connection {
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
                [XmlElement(name="password")]
        public var password: String = null;
                [XmlElement(name="extra")]
        public var extra: String = null;

    public function toString(): String {
        var str: String = "Connection: ";
        str += " (connectionId: " + connectionId + ")";
        str += " (connType: " + connType + ")";
        str += " (host: " + host + ")";
        str += " (login: " + login + ")";
        str += " (schema: " + schema + ")";
        str += " (port: " + port + ")";
        str += " (password: " + password + ")";
        str += " (extra: " + extra + ")";
        return str;
    }

}

}
