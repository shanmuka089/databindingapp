package com.myControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class LcEmailServiceImpl {
	
	@Autowired
	private JavaMailSender mailSender;
	
	public void sendEmail(String name,String mail,String result) {
	SimpleMailMessage newEmail=new SimpleMailMessage();
	newEmail.setTo(mail);
	newEmail.setSubject("love caluculator application result!...");
	newEmail.setText("Hi! "+name+" \n \t the result predicted by lc app is "+result);
	mailSender.send(newEmail);
	}

}
