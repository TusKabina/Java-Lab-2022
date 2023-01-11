
package com.ivanrogulj.vjezba6.entitites;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "year",
    "month",
    "value",
    "device"
})
@Generated("jsonschema2pojo")
public class Content implements Serializable
{

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("year")
    private String year;
    @JsonProperty("month")
    private String month;
    @JsonProperty("value")
    private String value;
    @JsonProperty("device")
    private Device device;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3284230127470575728L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Content() {
    }

    /**
     * 
     * @param month
     * @param year
     * @param id
     * @param value
     * @param device
     */
    public Content(Integer id, String year, String month, String value, Device device) {
        super();
        this.id = id;
        this.year = year;
        this.month = month;
        this.value = value;
        this.device = device;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public Content withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("year")
    public String getYear() {
        return year;
    }

    @JsonProperty("year")
    public void setYear(String year) {
        this.year = year;
    }

    public Content withYear(String year) {
        this.year = year;
        return this;
    }

    @JsonProperty("month")
    public String getMonth() {
        return month;
    }

    @JsonProperty("month")
    public void setMonth(String month) {
        this.month = month;
    }

    public Content withMonth(String month) {
        this.month = month;
        return this;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public Content withValue(String value) {
        this.value = value;
        return this;
    }

    @JsonProperty("device")
    public Device getDevice() {
        return device;
    }

    @JsonProperty("device")
    public void setDevice(Device device) {
        this.device = device;
    }

    public Content withDevice(Device device) {
        this.device = device;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Content withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
