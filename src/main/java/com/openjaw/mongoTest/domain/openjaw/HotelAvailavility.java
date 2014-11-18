package com.openjaw.mongoTest.domain.openjaw;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true) 
public class HotelAvailavility {
	private HotelSearchResults HotelSearchResults;

	public HotelSearchResults getHotelSearchResults() {
		return HotelSearchResults;
	}

	public void setHotelSearchResults(HotelSearchResults hotelSearchResults) {
		HotelSearchResults = hotelSearchResults;
	}
	
	
}
