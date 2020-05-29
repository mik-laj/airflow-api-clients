package org.openapitools.client.model {

import org.openapitools.client.model.DAG;

    [XmlRootNode(name="DAGCollection")]
    public class DAGCollection {
                // This declaration below of _dags_obj_class is to force flash compiler to include this class
        private var _dags_obj_class: Array = null;
        [XmlElementWrapper(name="dags")]
        [XmlElements(name="dags", type="Array")]
                public var dags: Array = new Array();

    public function toString(): String {
        var str: String = "DAGCollection: ";
        str += " (dags: " + dags + ")";
        return str;
    }

}

}
