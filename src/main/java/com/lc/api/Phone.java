package com.lc.api;

public class Phone {
	
	private String countryCode;
	@Override
	public String toString() {
		return countryCode+"-"+userNumber;
	}
	private String userNumber;
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}
}
