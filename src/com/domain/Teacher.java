package com.domain;

public class Teacher {
	private Integer tid;//老师id
	private String username;//登陆账号
	private String password;//密码
	private String realname;//老师真实姓名
	private String email;//老师邮箱
	private String intro;//教师介绍
	
	
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
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
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", username=" + username + ", password=" + password + ", realname=" + realname
				+ ", email=" + email + ", intro=" + intro + "]";
	}
	
	
	
	

	
}
