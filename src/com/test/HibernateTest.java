package com.test;

import javax.annotation.Resource;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.dao.TestDao;
import com.domain.Student;
import com.service.TestService;

//测试hibernate框架
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class HibernateTest {
			
	
	@Resource(name="sessionFactory")
	private SessionFactory sf ;
		@Test
		//测试spring管理sessionFactory
		public void fun2(){
			Session session = sf.openSession();
			Transaction tx = session.beginTransaction();
			//-------------------------------------------------
			Student u = new Student();
			u.setUsername("rose");
			u.setRealname("肉丝");
			u.setPassword("1234");
			session.save(u);
			//-------------------------------------------------
			tx.commit();
			session.close();
		}
		
		
		
		@Resource(name="userDao")
		private TestDao ud;
		@Test
		//测试Dao Hibernate模板
		public void fun3(){
			Student u = ud.getUserByUsername("youxin");
			System.out.println(u);
		}
		
		
		
		@Resource(name="userService")
		private TestService us;
		@Test
		//测试aop事务
		public void fun4(){
			Student u = new Student();
			u.setUsername("hqy");
			u.setRealname("郝强勇");
			u.setPassword("1234");
			us.saveUser(u);
		}
		
}
