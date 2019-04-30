package com.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.dao.TCDao;
import com.domain.TC;
import com.domain.Teacher;
@Repository
@Transactional
public class TCDaoImpl extends HibernateDaoSupport implements TCDao {

	//添加教师选课
	public void saveTC(TC tc) {
		Session session = getSessionFactory().getCurrentSession();
		session.save(tc);
	}

	//删除教师选课
	public void deleteTC(Integer id) {
		Session session = getSessionFactory().getCurrentSession();
		TC tc = session.get(TC.class, id);
		session.delete(tc);
	}

	//查询某个教师的选课情况
	public List<TC> getTCByTid(Integer tid) {
		Session session = getSessionFactory().getCurrentSession();
		Criteria criteria = session.createCriteria(TC.class);
		criteria.add(Restrictions.eq("tid", tid));
		return criteria.list();
	}

	//查看某门课程的选课情况
	public List<TC> getTCByCid(Integer cid) {
		Session session = getSessionFactory().getCurrentSession();
		Criteria criteria = session.createCriteria(TC.class);
		criteria.add(Restrictions.eq("cid", cid));
		return criteria.list();
	}

	//查看某个教师某门课程的选课情况
	public TC getTCByTidCid(Integer tid, Integer cid) {
		Session session = getSessionFactory().getCurrentSession();
		Criteria criteria = session.createCriteria(TC.class);
		criteria.add(Restrictions.eq("tid", tid));
		criteria.add(Restrictions.eq("cid", cid));
		return (TC) criteria.uniqueResult();
	}

	//查看所有教师所有课程的选课情况
	public List<TC> getALLTC() {
		Session session = getSessionFactory().getCurrentSession();
		Criteria criteria = session.createCriteria(TC.class);
		return criteria.list();
	}

	//通过选课表查询教师名字
	public List<Teacher> getTeacher(List<TC> tcList) {
		Session session = getSessionFactory().getCurrentSession();
		List<Teacher> list = new ArrayList<>();
		for (TC tc : tcList) {
			Criteria criteria = session.createCriteria(Teacher.class);
			criteria.add(Restrictions.eq("tid", tc.getTid()));
			Teacher teacher = (Teacher) criteria.uniqueResult();
			list.add(teacher);
		}
		return list;
	}

}
