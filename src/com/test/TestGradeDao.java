package com.test;

import static org.junit.Assert.*;

import javax.annotation.Resource;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.dao.GradeDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestGradeDao {
	@Resource(name="sessionFactory")
	private SessionFactory sf ;
	@Resource(name="gradeDao")
	private GradeDao dao;
	
	@Test
	public void testName() throws Exception {
		
	}
}
