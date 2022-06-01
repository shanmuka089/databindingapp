package com.format.creditcard;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

public class CreditCardFormatter implements Formatter<CardNumber> {

	@Override
	public String print(CardNumber object, Locale locale) {
		
		System.out.println("inside credit card print method");
		return object.getFirstfour()+"-"+object.getSecondfour()+"-"+object.getThirdfour()+"-"+object.getFourfour();
	}

	@Override
	public CardNumber parse(String text, Locale locale) throws ParseException {
		
		System.out.println("inside credit card parse method");
		String[] arr=text.split("-");
		CardNumber cnum=new CardNumber();
		cnum.setFirstfour(arr[0]);
		cnum.setSecondfour(arr[1]);
		cnum.setThirdfour(arr[2]);
		cnum.setFourfour(arr[3]);
		return cnum;
	}

	
	

	

}
