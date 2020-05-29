package org.openapitools.client.api;

import org.openapitools.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.Variable;
import org.openapitools.client.model.VariableCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface VariableApi {
  /**
   * Create a variable
   * 
   * @param variable  (required)
   * @return Call&lt;Variable&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("variables")
  Call<Variable> createVariable(
    @retrofit2.http.Body Variable variable
  );

  /**
   * Delete variable
   * 
   * @param variableKey The Variable Key. (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("variables/{variable_key}")
  Call<Void> deleteVariable(
    @retrofit2.http.Path("variable_key") String variableKey
  );

  /**
   * Get a variable by key
   * 
   * @param variableKey The Variable Key. (required)
   * @return Call&lt;Variable&gt;
   */
  @GET("variables/{variable_key}")
  Call<Variable> getVariable(
    @retrofit2.http.Path("variable_key") String variableKey
  );

  /**
   * Get all variables
   * The collection does not contain data. To get data, you must get a single entity.
   * @param limit The numbers of items to return. (optional, default to 100)
   * @param offset The number of items to skip before starting to collect the result set. (optional)
   * @return Call&lt;VariableCollection&gt;
   */
  @GET("variables")
  Call<VariableCollection> getVariables(
    @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

  /**
   * Update a variable by key
   * 
   * @param variableKey The Variable Key. (required)
   * @param variable  (required)
   * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;String&gt;())
   * @return Call&lt;Variable&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("variables/{variable_key}")
  Call<Variable> updateVariable(
    @retrofit2.http.Path("variable_key") String variableKey, @retrofit2.http.Body Variable variable, @retrofit2.http.Query("update_mask") CSVParams updateMask
  );

}
