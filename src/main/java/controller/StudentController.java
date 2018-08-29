/**
 * @author sagar.choudhary
 */

package controller;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.School;
import model.Student;
import service.SchoolService;
import service.StudentService;

@RestController
@RequestMapping("/School")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	private SchoolService schoolService;

	@RequestMapping("/create")
	public String createStudent() {
		studentService.createStudent("Sagar", "Choudhary", "1");
		return "Student Created Successfully";
	}

	@RequestMapping("/read")
	public Student readStudent() {
		return studentService.readStudent("1");
	}
	
	@RequestMapping("/readAll")
	public Map<String, Student> readAll() {
		return studentService.readAll();
	}
	
	@RequestMapping("/addStudent")
	public String addStudentToSchool() {
		studentService.addStudentToSchool();
		return "Students added to School Successfully";
	}
	
	@RequestMapping("/SchoolDetails")
	public Map<String, School> getSchoolDetails() {
		return schoolService.getSchoolDetails();
	}
}