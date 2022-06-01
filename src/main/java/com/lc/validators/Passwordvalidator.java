package com.lc.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.lc.annotations.Age;
import com.lc.annotations.Password;

public class Passwordvalidator implements ConstraintValidator<Password, String>{

	private int lower;
	private int upper;
	@Override
	public void initialize(Password password) {
//		i can wrie the post construct here
		this.lower=password.lower();
		this.upper=password.upper();
	}
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		
		
		return false;
	}

}
