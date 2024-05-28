package com.asterisc.in.pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.asterisc.in.pack.model.Student;

@Controller
public class HomeController {
	
	
	@RequestMapping("/")
	String fun1()
	{
		return "page1.html";
	}

	
	@RequestMapping("/test")
	String fun2(Model m)
	{
		String msg="hello studnet";
		
		m.addAttribute("mymsg", msg);
		
		return "page2.html";
	}
	
	@RequestMapping("/test2")
	String fun3(Model m)
	{
		Student s=new Student(101, "ram", "nagpur", "78.3");
		
		m.addAttribute("obj",s);
		
		return "page3.html";
	}
	
	@RequestMapping("/test3")
	ModelAndView fun4()
	{
		
		ModelAndView mv=new ModelAndView("page4.html");
		
		Student s=new Student(101, "ram", "nagpur", "78.3");
		
		mv.addObject("obj", s);
		
		return mv;
	}
	
	
	
}
