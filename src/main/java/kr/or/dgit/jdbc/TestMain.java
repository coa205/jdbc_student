package kr.or.dgit.jdbc;

import java.sql.Connection;
import java.util.Date;

import kr.or.dgit.jdbc.dto.Student;
import kr.or.dgit.jdbc.service.StudentService;
import kr.or.dgit.jdbc.util.ConnectionFactory;

public class TestMain {
	public static void main(String[] args) {
		Connection connection = ConnectionFactory.getInstance();
		System.out.println(connection);
		
		StudentService service = StudentService.getInstance();
		Student student = new Student();
		student.setStudentId(1);
		student.setName("김자바");
		student.setEmail("kjv@test.co.kr");
		student.setDob(new Date());
		
		service.insertStudent(student);
	}
}
