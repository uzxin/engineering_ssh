package com.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dao.TCDao;
import com.domain.TC;
import com.domain.Teacher;
import com.service.CourseSelectService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestCourseSelectAction {
	@Resource(name="courseSelectService")
	private CourseSelectService courseSelectService;
	@Resource(name="tcDao")
	private TCDao tcDao;
	
	@Test
	public void testName11() throws Exception {
		List<TC> tcList = new ArrayList<>();
		for (int i = 1; i < 6; i++) {
			TC tc = new TC();
			tc.setId(i);
			tc.setTid(i);
			tc.setCid(i);
			tcList.add(tc);
		}
		List<Teacher> list = tcDao.getTeacher(tcList);
	}
}
