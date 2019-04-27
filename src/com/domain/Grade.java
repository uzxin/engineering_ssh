package com.domain;

public class Grade {
	private Integer gid;//成绩id
	private Integer sid;//学生id
	private Integer cid;//课程id
	private Integer answer1;//考勤成绩
	private Integer answer2;//考勤成绩
	private Integer answer3;//考勤成绩
	private Integer homework1;//平时作业成绩
	private Integer homework2;//平时作业成绩
	private Integer homework3;//平时作业成绩
	private Integer test1;//小测验成绩
	private Integer test2;//小测验成绩
	private Integer test3;//小测验成绩
	private Integer finalexam;//期末成绩
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
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
	public Integer getAnswer1() {
		return answer1;
	}
	public void setAnswer1(Integer answer1) {
		this.answer1 = answer1;
	}
	public Integer getAnswer2() {
		return answer2;
	}
	public void setAnswer2(Integer answer2) {
		this.answer2 = answer2;
	}
	public Integer getAnswer3() {
		return answer3;
	}
	public void setAnswer3(Integer answer3) {
		this.answer3 = answer3;
	}
	public Integer getHomework1() {
		return homework1;
	}
	public void setHomework1(Integer homework1) {
		this.homework1 = homework1;
	}
	public Integer getHomework2() {
		return homework2;
	}
	public void setHomework2(Integer homework2) {
		this.homework2 = homework2;
	}
	public Integer getHomework3() {
		return homework3;
	}
	public void setHomework3(Integer homework3) {
		this.homework3 = homework3;
	}
	public Integer getTest1() {
		return test1;
	}
	public void setTest1(Integer test1) {
		this.test1 = test1;
	}
	public Integer getTest2() {
		return test2;
	}
	public void setTest2(Integer test2) {
		this.test2 = test2;
	}
	public Integer getTest3() {
		return test3;
	}
	public void setTest3(Integer test3) {
		this.test3 = test3;
	}
	public Integer getFinalexam() {
		return finalexam;
	}
	public void setFinalexam(Integer finalexam) {
		this.finalexam = finalexam;
	}
	@Override
	public String toString() {
		return "Grade [gid=" + gid + ", sid=" + sid + ", cid=" + cid + ", answer1=" + answer1 + ", answer2=" + answer2
				+ ", answer3=" + answer3 + ", homework1=" + homework1 + ", homework2=" + homework2 + ", homework3="
				+ homework3 + ", test1=" + test1 + ", test2=" + test2 + ", test3=" + test3 + ", finalexam=" + finalexam
				+ "]";
	}
	
}
