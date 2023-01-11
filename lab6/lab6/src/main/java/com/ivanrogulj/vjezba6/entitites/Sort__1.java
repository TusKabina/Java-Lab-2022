
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
    "empty",
    "sorted",
    "unsorted"
})
@Generated("jsonschema2pojo")
public class Sort__1 implements Serializable
{

    @JsonProperty("empty")
    private Boolean empty;
    @JsonProperty("sorted")
    private Boolean sorted;
    @JsonProperty("unsorted")
    private Boolean unsorted;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 680820419941318522L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sort__1() {
    }

    /**
     * 
     * @param unsorted
     * @param sorted
     * @param empty
     */
    public Sort__1(Boolean empty, Boolean sorted, Boolean unsorted) {
        super();
        this.empty = empty;
        this.sorted = sorted;
        this.unsorted = unsorted;
    }

    @JsonProperty("empty")
    public Boolean getEmpty() {
        return empty;
    }

    @JsonProperty("empty")
    public void setEmpty(Boolean empty) {
        this.empty = empty;
    }

    public Sort__1 withEmpty(Boolean empty) {
        this.empty = empty;
        return this;
    }

    @JsonProperty("sorted")
    public Boolean getSorted() {
        return sorted;
    }

    @JsonProperty("sorted")
    public void setSorted(Boolean sorted) {
        this.sorted = sorted;
    }

    public Sort__1 withSorted(Boolean sorted) {
        this.sorted = sorted;
        return this;
    }

    @JsonProperty("unsorted")
    public Boolean getUnsorted() {
        return unsorted;
    }

    @JsonProperty("unsorted")
    public void setUnsorted(Boolean unsorted) {
        this.unsorted = unsorted;
    }

    public Sort__1 withUnsorted(Boolean unsorted) {
        this.unsorted = unsorted;
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

    public Sort__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
