package com.web.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.domain.*;
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
		List<TC> tcList = courseSelectService.getAllTC();//获取选课列表
		List<Teacher> teacherList = courseSelectService.getTeacher(tcList);//获取教师列表
		List<Course> courseList = courseSelectService.getTCourse(tcList);//获取课程列表
		//封装数据
		List<CourseSelect> csList = new ArrayList<>();
		for (int i = 0; i < tcList.size(); i++) {
			CourseSelect cs = new CourseSelect();
			cs.setRealname(teacherList.get(i).getRealname());
			cs.setCname(courseList.get(i).getCname());
			csList.add(cs);
		}
		ActionContext.getContext().put("teacherList", teacherList);
		ActionContext.getContext().put("courseList", courseList);
		ActionContext.getContext().put("csList", csList);
		return "toCourseSelect";
	}
	
	//获取学生选课列表
	public String getAllSC() throws Exception {
		List<SC> scList = courseSelectService.getAllSC();//获取选课列表
		List<Student> studentList = courseSelectService.getStudent(scList);//获取学生列表
		List<Course> courseList = courseSelectService.getSCourse(scList);//获取课程列表
		//封装数据
		List<CourseSelect> csList = new ArrayList<>();
		for (int i = 0; i < scList.size(); i++) {
			CourseSelect cs = new CourseSelect();
			cs.setRealname(studentList.get(i).getRealname());
			cs.setCname(courseList.get(i).getCname());
			csList.add(cs);
		}
		ActionContext.getContext().put("studentList", studentList);
		ActionContext.getContext().put("courseList", courseList);
		ActionContext.getContext().put("csList", csList);
		return "toCourseSelect";
	}
	
	//教师选课前先要获取教师列表和课程列表
	public String getTeacherAndCourse() throws Exception {
		List<Teacher> teacherList= courseSelectService.getTeacherList();
		List<Course> courseList= courseSelectService.getCourseList();
		ActionContext.getContext().put("teacherList", teacherList);
		ActionContext.getContext().put("courseList", courseList);
		return "toAddTCourse";
	}
	
	//学生选课前先要获取学生列表和课程列表
	public String getStudentAndCourse() throws Exception {
		List<Student> studentList= courseSelectService.getStudentList();
		List<Course> courseList= courseSelectService.getCourseList();
		ActionContext.getContext().put("studentList", studentList);
		ActionContext.getContext().put("courseList", courseList);
		return "toAddSCourse";
	}
	
	//添加教师选课
	public String addTeacherCourse() throws Exception {
		Integer tid = Integer.valueOf(ServletActionContext.getRequest().getParameter("teacher"));
		Integer cid = Integer.valueOf(ServletActionContext.getRequest().getParameter("course"));
		TC tc = new TC();
		tc.setTid(tid);
		tc.setCid(cid);
		courseSelectService.addTC(tc);
		return "toTCList";
	}
	
	//删除教师选课
	public String delTeacherCourse() throws Exception {
		
		return "toTCList";
	}
	
	//添加学生选课
	public String addStudentCourse() throws Exception {
		Integer sid = Integer.valueOf(ServletActionContext.getRequest().getParameter("student"));
		Integer cid = Integer.valueOf(ServletActionContext.getRequest().getParameter("course"));
		SC sc = new SC();
		sc.setSid(sid);
		sc.setCid(cid);
		courseSelectService.addSC(sc);
		return "toSCList";
	}
	
	//删除学生选课
	public String delStudntCourse() throws Exception {
			
		return "toSCList";
	}
	
}
