package com.dao;

import java.util.List;

import com.domain.Course;

public interface CourseDao {
	//添加课程
	void saveCourse(Course course);
	//删除课程
	void deleteCourseByCid(Integer cid);
	void deleteCourseByCname(String cname);
	//修改课程信息
	void updateCourse(Course course);
	//查找课程
	Course getCourseByCid(Integer cid);
	Course getCourseByCname(String cname);
	List<Course> getCourseByRemark(String remark);//模糊查询
	List<Course> getAllCourse();//获得所有课程
}
