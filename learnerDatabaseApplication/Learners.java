package learnerDatabaseApplication;

import java.util.Scanner;

public class Learners {
	
	private String firstName;
	private String lastName;
	private int semStatus;
	private String regID;
	private String courses = "" ;
	private int tutionBalance = 0;
	private static int courseFee = 5800;
	private static int rnum = 1000;

// Enter learner's Name & Semester
	public Learners() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Name: ");
		this.firstName = sc.nextLine();
		
		System.out.print("Enter Last Name: ");
		this.lastName = sc.nextLine();
		
		System.out.print("\nSemesters, \n1 - Fresher \n2 - Second semester \n3 - Third semester \n4 - Fourth semester \n5 - Fifth semester \n6 - Sixth semester \n7 - Seventh semester \n8 - Final semester \nEnter your current Semester: ");
		this.semStatus = sc.nextInt();
		setLearnerID();
	}
	
//	Generate learner ID
	private void setLearnerID() {
		rnum++ ;
		this.regID = semStatus + "" + rnum ;
		}
	
//	Enroll in subjects
	public void enroll() {
		do {
		System.out.print("\nEnter Subjects to enroll (Q to Quit): ");
		Scanner sc = new Scanner(System.in);
		String course = sc.nextLine();
		
		if(!course.equals("Q")) {
			courses = courses + "\n  " +course;
			tutionBalance = tutionBalance + courseFee;
		} else {
		  break;
		}
		} while ( 1 != 0 );
		  System.out.println("You have Enrolled In: " +courses);
	  }
	
//	view Total amount 
	public void viewBalance() {
	System.out.println("Your Total Fee in this semester is Rs. " +tutionBalance);
	}
	
//	Pay your fee
	
	public void payFee () {
		viewBalance();
		System.out.print("Enter Your Payment: Rs. ");
		Scanner sc = new Scanner(System.in);
		int payment = sc.nextInt();
		tutionBalance = tutionBalance - payment;
		System.out.println("Thank You for Your Payment of Rs. " +payment);
		System.out.println("Your pending balance: " +tutionBalance);
	}
	
//	Show Info
	public String showInfo() {
		return "\nYour Info. \nName: " +firstName+ " " +lastName+ "\nSemester: "+semStatus+ "\nRegestration No. " +regID+ "\nSubjects Enrolled: " +courses+ "\nPending Balance: " +tutionBalance;
	}
 }
