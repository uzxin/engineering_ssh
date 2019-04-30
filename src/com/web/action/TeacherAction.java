package com.web.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.domain.Course;
import com.domain.Teacher;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.TeacherService;

public class TeacherAction extends ActionSupport implements ModelDriven<Teacher>{
	private Teacher teacher = new Teacher();
	private TeacherService teacherService;
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	
	//获取教师列表
	public String getAllTeacher() throws Exception {
		List<Teacher> teacherList= teacherService.getAllTeacher();
		ActionContext.getContext().put("teacherList", teacherList);
		return "toTeacher";
	}
	
	//添加教师
	public String add() throws Exception{
		teacherService.add(teacher);
		return "toTeacherList";
	}
	
	//删除教师
	public String del() throws Exception {
		Integer tid = (Integer) ServletActionContext.getRequest().getAttribute("tid");
		teacherService.del(tid);
		return "toTeacherList";
	}
	
	//编辑教师信息前的准备
	public String edit() throws Exception {
		Integer tid = (Integer) ServletActionContext.getRequest().getAttribute("tid");
		Teacher teacher = teacherService.getTeacher(tid);
		ActionContext.getContext().put("teacher", teacher);
		return "toEdit";
	}
	
	//更新教师信息
	public String update() throws Exception {
		teacherService.update(teacher);
		return "toTeacherList";
	}
	
	
	@Override
	public Teacher getModel() {
		return teacher;
	}
	
	
}
