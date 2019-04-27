package com.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.dao.CourseDao;
import com.domain.Course;
@Repository
@Transactional
public class CourseDaoImpl extends HibernateDaoSupport implements CourseDao {
	//保存课程
	public void saveCourse(Course course) {
		Session session = getSessionFactory().getCurrentSession();
		session.save(course);
	}

	//根据id删除课程
	public void deleteCourseByCid(Integer cid) {
		Session session = getSessionFactory().getCurrentSession();
		Course course = session.get(Course.class, cid);
		session.delete(course);
	}

	//根据课程名字删除课程
	public void deleteCourseByCname(String cname) {
		Session session = getSessionFactory().getCurrentSession();
		Criteria criteria = session.createCriteria(Course.class);
		criteria.add(Restrictions.eq("cname", cname));
		Course course = (Course) criteria.uniqueResult();
		session.delete(course);
	}

	//通过id查找课程
	public Course getCourseByCid(Integer cid) {
		Session session = getSessionFactory().getCurrentSession();
		return session.get(Course.class, cid);
	}

	//通过名字查找课程
	public Course getCourseByCname(String cname) {
		Session session = getSessionFactory().getCurrentSession();
		Criteria criteria = session.createCriteria(Course.class);
		criteria.add(Restrictions.eq("cname", cname));
		return (Course) criteria.uniqueResult();
	}

	//通过课程介绍模糊查询课程
	public List<Course> getCourseByRemark(String remark) {
		Session session = getSessionFactory().getCurrentSession();
		List<Course> CourseList = session.createQuery("from Course as c where c.remark like  '%"+remark+"%' ").list();
		return CourseList;
	}

	//获得所有课程
	public List<Course> getAllCourse() {
		Session session = getSessionFactory().getCurrentSession();
		Criteria criteria = session.createCriteria(Course.class);
		return criteria.list();
	}

	//修改课程信息
	public void updateCourse(Course course) {
		Session session = getSessionFactory().getCurrentSession();
		Course c = session.get(Course.class, course.getCid());
		c.setCname(course.getCname());
		c.setRemark(course.getRemark());
		session.update(c);
	}


}
