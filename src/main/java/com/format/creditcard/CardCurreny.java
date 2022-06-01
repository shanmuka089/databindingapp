package com.format.creditcard;

import java.text.NumberFormat;
import java.util.Locale;

public class CardCurreny {
	private double num;
	private Locale currency;
	public double getNum() {
		return num;
	}
	public void setNum(double i) {
		this.num = i;
	}
	public Locale getCurrency() {
		return currency;
	}
	@Override
	public String toString() {
		
		NumberFormat formatter=NumberFormat.getCurrencyInstance(currency);
		String currency=formatter.format(num);
		return currency;
	}
	public void setCurrency(Locale locale) {
		this.currency = locale;
	}
	
}
