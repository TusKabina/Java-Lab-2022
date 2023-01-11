
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
    "sort",
    "offset",
    "pageNumber",
    "pageSize",
    "paged",
    "unpaged"
})
@Generated("jsonschema2pojo")
public class Pageable implements Serializable
{

    @JsonProperty("sort")
    private Sort sort;
    @JsonProperty("offset")
    private Integer offset;
    @JsonProperty("pageNumber")
    private Integer pageNumber;
    @JsonProperty("pageSize")
    private Integer pageSize;
    @JsonProperty("paged")
    private Boolean paged;
    @JsonProperty("unpaged")
    private Boolean unpaged;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4204305774363947378L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Pageable() {
    }

    /**
     * 
     * @param paged
     * @param pageNumber
     * @param offset
     * @param pageSize
     * @param unpaged
     * @param sort
     */
    public Pageable(Sort sort, Integer offset, Integer pageNumber, Integer pageSize, Boolean paged, Boolean unpaged) {
        super();
        this.sort = sort;
        this.offset = offset;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.paged = paged;
        this.unpaged = unpaged;
    }

    @JsonProperty("sort")
    public Sort getSort() {
        return sort;
    }

    @JsonProperty("sort")
    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public Pageable withSort(Sort sort) {
        this.sort = sort;
        return this;
    }

    @JsonProperty("offset")
    public Integer getOffset() {
        return offset;
    }

    @JsonProperty("offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Pageable withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    @JsonProperty("pageNumber")
    public Integer getPageNumber() {
        return pageNumber;
    }

    @JsonProperty("pageNumber")
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Pageable withPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    @JsonProperty("pageSize")
    public Integer getPageSize() {
        return pageSize;
    }

    @JsonProperty("pageSize")
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Pageable withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    @JsonProperty("paged")
    public Boolean getPaged() {
        return paged;
    }

    @JsonProperty("paged")
    public void setPaged(Boolean paged) {
        this.paged = paged;
    }

    public Pageable withPaged(Boolean paged) {
        this.paged = paged;
        return this;
    }

    @JsonProperty("unpaged")
    public Boolean getUnpaged() {
        return unpaged;
    }

    @JsonProperty("unpaged")
    public void setUnpaged(Boolean unpaged) {
        this.unpaged = unpaged;
    }

    public Pageable withUnpaged(Boolean unpaged) {
        this.unpaged = unpaged;
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

    public Pageable withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
