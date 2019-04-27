package com.domain;

public class Student {
	private Integer sid;//学生id
	private String username;//登陆账号
	private String password;//密码
	private String realname;//学生真实姓名
	
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
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
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", username=" + username + ", password=" + password + ", realname=" + realname
				+ "]";
	}
	
	

	
}
