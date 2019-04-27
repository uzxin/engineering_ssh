package com.test;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.dao.StudentDao;
import com.dao.impl.StudentDaoImpl;
import com.domain.Student;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestStudentDao {
	@Resource(name="sessionFactory")
	private SessionFactory sf ;
	@Resource(name="studentDao")
	private StudentDao dao;
	
	@Test
	//测试添加学生
	public void testAdd() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Student stu = new Student();
		stu.setUsername("bbaaaaab");
		stu.setPassword("123456");
		stu.setRealname("李四");
		dao.saveStudent(stu);
		tx.commit();
	}
	@Test
	//测试通过id删除学生
	public void testDeleteById() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		dao.deleteStudentBySid(13);
		tx.commit();
	}
	@Test
	//测试通过名字删除学生
	public void testDeleteByname() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		dao.deleteStudentByRealname("张三");
		tx.commit();
	}
	@Test
	//测试通过id查找学生
	public void testGetStuById() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Student stu = dao.getStudentBySid(3);
		tx.commit();
		System.out.println(stu);
	}
	@Test
	//测试通过登陆账号查找学生
	public void testGetStuByUsername() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Student stu = dao.getStudentByUsername("xiongxun");
		tx.commit();
		System.out.println(stu);
	}
	@Test
	//测试通过登陆账号和密码查找学生
	public void testName() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Student stu = dao.getStudentByUsernamePassword("youxin", "123");
		tx.commit();
		System.out.println(stu);
	}
	@Test
	//测试通过真实姓名查找学生
	public void testGetStuByRealname() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Student stu = dao.getStudentByRealname("游鑫");
		tx.commit();
		System.out.println(stu);
	}
	@Test
	//测试查询所有学生
	public void testGetAllStu() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		List<Student> stuList = dao.getAllStudent();
		tx.commit();
		for (Student student : stuList) {
			System.out.println(student);
		}
	}
	@Test
	public void testUpdateStu() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Student stu = new Student();
		stu.setSid(5);
		stu.setUsername("huangpeng111");
		stu.setPassword("123123");
		stu.setRealname("黄鹏111");
		dao.updateStudentBySid(stu);
		tx.commit();
	}
}
