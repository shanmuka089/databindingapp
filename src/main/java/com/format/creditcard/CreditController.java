package com.format.creditcard;

import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lc.propertyEditor.CreditCardEditor;
import com.lc.propertyEditor.MyCurrencyEditor;
import com.lc.propertyEditor.NamePropertyEditor;

@Controller
public class CreditController {
	
	
	@RequestMapping("/credit")
	public String creditNum(Model model)
	{
		CreditCard credt=new CreditCard();
		CardNumber cn=new CardNumber();
		cn.setFirstfour("1234");
		cn.setSecondfour("4567");
		cn.setThirdfour("4789");
		cn.setFourfour("9632");
		
		CardCurreny cc=new CardCurreny();
		cc.setNum(10);
		cc.setCurrency(Locale.US);

		CardFields cf=new CardFields();
//		cf.setCnum(cn);
		cf.setCcur(cc);
		credt.setCnum(cn);
		

		credt.setCardFields(cf);
		model.addAttribute("creditCard",credt);
		return "credit-page";
	}
	
	@RequestMapping("/processCredit")
	public String processCredit(@Valid @ModelAttribute CreditCard creditCard,BindingResult set)
	{
		if(set.hasErrors()) {
			System.out.println(set.getAllErrors());
			return "credit-page";
		}
		
		
		return "credit-result-page";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
//		date custom property editor
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		CustomDateEditor customDateEditor=new CustomDateEditor(dateFormat, true);
		binder.registerCustomEditor(Date.class, "date", customDateEditor);
		
//		currency custom property editor
		MyCurrencyEditor editor= new MyCurrencyEditor();
		binder.registerCustomEditor(Currency.class,"currency", editor);
		
//		credit card formatter
//		binder.addCustomFormatter(new CreditCardFormatter());
		
//		credit card property editor
//		CreditCardEditor editor2=new CreditCardEditor();
//		binder.registerCustomEditor(CardNumber.class,"cnum", editor2);
			
	}

}
