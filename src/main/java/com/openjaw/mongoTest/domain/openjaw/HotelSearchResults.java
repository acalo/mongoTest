package com.openjaw.mongoTest.domain.openjaw;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@XmlRootElement(name="HotelSearchResults")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true) 
public class HotelSearchResults {
	private PageInfo PageInfo;
	private SearchSummary SearchSummary;
	private Pages Pages;
	private Hotels Hotels;
	public PageInfo getPageInfo() {
		return PageInfo;
	}
	public void setPageInfo(PageInfo pageInfo) {
		PageInfo = pageInfo;
	}
	public SearchSummary getSearchSummary() {
		return SearchSummary;
	}
	public void setSearchSummary(SearchSummary searchSummary) {
		SearchSummary = searchSummary;
	}
	public Pages getPages() {
		return Pages;
	}
	public void setPages(Pages pages) {
		Pages = pages;
	}
	public Hotels getHotels() {
		return Hotels;
	}
	public void setHotels(Hotels hotels) {
		Hotels = hotels;
	}
	
	
}
