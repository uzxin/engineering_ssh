package com.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.dao.TeacherDao;
import com.domain.Teacher;
@Repository
@Transactional

public class TeacherDaoImpl extends HibernateDaoSupport implements TeacherDao {
	//添加教师
	public void saveTeacher(Teacher teacher) {
		Session session = getSessionFactory().getCurrentSession();
		session.save(teacher);
	}

	//通过id删除教师
	public void deleteTeacherByTid(Integer tid) {
		Session session = getSessionFactory().getCurrentSession();
		Teacher teacher = session.get(Teacher.class, tid);
		session.delete(teacher);
	}

	//通过真实姓名删除教师
	public void deleteTeacherByRealname(String realname) {
		Session session = getSessionFactory().getCurrentSession();
		Criteria criteria = session.createCriteria(Teacher.class);
		criteria.add(Restrictions.eq("realname", realname));
		Teacher teacher = (Teacher) criteria.uniqueResult();
		session.delete(teacher);
	}

	//通过id查找教师
	public Teacher getTeacherByTid(Integer sid) {
		Session session = getSessionFactory().getCurrentSession();
		Teacher teacher = session.get(Teacher.class, sid);
		return teacher;
	}

	//通过登陆账号查找教师
	public Teacher getTeacherByUsername(String username) {
		Session session = getSessionFactory().getCurrentSession();
		Criteria criteria = session.createCriteria(Teacher.class);
		criteria.add(Restrictions.eq("username", username));
		Teacher teacher = (Teacher) criteria.uniqueResult();
		return teacher;
	}

	//通过登陆账号和密码查找教师
	public Teacher getTeacherByUsernamePassword(String username, String password) {
		Session session = getSessionFactory().getCurrentSession();
		Criteria criteria = session.createCriteria(Teacher.class);
		criteria.add(Restrictions.eq("username", username));
		criteria.add(Restrictions.eq("password", password));
		Teacher teacher = (Teacher) criteria.uniqueResult();
		return teacher;
	}

	//通过真实姓名查找教师
	public Teacher getTeacherByRealname(String realname) {
		Session session = getSessionFactory().getCurrentSession();
		Criteria criteria = session.createCriteria(Teacher.class);
		criteria.add(Restrictions.eq("realname", realname));
		Teacher teacher = (Teacher) criteria.uniqueResult();
		return teacher;
	}

	//获得所有教师
	public List<Teacher> getAllTeacher() {
		Session session = getSessionFactory().getCurrentSession();
		Criteria criteria = session.createCriteria(Teacher.class);
		return criteria.list();
	}

	//更改教师信息
	public void updateTeacher(Teacher teacher) {
		Session session = getSessionFactory().getCurrentSession();
		Teacher tea = session.get(Teacher.class, teacher.getTid());
		tea.setUsername(teacher.getUsername());
		tea.setPassword(teacher.getPassword());
		tea.setRealname(teacher.getRealname());
		tea.setEmail(teacher.getEmail());
		tea.setIntro(teacher.getIntro());
	}
}
