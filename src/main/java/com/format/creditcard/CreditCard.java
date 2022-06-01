package com.format.creditcard;

import java.util.Currency;
import java.util.Date;

public class CreditCard {
	
	private CardNumber cnum;
	

	public CardNumber getCnum() {
		return cnum;
	}

	public void setCnum(CardNumber cnum) {
		this.cnum = cnum;
	}

	private CardFields cardFields;
	private Date date;
	private Currency currency;

	public Date getDate() {
		return date;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public CardFields getCardFields() {
		return cardFields;
	}

	public void setCardFields(CardFields cardFields) {
		this.cardFields = cardFields;
	} 
}
