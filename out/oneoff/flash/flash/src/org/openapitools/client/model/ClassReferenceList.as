package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class ClassReferenceList implements ListWrapper {
        // This declaration below of _ClassReference_obj_class is to force flash compiler to include this class
        private var _classReference_obj_class: org.openapitools.client.model.ClassReference = null;
        [XmlElements(name="classReference", type="org.openapitools.client.model.ClassReference")]
        public var classReference: Array = new Array();

        public function getList(): Array{
            return classReference;
        }

}

}
