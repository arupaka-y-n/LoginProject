package com.login.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;




//ログイン画面のコントローラ部分の役割はWebSecurityConfigが担っているので、
//ViewNameと画面の対応づけを行うために実装
@Configuration
public class MvcConfig implements WebMvcConfigurer{


	public void addViewControllers(ViewControllerRegistry registry)  {
//		 「/login」というURLからlogin.htmlを呼び出す
//		「/login」というURLでリクエストが来たら「login」ってビュー名(login.html)で表示してねって処理
		registry.addViewController("/login").setViewName("login");
	}
}
