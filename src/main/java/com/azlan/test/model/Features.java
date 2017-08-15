
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
    "geolookup",
    "conditions",
    "forecast"
})
public class Features {

    @JsonProperty("geolookup")
    private Integer geolookup;
    @JsonProperty("conditions")
    private Integer conditions;
    @JsonProperty("forecast")
    private Integer forecast;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("geolookup")
    public Integer getGeolookup() {
        return geolookup;
    }

    @JsonProperty("geolookup")
    public void setGeolookup(Integer geolookup) {
        this.geolookup = geolookup;
    }

    @JsonProperty("conditions")
    public Integer getConditions() {
        return conditions;
    }

    @JsonProperty("conditions")
    public void setConditions(Integer conditions) {
        this.conditions = conditions;
    }

    @JsonProperty("forecast")
    public Integer getForecast() {
        return forecast;
    }

    @JsonProperty("forecast")
    public void setForecast(Integer forecast) {
        this.forecast = forecast;
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
