package com.dao;

import java.util.List;

import com.domain.Grade;

public interface GradeDao {
	//添加成绩
	void saveGrade(Integer sid,Integer cid);
	//更改成绩
	void updateGrade(Integer sid,Integer cid);
	//查询成绩
	Grade getGradeBySidCid(Integer sid,Integer cid);//查询某个学生某门课程的成绩
	List<Grade> getAllGradeBySid(Integer sid);//查询某个学生所有课程的成绩
	List<Grade> getAllGradeByCid(Integer cid);//查询某门课程所有学生的成绩
	List<Grade> getAllGrade();//查询所有课程所有学生的成绩
}
