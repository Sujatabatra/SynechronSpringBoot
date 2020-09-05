package com.sujata.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.bean.User;
import com.sujata.service.LoginService;

@Controller
public class MyLoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/")
	public String showFirstScreen(){
		return "index";
	}
	
	@RequestMapping("/login")
	public ModelAndView loginCheckController(HttpServletRequest request){
		
		User user=new User(request.getParameter("uname"),request.getParameter("pwd"));
		String message=null;
		if(loginService.check(user))
			message="Login Succesful";
			else
				message="Login Failed";
		
		return new ModelAndView("result", "msg",message);
		
	}

}
