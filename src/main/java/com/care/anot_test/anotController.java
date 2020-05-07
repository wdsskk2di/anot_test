package com.care.anot_test;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import com.care.service.anot_test_Service;

@Controller
public class anotController {
	
	ApplicationContext ac = App.ac;	//template의 부모인 appli..가 있는 App 연결
	private anot_test_Service ats;	//객체들이 구현할 인터페이스
}
