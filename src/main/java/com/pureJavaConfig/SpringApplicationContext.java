package com.pureJavaConfig;

import java.util.Properties;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.format.creditcard.CreditCardFormatter;
import com.lc.converter.CreditCardConverter;
import com.lc.converter.CreditCardConverter2;
import com.lc.formatter.PhoneNumberFormatter;


@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.myControllers,com.format.creditcard,com.lc.validators,com.session.controllers,com.GlobalExceptionhandler")
public class SpringApplicationContext implements WebMvcConfigurer{
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
//	@Bean
//	public MessageSource messageSource() {
//		ReloadableResourceBundleMessageSource messageSource=new ReloadableResourceBundleMessageSource();
//		messageSource.setBasename("messages");
//		return messageSource;
//	}
//	@Bean
//	public LocalValidatorFactoryBean validator() {
//		LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
//		localValidatorFactoryBean.setValidationMessageSource(messageSource());
//		
//		return localValidatorFactoryBean;
//	}
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		
		System.out.println("inside add formatters method");
		
		registry.addFormatter(new PhoneNumberFormatter());
//		registry.addFormatter(new CreditCardFormatter());
		registry.addFormatter(new CreditCardFormatter2());
		registry.addConverter(new CreditCardConverter());
		registry.addConverter(new CreditCardConverter2());
	}
	
	
	
	
	@Bean
	public JavaMailSenderImpl configureJavaMailSender() {
		
		JavaMailSenderImpl javaMailSenderImpl=new JavaMailSenderImpl();
		javaMailSenderImpl.setHost("smtp.gmail.com");
		javaMailSenderImpl.setUsername("shanmukashanu5525@gmail.com");
		javaMailSenderImpl.setPort(587);
		javaMailSenderImpl.setPassword("Shanmuka@5525");
		Properties mailProperties=new Properties();
		mailProperties.put("mail.smtp.starttls.enable", true);
		mailProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		javaMailSenderImpl.setJavaMailProperties(mailProperties);
		return javaMailSenderImpl;
	}
	
	
//	@Override
//	public Validator getValidator()
//	{
//		return validator();
//	}
	
}
