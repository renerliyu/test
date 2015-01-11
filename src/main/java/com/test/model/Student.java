package com.test.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {

	private Integer sno;
	private String sname;
	private String course;
	private Integer fee;

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", course="
				+ course + ", fee=" + fee + "]";
	}

	public Student() {
		super();
	}

	public Student(int sno, String sname, String course, int fee) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.course = course;
		this.fee = fee;
	}

	public Integer getSno() {
		return sno;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Integer getFee() {
		return fee;
	}

	public void setFee(Integer fee) {
		this.fee = fee;
	}

}
