package learnerDatabaseApplication;

import java.util.Scanner;

public class LearnerDatabase {

	public static void main(String[] args) {
		
//		How many learner want to enroll
		System.out.print("Enter the number of new Learner to enroll in: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Learners[] learner = new Learners[num];
		
//		Create n number of new learner
		for(int i=0; i<num; i++ ) {
			learner[i] = new Learners();
			learner[i].enroll();
			learner[i].payFee();	
		}	
		for(int i=0; i<num; i++ ) {
		    System.out.println(learner[i].showInfo());  
		}
	 } 	
  }


