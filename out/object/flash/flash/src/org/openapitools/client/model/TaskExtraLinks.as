package org.openapitools.client.model {

import org.openapitools.client.model.ClassReference;

    [XmlRootNode(name="TaskExtraLinks")]
    public class TaskExtraLinks {
                [XmlElement(name="class_ref")]
        public var classRef: ClassReference = NaN;

    public function toString(): String {
        var str: String = "TaskExtraLinks: ";
        str += " (classRef: " + classRef + ")";
        return str;
    }

}

}
