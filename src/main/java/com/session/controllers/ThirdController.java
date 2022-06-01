package com.session.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@ControllerAdvice
@SessionAttributes("myCrush")
public class ThirdController {
	
	
	
	@ModelAttribute("myCrush")
	public Crush getCrush() {
		Crush crush=new Crush();
		crush.setName("vedha");
		crush.setAge(24);
		return crush;
	}
	
	@RequestMapping("/crush")
	public String mycrush(Model model) throws Exception {
		if(true) {
			throw new Exception();
		}
		
		Crush c=(Crush)model.getAttribute("myCrush");
		System.out.println(c.getName());
		System.out.println(c.getAge());
		return "showCrush";
	}
	
	@RequestMapping("/darlu")
	public String mydarling(Model model) {
		
		
		Crush c=(Crush)model.getAttribute("myCrush");
		System.out.println(c.getName());
		System.out.println(c.getAge());
		return "showCrush";
	}
	

}
