package com.dao;

import com.domain.Student;

public interface TestDao {
	
	//根据登陆名称查询user对象
	Student getUserByUsername(String username);
	//保存用户
	void save(Student user);
}
