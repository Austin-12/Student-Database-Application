package studentDatabaseApp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 
		 //ask how many new students we want to add
		 System.out.print("Enter number of new students to enroll: ");
		 Scanner in = new Scanner(System.in);
		 int numOfStudents = in.nextInt();
		 Student[] students = new Student[numOfStudents];
		 
		 //create n number of students
		 for(int i = 0; i < numOfStudents; i++) {
			 	students[i] = new Student();
				students[i].enroll();
				 students[i].payTuition();
		 }
		 
		 for(int i = 0; i < numOfStudents; i++) {
			 System.out.println(students[i].showInfo());
		 }

	}

}
