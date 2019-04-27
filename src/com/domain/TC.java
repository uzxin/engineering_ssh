package com.domain;

public class TC {
	private Integer id;//教师选课表唯一表示
	private Integer tid;//教师id
	private Integer cid;//课程id
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "Teancher_course [id=" + id + ", tid=" + tid + ", cid=" + cid + "]";
	}
	
	
}
