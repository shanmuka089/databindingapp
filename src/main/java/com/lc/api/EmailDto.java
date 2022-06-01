package com.lc.api;

public class EmailDto {
		
	@Override
	public String toString() {
		return userEmail;
	}

	private String userEmail;

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

}
