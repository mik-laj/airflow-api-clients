package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.ImportError;
import org.openapitools.client.model.ImportErrorCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-31T07:37:09.721Z[GMT]")
public interface ImportErrorApi extends ApiClient.Api {


  /**
   * Delete an import error
   * 
   * @param importErrorId The Import Error ID. (required)
   */
  @RequestLine("DELETE /importErrors/{importErrorId}")
  @Headers({
    "Accept: application/json",
  })
  void deleteImportError(@Param("importErrorId") Integer importErrorId);

  /**
   * Get an import error
   * 
   * @param importErrorId The Import Error ID. (required)
   * @return ImportError
   */
  @RequestLine("GET /importErrors/{importErrorId}")
  @Headers({
    "Accept: application/json",
  })
  ImportError getImportError(@Param("importErrorId") Integer importErrorId);

  /**
   * Get all import errors
   * 
   * @param limit The numbers of items to return. (optional, default to 100)
   * @param offset The number of items to skip before starting to collect the result set. (optional)
   * @return ImportErrorCollection
   */
  @RequestLine("GET /importErrors?limit={limit}&offset={offset}")
  @Headers({
    "Accept: application/json",
  })
  ImportErrorCollection getImportErrors(@Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Get all import errors
   * 
   * Note, this is equivalent to the other <code>getImportErrors</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetImportErrorsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>limit - The numbers of items to return. (optional, default to 100)</li>
   *   <li>offset - The number of items to skip before starting to collect the result set. (optional)</li>
   *   </ul>
   * @return ImportErrorCollection
   */
  @RequestLine("GET /importErrors?limit={limit}&offset={offset}")
  @Headers({
  "Accept: application/json",
  })
  ImportErrorCollection getImportErrors(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getImportErrors</code> method in a fluent style.
   */
  public static class GetImportErrorsQueryParams extends HashMap<String, Object> {
    public GetImportErrorsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetImportErrorsQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }
}
