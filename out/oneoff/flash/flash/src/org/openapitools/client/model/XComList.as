package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.VariableAllOf;
import org.openapitools.client.model.XComCollectionItem;

    public class XComList implements ListWrapper {
        // This declaration below of _XCom_obj_class is to force flash compiler to include this class
        private var _xCom_obj_class: org.openapitools.client.model.XCom = null;
        [XmlElements(name="xCom", type="org.openapitools.client.model.XCom")]
        public var xCom: Array = new Array();

        public function getList(): Array{
            return xCom;
        }

}

}
