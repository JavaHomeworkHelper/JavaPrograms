package com.programming.help;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * @ JavaHomeworkHelper
 * This program calculates the factorial for a positive number inputted to the program
 * The program uses a for loop for calculating the value.
 * 
 */
public class CalculateFactorial {

	public static void main(String args[]) {
		
		//Prompt user to input a number
		System.out.println("Enter number for which factorial value should be computed and printed: ");
		int number = 0;
		try{
			number = new Scanner(System.in).nextInt();
			while(number <=0){
				System.out.println("Enter a postive number to compute the factorial value: ");
				number = new Scanner(System.in).nextInt();
							
			};
		}catch(InputMismatchException ime){
			System.out.println("Enter a postive number to compute the factorial value. Re-run the program");
			System.exit(0);
		}
		
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
	}
}
