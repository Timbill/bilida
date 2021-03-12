package com.example.bilida.model;

import lombok.Getter;
import lombok.Setter;
import lombok.Data;

import java.util.List;
//@Data

@Getter
@Setter
public class User {
	private String message;
	private String number;
	private String value;


	public User() {

	}
	
/*	public User(String message, String number, String value) {

		this.message = message;
		this.number = number;
		this.value = value;
	}
*/
	/*
	 * public String getMessage() { return message; }
	 * 
	 * public void setMessage(String message) { this.message = message; }
	 * 
	 * public String getNumber() { return number; }
	 * 
	 * public void setNumber(String number) { this.number = number; }
	 * 
	 * public String getValue() { return value; }
	 * 
	 * public void setValue(String value) { this.value = value; }
	 */
}