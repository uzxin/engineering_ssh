package com.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.dao.AdminDao;
import com.domain.Admin;
@Repository
@Transactional
public class AdminDaoImpl extends HibernateDaoSupport implements AdminDao {
	
	//通过登陆账号查找管理员
	public Admin getAdminByUsername(String username) {
		Session session = getSessionFactory().getCurrentSession();
		Criteria criteria = session.createCriteria(Admin.class);
		criteria.add(Restrictions.eq("username", username));
		return (Admin) criteria.uniqueResult();
	}

}
