package com.lc.propertyEditor;

import java.beans.PropertyEditorSupport;
import java.util.Currency;

public class MyCurrencyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Currency c=Currency.getInstance(text.toUpperCase());
		setValue(c);
	}

}
