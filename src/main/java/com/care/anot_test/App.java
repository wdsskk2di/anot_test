package com.care.anot_test;

import org.springframework.beans.BeansException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class App implements ApplicationContextAware {	//template의 부모 객체.
	public static ApplicationContext ac;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("ac 실행");
		this.ac = applicationContext;
		System.out.println("acac : "+ac);
	}

}
