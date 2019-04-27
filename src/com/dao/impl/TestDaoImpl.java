package com.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.dao.TestDao;
import com.domain.Student;
//HibernateDaoSupport 为dao注入sessionFactory
public class TestDaoImpl extends HibernateDaoSupport implements TestDao {
	//根据用户名密码查询用户
	public Student getUserByUsername(String username) {
		//HQL
		return getHibernateTemplate().execute(new HibernateCallback<Student>() {
			@Override
			public Student doInHibernate(Session session) throws HibernateException {
					String hql = "from User where username = ? ";
					Query query = session.createQuery(hql);
					query.setParameter(0, username);
					Student user = (Student) query.uniqueResult();
				return user;
			}
		});
		//Criteria
		/*DetachedCriteria dc = DetachedCriteria.forClass(User.class);
		
		dc.add(Restrictions.eq("user_code", usercode));
		
		List<User> list = (List<User>) getHibernateTemplate().findByCriteria(dc);
			
		if(list != null && list.size()>0){
			return list.get(0);
		}else{
			return null;
		}*/
	}

	//保存用户
	public void save(Student u) {
		getHibernateTemplate().save(u);
	}

}
