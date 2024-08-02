package com.setterdi;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Resource resource= new ClassPathResource("Spring.xml");
		BeanFactory factory= new XmlBeanFactory(resource);
		
		Student student = (Student)factory.getBean("std");
		System.out.println(student);
	}

}
