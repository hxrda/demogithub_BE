package com.example.helloworld.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@ResponseBody 
public class HelloController {
	
	@RequestMapping("*") 
	public String hello() {
		return "Hello Spring";
	}
	
	//next: type "http://localhost:8080/" to web search bar (non-parametric)
}
