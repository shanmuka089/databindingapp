package com.format.creditcard;

public class CardNumber {
	
	@Override
	public String toString() {
		return  firstfour + "-" + secondfour + "-" + thirdfour
				+ "-" + fourfour;
	}
	private String firstfour;
	private String secondfour;
	private String thirdfour;
	private String fourfour;
	public String getFirstfour() {
		return firstfour;
	}
	public void setFirstfour(String firstfour) {
		this.firstfour = firstfour;
	}
	public String getSecondfour() {
		return secondfour;
	}
	public void setSecondfour(String secondfour) {
		this.secondfour = secondfour;
	}
	public String getThirdfour() {
		return thirdfour;
	}
	public void setThirdfour(String thirdfour) {
		this.thirdfour = thirdfour;
	}
	public String getFourfour() {
		return fourfour;
	}
	public void setFourfour(String fourfour) {
		this.fourfour = fourfour;
	}
}
