/*
 * Airflow API (Stable)
 * Apache Airflow management API.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: dev@airflow.apache.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.client.model.CronExpression;
import org.openapitools.client.model.RelativeDelta;
import org.openapitools.client.model.TimeDelta;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:00:27.527Z[GMT]")
@JsonDeserialize(using=ScheduleInterval.ScheduleIntervalDeserializer.class)
public class ScheduleInterval extends AbstractOpenApiSchema {
    public static class ScheduleIntervalDeserializer extends StdDeserializer<ScheduleInterval> {
        public ScheduleIntervalDeserializer() {
            this(ScheduleInterval.class);
        }

        public ScheduleIntervalDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public ScheduleInterval deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();

            int match = 0;
            Object deserialized = null;
            // deserialize CronExpression
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(CronExpression.class);
                match++;
            } catch (Exception e) {
                // deserialization failed, continue
            }

            // deserialize RelativeDelta
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(RelativeDelta.class);
                match++;
            } catch (Exception e) {
                // deserialization failed, continue
            }

            // deserialize TimeDelta
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(TimeDelta.class);
                match++;
            } catch (Exception e) {
                // deserialization failed, continue
            }

            if (match == 1) {
                ScheduleInterval ret = new ScheduleInterval();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for ScheduleInterval: %d classes match result, expected 1", match));
        }
    }

    // store a list of schema names defined in oneOf
    public final static Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ScheduleInterval() {
        super("oneOf", Boolean.FALSE);
    }

    public ScheduleInterval(CronExpression o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ScheduleInterval(RelativeDelta o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ScheduleInterval(TimeDelta o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CronExpression", new GenericType<CronExpression>() {
        });
        schemas.put("RelativeDelta", new GenericType<RelativeDelta>() {
        });
        schemas.put("TimeDelta", new GenericType<TimeDelta>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ScheduleInterval.schemas;
    }

    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CronExpression) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RelativeDelta) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TimeDelta) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CronExpression, RelativeDelta, TimeDelta");
    }



}

