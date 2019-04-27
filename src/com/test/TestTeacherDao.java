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
import com.dao.TeacherDao;
import com.domain.Teacher;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestTeacherDao {
	@Resource(name="sessionFactory")
	private SessionFactory sf ;
	@Resource(name="teacherDao")
	private TeacherDao dao;
	
	@Test
	//测试添加教师
	public void testAddTea() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Teacher t = new Teacher();
		t.setUsername("zhangyuanmao");
		t.setPassword("123");
		t.setRealname("张无忌");
		t.setEmail("zhang@cuit.com");
		t.setIntro("人物简介暂无");
		dao.saveTeacher(t);
		tx.commit();
	}
	
	@Test
	//测试根据id删除教师
	public void testDeleteTeaById() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		dao.deleteTeacherByTid(3);
		tx.commit();
	}
	
	@Test
	//测试通过真实姓名删除教师
	public void testDeleteTeaByReealname() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		dao.deleteTeacherByRealname("张三丰");
		tx.commit();
	}
	
	@Test
	//测试通过id查找教师
	public void tesGetTeaById() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Teacher teacher = dao.getTeacherByTid(2);
		tx.commit();
		System.out.println(teacher);
	}
	
	@Test
	//测试通过登陆账号查找教师
	public void testGetTeaByUsername() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Teacher teacher = dao.getTeacherByUsername("teacher2");
		tx.commit();
		System.out.println(teacher);
	}
	
	@Test
	//测试通过登陆账号和密码查找教师
	public void testGetTeaByUsernamepassword() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Teacher teacher = dao.getTeacherByUsernamePassword("teacher2", "123");
		tx.commit();
		System.out.println(teacher);
	}
	
	@Test
	//测试通过真实姓名查找教师
	public void testGetTeaByRealname() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		//Teacher teacher = dao.getTeacherByRealname("张元茂");
		Teacher teacher = dao.getTeacherByRealname("郑丰华");
		tx.commit();
		System.out.println(teacher);
	}
	
	@Test
	//测试获得所有教师
	public void testGetAllTea() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		List<Teacher> teaList = dao.getAllTeacher();
		tx.commit();
		for (Teacher teacher : teaList) {
			System.out.println(teacher);
		}
	}
	
	@Test
	//测试修改教师信息
	public void testUpdateTea() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Teacher t = new Teacher();
		t.setTid(5);
		t.setUsername("zhangwuji");
		t.setPassword("123321zzz");
		t.setRealname("张无忌");
		t.setEmail("zhangwuji@cuit.com");
		t.setIntro("修改后");
		dao.updateTeacher(t);
		tx.commit();
	}
}
