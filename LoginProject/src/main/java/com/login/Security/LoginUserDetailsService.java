//package com.login.Security;
//
//import java.util.ArrayList;
//import java.util.Collection;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.login.Entity.LoginUserDetailsEntity.Account;
//import com.login.Entity.LoginUserDetailsEntity.AccountRepository;
//
//import antlr.StringUtils;
//
//
//@Service
////　ユーザー情報を検索する役割のUserDetailsServiceインターフェースをOverrideする
////UserDetailsServiceは、認証処理で必要となる資格情報と,ユーザーの状態をデータストア から取得するためのインタフェース
//public class LoginUserDetailsService implements UserDetailsService {
//	
//	private AccountRepository repository;
//	
//	@Autowired
//	public LoginUserDetailsService(AccountRepository repository) {
//		this.repository = repository;
//	}
//	
//	
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//			
////			既に登録されている値の時、UsernameNotFoundExceptionを発生させる
//			if (StringUtils.isEmpty(id)) {
//			    throw new UsernameNotFoundException("username is empty");
//			  }
//			
////			DBからアカウント情報を探して取得
//			Account account = repository.findByUsername(id);
//		  
////		  	ユーザーデータが存在しない時、UsernameNotFoundExceptionを発生させる
//			  if (account == null) {
//				  throw new UsernameNotFoundException("Not found username : " + username);
//			  }
//			
////			List(ユーザー情報、権限)を作成
//			Collection<GrantedAuthority> authorities = new ArrayList<>();
////			認証を付与
//			authorities.add(new SimpleGrantedAuthority(account.getRole()));
////			認証を付与した新しいユーザークラスを作成する
//			User user = new User(account.getId(), account.getPassword(), authorities);
//			
//			return user;
//		}
//	
//}
//
//
//
////9.2.2.4.3. DB認証の適用
////作成したUserDetailsServiceを使用して認証処理を行うためには、 DaoAuthenticationProviderを有効化して、作成したUserDetailsServiceを適用する必要がある。
////
////spring-security.xmlの定義例
////<sec:authentication-manager> <!-- (1) -->
////    <sec:authentication-provider user-service-ref="accountUserDetailsService"> <!-- (2) -->
////        <sec:password-encoder ref="passwordEncoder" /> <!-- (3) -->
////    </sec:authentication-provider>
////</sec:authentication-manager>
////
////<bean id="passwordEncoder"
////    class="org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder" /> <!-- (4) -->
