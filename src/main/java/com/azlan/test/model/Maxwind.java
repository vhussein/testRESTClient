
package com.azlan.test.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "mph",
    "kph",
    "dir",
    "degrees"
})
public class Maxwind {

    @JsonProperty("mph")
    private Integer mph;
    @JsonProperty("kph")
    private Integer kph;
    @JsonProperty("dir")
    private String dir;
    @JsonProperty("degrees")
    private Integer degrees;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("mph")
    public Integer getMph() {
        return mph;
    }

    @JsonProperty("mph")
    public void setMph(Integer mph) {
        this.mph = mph;
    }

    @JsonProperty("kph")
    public Integer getKph() {
        return kph;
    }

    @JsonProperty("kph")
    public void setKph(Integer kph) {
        this.kph = kph;
    }

    @JsonProperty("dir")
    public String getDir() {
        return dir;
    }

    @JsonProperty("dir")
    public void setDir(String dir) {
        this.dir = dir;
    }

    @JsonProperty("degrees")
    public Integer getDegrees() {
        return degrees;
    }

    @JsonProperty("degrees")
    public void setDegrees(Integer degrees) {
        this.degrees = degrees;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
