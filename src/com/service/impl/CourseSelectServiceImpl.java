package com.service.impl;

import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import com.dao.CourseDao;
import com.dao.SCDao;
import com.dao.StudentDao;
import com.dao.TCDao;
import com.dao.TeacherDao;
import com.domain.Course;
import com.domain.SC;
import com.domain.Student;
import com.domain.TC;
import com.domain.Teacher;
import com.service.CourseSelectService;
@Service
public class CourseSelectServiceImpl implements CourseSelectService {
	private SessionFactory sf;
	private TCDao tcDao;
	private SCDao scDao;
	private StudentDao studentDao;
	private TeacherDao teacherDao;
	private CourseDao courseDao;
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	public void setTcDao(TCDao tcDao) {
		this.tcDao = tcDao;
	}
	public void setScDao(SCDao scDao) {
		this.scDao = scDao;
	}
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}
	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}
	//获取教师选课列表
	public List<TC> getAllTC() {
		List<TC> list = tcDao.getALLTC();
		return list;
	}
	
	//通过选课表查询教师姓名
	public List<Teacher> getTeacher(List<TC> tcList) {
		List<Teacher> list = tcDao.getTeacher(tcList);
		return list;
	}
	//通过选课表查询课程名字
	public List<Course> getTCourse(List<TC> tcList) {
		List<Course> list = tcDao.getCourse(tcList);
		return list;
	}
	
	//获取学生选课列表
	public List<SC> getAllSC() {
		List<SC> list = scDao.getALLSC();
		return list;
	}
	
	//通过选课表查询学生姓名
	public List<Student> getStudent(List<SC> scList) {
		List<Student> list = scDao.getStudent(scList);
		return list;
	}
	
	//通过选课表查询课程名字
	public List<Course> getSCourse(List<SC> scList) {
		List<Course> list = scDao.getCourse(scList);
		return list;
	}
	
	//获取教师列表
	public List<Teacher> getTeacherList() {
		List<Teacher> list = teacherDao.getAllTeacher();
		return list;
	}
	
	//获取学生列表
	public List<Student> getStudentList() {
		List<Student> list = studentDao.getAllStudent();
		return list;
	}
		
	//获取课程列表
	public List<Course> getCourseList() {
		List<Course> list = courseDao.getAllCourse();
		return list;
	}
	
	//添加教师选课
	public void addTC(TC tc) {
		Transaction tx = sf.openSession().beginTransaction();
		tcDao.saveTC(tc);
		tx.commit();
		sf.openSession().close();
	}
	
	//添加学生选课
	public void addSC(SC sc) {
		Transaction tx = sf.openSession().beginTransaction();
		scDao.saveSC(sc);
		tx.commit();
		sf.openSession().close();
	}
	
}
