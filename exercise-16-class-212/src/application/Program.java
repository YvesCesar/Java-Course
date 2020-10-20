package application;

import java.util.Scanner;

import entities.Course;
import entities.Professor;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Professor prof = new Professor(1, "Alex");
		prof.addCourses(new Course("A"));
		prof.addCourses(new Course("B"));
		prof.addCourses(new Course("C"));
		
		for (Course course : prof.getCourses()) {
			System.out.print("How many students for course "+ course.getName() +"? ");
			int quantity = sc.nextInt();
			
			for (int i = 0; i < quantity; i++) {
				course.addStudents(new Student(sc.nextInt()));
			}
		}
		
		System.out.println("Total students: " + prof.getTotStudents(prof.getCourses()).size());
		sc.close();
	}

}
