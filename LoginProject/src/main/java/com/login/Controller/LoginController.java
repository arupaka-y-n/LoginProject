package com.login.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("login")
public class LoginController {
	
//	ログイン画面
	@GetMapping
	String getlogin() {
		return "login";
	}
	
//	ログイン成功時のメニュー画面への遷移
	@PostMapping
	String postLogin() {
		return "redirect:/hello";
	}
	
//	@GetMapping("admin")
//	public String admin(@AuthenoticationPrincipal User user) {
//	  System.out.println(user);
//	  return "admin";
//	}
}
