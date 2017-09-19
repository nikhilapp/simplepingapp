package com.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.components.PingDomain;

@RestController
public class TestController {
	
	@Autowired
	private PingDomain e;
	
	@RequestMapping("/")
	public ModelAndView hello() {
		return new ModelAndView("status","result",e.statusCheck());
	}
}
