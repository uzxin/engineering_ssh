package com.web.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.domain.Course;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.CourseService;

public class CourseAction extends ActionSupport implements ModelDriven<Course>{
	private Course course = new Course();
	private CourseService courseService;
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}
	
	//获得课程列表
	public String getAllCourse() throws Exception {
		List<Course> courseList = courseService.getAllCourse();
		ActionContext.getContext().put("courseList", courseList);
		return "toCourse";
	}
	//添加课程
	public String add() throws Exception {
		System.out.println(course);
		courseService.add(course);
		return "toCourseList";
	}
	//删除课程
	public String del() throws Exception {
		Integer cid = (Integer) ServletActionContext.getRequest().getAttribute("cid");
		courseService.delCourse(cid);
		return "toCourseList";
	}
	//修改课程信息之前的准备
	public String edit() throws Exception {
		Integer cid = (Integer) ServletActionContext.getRequest().getAttribute("cid");
		Course course = courseService.getCourse(cid);
		ActionContext.getContext().put("course", course);
		return "toEdit";
	}
	//更新课程信息
	public String update() throws Exception {
		courseService.updateCourse(course);
		return "toCourseList";
	}
	
	@Override
	public Course getModel() {
		return course;
	}
}
