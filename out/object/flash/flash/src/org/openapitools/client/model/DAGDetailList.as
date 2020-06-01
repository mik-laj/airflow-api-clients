package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.DAG;
import org.openapitools.client.model.DAGDetailAllOf;
import org.openapitools.client.model.ScheduleInterval;
import org.openapitools.client.model.Tag;
import org.openapitools.client.model.TimeDelta;

    public class DAGDetailList implements ListWrapper {
        // This declaration below of _DAGDetail_obj_class is to force flash compiler to include this class
        private var _dAGDetail_obj_class: org.openapitools.client.model.DAGDetail = null;
        [XmlElements(name="dAGDetail", type="org.openapitools.client.model.DAGDetail")]
        public var dAGDetail: Array = new Array();

        public function getList(): Array{
            return dAGDetail;
        }

}

}
