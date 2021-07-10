package com.login.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.login.dao.LoginUserDao;
import com.login.entity.LoginUserDetailsEntity;



//Spring Securityのユーザ検索用のサービスの実装クラス

//ユーザー情報を検索する役割のUserDetailsServiceインターフェースをOverrideする
//UserDetailsServiceは、認証処理で必要となる資格情報と,ユーザーの状態をデータストア から取得するためのインタフェース

//DataSourceの引数として指定することで認証にDBを利用できるようになる

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

//	DBからユーザ情報を検索するメソッドを実装したクラス
	@Autowired
	private LoginUserDao userDao;
	

	
//	UserDetailsServiceインタフェースの実装メソッド
//	フォームから取得したユーザ名でDBを検索し、合致するものが存在したとき、
//	パスワード、権限情報と共にUserDetailsオブジェクトを生成
//	コンフィグクラスで上入力値とDBから取得したパスワードと比較し、ログイン判定を行う
	@Override
	public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
			
		LoginUserDetailsEntity user = userDao.findUser(id);
		
//	  	ユーザーデータが存在しない時、UsernameNotFoundExceptionを発生させる
		  if (user == null) {
			  throw new UsernameNotFoundException("Not found userid : " + id);
		  }
		  

			
//			List(ユーザー情報、権限)を作成
//			権限を利用する場合は、DB上で権限テーブル、ユーザ権限テーブルを作成し管理が必要
			List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//			認証を付与
			authorities.add(new SimpleGrantedAuthority("USER"));
			
			
//			UserDetailsはインタフェースなのでUserクラスのコンストラクタで生成したユーザオブジェクトを
//			認証を付与した新しいユーザークラスを作成する
		
			UserDetails userDetails = (UserDetails)new User(user.getUserEmail(),user.getPassword(), authorities);
			
			return userDetails;
		}
}
