package com.openjaw.mongoTest.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlAccessorType (XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true) 
public class HotelsData {
	@XmlElement(name="hotel")
	private List<HotelData> hotels = null;

	public List<HotelData> getHotels() {
		return hotels;
	}

	public void setHotels(List<HotelData> hotels) {
		this.hotels = hotels;
	}
	
	
}
