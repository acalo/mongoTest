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
public class FlightData extends ServiceData{
	@XmlElement
	private String company;
	@XmlElement
	private String date;
	@XmlElement
	private String typeFlight;
	@XmlElement
	private Integer poblationOut;
	@XmlElement
	private Integer poblationReturn;
	
	
	public FlightData(){
		
	}
	public FlightData(Integer price, String type, String company, String date, String typeFlight, Integer poblationOut, Integer poblationReturn){
		super(price, type);
		this.company = company;
		this.date = date;
		this.typeFlight = typeFlight;
		this.poblationOut = poblationOut;
		this.poblationReturn = poblationReturn;
	}
	
	public Integer getPoblationOut() {
		return poblationOut;
	}
	public void setPoblationOut(Integer poblationOut) {
		this.poblationOut = poblationOut;
	}
	public Integer getPoblationReturn() {
		return poblationReturn;
	}
	public void setPoblationReturn(Integer poblationReturn) {
		this.poblationReturn = poblationReturn;
	}
	public String getTypeFlight() {
		return typeFlight;
	}
	public void setTypeFlight(String typeFlight) {
		this.typeFlight = typeFlight;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
