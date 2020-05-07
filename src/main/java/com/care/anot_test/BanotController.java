package com.care.anot_test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.service.Anot_A;
import com.care.service.anot_test_Service;

@Controller
public class BanotController {
	
	ApplicationContext ac = App.ac;	//template의 부모인 appli..가 있는 App 연결
	private anot_test_Service ats;	//객체들이 구현할 인터페이스
	
	@RequestMapping("main")
	public String main() {
		return "anot_bank/main";
	}
	
	@RequestMapping("reposit")
	public String reposit(HttpServletRequest request, Model model) {
		model.addAttribute("이동 확인", request.getAttribute("name"));
		System.out.println("ac : "+ac);
		ats =  ac.getBean("anot_A", Anot_A.class);
		ats.execute(model);
		
		return "anot_bank/reposit";
	}
}
