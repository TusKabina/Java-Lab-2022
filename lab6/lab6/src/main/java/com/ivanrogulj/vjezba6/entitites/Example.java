
package com.ivanrogulj.vjezba6.entitites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "content",
    "pageable",
    "last",
    "totalPages",
    "totalElements",
    "size",
    "number",
    "sort",
    "first",
    "numberOfElements",
    "empty"
})
@Generated("jsonschema2pojo")
public class Example implements Serializable
{

    @JsonProperty("content")
    private List<Content> content = new ArrayList<Content>();
    @JsonProperty("pageable")
    private Pageable pageable;
    @JsonProperty("last")
    private Boolean last;
    @JsonProperty("totalPages")
    private Integer totalPages;
    @JsonProperty("totalElements")
    private Integer totalElements;
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("number")
    private Integer number;
    @JsonProperty("sort")
    private Sort__1 sort;
    @JsonProperty("first")
    private Boolean first;
    @JsonProperty("numberOfElements")
    private Integer numberOfElements;
    @JsonProperty("empty")
    private Boolean empty;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7987781756688232056L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Example() {
    }

    /**
     * 
     * @param number
     * @param last
     * @param size
     * @param numberOfElements
     * @param totalPages
     * @param pageable
     * @param sort
     * @param content
     * @param first
     * @param totalElements
     * @param empty
     */
    public Example(List<Content> content, Pageable pageable, Boolean last, Integer totalPages, Integer totalElements, Integer size, Integer number, Sort__1 sort, Boolean first, Integer numberOfElements, Boolean empty) {
        super();
        this.content = content;
        this.pageable = pageable;
        this.last = last;
        this.totalPages = totalPages;
        this.totalElements = totalElements;
        this.size = size;
        this.number = number;
        this.sort = sort;
        this.first = first;
        this.numberOfElements = numberOfElements;
        this.empty = empty;
    }

    @JsonProperty("content")
    public List<Content> getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(List<Content> content) {
        this.content = content;
    }

    public Example withContent(List<Content> content) {
        this.content = content;
        return this;
    }

    @JsonProperty("pageable")
    public Pageable getPageable() {
        return pageable;
    }

    @JsonProperty("pageable")
    public void setPageable(Pageable pageable) {
        this.pageable = pageable;
    }

    public Example withPageable(Pageable pageable) {
        this.pageable = pageable;
        return this;
    }

    @JsonProperty("last")
    public Boolean getLast() {
        return last;
    }

    @JsonProperty("last")
    public void setLast(Boolean last) {
        this.last = last;
    }

    public Example withLast(Boolean last) {
        this.last = last;
        return this;
    }

    @JsonProperty("totalPages")
    public Integer getTotalPages() {
        return totalPages;
    }

    @JsonProperty("totalPages")
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Example withTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    @JsonProperty("totalElements")
    public Integer getTotalElements() {
        return totalElements;
    }

    @JsonProperty("totalElements")
    public void setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
    }

    public Example withTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
        return this;
    }

    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    public Example withSize(Integer size) {
        this.size = size;
        return this;
    }

    @JsonProperty("number")
    public Integer getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    public Example withNumber(Integer number) {
        this.number = number;
        return this;
    }

    @JsonProperty("sort")
    public Sort__1 getSort() {
        return sort;
    }

    @JsonProperty("sort")
    public void setSort(Sort__1 sort) {
        this.sort = sort;
    }

    public Example withSort(Sort__1 sort) {
        this.sort = sort;
        return this;
    }

    @JsonProperty("first")
    public Boolean getFirst() {
        return first;
    }

    @JsonProperty("first")
    public void setFirst(Boolean first) {
        this.first = first;
    }

    public Example withFirst(Boolean first) {
        this.first = first;
        return this;
    }

    @JsonProperty("numberOfElements")
    public Integer getNumberOfElements() {
        return numberOfElements;
    }

    @JsonProperty("numberOfElements")
    public void setNumberOfElements(Integer numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public Example withNumberOfElements(Integer numberOfElements) {
        this.numberOfElements = numberOfElements;
        return this;
    }

    @JsonProperty("empty")
    public Boolean getEmpty() {
        return empty;
    }

    @JsonProperty("empty")
    public void setEmpty(Boolean empty) {
        this.empty = empty;
    }

    public Example withEmpty(Boolean empty) {
        this.empty = empty;
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

    public Example withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
