
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
    "airport",
    "pws"
})
public class NearbyWeatherStations {

    @JsonProperty("airport")
    private Airport airport;
    @JsonProperty("pws")
    private Pws pws;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("airport")
    public Airport getAirport() {
        return airport;
    }

    @JsonProperty("airport")
    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    @JsonProperty("pws")
    public Pws getPws() {
        return pws;
    }

    @JsonProperty("pws")
    public void setPws(Pws pws) {
        this.pws = pws;
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
