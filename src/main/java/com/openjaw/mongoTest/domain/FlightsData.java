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
public class FlightsData {
	@XmlElement(name="flight")
	private List<FlightData> flights;

	public List<FlightData> getFlights() {
		return flights;
	}

	public void setFlights(List<FlightData> flights) {
		this.flights = flights;
	}
	
	
}
