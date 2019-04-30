package com.service;

import java.util.List;

import com.domain.Course;

public interface CourseService {
	//获取课程列表
	List<Course> getAllCourse();
	//删除课程
	void delCourse(Integer i);
	//添加课程
	void add(Course course);
	//获取课程信息
	Course getCourse(Integer cid);
	//更新课程信息
	void updateCourse(Course course);

}
