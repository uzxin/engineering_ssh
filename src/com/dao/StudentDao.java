package com.dao;

import java.util.List;
import com.domain.Student;

public interface StudentDao {
	//添加学生
	void saveStudent(Student student);
	//删除学生
	void deleteStudentBySid(Integer sid);
	void deleteStudentByRealname(String realname);
	//修改学生信息
	void updateStudentBySid(Student student);
	//查找学生
	Student getStudentBySid(Integer sid);
	Student getStudentByUsername(String username);
	Student getStudentByUsernamePassword(String username,String password);
	Student getStudentByRealname(String realname);
	List<Student> getAllStudent();//获得所有学生
}
