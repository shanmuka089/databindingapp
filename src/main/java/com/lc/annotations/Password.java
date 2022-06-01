package com.lc.annotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.lc.validators.Passwordvalidator;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = Passwordvalidator.class)
@Target(ElementType.FIELD)
public @interface Password {
	

	String message() default "please enter a valid password the password must be between {lower} to {upper}";
	
	int lower() default 8;
	int upper() default 15;
	
	
	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
	
	

}
