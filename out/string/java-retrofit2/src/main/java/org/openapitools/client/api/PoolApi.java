package org.openapitools.client.api;

import org.openapitools.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.Pool;
import org.openapitools.client.model.PoolCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PoolApi {
  /**
   * Create a pool
   * 
   * @param pool  (required)
   * @return Call&lt;Pool&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("pools")
  Call<Pool> createPool(
    @retrofit2.http.Body Pool pool
  );

  /**
   * Delete a pool
   * 
   * @param poolName The Pool name. (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("pools/{pool_name}")
  Call<Void> deletePool(
    @retrofit2.http.Path("pool_name") String poolName
  );

  /**
   * Get a pool
   * 
   * @param poolName The Pool name. (required)
   * @return Call&lt;Pool&gt;
   */
  @GET("pools/{pool_name}")
  Call<Pool> getPool(
    @retrofit2.http.Path("pool_name") String poolName
  );

  /**
   * Get all pools
   * 
   * @param limit The numbers of items to return. (optional, default to 100)
   * @param offset The number of items to skip before starting to collect the result set. (optional)
   * @return Call&lt;PoolCollection&gt;
   */
  @GET("pools")
  Call<PoolCollection> getPools(
    @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Update a pool
   * 
   * @param poolName The Pool name. (required)
   * @param pool  (required)
   * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;String&gt;())
   * @return Call&lt;Pool&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("pools/{pool_name}")
  Call<Pool> updatePool(
    @retrofit2.http.Path("pool_name") String poolName, @retrofit2.http.Body Pool pool, @retrofit2.http.Query("update_mask") CSVParams updateMask
  );

}
