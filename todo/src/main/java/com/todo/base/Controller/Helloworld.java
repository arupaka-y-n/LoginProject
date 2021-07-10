package com.todo.base.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Helloworld {

	@GetMapping({"/"})
	public String hello() {
		return "/hello";
		
	}
}