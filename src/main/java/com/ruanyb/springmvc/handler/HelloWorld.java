package com.ruanyb.springmvc.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.filter.HiddenHttpMethodFilter;

@Controller
public class HelloWorld {
	
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("Hello World");
		return "success";
	}
}	
