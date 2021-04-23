package com.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
//	ログイン画面
	@GetMapping("/login")
	public String getLogin() {
		return "/login";
	}

	
//	ログイン成功時のメニュー画面への遷移
	@PostMapping
	public String postLogin() {
		return "redirect:/hello";
	}
	
//	@GetMapping("admin")
//	public String admin(@AuthenoticationPrincipal User user) {
//	  System.out.println(user);
//	  return "admin";
//	}
}
