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
import com.dao.CourseDao;
import com.domain.Course;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestCourseDao {
	@Resource(name="sessionFactory")
	private SessionFactory sf ;
	@Resource(name="courseDao")
	private CourseDao dao;
	
	@Test
	//测试添加课程
	public void testAddCourse() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Course course = new Course();
		course.setCname("测试课程");
		course.setRemark("这是一个测试");
		dao.saveCourse(course);
		tx.commit();
	}
	
	@Test
	//测试通过id删除课程
	public void testDeleteCourseById() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		dao.deleteCourseByCid(6);
		tx.commit();
	}
	
	@Test
	//测试通过课程名字删除课程
	public void testDeleteCoursebyCname() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		dao.deleteCourseByCname("测试课程");
		tx.commit();
	}
	
	@Test
	//测试通过id查找课程
	public void testGetCourseByCid() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Course c = dao.getCourseByCid(3);
		tx.commit();
		System.out.println(c);
	}
	
	@Test
	//测试通过课程名查找课程
	public void testGetCourseByCname() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Course c = dao.getCourseByCname("计算机网络");
		tx.commit();
		System.out.println(c);
	}
	
	@Test
	//测试通过课程介绍进行模糊查询
	public void testGetCourseByRemark() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		List<Course> list = dao.getCourseByRemark("计");
		tx.commit();
		for (Course course : list) {
			System.out.println(course);
		}
	}
	
	@Test
	//测试获得所有课程
	public void testGetAllCourse() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		List<Course> list = dao.getAllCourse();
		tx.commit();
		for (Course course : list) {
			System.out.println(course);
		}
	}
	
	@Test
	//测试修改课程信息
	public void testUpdateCourse() throws Exception {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Course course = new Course();
		course.setCid(6);
		course.setCname("测试完毕");
		course.setRemark("测试完毕");
		dao.updateCourse(course);
		tx.commit();
	}
	
	
	
	
	
	
	
}
