package com.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
//	UserServiceのインスタンスを生成
	@Autowired
	UserDetailsService userService;
	
////	JavaMailSenderのインスタンスを生成
//	@Autowired
//	JavaMailSender mailSender;
	
	
//	ログイン画面
	@RequestMapping("/hello")
	public String init(Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//		Principalからログインユーザの情報を取得
		String userEmail = auth.getName();
		model.addAttribute("userEmail", userEmail);
		return "hello";
	}

//	signupにアクセスしたらユーザー情報を入力するテンプレートにアクセスする
//	@GetMapping("/sign_in")
//	public String displaySignupForm(Model model) {
//	  
//	  return "/login";
//	}
}






//鈴木さんのController

//// UserServiceのインスタンスを生成
//@Autowired
//UserService userService;
//// JavaMailSenderのインスタンスを生成
//@Autowired
//JavaMailSender mailSender;
//// signupにアクセスしたらユーザー情報を入力するテンプレートにアクセスする
//@GetMapping("/signup")
//public String displaySignupForm(Model model, UserDetailForm userDetailForm) {
//	return "/signup/inputUserInfo";
//}
//// ユーザー情報の登録処理
//@PostMapping("/signup/registration")
//public String registrationTmp(@Validated UserDetailForm userDetailForm, Model model,
//								BindingResult result) throws UnknownHostException {
//	if(result.hasErrors()) {
//		model.addAttribute(userDetailForm);
//		return "/signup/inputUserInfo";
//	}
//	// UserDetailEntityのインスタンスを生成、ここに値をsetしていく
//	UserDetailEntity user = new UserDetailEntity();
//	//UUIDを生成
//	UUID uuid = UUID.randomUUID();
//	// UUIDをStringに変換
//	String insrtUuid = uuid.toString();
//	// 値をset
//	user.setUserId(userDetailForm.getUserId());
//	user.setPassword(userDetailForm.getPassword());
//	user.setRegisteredMail(userDetailForm.getRegisteredMail());
//	user.setUuid(insrtUuid);
//	// userServiceの登録処理を呼び出し
//	userService.registrationUser(user);
//    /**
//     * 認証のためのメールを送る
//     * 認証URLを生成してユーザー（上で登録したメールアドレス）にメールを送る
//     *     
//     */
//	// IPアドレスの取得　今回は使わない		
//	// String IPadnPort = InetAddress.getLocalHost().getHostAddress();
//	String from = "kp258584@gmail.com";
//    String title = "アカウント確認のお願い";
//    String content = "会員登録いただき誠にありがとうございます。" + "\n" + "\n" + 
//					 "以下のリンクにアクセスしてアカウントを認証してください" + "\n"
//					 +"http://" + "localhost:8080" + "/signup/validate?id=" + insrtUuid;
//    SimpleMailMessage msg = new SimpleMailMessage();
//    msg.setFrom(from);
//    msg.setTo(user.getRegisteredMail());
//    msg.setSubject(title);// タイトルの設定
//    msg.setText(content); // 本文の設定
//    mailSender.send(msg);
//	return "/signup/sendMail";
//}
//// メールのURLを踏んだ後の処理
//// RequestParamでid(付与したuuid)を取得
//?以降はパラメータとして扱うのでその前までがURLとして認識される
//@GetMapping("/signup/validate")
//public String validateAccout(@RequestParam("id") String id) {
//	userService.valudateUser(id);
//	return "/signup/successSignup";
//}