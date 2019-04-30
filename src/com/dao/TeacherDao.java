package com.dao;

import java.util.List;
import com.domain.Teacher;

public interface TeacherDao {
	//添加教师
	void saveTeacher(Teacher teacher);
	//删除教师
	void deleteTeacherByTid(Integer tid);
	void deleteTeacherByRealname(String realname);
	//修改教师信息
	void updateTeacher(Teacher teacher);
	//查找教师
	Teacher getTeacherByTid(Integer tid);
	Teacher getTeacherByUsername(String username);
	Teacher getTeacherByUsernamePassword(String username,String password);
	Teacher getTeacherByRealname(String realname);
	List<Teacher> getAllTeacher();//获得所有教师
}
