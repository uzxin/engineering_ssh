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
import com.dao.TCDao;
import com.domain.SC;
import com.domain.TC;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestTCDao {
	@Resource(name="sessionFactory")
	private SessionFactory sf ;
	@Resource(name="tcDao")
	private TCDao dao;
	
	@Test
	//测试添加教师选课
	public void testAddSC() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		TC tc = new TC();
		tc.setTid(5);
		tc.setCid(10);
		dao.saveTC(tc);
		tx.commit();
	}
	
	@Test
	//测试删除教师选课
	public void testDeleteSC() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		dao.deleteTC(6);
		tx.commit();
	}
	
	@Test
	//测试查看某个教师的选课情况
	public void test22() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		List<TC> tcList = dao.getTCByTid(2);
		tx.commit();
		for (TC tc : tcList) {
			System.out.println(tc);
		}
	}
	
	@Test
	//测试查看某门课程的选课请情况
	public void test11() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		List<TC> tcList = dao.getTCByCid(2);
		tx.commit();
		for (TC tc : tcList) {
			System.out.println(tc);
		}
	}
	
	@Test
	//测试查看某个教师某门课程的选课信息
	public void test212() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		TC tc = dao.getTCByTidCid(2, 4);
		tx.commit();
		System.out.println(tc);
	}
	
	@Test
	//测试所有教师所有课程的选课情况
	public void testGetAllTC() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		List<TC> list = dao.getALLTC();
		tx.commit();
		for (TC tc : list) {
			System.out.println(tc);
		}
	}
}
