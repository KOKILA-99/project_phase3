package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.pojo.HiScope;

public class LazyEagerDemoMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("lazyeager.xml");
		HiScope h1=(HiScope) context.getBean("h1");
		System.out.println("Message from h1(singleton) : "+h1.getMessage());
		System.out.println("Hashcode of h1(singleton) : "+System.identityHashCode(h1));
	}

}
