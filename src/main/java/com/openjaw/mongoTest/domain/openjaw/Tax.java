package com.openjaw.mongoTest.domain.openjaw;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Tax {
	private Double Amount;
	private String Currency;
	private String Code;
	private Boolean PayableLocally;
	public Double getAmount() {
		return Amount;
	}
	public void setAmount(Double amount) {
		Amount = amount;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public Boolean getPayableLocally() {
		return PayableLocally;
	}
	public void setPayableLocally(Boolean payableLocally) {
		PayableLocally = payableLocally;
	}
	
	
}
