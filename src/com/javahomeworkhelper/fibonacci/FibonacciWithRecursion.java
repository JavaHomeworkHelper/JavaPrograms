package com.javahomeworkhelper.fibonacci;


import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * @JavaHomeworkHelper
 * This program calculates the fibonacci number series using recursion.
 * The input to the program is provided via the command line. 
 * 
 * Fibonacci number is sum of previous two Fibonacci numbers fn= fn-1+ fn-2
 * first 10 Fibonacci numbers are 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
 */
public class FibonacciWithRecursion {

	public static int getFibonacci(int n) {
		if (n == 1) { 
			return 1; 
		} else if (n == 2) { 
			return 1; 
		}else{ 
			//Recursive calls to compute the fibonacci series
			return getFibonacci(n - 1) + getFibonacci(n - 2);
		}
	}

	public static void main(String args[]) {
		
		//Prompt user to input a number, till which the fibonacci series need to be computed
		System.out.println("Enter number upto which Fibonacci series should be computed and printed: "); 
		int number = 0;
		try{
			number = new Scanner(System.in).nextInt();
			while(number <=0){
				System.out.println("Enter a postive number to compute the fibonacci series: ");
				number = new Scanner(System.in).nextInt();
							
			};
		}catch(InputMismatchException ime){
			System.out.println("Enter a postive number to compute the fibonacci series. Re-run the program");
			System.exit(0);
		}


		System.out.println("Fibonacci series till number " + number +" is : ");
		for(int i=1; i <= number; i++){
			System.out.printf("%s ", getFibonacci(i));
		}
		
	}

}
