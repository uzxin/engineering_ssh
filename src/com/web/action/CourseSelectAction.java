package com.web.action;

import java.util.ArrayList;
import java.util.List;

import com.domain.TC;
import com.domain.Teacher;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.CourseSelectService;

public class CourseSelectAction extends ActionSupport{
	private CourseSelectService courseSelectService;
	public void setCourseSelectService(CourseSelectService courseSelectService) {
		this.courseSelectService = courseSelectService;
	}
	
	//获取教师选课列表
	public String getAllTC() throws Exception {
		List<TC> tcList = courseSelectService.getAllTC();
		List<Teacher> teacherList = courseSelectService.getTeacher(tcList);
		for (Teacher teacher : teacherList) {
			System.out.println("教师姓名："+teacher.getRealname());
		}
		//ActionContext.getContext().put("teacherList", teacherList);
		//ActionContext.getContext().put("courseList", courseList);
		return "toCourseSelect";
	}
	
	//获取教师选课列表
	public String getAllSC() throws Exception {
		// TODO Auto-generated method stub
		return "toCourseSelect";
	}
	
	
	
}
