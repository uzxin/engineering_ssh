package com.service;

import java.util.List;

import com.domain.Course;
import com.domain.SC;
import com.domain.Student;
import com.domain.TC;
import com.domain.Teacher;

public interface CourseSelectService {
	//获取教师选课列表
	List<TC> getAllTC();
	//获取学生选课列表
	List<SC> getAllSC();
	//通过教师选课表查询教师姓名
	List<Teacher> getTeacher(List<TC> tcList);
	//通过教师选课表查询课程名字
	List<Course> getTCourse(List<TC> tcList);
	//通过学生选课表查询学生姓名
	List<Student> getStudent(List<SC> scList);
	//通过学生选课表查询课程名字
	List<Course> getSCourse(List<SC> scList);
	//获取教师列表
	List<Teacher> getTeacherList();
	//获取学生列表
	List<Student> getStudentList();
	//获取课程列表
	List<Course> getCourseList();
	//添加教师选课
	void addTC(TC tc);
	//添加学生选课
	void addSC(SC sc);

}
