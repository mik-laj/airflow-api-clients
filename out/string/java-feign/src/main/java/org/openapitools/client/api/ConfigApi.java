package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;

import org.openapitools.client.model.Config;
import org.openapitools.client.model.Error;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-30T18:45:53.210Z[GMT]")
public interface ConfigApi extends ApiClient.Api {


  /**
   * Get current configuration
   * 
   * @param limit The numbers of items to return. (optional, default to 100)
   * @param offset The number of items to skip before starting to collect the result set. (optional)
   * @return Config
   */
  @RequestLine("GET /config?limit={limit}&offset={offset}")
  @Headers({
    "Accept: application/json",
  })
  Config getConfig(@Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Get current configuration
   * 
   * Note, this is equivalent to the other <code>getConfig</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetConfigQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>limit - The numbers of items to return. (optional, default to 100)</li>
   *   <li>offset - The number of items to skip before starting to collect the result set. (optional)</li>
   *   </ul>
   * @return Config
   */
  @RequestLine("GET /config?limit={limit}&offset={offset}")
  @Headers({
  "Accept: application/json",
  })
  Config getConfig(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getConfig</code> method in a fluent style.
   */
  public static class GetConfigQueryParams extends HashMap<String, Object> {
    public GetConfigQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetConfigQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }
}
