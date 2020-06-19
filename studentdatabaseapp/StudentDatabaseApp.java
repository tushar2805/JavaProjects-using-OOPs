package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		// No of students to be added to db
		System.out.println("Hoe many students you want to add? ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		// create n no of students
		for (int n = 0; n < numOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			System.out.println();
		}
		for (int n = 0; n < numOfStudents; n++) {
			System.out.println(students[n].showInfo());
			System.out.println();
		}
	}

}
