package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class ImportErrorList implements ListWrapper {
        // This declaration below of _ImportError_obj_class is to force flash compiler to include this class
        private var _importError_obj_class: org.openapitools.client.model.ImportError = null;
        [XmlElements(name="importError", type="org.openapitools.client.model.ImportError")]
        public var importError: Array = new Array();

        public function getList(): Array{
            return importError;
        }

}

}
