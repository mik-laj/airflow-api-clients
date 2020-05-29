package org.openapitools.client.model {

import org.openapitools.client.model.XComCollectionItem;

    [XmlRootNode(name="XComCollection")]
    public class XComCollection {
                // This declaration below of _xcomEntries_obj_class is to force flash compiler to include this class
        private var _xcomEntries_obj_class: Array = null;
        [XmlElementWrapper(name="xcom_entries")]
        [XmlElements(name="xcomEntries", type="Array")]
                public var xcomEntries: Array = new Array();

    public function toString(): String {
        var str: String = "XComCollection: ";
        str += " (xcomEntries: " + xcomEntries + ")";
        return str;
    }

}

}
