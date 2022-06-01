package com.lc.converter;
import org.springframework.core.convert.converter.Converter;

import com.format.creditcard.CardNumber;
public class CreditCardConverter implements Converter<String,CardNumber> {

	@Override
	public CardNumber convert(String source) {
		
		String[] arr=source.split("-");
		CardNumber cnum=new CardNumber();
		cnum.setFirstfour(arr[0]);
		cnum.setSecondfour(arr[1]);
		cnum.setThirdfour(arr[2]);
		cnum.setFourfour(arr[3]);
		return cnum;
	}
}
