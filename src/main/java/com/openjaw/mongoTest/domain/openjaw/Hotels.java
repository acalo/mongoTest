package com.openjaw.mongoTest.domain.openjaw;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Hotels {
	
	private Integer Total;
	private Integer Matching;
	private String Indicator;
	private List<Hotel> Hotel;
	private List<Error> Error;
	public Integer getTotal() {
		return Total;
	}
	public void setTotal(Integer total) {
		Total = total;
	}
	public Integer getMatching() {
		return Matching;
	}
	public void setMatching(Integer matching) {
		Matching = matching;
	}
	public String getIndicator() {
		return Indicator;
	}
	public void setIndicator(String indicator) {
		Indicator = indicator;
	}
	public List<Hotel> getHotel() {
		return Hotel;
	}
	public void setHotel(List<Hotel> hotel) {
		Hotel = hotel;
	}
	public List<Error> getError() {
		return Error;
	}
	public void setError(List<Error> error) {
		Error = error;
	}
	
	
}
