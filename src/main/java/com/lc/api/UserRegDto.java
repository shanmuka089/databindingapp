package com.lc.api;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.lc.annotations.Age;

public class UserRegDto {
	
	@NotBlank(message = "* name cannot be blank")
	private String name;
	
	//@NotBlank(message = "* userName cannot be blank")
	private String userName;
	
	@NotEmpty(message = "* your password cannot be empty")
	private char[] password;
	
	@NotBlank(message = "* please select your country")
	private String country;
	
	@NotEmpty(message = "* select your hobbies")
	private String[] hobbies;
	
	@NotBlank(message = "* please select your gender")
	private String gender;
	
	@Age(lower = 18,upper = 30)
	private Integer age;
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	private UserCommuDto commuDto;
	public UserCommuDto getCommuDto() {
		return commuDto;
	}
	public void setCommuDto(UserCommuDto commuDto) {
		this.commuDto = commuDto;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
}
