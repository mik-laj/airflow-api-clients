package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.ClassReference;

    public class ExtraLinkList implements ListWrapper {
        // This declaration below of _ExtraLink_obj_class is to force flash compiler to include this class
        private var _extraLink_obj_class: org.openapitools.client.model.ExtraLink = null;
        [XmlElements(name="extraLink", type="org.openapitools.client.model.ExtraLink")]
        public var extraLink: Array = new Array();

        public function getList(): Array{
            return extraLink;
        }

}

}
