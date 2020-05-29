package org.openapitools.client.model {


    [XmlRootNode(name="CollectionInfo")]
    public class CollectionInfo {
                [XmlElement(name="total_entries")]
        public var totalEntries: Number = 0;

    public function toString(): String {
        var str: String = "CollectionInfo: ";
        str += " (totalEntries: " + totalEntries + ")";
        return str;
    }

}

}
