package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class ListDagRunsFormList implements ListWrapper {
        // This declaration below of _ListDagRunsForm_obj_class is to force flash compiler to include this class
        private var _listDagRunsForm_obj_class: org.openapitools.client.model.ListDagRunsForm = null;
        [XmlElements(name="listDagRunsForm", type="org.openapitools.client.model.ListDagRunsForm")]
        public var listDagRunsForm: Array = new Array();

        public function getList(): Array{
            return listDagRunsForm;
        }

}

}
