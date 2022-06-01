package com.lc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserDto {
	
	
	@Size(min = 3,max = 15,message = "* your name must atleast 3-15 chars")
	@NotBlank(message = "* your name cannot be blank")
	//@Min(value = 3,message = "* your name atleast have 3 characters")
	private String userName;
	
	@NotBlank(message = "* your cannot be blank")
	@Size(min = 3,max=15, message = "* your name must btwn 3-15 characters")
	private String crushName;
	@AssertTrue(message = "* you have to agree to use our app")
	private boolean checkBox;
	public boolean isCheckBox() {
		return checkBox;
	}
	public void setCheckBox(boolean checkBox) {
		this.checkBox = checkBox;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCrushName() {
		return crushName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	@Override
	public String toString() {
		return "UserDto [userName=" + userName + ", crushName=" + crushName + "]";
	}
}
