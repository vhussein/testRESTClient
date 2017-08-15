
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
    "fahrenheit",
    "celsius"
})
public class Low {

    @JsonProperty("fahrenheit")
    private String fahrenheit;
    @JsonProperty("celsius")
    private String celsius;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fahrenheit")
    public String getFahrenheit() {
        return fahrenheit;
    }

    @JsonProperty("fahrenheit")
    public void setFahrenheit(String fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    @JsonProperty("celsius")
    public String getCelsius() {
        return celsius;
    }

    @JsonProperty("celsius")
    public void setCelsius(String celsius) {
        this.celsius = celsius;
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
