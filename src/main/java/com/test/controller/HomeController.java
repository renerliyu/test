package com.test.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value="/w1",method=RequestMethod.GET)
	public String showWelcomePage(){
		logger.info("Show Welcome Page method");
		return "welcome1";
	}
	
	@RequestMapping(value="/w2/{userName}",method=RequestMethod.GET)
	public ModelAndView showWelcomePage2(@PathVariable("userName") String userName,@RequestParam String password){
		logger.info("Show Welcome Page method");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("welcome1");
		modelAndView.addObject("date",new Date());
		return modelAndView;
	}
}
