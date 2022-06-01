package com.session.controllers;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes({"name","crush"})
public class FirstController {

	
	@RequestMapping("/first")
	public String firstHandler(Model model) {
		model.addAttribute("name","shanmuka");
		model.addAttribute("crush","vedha");
		model.addAttribute("next","/second");
		
		return "index";
	}
	
	@RequestMapping("/second")
	public String secondHandler(Model model,SessionStatus status,HttpSession session) {
		status.setComplete();
		
		String x=(String)model.getAttribute("name");
		String y=(String)session.getAttribute("crush");
		model.addAttribute("next","/first2");
		System.out.println(x);
		System.out.println(y);
		
		return "index";
	}
	
	
}
