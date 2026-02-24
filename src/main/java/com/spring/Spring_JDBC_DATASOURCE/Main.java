package com.spring.Spring_JDBC_DATASOURCE;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		StudentDao dao = ac.getBean("dao",StudentDao.class);
		
		Student s = new Student();
		s.setSid(1);
		s.setSname("Pavan");
		dao.insert(s);
		
		
		//retrieve or get
		Student r = dao.get();
		r.display();
		
		//update 
		
		Student up = new Student ();
		up.setSid(1);
		up.setSname("Pavan Kumar");
		dao.update(up);
		dao.get().display();
		
	}

}
