package com.openjaw.mongoTest.domain.openjaw;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Room {
	private Integer RemainingUnits;
	private String REF;
	private Integer Reference;
	private Boolean OnRequest;
	private String Code;
	private String PolicyStatus;
	private String Name;
	private String Description;
	private String Checked;
	private Integer Adults;
	private Integer Children;
	private Integer Infants;
	private Boolean Selected;
	private Integer ProductNumber;
	private Meals Meals;
	private Specials Specials;
	private Extras Extras;
	private Amenities Amenities ;
	private Price Price;
	private Loyalty Loyalty;
	private GuestDetails GuestDetails;
	public Integer getRemainingUnits() {
		return RemainingUnits;
	}
	public void setRemainingUnits(Integer remainingUnits) {
		RemainingUnits = remainingUnits;
	}
	public String getREF() {
		return REF;
	}
	public void setREF(String rEF) {
		REF = rEF;
	}
	public Integer getReference() {
		return Reference;
	}
	public void setReference(Integer reference) {
		Reference = reference;
	}
	public Boolean getOnRequest() {
		return OnRequest;
	}
	public void setOnRequest(Boolean onRequest) {
		OnRequest = onRequest;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getPolicyStatus() {
		return PolicyStatus;
	}
	public void setPolicyStatus(String policyStatus) {
		PolicyStatus = policyStatus;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getChecked() {
		return Checked;
	}
	public void setChecked(String checked) {
		Checked = checked;
	}
	public Integer getAdults() {
		return Adults;
	}
	public void setAdults(Integer adults) {
		Adults = adults;
	}
	public Integer getChildren() {
		return Children;
	}
	public void setChildren(Integer children) {
		Children = children;
	}
	public Integer getInfants() {
		return Infants;
	}
	public void setInfants(Integer infants) {
		Infants = infants;
	}
	public Boolean getSelected() {
		return Selected;
	}
	public void setSelected(Boolean selected) {
		Selected = selected;
	}
	public Integer getProductNumber() {
		return ProductNumber;
	}
	public void setProductNumber(Integer productNumber) {
		ProductNumber = productNumber;
	}
	public Meals getMeals() {
		return Meals;
	}
	public void setMeals(Meals meals) {
		Meals = meals;
	}
	public Specials getSpecials() {
		return Specials;
	}
	public void setSpecials(Specials specials) {
		Specials = specials;
	}
	public Extras getExtras() {
		return Extras;
	}
	public void setExtras(Extras extras) {
		Extras = extras;
	}
	public Amenities getAmenities() {
		return Amenities;
	}
	public void setAmenities(Amenities amenities) {
		Amenities = amenities;
	}
	public Price getPrice() {
		return Price;
	}
	public void setPrice(Price price) {
		Price = price;
	}
	public Loyalty getLoyalty() {
		return Loyalty;
	}
	public void setLoyalty(Loyalty loyalty) {
		Loyalty = loyalty;
	}
	public GuestDetails getGuestDetails() {
		return GuestDetails;
	}
	public void setGuestDetails(GuestDetails guestDetails) {
		GuestDetails = guestDetails;
	}
	
	
			
			
			
			
}
