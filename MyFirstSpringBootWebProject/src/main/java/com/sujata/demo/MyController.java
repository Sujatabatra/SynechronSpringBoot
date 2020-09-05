package com.sujata.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/") //Mapping Handler
	public ModelAndView firstController(){
		ModelAndView mv=new ModelAndView();
		mv.addObject("message", "Hi Evevryone coming from first Controller");
		mv.setViewName("index");
		return mv;
	}

	@RequestMapping("/second")
	public ModelAndView secondController(){
		ModelAndView mv=new ModelAndView();
		mv.addObject("message", "Hi Evevryone coming from second Controller");
		mv.setViewName("index");
		return mv;
	}
}
