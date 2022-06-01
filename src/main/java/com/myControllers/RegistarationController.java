package com.myControllers;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lc.api.Phone;
import com.lc.api.UserCommuDto;
import com.lc.api.UserRegDto;
import com.lc.propertyEditor.NamePropertyEditor;
import com.lc.validators.EmailValidator;
import com.lc.validators.NameValidator;

@Controller
public class RegistarationController {
	
	@Autowired
	EmailValidator valid;

	@RequestMapping("/register")
	public String RegistrationPage( Model model)
	{
		
		System.out.println("inside registration page method");
		UserRegDto userRegDto=new UserRegDto();
		userRegDto.setName("vedha");
		Phone p=new Phone();
		p.setCountryCode("91");
		p.setUserNumber("9121855469");
		
		UserCommuDto c=new UserCommuDto();
		c.setPhone(p);
		userRegDto.setCommuDto(c);
		model.addAttribute("userRegDto", userRegDto);
		return "user-reg-page";
	}
	
	
	
	
	@RequestMapping("/registration-success")
	public String processUserReg(@Valid @ModelAttribute("userRegDto") UserRegDto userRegDto,BindingResult set) {
		
//		we can validators directly from controllers
		
		valid.validate(userRegDto, set);
		
		
		if(set.hasErrors()) {
			System.out.println(set.getAllErrors());
			return "user-reg-page";
		}
		
		System.out.println("inside registration process method");
		return "reg-success";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		System.out.println("inside init binder");
		
//		StringTrimmerEditor editor=new StringTrimmerEditor(true);
//		binder.registerCustomEditor(String.class, "name", editor);
//		
		
		NameValidator validator=new NameValidator();
		binder.addValidators(validator);;
		
		NamePropertyEditor editor=new NamePropertyEditor();
		binder.registerCustomEditor(String.class,"name", editor);
		
//		EmailValidator valid=new EmailValidator();
//		binder.addValidators(valid);
		
		
		
	}
}
