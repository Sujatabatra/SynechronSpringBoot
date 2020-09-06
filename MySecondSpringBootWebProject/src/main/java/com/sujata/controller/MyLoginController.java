package com.sujata.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.bean.User;
import com.sujata.service.LoginService;

@Controller
@SessionAttributes("user")
public class MyLoginController {
	
	@Autowired
	private LoginService loginService;
	
//	@RequestMapping("/")
//	public String showFirstScreen(){
//		return "index";
//	}
//	
//	@RequestMapping("/login")
//	public ModelAndView loginCheckController(HttpServletRequest request){
//		
//		User user=new User(request.getParameter("uname"),request.getParameter("pwd"));
//		String message=null;
//		if(loginService.check(user))
//			message="Login Succesful";
//			else
//				message="Login Failed";
//		
//		return new ModelAndView("result", "msg",message);
//		
//	}
	
	@RequestMapping("/")
	public ModelAndView showFirstScreen(){
		return new ModelAndView("index","user",new User());
	}
	
	@RequestMapping("/login")
	public ModelAndView loginCheckController(@ModelAttribute("user") User user/*,HttpSession session*/){
//		session.setAttribute("user", user);
		ModelAndView mv=new ModelAndView();
		String message=null;
		if(loginService.check(user))
			message="Login Succesful";
			else
				message="Login Failed";
		
		mv.setViewName("result");
		mv.addObject("user", user);
		mv.addObject("msg", message);
		return mv;
		
	}
	
	@ModelAttribute("displayNames")
	public List<String> someData(){
		List<String> names=new ArrayList<>();
		names.add("FirstName");
		names.add("SecondName");
		names.add("ThirdName");
		names.add("FourthName");
		return names;
	}

}
