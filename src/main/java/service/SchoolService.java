/**
 * @author sagar.choudhary
 */

package service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.School;
import model.Student;

public class SchoolService {
	static Map<String,School> schoolList = new HashMap<String, School>();

	public static void addStudents(Map<String, Student> studentList) {
		School school = new School();
		school.setId("1");
		school.setName("DPS");
		school.setStudents(studentList);
		schoolList.put("1", school);
	}
	
	public Map<String, School> getSchoolDetails() {
		return schoolList;
	}

}
