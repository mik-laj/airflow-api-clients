package org.openapitools.client.model {

import org.openapitools.client.model.DAGRun;

    [XmlRootNode(name="DAGRunCollection")]
    public class DAGRunCollection {
                // This declaration below of _dagRuns_obj_class is to force flash compiler to include this class
        private var _dagRuns_obj_class: Array = null;
        [XmlElementWrapper(name="dag_runs")]
        [XmlElements(name="dagRuns", type="Array")]
                public var dagRuns: Array = new Array();

    public function toString(): String {
        var str: String = "DAGRunCollection: ";
        str += " (dagRuns: " + dagRuns + ")";
        return str;
    }

}

}
