package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.ExtraLink;

    public class ExtraLinkCollectionList implements ListWrapper {
        // This declaration below of _ExtraLinkCollection_obj_class is to force flash compiler to include this class
        private var _extraLinkCollection_obj_class: org.openapitools.client.model.ExtraLinkCollection = null;
        [XmlElements(name="extraLinkCollection", type="org.openapitools.client.model.ExtraLinkCollection")]
        public var extraLinkCollection: Array = new Array();

        public function getList(): Array{
            return extraLinkCollection;
        }

}

}
