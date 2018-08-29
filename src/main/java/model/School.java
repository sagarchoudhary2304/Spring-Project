/**
 * @author sagar.choudhary
 */

package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {

	private String id;
	private String name;
	private Map<String, Student> students = new HashMap<String, Student>();

	public Map<String, Student> getStudents() {
		return students;
	}

	public void setStudents(Map<String, Student> students) {
		this.students = students;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
