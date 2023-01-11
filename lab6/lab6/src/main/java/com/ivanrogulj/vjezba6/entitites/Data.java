package com.ivanrogulj.vjezba6.entitites;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@lombok.Data
//@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Data {

	@JsonProperty("deviceDataId")
	private Long deviceDataId;
	@JsonProperty("value")
	private int value;
	@JsonProperty("month")
	private String month;
	@JsonProperty("year")
	private String year;

}
