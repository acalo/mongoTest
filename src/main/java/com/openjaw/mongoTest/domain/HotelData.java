package com.openjaw.mongoTest.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true) 
public class HotelData extends ServiceData{
	
	@XmlElement
	private String hotel;
	@XmlElement
	private String dateIn;
	@XmlElement
	private String dateOut;
	@XmlElement
	private Integer poblation;
	
	public HotelData(){
		
	}
	public HotelData(Integer price, String type, String hotel, String dateIn, String dateOut, Integer poblation){
		super(price, type);
		this.hotel = hotel;
		this.dateIn = dateIn;
		this.dateOut = dateOut;
		this.poblation = poblation;
	}
	
	public Integer getPoblation() {
		return poblation;
	}
	public void setPoblation(Integer poblation) {
		this.poblation = poblation;
	}
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	public String getDateIn() {
		return dateIn;
	}
	public void setDateIn(String dateIn) {
		this.dateIn = dateIn;
	}
	public String getDateOut() {
		return dateOut;
	}
	public void setDateOut(String dateOut) {
		this.dateOut = dateOut;
	}
	
	
}
