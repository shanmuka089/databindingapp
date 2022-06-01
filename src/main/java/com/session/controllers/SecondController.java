package com.session.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SecondController {

	@RequestMapping("/first2")
	public String firstHandler(Model model) {
		return "index";
	}
	
	@RequestMapping("/jaanu")
	public String mycrush(Model model) {
		
		Crush c=(Crush)model.getAttribute("myCrush");
		System.out.println(c.getName());
		System.out.println(c.getAge());
		return "showCrush";
	}
}
