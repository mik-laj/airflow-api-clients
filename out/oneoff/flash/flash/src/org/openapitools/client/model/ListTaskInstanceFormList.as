package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class ListTaskInstanceFormList implements ListWrapper {
        // This declaration below of _ListTaskInstanceForm_obj_class is to force flash compiler to include this class
        private var _listTaskInstanceForm_obj_class: org.openapitools.client.model.ListTaskInstanceForm = null;
        [XmlElements(name="listTaskInstanceForm", type="org.openapitools.client.model.ListTaskInstanceForm")]
        public var listTaskInstanceForm: Array = new Array();

        public function getList(): Array{
            return listTaskInstanceForm;
        }

}

}
