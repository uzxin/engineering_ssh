package com.service;

import java.util.List;

import com.domain.Teacher;

public interface TeacherService {
	//获取教师列表
	List<Teacher> getAllTeacher();
	//添加教师
	void add(Teacher teacher);
	//删除教师
	void del(Integer tid);
	//获取教师信息
	Teacher getTeacher(Integer tid);
	//更新教师信息
	void update(Teacher teacher);
	
}
