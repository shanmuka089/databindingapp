package com.myControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lc.api.EmailDto;
import com.lc.api.UserDto;

@Controller
public class EmailController {
	
	@Autowired
	private LcEmailServiceImpl service;
	
	@RequestMapping("/sendEmail")
//	public String sendEmail(@CookieValue("userCookie") String userName,Model model) {
	public String sendEmail(Model model) {
//		model.addAttribute("userName",userName);
		model.addAttribute("emailDto",new EmailDto());
		return "send-emailPage";
	}
	
//	handler method to receive request & send response back 
	@RequestMapping("/process-email")
	public String processEmail(@SessionAttribute("userInfo") UserDto userDto,@ModelAttribute("emailDto") EmailDto emailDto) {
		service.sendEmail(userDto.getUserName(), emailDto.getUserEmail(),"friend");
		
		return "process-emailPage";
	}

	public void m1(){

	}
}
