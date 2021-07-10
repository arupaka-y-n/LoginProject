package com.login.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.login.domain.entity.UserDetailEntity;
import com.login.domain.service.UserService;
import com.login.web.form.UserDetailForm;

@Controller
public class SignupController {
	
	@Autowired
	UserService userService;

//	ユーザー情報を入力するテンプレートにアクセス
	@GetMapping("/signup")
	public String displaySignupForm(Model model, UserDetailForm userDetailForm) {
		return "/signup/form";
	}
	
	
//	ユーザー情報の登録処理
	@PostMapping("/signup/regist")
	public String registUserData(UserDetailForm userDetailForm) {
		
		UserDetailEntity userDetail = new UserDetailEntity();
		
//		UUIDを作成
		UUID uuid = UUID.randomUUID();
		String insUuid = uuid.toString();
		
//		フォームに入力された情報をEntityに渡す
//	仮登録するための情報をここでセット
		userDetail.setUserId(userDetailForm.getUserId());
		userDetail.setUserName(userDetailForm.getUserName());
		userDetail.setPassword(userDetailForm.getPassword());
		userDetail.setEmail(userDetailForm.getEmail());
		userDetail.setUuid(insUuid);
		
//		DBへのインサート
		userService.registUserDetail(userDetail);
		
		return "/signup/sendMail";
	}
}
