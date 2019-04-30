package com.service.impl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;
import com.dao.CourseDao;
import com.domain.Course;
import com.service.CourseService;
@Service
public class CourseServiceImpl implements CourseService {
	private SessionFactory sf;
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	private CourseDao courseDao;
	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}
	
	//获取课程列表
	public List<Course> getAllCourse() {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		List<Course> courseList = courseDao.getAllCourse();
		tx.commit();
		session.close();
		return courseList;
	}

	//删除课程
	public void delCourse(Integer i) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		courseDao.deleteCourseByCid(i);
		tx.commit();
		session.close();
	}

	//添加课程
	public void add(Course course) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		courseDao.saveCourse(course);
		tx.commit();
		session.close();
	}

	//获取课程信息
	public Course getCourse(Integer cid) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Course course = courseDao.getCourseByCid(cid);
		tx.commit();
		session.close();
		return course;
	}

	//更新课程信息
	public void updateCourse(Course course) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		courseDao.updateCourse(course);
		tx.commit();
		session.close();
	}

}
