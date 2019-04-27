package com.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.SCDao;
import com.domain.SC;
/**
 * 学生选课表数据访问层的具体实现
 */
@Repository
@Transactional
public class SCDaoImpl extends HibernateDaoSupport implements SCDao{

	//添加学生选课
	public void saveSC(SC sc) {
		Session session = getSessionFactory().getCurrentSession();
		session.save(sc);
	}

	//删除学生选课
	public void deleteSC(Integer id) {
		Session session = getSessionFactory().getCurrentSession();
		SC sc2 = session.get(SC.class, id);
		session.delete(sc2);
	}

	//查看某个学生的选课情况
	public List<SC> getSCBySid(Integer sid) {
		Session session = getSessionFactory().getCurrentSession();
		Criteria criteria = session.createCriteria(SC.class);
		criteria.add(Restrictions.eq("sid", sid));
		return criteria.list();
	}

	//查看某门课程的所有学生
	public List<SC> getSCByCid(Integer cid) {
		Session session = getSessionFactory().getCurrentSession();
		Criteria criteria = session.createCriteria(SC.class);
		criteria.add(Restrictions.eq("cid", cid));
		return criteria.list();
	}

	//查看某个学生某门课程的选课信息
	public SC getSCBySidCid(Integer sid, Integer cid) {
		Session session = getSessionFactory().getCurrentSession();
		Criteria criteria = session.createCriteria(SC.class);
		criteria.add(Restrictions.eq("sid", sid));
		criteria.add(Restrictions.eq("cid", cid));
		return (SC) criteria.uniqueResult();
	}

	//获得所有学生所有课程选课信息
	public List<SC> getALLSC() {
		Session session = getSessionFactory().getCurrentSession();
		Criteria criteria = session.createCriteria(SC.class);
		return criteria.list();
	}

}
