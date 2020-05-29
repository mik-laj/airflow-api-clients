package org.openapitools.client.api;

import org.openapitools.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.openapitools.client.model.Connection;
import org.openapitools.client.model.ConnectionCollection;
import org.openapitools.client.model.Error;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ConnectionApi {
  /**
   * Create connection entry
   * 
   * @param connection  (required)
   * @return Call&lt;Connection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("connections")
  Call<Connection> createConnection(
    @retrofit2.http.Body Connection connection
  );

  /**
   * Delete a connection entry
   * 
   * @param connectionId The Connection ID. (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("connections/{connection_id}")
  Call<Void> deleteConnection(
    @retrofit2.http.Path("connection_id") Integer connectionId
  );

  /**
   * Get a connection entry
   * 
   * @param connectionId The Connection ID. (required)
   * @return Call&lt;Connection&gt;
   */
  @GET("connections/{connection_id}")
  Call<Connection> getConnection(
    @retrofit2.http.Path("connection_id") Integer connectionId
  );

  /**
   * Get all connection entries
   * 
   * @param limit The numbers of items to return. (optional, default to 100)
   * @param offset The number of items to skip before starting to collect the result set. (optional)
   * @return Call&lt;ConnectionCollection&gt;
   */
  @GET("connections")
  Call<ConnectionCollection> getConnections(
    @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Update a connection entry
   * 
   * @param connectionId The Connection ID. (required)
   * @param connection  (required)
   * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;String&gt;())
   * @return Call&lt;Connection&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("connections/{connection_id}")
  Call<Connection> updateConnection(
    @retrofit2.http.Path("connection_id") Integer connectionId, @retrofit2.http.Body Connection connection, @retrofit2.http.Query("update_mask") CSVParams updateMask
  );

}
