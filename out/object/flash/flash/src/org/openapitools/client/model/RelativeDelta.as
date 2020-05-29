package org.openapitools.client.model {


    [XmlRootNode(name="RelativeDelta")]
    public class RelativeDelta {
                [XmlElement(name="__type")]
        public var type: String = null;
                [XmlElement(name="years")]
        public var years: Number = 0;
                [XmlElement(name="months")]
        public var months: Number = 0;
                [XmlElement(name="days")]
        public var days: Number = 0;
                [XmlElement(name="leapdays")]
        public var leapdays: Number = 0;
                [XmlElement(name="hours")]
        public var hours: Number = 0;
                [XmlElement(name="minutes")]
        public var minutes: Number = 0;
                [XmlElement(name="seconds")]
        public var seconds: Number = 0;
                [XmlElement(name="microseconds")]
        public var microseconds: Number = 0;
                [XmlElement(name="year")]
        public var year: Number = 0;
                [XmlElement(name="month")]
        public var month: Number = 0;
                [XmlElement(name="day")]
        public var day: Number = 0;
                [XmlElement(name="hour")]
        public var hour: Number = 0;
                [XmlElement(name="minute")]
        public var minute: Number = 0;
                [XmlElement(name="second")]
        public var second: Number = 0;
                [XmlElement(name="microsecond")]
        public var microsecond: Number = 0;

    public function toString(): String {
        var str: String = "RelativeDelta: ";
        str += " (type: " + type + ")";
        str += " (years: " + years + ")";
        str += " (months: " + months + ")";
        str += " (days: " + days + ")";
        str += " (leapdays: " + leapdays + ")";
        str += " (hours: " + hours + ")";
        str += " (minutes: " + minutes + ")";
        str += " (seconds: " + seconds + ")";
        str += " (microseconds: " + microseconds + ")";
        str += " (year: " + year + ")";
        str += " (month: " + month + ")";
        str += " (day: " + day + ")";
        str += " (hour: " + hour + ")";
        str += " (minute: " + minute + ")";
        str += " (second: " + second + ")";
        str += " (microsecond: " + microsecond + ")";
        return str;
    }

}

}
