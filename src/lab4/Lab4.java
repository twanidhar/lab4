package lab4;

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner (System.in);
		//System.out.println("Enter an integer");use later
		int sqr;
		int cube;
		int userInput;
		String userResponse ="yes";
		//int number;
		//number = scnr.nextInt();
		do {
		System.out.println("Enter an integer");
		userInput = scnr.nextInt();
		
		System.out.println("Number"+"    "+"Squared"+"    "+"Cubed");
		System.out.println("=====" +"    "+" ======="+"    "+"=====");
		
		for(int i = 1; i<=userInput; i++ ) {
		//need to add the printing of the original number
		//need to add the printing of the squared number
		//need to add the printing of the cubed number
		sqr= i*i;
		cube= i*i*i;
		System.out.println(i+ "          "+sqr      +"         "+cube);
		//System.out.println(sqr);
		//System.out.println(cube);
		
		
		}
		System.out.println("Continue? (yes/no)");
		userResponse =scnr.next();
		}while (userResponse.equals("yes"));
		userResponse =scnr.next();
	}
}
