package com.dao;

import java.util.List;

import com.domain.Course;
import com.domain.SC;
import com.domain.Student;

/**
 * 学生选课表的数据访问层
 */
public interface SCDao {
	//添加学生选课
	void saveSC(SC sc);
	//删除学生选课
	void deleteSC(Integer id);
	//查询学生选课
	List<SC> getSCBySid(Integer sid);//查询某个学生的选课情况
	List<SC> getSCByCid(Integer cid);//查询某门课程学生的选课情况
	SC getSCBySidCid(Integer sid,Integer cid);//查询某个学生某门课程的选课情况
	List<SC> getALLSC();//查询所有课程所有学生的选课情况
	List<Student> getStudent(List<SC> scList);//通过选课表查询
	List<Course> getCourse(List<SC> scList);

}
