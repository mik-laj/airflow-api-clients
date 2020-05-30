package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;

import org.openapitools.client.model.Connection;
import org.openapitools.client.model.ConnectionCollection;
import org.openapitools.client.model.Error;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-30T18:47:01.071Z[GMT]")
public interface ConnectionApi extends ApiClient.Api {


  /**
   * Create connection entry
   * 
   * @param connection  (required)
   * @return Connection
   */
  @RequestLine("POST /connections")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Connection createConnection(Connection connection);

  /**
   * Delete a connection entry
   * 
   * @param connectionId The Connection ID. (required)
   */
  @RequestLine("DELETE /connections/{connectionId}")
  @Headers({
    "Accept: application/json",
  })
  void deleteConnection(@Param("connectionId") Integer connectionId);

  /**
   * Get a connection entry
   * 
   * @param connectionId The Connection ID. (required)
   * @return Connection
   */
  @RequestLine("GET /connections/{connectionId}")
  @Headers({
    "Accept: application/json",
  })
  Connection getConnection(@Param("connectionId") Integer connectionId);

  /**
   * Get all connection entries
   * 
   * @param limit The numbers of items to return. (optional, default to 100)
   * @param offset The number of items to skip before starting to collect the result set. (optional)
   * @return ConnectionCollection
   */
  @RequestLine("GET /connections?limit={limit}&offset={offset}")
  @Headers({
    "Accept: application/json",
  })
  ConnectionCollection getConnections(@Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Get all connection entries
   * 
   * Note, this is equivalent to the other <code>getConnections</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetConnectionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>limit - The numbers of items to return. (optional, default to 100)</li>
   *   <li>offset - The number of items to skip before starting to collect the result set. (optional)</li>
   *   </ul>
   * @return ConnectionCollection
   */
  @RequestLine("GET /connections?limit={limit}&offset={offset}")
  @Headers({
  "Accept: application/json",
  })
  ConnectionCollection getConnections(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getConnections</code> method in a fluent style.
   */
  public static class GetConnectionsQueryParams extends HashMap<String, Object> {
    public GetConnectionsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetConnectionsQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a connection entry
   * 
   * @param connectionId The Connection ID. (required)
   * @param connection  (required)
   * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional)
   * @return Connection
   */
  @RequestLine("PATCH /connections/{connectionId}?update_mask={updateMask}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Connection updateConnection(@Param("connectionId") Integer connectionId, Connection connection, @Param("updateMask") List<String> updateMask);

  /**
   * Update a connection entry
   * 
   * Note, this is equivalent to the other <code>updateConnection</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateConnectionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param connectionId The Connection ID. (required)
   * @param connection  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>updateMask - The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional)</li>
   *   </ul>
   * @return Connection
   */
  @RequestLine("PATCH /connections/{connectionId}?update_mask={updateMask}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Connection updateConnection(@Param("connectionId") Integer connectionId, Connection connection, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>updateConnection</code> method in a fluent style.
   */
  public static class UpdateConnectionQueryParams extends HashMap<String, Object> {
    public UpdateConnectionQueryParams updateMask(final List<String> value) {
      put("update_mask", EncodingUtils.encodeCollection(value, "csv"));
      return this;
    }
  }
}
