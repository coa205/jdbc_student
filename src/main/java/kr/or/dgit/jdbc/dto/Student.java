package kr.or.dgit.jdbc.dto;

import java.util.Date;

public class Student {
	private int studentId;
	private String name;
	private String email;
	private Date dob;
	
	public Student() {}

	public Student(int studentId, String name, String email, Date dob) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.email = email;
		this.dob = dob;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return String.format("%s, %s, %s, %s", studentId, name, email, dob);
	}
}
