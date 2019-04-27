package com.domain;

public class SC {
	private Integer id;//学生选课表唯一表示
	private Integer sid;//学生id
	private Integer cid;//课程id
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "Student_Course [id=" + id + ", sid=" + sid + ", cid=" + cid + "]";
	}
	
}
