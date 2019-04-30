package com.test;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.domain.Student;
import com.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestStudentAction {
	@Resource(name="studentService")
	private StudentService service;
	
	@Test
	public void testName() throws Exception {
		List<Student> list = service.getAllStudent();
		for (Student student : list) {
			System.out.println(student);
		}
	}
}
