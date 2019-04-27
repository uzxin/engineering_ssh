package com.service;

import com.domain.Admin;
import com.domain.Student;
import com.domain.Teacher;

public interface LoginService {
	//使用学生身份进行登陆
	Student loginWithStudent(String username, String password);
	//使用教师身份进行登陆
	Teacher loginWithTeacher(String username, String password);
	//使用管理员身份进行登陆
	Admin loginWithAdmin(String username, String password);
	
}
