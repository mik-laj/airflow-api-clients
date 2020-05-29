package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.ImportError;

    public class ImportErrorCollectionList implements ListWrapper {
        // This declaration below of _ImportErrorCollection_obj_class is to force flash compiler to include this class
        private var _importErrorCollection_obj_class: org.openapitools.client.model.ImportErrorCollection = null;
        [XmlElements(name="importErrorCollection", type="org.openapitools.client.model.ImportErrorCollection")]
        public var importErrorCollection: Array = new Array();

        public function getList(): Array{
            return importErrorCollection;
        }

}

}
