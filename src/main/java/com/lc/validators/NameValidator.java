package com.lc.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.lc.api.UserRegDto;

public class NameValidator implements Validator {

//	check for the name validator supports a given object
	@Override
	public boolean supports(Class<?> clazz) {
		
		return UserRegDto.class.equals(clazz);
	}

//	we need to write a custom validation logic
	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "userName.empty","userName Cannot be empty");
		String userName=((UserRegDto)target).getUserName();
		
		if(!userName.contains("_")) {
			errors.rejectValue("userName", "userNmae.invalidString", "the user name must contains underscore");
		}
		
	}

}
