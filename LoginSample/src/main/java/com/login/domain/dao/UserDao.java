package com.login.domain.dao;



import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.login.domain.entity.UserDetailEntity;

@Repository
public class UserDao {
	
	@Autowired
	EntityManager em;
	
	public void registUser(UserDetailEntity entity) {
		
//		インサート
		em.persist(entity);
	}
}
