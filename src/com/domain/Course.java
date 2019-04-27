package com.domain;

public class Course {
	private Integer cid;//课程id
	private String cname;//课程名
	private String remark;//课程备注
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", remark=" + remark + "]";
	}
	
}
