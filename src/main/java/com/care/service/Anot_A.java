package com.care.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.care.anot_DAO.anot_DAO;

@Service
public class Anot_A implements anot_test_Service {

	@Autowired
	@Qualifier("anot_DAO")
	private anot_DAO dao;
	
	@Override
	public void execute(Model model) {
		System.out.println("이동 결과 확인: "+model);
		dao.test();
	}

}
