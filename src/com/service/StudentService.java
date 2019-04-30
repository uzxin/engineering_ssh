package com.service;

import java.util.List;

import com.domain.Student;

public interface StudentService {
	//获取学生列表
	List<Student> getAllStudent();
	//添加学生
	void add(Student student);
	//删除学生
	void del(Integer sid);
	//获取学生信息
	Student getStudent(Integer sid);
	//更新学生信息
	void update(Student student);

}
