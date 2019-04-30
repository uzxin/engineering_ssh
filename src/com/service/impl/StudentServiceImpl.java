package com.service.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dao.StudentDao;
import com.domain.Student;
import com.service.StudentService;

public class StudentServiceImpl implements StudentService {
	private SessionFactory sf;
	private StudentDao studentDao;
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	//获取学生列表
	public List<Student> getAllStudent() {
		List<Student> list = studentDao.getAllStudent();
		return list;
	}
	//添加学生
	public void add(Student student) {
		Transaction tx = sf.openSession().beginTransaction();
		studentDao.saveStudent(student);
		tx.commit();
		sf.openSession().close();
	}
	
	//删除学生
	public void del(Integer sid) {
		Transaction tx = sf.openSession().beginTransaction();
		studentDao.deleteStudentBySid(sid);
		tx.commit();
		sf.openSession().close();
	}
	
	//获取学生信息
	public Student getStudent(Integer sid) {
		Transaction tx = sf.openSession().beginTransaction();
		Student student = studentDao.getStudentBySid(sid);
		tx.commit();
		sf.openSession().close();
		return student;
	}
	
	//更新学生信息
	public void update(Student student) {
		Transaction tx = sf.openSession().beginTransaction();
		studentDao.updateStudentBySid(student);
		tx.commit();
		sf.openSession().close();
		
	}

}
