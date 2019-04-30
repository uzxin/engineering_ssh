package com.service.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dao.TeacherDao;
import com.domain.Teacher;
import com.service.TeacherService;

public class TeacherServiceImpl implements TeacherService {
	private SessionFactory sf;
	private TeacherDao teacherDao;
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}
	
	//获取教师列表
	public List<Teacher> getAllTeacher() {
		List<Teacher> list = teacherDao.getAllTeacher();
		return list;
	}
	
	//添加教师
	public void add(Teacher teacher) {
		Transaction tx = sf.openSession().beginTransaction();
		teacherDao.saveTeacher(teacher);
		tx.commit();
		sf.openSession().close();
	}
	
	//删除教师
	public void del(Integer tid) {
		Transaction tx = sf.openSession().beginTransaction();
		teacherDao.deleteTeacherByTid(tid);
		tx.commit();
		sf.openSession().close();
		
	}
	
	//获取教师信息
	public Teacher getTeacher(Integer tid) {
		Transaction tx = sf.openSession().beginTransaction();
		Teacher t = teacherDao.getTeacherByTid(tid);
		tx.commit();
		sf.openSession().close();
		return t;
	}
	
	//更新教师信息
	public void update(Teacher teacher) {
		Transaction tx = sf.openSession().beginTransaction();
		teacherDao.updateTeacher(teacher);
		tx.commit();
		sf.openSession().close();
	}
	
	
	
	
	
	
	
	
}
