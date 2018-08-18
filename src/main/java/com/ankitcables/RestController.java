package com.ankitcables;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@RequestMapping("/hello")
	String helloWorld(){
		return "Hello World";
	}
}
