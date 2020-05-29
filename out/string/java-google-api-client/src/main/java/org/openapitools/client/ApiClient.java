package org.openapitools.client;

import org.openapitools.client.api.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.openapitools.jackson.nullable.JsonNullableModule;
import com.fasterxml.jackson.datatype.threetenbp.ThreeTenModule;
import org.threeten.bp.*;
import com.google.api.client.googleapis.util.Utils;
import com.google.api.client.http.AbstractHttpContent;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.Json;

import java.io.IOException;
import java.io.OutputStream;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:01:56.893Z[GMT]")
public class ApiClient {
    private final String basePath;
    private final HttpRequestFactory httpRequestFactory;
    private final ObjectMapper objectMapper;

    private static final String defaultBasePath = "http://localhost/api/v1";

    // A reasonable default object mapper. Client can pass in a chosen ObjectMapper anyway, this is just for reasonable defaults.
    private static ObjectMapper createDefaultObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper()
            .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            .setDateFormat(new RFC3339DateFormat());
        ThreeTenModule module = new ThreeTenModule();
        module.addDeserializer(Instant.class, CustomInstantDeserializer.INSTANT);
        module.addDeserializer(OffsetDateTime.class, CustomInstantDeserializer.OFFSET_DATE_TIME);
        module.addDeserializer(ZonedDateTime.class, CustomInstantDeserializer.ZONED_DATE_TIME);
        objectMapper.registerModule(module);
        JsonNullableModule jnm = new JsonNullableModule();
        objectMapper.registerModule(jnm);
        return objectMapper;
    }

    public ApiClient() {
        this(null, null, null, null);
    }

    public ApiClient(
        String basePath,
        HttpTransport httpTransport,
        HttpRequestInitializer initializer,
        ObjectMapper objectMapper
    ) {
        this.basePath = basePath == null ? defaultBasePath : (
            basePath.endsWith("/") ? basePath.substring(0, basePath.length() - 1) : basePath
        );
        this.httpRequestFactory = (httpTransport == null ? Utils.getDefaultTransport() : httpTransport).createRequestFactory(initializer);
        this.objectMapper = (objectMapper == null ? createDefaultObjectMapper() : objectMapper);
    }

    public HttpRequestFactory getHttpRequestFactory() {
        return httpRequestFactory;
    }

    public String getBasePath() {
        return basePath;
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    public class JacksonJsonHttpContent extends AbstractHttpContent {
        /* A POJO that can be serialized with a com.fasterxml Jackson ObjectMapper */
        private final Object data;

        public JacksonJsonHttpContent(Object data) {
            super(Json.MEDIA_TYPE);
            this.data = data;
        }

        @Override
        public void writeTo(OutputStream out) throws IOException {
            objectMapper.writeValue(out, data);
        }
    }

    // Builder pattern to get API instances for this client.
    
    public ConfigApi configApi() {
        return new ConfigApi(this);
    }
    
    public ConnectionApi connectionApi() {
        return new ConnectionApi(this);
    }
    
    public DagApi dagApi() {
        return new DagApi(this);
    }
    
    public DagRunApi dagRunApi() {
        return new DagRunApi(this);
    }
    
    public EventLogApi eventLogApi() {
        return new EventLogApi(this);
    }
    
    public ImportErrorApi importErrorApi() {
        return new ImportErrorApi(this);
    }
    
    public PoolApi poolApi() {
        return new PoolApi(this);
    }
    
    public TaskInstanceApi taskInstanceApi() {
        return new TaskInstanceApi(this);
    }
    
    public VariableApi variableApi() {
        return new VariableApi(this);
    }
    
    public XComApi xComApi() {
        return new XComApi(this);
    }
    
}
