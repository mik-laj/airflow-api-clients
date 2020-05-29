package org.openapitools.client.model {


    [XmlRootNode(name="TimeDelta")]
    public class TimeDelta {
                [XmlElement(name="__type")]
        public var type: String = null;
                [XmlElement(name="days")]
        public var days: Number = 0;
                [XmlElement(name="seconds")]
        public var seconds: Number = 0;
                [XmlElement(name="microsecond")]
        public var microsecond: Number = 0;

    public function toString(): String {
        var str: String = "TimeDelta: ";
        str += " (type: " + type + ")";
        str += " (days: " + days + ")";
        str += " (seconds: " + seconds + ")";
        str += " (microsecond: " + microsecond + ")";
        return str;
    }

}

}
