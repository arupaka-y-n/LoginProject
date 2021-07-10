package demo.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.application.entity.InquiryEntity;

@Repository
public interface InquiryRepository extends JpaRepository<InquiryEntity, Long>{

//	serviceでrepositroryのsaveメソッドを呼び出して、Daoと同じ挙動が実行されるようにする
//	コードを書かなくても実行される
}
