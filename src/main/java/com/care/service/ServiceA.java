package com.care.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.care.anot_DAO.anot_DAO;

@Service
public class ServiceA implements anot_test_Service {
	@Autowired
	private anot_DAO dao;

	@Override
	public void execute() {
		
	}
}
