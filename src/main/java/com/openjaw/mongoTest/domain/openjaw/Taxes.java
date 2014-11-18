package com.openjaw.mongoTest.domain.openjaw;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Taxes {
	private List<Tax> Tax;

	public List<Tax> getTax() {
		return Tax;
	}

	public void setTax(List<Tax> tax) {
		Tax = tax;
	}
	
}
