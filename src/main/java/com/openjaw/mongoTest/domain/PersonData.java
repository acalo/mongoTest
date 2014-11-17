package com.openjaw.mongoTest.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true) 
public class PersonData implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8105883153360028277L;
	@JsonProperty("_id")
	private String username;
	private String name;
	private String lastName;
	private Integer age;
	private String gender;
	
	
	public PersonData(){
		
	}
	
	public PersonData(String username, String name, String lastName, Integer age, String gender){
		this.setUsername(username);
		this.setAge(age);
		this.setGender(gender);
		this.setLastName(lastName);
		this.setName(name);
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
