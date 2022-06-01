package com.pureJavaConfig;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.format.creditcard.CardCurreny;

public class CreditCardFormatter2 implements Formatter<CardCurreny> {

	@Override
	public String print(CardCurreny object, Locale locale) {
		locale=object.getCurrency();
		String code = NumberFormat.getCurrencyInstance(locale).getCurrency().getCurrencyCode();
		double x=object.getNum();
		
		return x+" "+code;
	}

	@Override
	public CardCurreny parse(String text, Locale locale) throws ParseException {
		
		System.out.println("inside curreny print");
		String[] s=text.split(" ");
		CardCurreny cc=new CardCurreny();
		cc.setNum(Double.parseDouble(s[0]));
		locale=getLocale(s[1]);
		cc.setCurrency(locale);
		return cc;
	}
	
	private static Locale getLocale(String strCode) {
	     System.out.println("inside currency parse");
	    for (Locale locale : NumberFormat.getAvailableLocales()) {
	        String code = NumberFormat.getCurrencyInstance(locale).getCurrency().getCurrencyCode();
	        if (strCode.equalsIgnoreCase(code)) {
	            return locale;
	        }
	    }  
	    return null;
	}

}
