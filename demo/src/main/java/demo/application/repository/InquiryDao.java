package demo.application.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import demo.application.entity.InquiryEntity;

@Repository
public class InquiryDao {
	
	@Autowired
	EntityManager entityManager;

//	データ登録のメソッド
	public void insertInquirｙData(InquiryEntity data) {
		
		entityManager.persist(data);
	}
}
