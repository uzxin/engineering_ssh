package com.dao.impl;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.StudentDao;
import com.domain.Student;
@Repository
@Transactional
public class StudentDaoImpl extends HibernateDaoSupport implements StudentDao {
	//添加学生
	public void saveStudent(Student student) {
		Session session = getSessionFactory().openSession();
		session.save(student);
	}
	//通过id删除学生
	public void deleteStudentBySid(Integer sid) {
		Session session = getSessionFactory().getCurrentSession();
		Student stu = session.get(Student.class, sid);
		session.delete(stu);
	}

	//通过真实姓名删除学生
	public void deleteStudentByRealname(String realname) {
		Session session = getSessionFactory().getCurrentSession();
		Criteria criteria = session.createCriteria(Student.class);
		criteria.add(Restrictions.eq("realname", realname));
		Student stu = (Student) criteria.uniqueResult();
		session.delete(stu);
	}

	//通过id查找学生
	public Student getStudentBySid(Integer sid) {
		Session session = getSessionFactory().getCurrentSession();
		return session.get(Student.class, sid);
	}

	//通过登陆账号查找学生
	public Student getStudentByUsername(String username) {
		Session session = getSessionFactory().getCurrentSession();
		Criteria criteria = session.createCriteria(Student.class);
		criteria.add(Restrictions.eq("username", username));
		return (Student) criteria.uniqueResult();
	}

	//通过登陆账号和密码查找学生
	public Student getStudentByUsernamePassword(String username, String password) {
		Session session = getSessionFactory().getCurrentSession();
		Criteria criteria = session.createCriteria(Student.class);
		criteria.add(Restrictions.eq("username", username));
		criteria.add(Restrictions.eq("password", password));
		return (Student) criteria.uniqueResult();
	}

	//通过真实姓名查找学生
	public Student getStudentByRealname(String realname) {
		Session session = getSessionFactory().getCurrentSession();
		Criteria criteria = session.createCriteria(Student.class);
		criteria.add(Restrictions.eq("realname", realname));
		return (Student) criteria.uniqueResult();
	}

	//查询所有学生
	public List<Student> getAllStudent() {
		Session session = getSessionFactory().getCurrentSession();
		Criteria criteria = session.createCriteria(Student.class);
		List<Student> stuList = criteria.list();
		return stuList;
	}
	
	//修改学生信息
	public void updateStudentBySid(Student student) {
		Session session = getSessionFactory().getCurrentSession();
		Student stu = session.get(Student.class, student.getSid());
		stu.setUsername(student.getUsername());
		stu.setPassword(student.getPassword());
		stu.setRealname(student.getRealname());
		session.update(stu);
	}
}
