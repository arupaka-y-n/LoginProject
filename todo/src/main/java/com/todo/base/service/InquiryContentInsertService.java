package com.todo.base.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.base.dao.InquiryContentInsertDao;
import com.todo.base.entity.InquiryEntity;

@Service
@Transactional
public class InquiryContentInsertService {

	@Autowired
	InquiryContentInsertDao inquiryInsert;
	
	public void inquiryContentInsert(InquiryEntity inquiryEntity) {
		inquiryInsert.inquiryContentInsert(inquiryEntity);
	}
}
