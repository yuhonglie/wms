package com.wms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {
	@RequestMapping("/index")
	public ModelAndView Index()
	{
		 ModelAndView model = new ModelAndView("index");
	        //model.addObject("userList", listUsers);
	     return model;
	}
}
