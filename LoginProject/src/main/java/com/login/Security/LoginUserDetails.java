//package com.login.Security;
//
//import java.util.Collection;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import com.login.Entity.LoginUserDetailsEntity.Account;
//
//
////UserDetailsインタフェースを実装したクラスを作成する
//public class LoginUserDetails implements UserDetails {
//
//	private final Account account;
//	private final Collection<GrantedAuthority> authorities;
//	
////	ユーザー情報と権限情報をプロパティに保持する
//	public LoginUserDetails(Account account, Collection<GrantedAuthority> authorities) {
//		this.account = account;
//		this.authorities = authorities;
//	}
//	
//	
////	UserDetailsインタフェースに定義されているメソッドを実装する
//	public int getId() {
//	    return account.getId();
//	  }
//	
//	public String getPassword() {
//        return account.getPassword();
//    }
//    public String getUsername() {
//        return account.getUserName();
//    }
////    public boolean isEnabled() {
////        return account.isEnabled();
////    }
//    public Collection<GrantedAuthority> getAuthorities() {
//        return authorities;
//    }
//	
////	認証処理成功後の処理でアカウント情報にアクセスできるようにするために、getterメソッドを用意する。
//	public Account getAccount() {
//		return account;
//	}
//
//
//@Override
//public boolean isAccountNonExpired() {
//	// TODO 自動生成されたメソッド・スタブ
//	return false;
//}
//
//
//@Override
//public boolean isAccountNonLocked() {
//	// TODO 自動生成されたメソッド・スタブ
//	return false;
//}
//
//
//@Override
//public boolean isCredentialsNonExpired() {
//	// TODO 自動生成されたメソッド・スタブ
//	return false;
//}
//
//
//@Override
//public boolean isEnabled() {
//	// TODO 自動生成されたメソッド・スタブ
//	return false;
//}
//}
