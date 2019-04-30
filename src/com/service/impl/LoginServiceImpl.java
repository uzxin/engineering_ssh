package com.service.impl;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;
import com.dao.AdminDao;
import com.dao.StudentDao;
import com.dao.TeacherDao;
import com.domain.Admin;
import com.domain.Student;
import com.domain.Teacher;
import com.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService {
	private SessionFactory sf;
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	private AdminDao adminDao;
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}
	private StudentDao studentDao;
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	private TeacherDao teacherDao;
	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}

	//使用学生身份进行登陆
	public Student loginWithStudent(String username, String password)  {
		Transaction tx = sf.openSession().beginTransaction();
		Student stu = studentDao.getStudentByUsername(username);
		tx.commit();
		sf.openSession().close();
		return stu;
	}

	//使用教师身份进行登陆
	public Teacher loginWithTeacher(String username, String password) {
		Transaction tx = sf.openSession().beginTransaction();
		Teacher tea = teacherDao.getTeacherByUsername(username);
		tx.commit();
		sf.openSession().close();
		return tea;
	}

	//使用管理员身份进行登陆
	public Admin loginWithAdmin(String username, String password) {
		Transaction tx = sf.openSession().beginTransaction();
		Admin admin = adminDao.getAdminByUsername(username);
		tx.commit();
		sf.openSession().close();
		return admin;
	}
}
