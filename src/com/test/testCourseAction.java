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

import com.domain.Course;
import com.service.CourseService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class testCourseAction {
	@Resource(name="sessionFactory")
	private SessionFactory sf ;
	@Resource(name="courseService")
	private CourseService service;
	
	@Test
	public void testName() throws Exception {
		List<Course> list = service.getAllCourse();
		for (Course course : list) {
			System.out.println(course);
		}
	}
	
	@Test
	public void fun11() throws Exception {
		Course c = new Course();
		c.setCname("test");
		c.setRemark("this is a test");
		service.add(c);
	}
}
