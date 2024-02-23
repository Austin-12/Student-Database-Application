package studentDatabaseApp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	//constructor: prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshmen\n2- Sophmore\n3- Junior\n4 - Senior\nEnter student grade level: ");
		this.gradeYear = in.nextInt();
		setStudentID();
		
		
	}
	
	//generate an ID
	private void setStudentID() {
		//grade year + ID
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	//enroll in courses
	public void enroll() {
		
		Scanner in = new Scanner(System.in);
		String course = "";		 
		 while(true) {
			 System.out.println("Enter course to enroll (Q to quit): ");
			 course = in.nextLine();
			 
			 if (course.equals("Q")) {
				 break;
			 }
			courses = courses + "\n  " + course;
			tuitionBalance = tuitionBalance + costOfCourse;
		 }
		
	}
	//view balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	
	//pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	
	//show status
	public String showInfo() {
		return "Name: " + firstName + " " + lastName +
				"\nGrade level: " + gradeYear +
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled:" + courses + "\nBalance: $" + tuitionBalance;
	}

		
	}




	
