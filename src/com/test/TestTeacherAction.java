package com.test;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.domain.Teacher;
import com.service.TeacherService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestTeacherAction {
	@Resource(name="teacherService")
	private TeacherService teacherService;
	
	@Test
	public void testName() throws Exception {
		List<Teacher> list = teacherService.getAllTeacher();
		for (Teacher teacher : list) {
			System.out.println(teacher);
		}
	}
	
	@Test
	public void fun2() throws Exception {
		Teacher t = new Teacher();
		t.setRealname("游鑫");
		t.setUsername("youxin");
		t.setPassword("123");
		t.setEmail("youxin@cuit.com");
		t.setIntro("宇宙第一帅");
		teacherService.add(t);
	}
}
