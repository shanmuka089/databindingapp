package com.myControllers;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lc.api.UserDto;

@Controller
@SessionAttributes("userInfo")
public class LcAppController {
	
	@RequestMapping("/")
	public String show(Model model)
	{
		UserDto userInfo=new UserDto();
		model.addAttribute("userInfo", userInfo);
		return "home-page";
	}
	
	

	//@RequestMapping("/")
	public String show(@ModelAttribute("userInfo") UserDto userDto,HttpServletRequest request)
	{
//		Cookie[] arr=request.getCookies();
//		for(Cookie c: arr) {
//			if("userCookie".equals(c.getName())) {
//				String userName=c.getValue();
//				userDto.setUserName(userName);
//			}
//		}
		return "home-page";
	}
	
	
//	@RequestMapping("/process-homepage")
//	public String showResultPage(@RequestParam("userName") String userName,
//			@RequestParam("crushName") String crushName,Model model)
//	{
//		
//		model.addAttribute("userName", userName);
//		model.addAttribute("crushName", crushName);
//		return "result-page";
//	}

	
	
//	@RequestMapping("/process-homepage")
//	public String showResultPage(UserDto userDto,Model model)
//	{
//		
//		model.addAttribute("userName", userDto.getUserName());
//		model.addAttribute("crushName", userDto.getCrushName());
//		return "result-page";
//	}
	
	
	
//	@RequestMapping("/process-homepage")
//	public String showResultPage(UserDto userDto,Model model)
//	{
//		
//		model.addAttribute("userDto", userDto);
//		return "result-page";
//	}
	
	
	
	@RequestMapping("/process-homepage")
	public String showResultPage(@Valid @ModelAttribute("userInfo") UserDto userDto, BindingResult result,HttpServletRequest request)
	{
		System.out.println(userDto.isCheckBox());
		
		if(result.hasErrors()) {
			List<ObjectError> allerrors=result.getAllErrors();
			for(ObjectError x: allerrors) {
				System.out.println(x);
			}
			return "home-page";
		}
		
		
//		create session for user name
		HttpSession session=request.getSession();
		session.setAttribute("userName", userDto.getUserName());
		
		
		
//		create cookie for user name
//		Cookie theCookie=new Cookie("userCookie",userDto.getUserName());
//		theCookie.setMaxAge(60*60*24);
//		
//		response.addCookie(theCookie);
		
		
		
		
		
		
		
		
//		write a service which will caluculate the love between user & crush
		
		return "result-page";
	} 

}
