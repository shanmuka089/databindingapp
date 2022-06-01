package com.GlobalExceptionhandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptions {
	
	@ResponseBody
	@ExceptionHandler(value = Exception.class)
	public String Exception() {
		return "Exception";
	}
}
