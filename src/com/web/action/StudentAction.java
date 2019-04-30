package com.web.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.domain.Student;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.StudentService;

public class StudentAction extends ActionSupport implements ModelDriven<Student>{
	private Student student = new Student();
	private StudentService studentService;
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	//获取学生列表
	public String getAllStudent() throws Exception {
		List<Student> studentList= studentService.getAllStudent();
		ActionContext.getContext().put("studentList", studentList);
		return "toStudent";
	}
	
	//添加学生
	public String add() throws Exception {
		studentService.add(student);
		return "toStudentList";
	}
	
	//删除学生
	public String del() throws Exception {
		Integer sid = (Integer) ServletActionContext.getRequest().getAttribute("sid");
		studentService.del(sid);
		return "toStudentList";
	}
	
	//更新学生信息前的准备
	public String edit() throws Exception {
		Integer sid = (Integer) ServletActionContext.getRequest().getAttribute("sid");
		Student student = studentService.getStudent(sid);
		ActionContext.getContext().put("student", student);
		return "toEdit";
	}
	
	//更新学生信息
	public String update() throws Exception {
		studentService.update(student);
		return "toStudentList";
	}
	
	

	@Override
	public Student getModel() {
		return student;
	}
}
