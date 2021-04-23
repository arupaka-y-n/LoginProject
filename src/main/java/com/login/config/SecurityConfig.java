package com.login.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//設定クラスということを示す　(@Configuration)
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//	パスワードのハッシュ化（パスワードは元の文字列が特定できない形でデータベースなどに保存）
	@Bean
	public PasswordEncoder passwordEncoder() {

//		BCrypt は単純に入力を１回ハッシュ化するのではなく、ランダムなソルトを付与したうえで複数回ハッシュ化を適用することで元のパスワードを推測しづらくする。
		return new BCryptPasswordEncoder();
	}
	
	
	
////	LoginUserDetailsServiceの設定
//	@Autowired
//	LoginUserDetailsService service;
	
//	@Override
////	AuthenticationManagerBuilder の userDetailsService() メソッドで UserDetailsService を登録する。
////	認証ユーザを取得する「UserDetailsService」の設定やパスワード照合時に使う「PasswordEncoder」の設定
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.userDetailsService(service).passwordEncoder(passwordEncoder());
//	}
	
	
	
	
//	静的リソース(/images/**、/js/**、/css/**)に認証が行われないように除外する設定
	@Override
	public void configure(WebSecurity web) throws Exception {
		web
//			.debug(false)
			.ignoring()
			.antMatchers("/images/**", "/js/**", "/css/**");
	}
	
	
//	アクセス制限の設定
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
//		    誰でもアクセスできるページの設定
			.mvcMatchers("/", "/login").permitAll()
//			上記以外のページは、認証ユーザーがアクセスできる
			.anyRequest().authenticated();
//		formLogin()でログインフォームが使えるようにする
		http.formLogin()
//			ログイン画面URL
			.loginPage("/login")
//			認証処理をするURL  springsecurity 自動的に
			.loginProcessingUrl("/authenticate")
//			　ログイン成功時、リダイレクト先を/(トップページ)のURLに遷移
			.defaultSuccessUrl("/")
//			ログイン失敗時、ログイン画面のURLに遷移
			.failureUrl("/login?error")
//			ログイン画面のhtmlのinputのname属性を見に行っている
			.usernameParameter("email")
			.passwordParameter("password");
//		logout()でログアウトが使えるようにする
		http.logout()
//		　	ログアウトしたらセッションを無効にする
			.invalidateHttpSession(true)
//			ログアウトしたらcookieのJESSIONIDを削除
			.deleteCookies("JSESSIONID")
//			　ログアウト成功後のリダイレクト先を/(トップページ)に設定します。
			.logoutSuccessUrl("/");
	}
	
	
	

}

