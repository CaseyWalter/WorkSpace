package Recitation97;

import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		
		/* This program reads in 3 positive integers
		 * and prints out the average of the 3 input integers
		 * Author: Prabhu
		 */
        // First create an instance of a Scanner object
		
		Scanner stdin = new Scanner (System.in);
		
		// The name chosen for my Scanner is stdin  
		// You can choose any name you want
		
		// Print a prompt to enter the first integer
		
		System.out.print("Enter three integer numbers: ");
		
		// Read the first integer number using nextInt()
		int num1 = stdin.nextInt();
		
		// Print a prompt to enter the second integer
		
//		System.out.print("Enter second integer number: ");
		
		// Read the second integer number
		int num2 = stdin.nextInt(); 
		
		// Print a prompt to enter the third integer
		
//		System.out.print("Enter third integer number: ");
		
		// Read the third integer number
		int num3 = stdin.nextInt();
		
		// Compute the sum of the input integers
		int sum = num1 + num2 + num3;
		
		// Compute the average which is type double
		// Do a real divide and not an integer divide
		
		double avg1 = sum/3; // this does integer divide
        double avg2 = sum/3.0; // this does real divide
		
        System.out.println("\nThe average is: " + avg1 + " " + avg2);
		// The + sign is a concatenation operator
		// combining a string with a value
		
		stdin.close(); // close the Scanner object stdin
		
		
	} // end main

} // end class Average
