package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class ControllerTest {
    @RequestMapping("/alien")
	public ModelAndView alien()
	{
		ModelAndView mv=new ModelAndView();
		System.out.println("in alien");
		mv.setViewName("abc.jsp");
		return mv;
		
	}
	
}
