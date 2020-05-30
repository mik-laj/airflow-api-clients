package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.Pool;
import org.openapitools.client.model.PoolCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-30T18:45:53.210Z[GMT]")
public interface PoolApi extends ApiClient.Api {


  /**
   * Create a pool
   * 
   * @param pool  (required)
   * @return Pool
   */
  @RequestLine("POST /pools")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Pool createPool(Pool pool);

  /**
   * Delete a pool
   * 
   * @param poolName The Pool name. (required)
   */
  @RequestLine("DELETE /pools/{poolName}")
  @Headers({
    "Accept: application/json",
  })
  void deletePool(@Param("poolName") String poolName);

  /**
   * Get a pool
   * 
   * @param poolName The Pool name. (required)
   * @return Pool
   */
  @RequestLine("GET /pools/{poolName}")
  @Headers({
    "Accept: application/json",
  })
  Pool getPool(@Param("poolName") String poolName);

  /**
   * Get all pools
   * 
   * @param limit The numbers of items to return. (optional, default to 100)
   * @param offset The number of items to skip before starting to collect the result set. (optional)
   * @return PoolCollection
   */
  @RequestLine("GET /pools?limit={limit}&offset={offset}")
  @Headers({
    "Accept: application/json",
  })
  PoolCollection getPools(@Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Get all pools
   * 
   * Note, this is equivalent to the other <code>getPools</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetPoolsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>limit - The numbers of items to return. (optional, default to 100)</li>
   *   <li>offset - The number of items to skip before starting to collect the result set. (optional)</li>
   *   </ul>
   * @return PoolCollection
   */
  @RequestLine("GET /pools?limit={limit}&offset={offset}")
  @Headers({
  "Accept: application/json",
  })
  PoolCollection getPools(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getPools</code> method in a fluent style.
   */
  public static class GetPoolsQueryParams extends HashMap<String, Object> {
    public GetPoolsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetPoolsQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a pool
   * 
   * @param poolName The Pool name. (required)
   * @param pool  (required)
   * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional)
   * @return Pool
   */
  @RequestLine("PATCH /pools/{poolName}?update_mask={updateMask}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Pool updatePool(@Param("poolName") String poolName, Pool pool, @Param("updateMask") List<String> updateMask);

  /**
   * Update a pool
   * 
   * Note, this is equivalent to the other <code>updatePool</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdatePoolQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param poolName The Pool name. (required)
   * @param pool  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>updateMask - The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional)</li>
   *   </ul>
   * @return Pool
   */
  @RequestLine("PATCH /pools/{poolName}?update_mask={updateMask}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Pool updatePool(@Param("poolName") String poolName, Pool pool, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>updatePool</code> method in a fluent style.
   */
  public static class UpdatePoolQueryParams extends HashMap<String, Object> {
    public UpdatePoolQueryParams updateMask(final List<String> value) {
      put("update_mask", EncodingUtils.encodeCollection(value, "csv"));
      return this;
    }
  }
}
