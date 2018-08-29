package service;

import java.util.HashMap;
import java.util.Map;

import model.Student;

public class StudentService {
	
	static Map<String,Student> studentList = new HashMap<String, Student>();
	
//	public StudentService(String firstName, String lastName, String id){
//		Student student = new Student();
//		student.setFirstName(firstName);
//		student.setLastName(lastName);
//		student.setId(id);
//		studentList.put(id, student);
//	}
	
	public void createStudent(String firstName, String lastName, String id ) {
		Student student = new Student();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setId(id);
		studentList.put(id, student);
	}
	
	public void addStudentToSchool() {
		SchoolService.addStudents(studentList);
	}
	
	public Student readStudent(String id) {
		return studentList.get(id);
	}
	
	public Map<String, Student> readAll() {
		return studentList;
	}

}
