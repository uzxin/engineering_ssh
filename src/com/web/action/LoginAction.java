package com.web.action;

import com.domain.Student;
import com.domain.Teacher;
import com.domain.Admin;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.LoginService;
public class LoginAction extends ActionSupport{
	private String checkcode;//验证码
	private String username;//用户名
	private String password;//密码
	private String identity;//身份
	private LoginService loginService;
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	//登陆方法
	public String login() throws Exception {
		//获取生成的图片验证码
		String checkCode_session = (String) ActionContext.getContext().getSession().get("checkcode_session");
		if (!checkcode.equals(checkCode_session)) {
			//验证码不正确
			ActionContext.getContext().put("loginInfo", "验证码不正确");
			return "error";
		}
		if(identity.equals("管理员")){
			//用管理员身份进行登陆
			Admin admin = loginService.loginWithAdmin(username,password);
			if (admin == null) {
				//不存在该用户名
				ActionContext.getContext().put("loginInfo", "不存在该管理员");
				return "error";
			}else if(admin != null && admin.getPassword().equals(password)) {
				//登陆成功
				ActionContext.getContext().getSession().put("identity", admin);
				return "success";
			}else{
				//密码错误
				ActionContext.getContext().put("loginInfo", "密码错误");
				return "error";
			}
		}else if (identity.equals("教师")) {
			//用教师身份进行登陆
			Teacher teacher = loginService.loginWithTeacher(username,password);
			if (teacher == null) {
				//不存在该用户名
				ActionContext.getContext().put("loginInfo", "不存在该教师");
				return "error";
			}else if(teacher != null && teacher.getPassword().equals(password)) {
				//登陆成功
				ActionContext.getContext().getSession().put("identity", teacher);
				return "success";
			}else{
				//密码错误
				ActionContext.getContext().put("loginInfo", "密码错误");
				return "error";
			}
		}else {
			//用学生身份进行登陆
			Student student = loginService.loginWithStudent(username,password);
			if (student == null) {
				//不存在该用户名
				ActionContext.getContext().put("loginInfo", "不存在该学生");
				return "error";
			}else if(student != null && student.getPassword().equals(password)) {
				//登陆成功
				ActionContext.getContext().getSession().put("identity", student);
				return "success";
			}else{
				//密码错误
				ActionContext.getContext().put("loginInfo", "密码错误");
				return "error";
			}
		}
	}
	
	//退出登录
	public String exit() throws Exception {
		// TODO Auto-generated method stub
		return "error";
	}

	public String getCheckcode() {
		return checkcode;
	}
	public void setCheckcode(String checkcode) {
		this.checkcode = checkcode;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	
	
}
