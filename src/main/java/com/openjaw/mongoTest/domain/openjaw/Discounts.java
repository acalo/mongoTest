package com.openjaw.mongoTest.domain.openjaw;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Discounts {
	private List<Discount> Discount;

	public List<Discount> getDiscount() {
		return Discount;
	}

	public void setDiscount(List<Discount> discount) {
		Discount = discount;
	}
	
	
}
