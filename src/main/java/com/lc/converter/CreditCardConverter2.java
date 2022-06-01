package com.lc.converter;

import org.springframework.core.convert.converter.Converter;

import com.format.creditcard.CardNumber;

public class CreditCardConverter2 implements Converter<CardNumber,String> {

	@Override
	public String convert(CardNumber source) {
		return ""+source;
	}


}
