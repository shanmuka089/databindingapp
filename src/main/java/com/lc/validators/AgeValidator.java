package com.lc.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.lc.annotations.Age;

public class AgeValidator implements ConstraintValidator<Age,Integer> {

	private int lower;
	private int upper;
	@Override
	public void initialize(Age age) {
//		i can wrie the post construct here
		this.lower=age.lower();
		this.upper=age.upper();
	}
	
	@Override
	public boolean isValid(Integer age, ConstraintValidatorContext context) {
//		i need to write my logic
		if(age==null) {
			return false;
		}
		if(age<lower || age>upper) {
			return false;
		}
		
		return true;
	}

}
