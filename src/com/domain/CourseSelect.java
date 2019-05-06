package com.domain;

public class CourseSelect {
	private String realname;//人名
	private String cname;//课程名
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "CourseSelect [realname=" + realname + ", cname=" + cname + "]";
	}
	
}
