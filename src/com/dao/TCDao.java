package com.dao;

import java.util.List;

import com.domain.TC;
import com.domain.Teacher;

public interface TCDao {
	//添加教师选课
	void saveTC(TC tc);
	//删除教师选课
	void deleteTC(Integer id);
	//查询教师选课
	List<TC> getTCByTid(Integer tid);//查询某个教师的选课情况
	List<TC> getTCByCid(Integer cid);//查询某门课程教师的选课情况
	TC getTCByTidCid(Integer tid,Integer cid);//查询某个教师某门课程的选课情况
	List<TC> getALLTC();//查询所有课程所有学生的选课情况
	List<Teacher> getTeacher(List<TC> tcList);//通过选课表查询教师
}
