package com.lc.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.lc.api.UserRegDto;

@Component
public class EmailValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return UserRegDto.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "commuDto.email", "email.empty","email cannot be empty");
		
		String mail=((UserRegDto)target).getCommuDto().getEmail();
		if(!mail.endsWith("virtusa.com")) {
			errors.rejectValue("commuDto.email","email.invalidDomain", "eamil should ends with virtusa.com");
		}
		

	}

}
