package com.test;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.dao.SCDao;
import com.domain.SC;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSCDao {
	@Resource(name="sessionFactory")
	private SessionFactory sf ;
	@Resource(name="scDao")
	private SCDao dao;
	
	@Test
	//测试添加学生选课
	public void testAddSC() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		SC sc = new SC();
		sc.setSid(6);
		sc.setCid(2);
		dao.saveSC(sc);
		tx.commit();
	}
	
	@Test
	//测试删除学生选课
	public void testDeleteSC() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		dao.deleteSC(10);
		tx.commit();
	}
	
	@Test
	//测试查看某个学生的选课情况
	public void test22() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		List<SC> scList = dao.getSCBySid(1);
		tx.commit();
		for (SC sc : scList) {
			System.out.println(sc);
		}
	}
	
	@Test
	//测试查看某门课程的所有学生
	public void test11() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		List<SC> scList = dao.getSCByCid(2);
		tx.commit();
		for (SC sc : scList) {
			System.out.println(sc);
		}
	}
	
	@Test
	//查看某个学生某门课程的选课信息
	public void test212() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		SC sc = dao.getSCBySidCid(1, 2);
		tx.commit();
		System.out.println(sc);
	}
	
	@Test
	public void testGetAllSC() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		List<SC> list = dao.getALLSC();
		tx.commit();
		for (SC sc : list) {
			System.out.println(sc);
		}
	}
	
	
	
	
	
}
