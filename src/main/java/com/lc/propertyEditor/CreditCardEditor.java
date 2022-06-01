package com.lc.propertyEditor;

import java.beans.PropertyEditorSupport;

import com.format.creditcard.CardNumber;
import com.format.creditcard.CreditCard;

public class CreditCardEditor extends PropertyEditorSupport {

	@Override
	public String getAsText() {
		
		CardNumber cnum=(CardNumber)getValue();
		
		return ""+cnum;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		
		System.out.println("inside set text method");
		
		String[] arr=text.split("-");
		CardNumber cnum=new CardNumber();
		cnum.setFirstfour(arr[0]);
		cnum.setSecondfour(arr[1]);
		cnum.setThirdfour(arr[2]);
		cnum.setFourfour(arr[3]);
		setValue(cnum);
	}

}
