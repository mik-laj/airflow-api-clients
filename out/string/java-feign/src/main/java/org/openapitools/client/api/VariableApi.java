package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.Variable;
import org.openapitools.client.model.VariableCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:00:38.059Z[GMT]")
public interface VariableApi extends ApiClient.Api {


  /**
   * Create a variable
   * 
   * @param variable  (required)
   * @return Variable
   */
  @RequestLine("POST /variables")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Variable createVariable(Variable variable);

  /**
   * Delete variable
   * 
   * @param variableKey The Variable Key. (required)
   */
  @RequestLine("DELETE /variables/{variableKey}")
  @Headers({
    "Accept: application/json",
  })
  void deleteVariable(@Param("variableKey") String variableKey);

  /**
   * Get a variable by key
   * 
   * @param variableKey The Variable Key. (required)
   * @return Variable
   */
  @RequestLine("GET /variables/{variableKey}")
  @Headers({
    "Accept: application/json",
  })
  Variable getVariable(@Param("variableKey") String variableKey);

  /**
   * Get all variables
   * The collection does not contain data. To get data, you must get a single entity.
   * @param limit The numbers of items to return. (optional, default to 100)
   * @param offset The number of items to skip before starting to collect the result set. (optional)
   * @return VariableCollection
   */
  @RequestLine("GET /variables?limit={limit}&offset={offset}")
  @Headers({
    "Accept: application/json",
  })
  VariableCollection getVariables(@Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Get all variables
   * The collection does not contain data. To get data, you must get a single entity.
   * Note, this is equivalent to the other <code>getVariables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetVariablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>limit - The numbers of items to return. (optional, default to 100)</li>
   *   <li>offset - The number of items to skip before starting to collect the result set. (optional)</li>
   *   </ul>
   * @return VariableCollection
   */
  @RequestLine("GET /variables?limit={limit}&offset={offset}")
  @Headers({
  "Accept: application/json",
  })
  VariableCollection getVariables(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getVariables</code> method in a fluent style.
   */
  public static class GetVariablesQueryParams extends HashMap<String, Object> {
    public GetVariablesQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public GetVariablesQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update a variable by key
   * 
   * @param variableKey The Variable Key. (required)
   * @param variable  (required)
   * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional)
   * @return Variable
   */
  @RequestLine("PATCH /variables/{variableKey}?update_mask={updateMask}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Variable updateVariable(@Param("variableKey") String variableKey, Variable variable, @Param("updateMask") List<String> updateMask);

  /**
   * Update a variable by key
   * 
   * Note, this is equivalent to the other <code>updateVariable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateVariableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param variableKey The Variable Key. (required)
   * @param variable  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>updateMask - The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional)</li>
   *   </ul>
   * @return Variable
   */
  @RequestLine("PATCH /variables/{variableKey}?update_mask={updateMask}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Variable updateVariable(@Param("variableKey") String variableKey, Variable variable, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>updateVariable</code> method in a fluent style.
   */
  public static class UpdateVariableQueryParams extends HashMap<String, Object> {
    public UpdateVariableQueryParams updateMask(final List<String> value) {
      put("update_mask", EncodingUtils.encodeCollection(value, "csv"));
      return this;
    }
  }
}
