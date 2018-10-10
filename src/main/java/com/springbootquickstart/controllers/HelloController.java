package com.springbootquickstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(value="/Hello")
	public String sayHi() {
		return "Hi";
	}

}
