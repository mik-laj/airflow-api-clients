package org.openapitools.client.model {


    [XmlRootNode(name="CronExpression")]
    public class CronExpression {
                [XmlElement(name="__type")]
        public var type: String = null;
                [XmlElement(name="value")]
        public var value: String = null;

    public function toString(): String {
        var str: String = "CronExpression: ";
        str += " (type: " + type + ")";
        str += " (value: " + value + ")";
        return str;
    }

}

}
