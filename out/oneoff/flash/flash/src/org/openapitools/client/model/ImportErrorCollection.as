package org.openapitools.client.model {

import org.openapitools.client.model.ImportError;

    [XmlRootNode(name="ImportErrorCollection")]
    public class ImportErrorCollection {
                // This declaration below of _importErrors_obj_class is to force flash compiler to include this class
        private var _importErrors_obj_class: Array = null;
        [XmlElementWrapper(name="import_errors")]
        [XmlElements(name="importErrors", type="Array")]
                public var importErrors: Array = new Array();

    public function toString(): String {
        var str: String = "ImportErrorCollection: ";
        str += " (importErrors: " + importErrors + ")";
        return str;
    }

}

}
