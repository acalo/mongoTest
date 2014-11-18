package com.openjaw.mongoTest.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlRootElement(name="services")
@XmlAccessorType (XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true) 
public class ServicesData {
		@XmlElement
		private HotelsData hotels;
		@XmlElement
		private FlightsData flights;
		public HotelsData getHotels() {
			return hotels;
		}
		public void setHotels(HotelsData hotels) {
			this.hotels = hotels;
		}
		public FlightsData getFlights() {
			return flights;
		}
		public void setFlights(FlightsData flights) {
			this.flights = flights;
		}
		
		
		
		
		
		
		
}
