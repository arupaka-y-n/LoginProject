package com.login.domain.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.domain.dao.UserDao;
import com.login.domain.entity.UserDetailEntity;

@Service
@Transactional
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public void registUserDetail(UserDetailEntity entity) {
		
		userDao.registUser(entity);
	}
}
