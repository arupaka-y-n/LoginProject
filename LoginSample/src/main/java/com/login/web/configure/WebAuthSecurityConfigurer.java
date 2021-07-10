package com.login.web.configure;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//@Configurationを書くことで、設定するファイルと示している
@Configuration
@EnableWebSecurity
public class WebAuthSecurityConfigurer extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
//			                       /signup/以下全て
				.antMatchers("/", "/signup/**").permitAll()
				.anyRequest().authenticated();
	}
}

