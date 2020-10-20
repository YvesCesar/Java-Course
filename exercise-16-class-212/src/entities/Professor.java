package entities;

import java.util.HashSet;
import java.util.Set;

public class Professor extends User {
	
	private String name;
	private Set<Course> courses = new HashSet<>();
	private Set<Student> totStudents = new HashSet<>();

	public Professor(Integer key, String name) {
		super(key);
		this.name = name;
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

	public void addCourses(Course course) {
		courses.add(course);
	}
	
	public Set<Student> getTotStudents(Set<Course> courses) {
		
		for (Course course : courses) {
			totStudents.addAll(course.getStudents());
		}
		
		return totStudents;
	}

}
