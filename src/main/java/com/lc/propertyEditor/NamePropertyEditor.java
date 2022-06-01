package com.lc.propertyEditor;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditor extends PropertyEditorSupport{

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		
		String myConverted=text.toUpperCase();
		setValue(myConverted);
	}

	
	
}
