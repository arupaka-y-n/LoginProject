package demo.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import demo.application.request.InquiryRequest;
import demo.application.service.InquiryService;

@Controller
public class InquiryController {
	
//	インスタンスを複数作る必要がない為、ここでインスタンスを1つ作る
	@Autowired
	InquiryService inquiryService;


//	デフォルトのお問い合わせ情報入力画面
	@GetMapping("/inquiry")
	public String inquiryForm(InquiryRequest inquiryRequest, Model model) {
//		templatesフォルダから、returnで返す名前と同じ、htmlファイルを探して表示するため、String型を返す
		model.addAttribute("title", "お問い合わせ");
		return "/inquiry/form";
	}
	
//	確認画面で戻るボタンを押した時
	@PostMapping("/inquiry/confirm")
	public String inquiryConfirm(InquiryRequest inquiryRequest, Model model){
		model.addAttribute("title", "お問い合わせ");
		return "/inquiry/confirm";
	}
	
	@PostMapping("/inquiry")
	public String backInquiryForm(InquiryRequest inquiryRequest, Model model) {
		model.addAttribute("title", "お問い合わせ");
		return "/inquiry/form";
	}
	
////	確認画面で送信ボタンを押した時
//	@PostMapping("/inquiry/complete")
//	public String complete( InquiryRequest inquiryRequest, Model model, RedirectAttributes redirectAttributes) {
//		
//		InquiryEntity data = new InquiryEntity();
//		data.setUserName(inquiryRequest.getUserName());
//		
//		inquiryService.insertInquiryData(data);
//		
//		
//		model.addAttribute("title", "お問い合わせ内容確認");
//		redirectAttributes.addFlashAttribute("complete", "送信完了");
//		return "redirect:/inquiry";
//	}

	
//	確認画面で送信ボタンを押した時(Repository利用する場合)
	@PostMapping("/inquiry/complete")
	public String complete( InquiryRequest inquiryRequest, Model model, RedirectAttributes redirectAttributes) {
		
		inquiryService.createInquiry(inquiryRequest);
		
		model.addAttribute("title", "お問い合わせ内容確認");
		redirectAttributes.addFlashAttribute("complete", "送信完了");
		return "redirect:/inquiry";
	}
	
}
