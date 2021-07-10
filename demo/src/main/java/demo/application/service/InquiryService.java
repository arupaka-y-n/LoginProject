package demo.application.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.application.entity.InquiryEntity;
import demo.application.repository.InquiryDao;
import demo.application.repository.InquiryRepository;
import demo.application.request.InquiryRequest;

@Service
@Transactional
public class InquiryService {

	@Autowired
	InquiryDao inquiryDao;
	InquiryRepository inquiryRepository;
	
////	データ（お問い合わせ内容）登録
//	public void insertInquiryData(InquiryEntity data) {
////		データを登録する為のメソッドを呼び出す
//		inquiryDao.insertInquirｙData(data);
//		
//	}
	
	
//	データを登録する処理(Repository利用する場合)
	public void createInquiry(InquiryRequest inquiryRequest) {
		inquiryRepository.save(completeInquiry(inquiryRequest));
	}
	
	public InquiryEntity completeInquiry( InquiryRequest inquiryRequest) {
		
		InquiryEntity data = new InquiryEntity();
		
		data.setUserName(inquiryRequest.getUserName());
		data.setUserEmail(inquiryRequest.getUserEmail());
		data.setInquiryContent(inquiryRequest.getInquiryContent());
		data.setAdjustmentFlag(inquiryRequest.isAdjustmentFlag());		
		
		return data;
	}
}
