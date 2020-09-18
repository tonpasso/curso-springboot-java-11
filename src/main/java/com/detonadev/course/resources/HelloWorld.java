package com.detonadev.course.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@RequestMapping("/")
	public String helloWorld() {
		return "<h1>Welcome</h1>";
	}

}
