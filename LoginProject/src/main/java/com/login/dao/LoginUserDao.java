package com.login.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.login.entity.LoginUserDetailsEntity;
import com.login.entity.LoginUserEntity;

@Repository
public class LoginUserDao {
	
	@Autowired
	EntityManager em;
	
	
//	フォームの入力値から該当するユーザを検索 合致するものが無い場合Nullが返される
//	@return 一致するユーザが存在するとき:UserEntity、存在しないとき:Null
	
	
	public LoginUserDetailsEntity findUser(String userEmail) {
		
		String query = "";
		query += "SELECT * ";
		query += "FROM user_detail ";
//		                idが引数で渡されたidの時
		query += "WHERE USEREMAIL = :userEmail ";
		
		//EntityManagerで取得された結果はオブジェクトとなるので、LoginUser型へキャストが必要となる
//		                                                                                            findUser(引数)
		return (LoginUserDetailsEntity)em.createNativeQuery(query, LoginUserDetailsEntity.class).setParameter("userEmail", userEmail).getSingleResult();
	}
}
