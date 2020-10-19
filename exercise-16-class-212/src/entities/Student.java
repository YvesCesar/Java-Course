package entities;

import java.util.HashSet;
import java.util.Set;

public class Student extends User{
	
	private String name;
	
	private Set<Course> courses = new HashSet<>(); 

	public Student(Integer key) {
		super(key);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Course course) {
		courses.add(course);
	}
}
