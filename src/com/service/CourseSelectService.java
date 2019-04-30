package com.service;

import java.util.List;

import com.domain.TC;
import com.domain.Teacher;

public interface CourseSelectService {
	//获取教师选课列表
	List<TC> getAllTC();
	//通过选课表查询教师姓名
	List<Teacher> getTeacher(List<TC> tcList);

}
