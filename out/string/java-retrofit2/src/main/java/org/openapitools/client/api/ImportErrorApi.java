package org.openapitools.client.api;

import org.openapitools.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.ImportError;
import org.openapitools.client.model.ImportErrorCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ImportErrorApi {
  /**
   * Delete an import error
   * 
   * @param importErrorId The Import Error ID. (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("importErrors/{import_error_id}")
  Call<Void> deleteImportError(
    @retrofit2.http.Path("import_error_id") Integer importErrorId
  );

  /**
   * Get an import error
   * 
   * @param importErrorId The Import Error ID. (required)
   * @return Call&lt;ImportError&gt;
   */
  @GET("importErrors/{import_error_id}")
  Call<ImportError> getImportError(
    @retrofit2.http.Path("import_error_id") Integer importErrorId
  );

  /**
   * Get all import errors
   * 
   * @param limit The numbers of items to return. (optional, default to 100)
   * @param offset The number of items to skip before starting to collect the result set. (optional)
   * @return Call&lt;ImportErrorCollection&gt;
   */
  @GET("importErrors")
  Call<ImportErrorCollection> getImportErrors(
    @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("offset") Integer offset
  );

}
