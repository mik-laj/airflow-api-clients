package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.ImportError;
import org.openapitools.client.model.ImportErrorCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-31T07:53:02.054Z[GMT]")
public class ImportErrorApi {
  private ApiClient apiClient;

  public ImportErrorApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ImportErrorApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API cilent
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API cilent
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Delete an import error
   * 
   * @param importErrorId The Import Error ID. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No content. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Client specified an invalid argument. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Request not authenticated due to missing, invalid, authentication info. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Client does not have sufficient permission. </td><td>  -  </td></tr>
     </table>
   */
  public void deleteImportError(Integer importErrorId) throws ApiException {
    deleteImportErrorWithHttpInfo(importErrorId);
  }

  /**
   * Delete an import error
   * 
   * @param importErrorId The Import Error ID. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No content. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Client specified an invalid argument. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Request not authenticated due to missing, invalid, authentication info. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Client does not have sufficient permission. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteImportErrorWithHttpInfo(Integer importErrorId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'importErrorId' is set
    if (importErrorId == null) {
      throw new ApiException(400, "Missing the required parameter 'importErrorId' when calling deleteImportError");
    }
    
    // create path and map variables
    String localVarPath = "/importErrors/{import_error_id}"
      .replaceAll("\\{" + "import_error_id" + "\\}", apiClient.escapeString(importErrorId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    return apiClient.invokeAPI("ImportErrorApi.deleteImportError", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, null);
  }
  /**
   * Get an import error
   * 
   * @param importErrorId The Import Error ID. (required)
   * @return ImportError
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Request not authenticated due to missing, invalid, authentication info. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Client does not have sufficient permission. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> A specified resource is not found. </td><td>  -  </td></tr>
     </table>
   */
  public ImportError getImportError(Integer importErrorId) throws ApiException {
    return getImportErrorWithHttpInfo(importErrorId).getData();
  }

  /**
   * Get an import error
   * 
   * @param importErrorId The Import Error ID. (required)
   * @return ApiResponse&lt;ImportError&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Request not authenticated due to missing, invalid, authentication info. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Client does not have sufficient permission. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> A specified resource is not found. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ImportError> getImportErrorWithHttpInfo(Integer importErrorId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'importErrorId' is set
    if (importErrorId == null) {
      throw new ApiException(400, "Missing the required parameter 'importErrorId' when calling getImportError");
    }
    
    // create path and map variables
    String localVarPath = "/importErrors/{import_error_id}"
      .replaceAll("\\{" + "import_error_id" + "\\}", apiClient.escapeString(importErrorId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ImportError> localVarReturnType = new GenericType<ImportError>() {};

    return apiClient.invokeAPI("ImportErrorApi.getImportError", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, null);
  }
  /**
   * Get all import errors
   * 
   * @param limit The numbers of items to return. (optional, default to 100)
   * @param offset The number of items to skip before starting to collect the result set. (optional)
   * @return ImportErrorCollection
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List of import errors. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Request not authenticated due to missing, invalid, authentication info. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Client does not have sufficient permission. </td><td>  -  </td></tr>
     </table>
   */
  public ImportErrorCollection getImportErrors(Integer limit, Integer offset) throws ApiException {
    return getImportErrorsWithHttpInfo(limit, offset).getData();
  }

  /**
   * Get all import errors
   * 
   * @param limit The numbers of items to return. (optional, default to 100)
   * @param offset The number of items to skip before starting to collect the result set. (optional)
   * @return ApiResponse&lt;ImportErrorCollection&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List of import errors. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Request not authenticated due to missing, invalid, authentication info. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Client does not have sufficient permission. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ImportErrorCollection> getImportErrorsWithHttpInfo(Integer limit, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/importErrors";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ImportErrorCollection> localVarReturnType = new GenericType<ImportErrorCollection>() {};

    return apiClient.invokeAPI("ImportErrorApi.getImportErrors", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, null);
  }
}
