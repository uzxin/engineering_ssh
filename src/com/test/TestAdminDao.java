package com.test;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.dao.AdminDao;
import com.domain.Admin;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestAdminDao {
	@Resource(name="sessionFactory")
	private SessionFactory sf ;
	@Resource(name="adminDao")
	private AdminDao dao;
	
	@Test
	public void testName() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Admin admin = dao.getAdminByUsername("admin2");
		tx.commit();
		System.out.println(admin);
	}
}
