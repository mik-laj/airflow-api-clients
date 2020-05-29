package org.openapitools.client.model {

import org.openapitools.client.model.ExtraLink;

    [XmlRootNode(name="ExtraLinkCollection")]
    public class ExtraLinkCollection {
                // This declaration below of _extraLinks_obj_class is to force flash compiler to include this class
        private var _extraLinks_obj_class: Array = null;
        [XmlElementWrapper(name="extra_links")]
        [XmlElements(name="extraLinks", type="Array")]
                public var extraLinks: Array = new Array();

    public function toString(): String {
        var str: String = "ExtraLinkCollection: ";
        str += " (extraLinks: " + extraLinks + ")";
        return str;
    }

}

}
