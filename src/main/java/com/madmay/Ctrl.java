package com.madmay;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Ctrl {
	   @RequestMapping("/home")
	   public String helloWord(){
//		      String message = "Hello World, Spring 3.0!";
//		      return new ModelAndView("home", "message",message);
		   return "home";
	   }
}
