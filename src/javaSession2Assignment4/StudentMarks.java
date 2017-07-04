package javaSession2Assignment4;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		
		int p,c,m,avg;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Physics paper marks");
		p = input.nextInt();
		System.out.println("Enter Chemistry paper marks");
		c = input.nextInt();
		System.out.println("Enter Mathematics paper marks");
		m = input.nextInt();
		// Calculating the average of marks obtained in 3 papers
		avg = (p+c+m)/3;
		// Printing the grade based on the average calculated
		System.out.print("Average you have secured: "+avg);
		if(avg > 70){
			System.out.println("\n Congrats! You have achieved A grade");
		}else if(avg > 61 && avg < 70){
			System.out.println("\n Superb! You have achieved B grade");
		}else{
			System.out.println("\n You have achieved C grade");
		}
	}

}
