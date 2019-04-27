package com.service;

import com.domain.Student;

public interface TestService {
	//登陆方法
	Student getUserByUsernamePassword(Student user);
	//注册用户
	void saveUser(Student user);
}
