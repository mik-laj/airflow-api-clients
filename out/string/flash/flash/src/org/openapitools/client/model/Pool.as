package org.openapitools.client.model {


    [XmlRootNode(name="Pool")]
    public class Pool {
                [XmlElement(name="name")]
        public var name: String = null;
                [XmlElement(name="slots")]
        public var slots: Number = 0;
                [XmlElement(name="occupied_slots")]
        public var occupiedSlots: Number = 0;
                [XmlElement(name="used_slots")]
        public var usedSlots: Number = 0;
                [XmlElement(name="queued_slots")]
        public var queuedSlots: Number = 0;
                [XmlElement(name="open_slots")]
        public var openSlots: Number = 0;

    public function toString(): String {
        var str: String = "Pool: ";
        str += " (name: " + name + ")";
        str += " (slots: " + slots + ")";
        str += " (occupiedSlots: " + occupiedSlots + ")";
        str += " (usedSlots: " + usedSlots + ")";
        str += " (queuedSlots: " + queuedSlots + ")";
        str += " (openSlots: " + openSlots + ")";
        return str;
    }

}

}
