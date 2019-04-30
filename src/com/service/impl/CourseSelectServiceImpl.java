package com.service.impl;

import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.dao.SCDao;
import com.dao.TCDao;
import com.domain.TC;
import com.domain.Teacher;
import com.service.CourseSelectService;

public class CourseSelectServiceImpl implements CourseSelectService {
	private SessionFactory sf;
	private TCDao tcDao;
	private SCDao scDao;
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	public void setTcDao(TCDao tcDao) {
		this.tcDao = tcDao;
	}
	public void setScDao(SCDao scDao) {
		this.scDao = scDao;
	}
	
	//获取教师选课列表
	public List<TC> getAllTC() {
		Transaction tx = sf.openSession().beginTransaction();
		List<TC> list = tcDao.getALLTC();
		tx.commit();
		sf.openSession().close();
		return list;
	}
	
	//通过选课表查询教师姓名
	public List<Teacher> getTeacher(List<TC> tcList) {
		Transaction tx = sf.openSession().beginTransaction();
		List<Teacher> list = tcDao.getTeacher(tcList);
		tx.commit();
		sf.openSession().close();
		return list;
	}
	
	
	
	
	
	
	
	
}
