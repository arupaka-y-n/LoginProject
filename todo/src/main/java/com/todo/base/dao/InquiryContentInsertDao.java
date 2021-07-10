package com.todo.base.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.todo.base.entity.InquiryEntity;

@Repository
public class InquiryContentInsertDao {

	@Autowired
	EntityManager em;
	
	public void inquiryContentInsert(InquiryEntity inquiryEntity) {
		em.persist(inquiryEntity);
	}
	
}
