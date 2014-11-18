package com.openjaw.mongoTest.domain.openjaw;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Price {
	
	private Total Base;
	private Taxes Taxes;
	private Total Subtotal;
	private Discounts Discounts;
	private Extras Extras;
	private Total Total;
	private PostPayTotal PostPayTotal;
	public Total getBase() {
		return Base;
	}
	public void setBase(Total base) {
		Base = base;
	}
	public Taxes getTaxes() {
		return Taxes;
	}
	public void setTaxes(Taxes taxes) {
		Taxes = taxes;
	}
	public Total getSubtotal() {
		return Subtotal;
	}
	public void setSubtotal(Total subtotal) {
		Subtotal = subtotal;
	}
	public Discounts getDiscounts() {
		return Discounts;
	}
	public void setDiscounts(Discounts discounts) {
		Discounts = discounts;
	}
	public Extras getExtras() {
		return Extras;
	}
	public void setExtras(Extras extras) {
		Extras = extras;
	}
	public Total getTotal() {
		return Total;
	}
	public void setTotal(Total total) {
		Total = total;
	}
	public PostPayTotal getPostPayTotal() {
		return PostPayTotal;
	}
	public void setPostPayTotal(PostPayTotal postPayTotal) {
		PostPayTotal = postPayTotal;
	}
	
	
	
}
