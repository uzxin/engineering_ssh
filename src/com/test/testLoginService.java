package com.test;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.domain.Student;
import com.service.LoginService;
import com.service.impl.LoginServiceImpl;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class testLoginService {
	@Autowired
	private LoginServiceImpl service;
	@Autowired
	private SessionFactory sf;
	
	@Test
	public void test1() throws Exception {
		Session session = sf.openSession();
		System.out.println(session);
	}
}
