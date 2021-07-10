package com.todo.base.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.todo.base.Form.InquiryForm;


@Controller
public class InquiryController {
	
	@GetMapping("inquiry/form")
	public String form(InquiryForm inquiryForm, Model model) {
		model.addAttribute("title","お問い合わせ");
		return "inquiry/form";
	}
	
	@PostMapping("inquiry/form")
	public String backForm(InquiryForm inquiryForm, Model model) {
		model.addAttribute("title","お問い合わせ");
		return "inquiry/form";
	}
	
	@PostMapping("inquiry/confirm")
	public String confirm(@Validated InquiryForm inquiryForm, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("title", "お問い合わせ内容エラー");
			return "inquiry/form";
		}
		model.addAttribute("title","お問い合わせ内容確認");
		return "inquiry/confirm";
	}
	
	@PostMapping("inquiry/complete")
	public String complete(@Validated InquiryForm inquiryForm, BindingResult result, Model model, RedirectAttributes redirectAttributes) {
		model.addAttribute("title", "お問い合わせ内容確認");
		
		redirectAttributes.addFlashAttribute("complete", "送信完了");
		return "redirect:/inquiry/form";
	}
}
