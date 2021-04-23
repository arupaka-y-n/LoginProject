//package com.login.security;
//
//
//import java.util.ArrayList;
//import java.util.Collection;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
////import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.login.dao.LoginUserDao;
////import com.login.entity.LoginUserDetailsEntity.AccountRepository;
//import com.login.form.LoginUserDetailsForm.Account;
//
//import antlr.StringUtils;
//
//
//@Service
////　ユーザー情報を検索する役割のUserDetailsServiceインターフェースをOverrideする
////UserDetailsServiceは、認証処理で必要となる資格情報と,ユーザーの状態をデータストア から取得するためのインタフェース
//public class LoginUserDetailsService implements UserDetailsService {
//	
//	private LoginUserDao userDao;
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
//			Account account = repository.findByUser(id);
//		  
////		  	ユーザーデータが存在しない時、UsernameNotFoundExceptionを発生させる
//			  if (account == null) {
//				  throw new UsernameNotFoundException("Not found username : " + username);
//			  }
//			
////			List(ユーザー情報、権限)を作成
////			権限を利用する場合は、DB上で権限テーブル、ユーザ権限テーブルを作成し管理が必要
//			Collection<GrantedAuthority> authorities = new ArrayList<>();
////			認証を付与
//			authorities.add(new SimpleGrantedAuthority(account.getRole()));
//			
////			UserDetailsはインタフェースなのでUserクラスのコンストラクタで生成したユーザオブジェクトを
////			認証を付与した新しいユーザークラスを作成する
//			UserDetails userDetails = (UserDetails)new User(account.getId(), account.getPassword(), authorities);
//			
//			return userDetails;
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
