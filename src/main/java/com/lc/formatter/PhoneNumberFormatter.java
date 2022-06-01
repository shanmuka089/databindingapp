package com.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.lc.api.Phone;

public class PhoneNumberFormatter implements Formatter<Phone>{

	@Override
	public String print(Phone object, Locale locale) {
		
		return object.getCountryCode()+"-"+object.getUserNumber(); 
	}

	@Override
	public Phone parse(String text, Locale locale) throws ParseException {
		
		System.out.println("inside the parse method of formatter");

		Phone p=new Phone();
		
		if(text.contains("-")) {
		
		String[] phone=text.split("-");
		if(phone[0].equals("")) {
			p.setCountryCode("91");
		}
		p.setUserNumber(phone[1]);
		}else {
			p.setCountryCode("91");
			p.setUserNumber(text);
		}
		
		return p;
	}

}
