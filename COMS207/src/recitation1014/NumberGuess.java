package recitation1014;

import java.util.Scanner;
	

public class NumberGuess {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Guess a number from 1 to 100");
		
		int hiddenNumber = getRandomInt(1, 100);
		
		boolean guessedRight = false; 
		
		while (!guessedRight) {
			System.out.println("Enter an integer");
			
			int userGuess = scan.nextInt();
			
			
			if(userGuess == hiddenNumber) {
				
				guessedRight = true;
			}else if (userGuess < hiddenNumber) {
				
				System.out.println("Your number is too small");
			}else {
				System.out.println("Your number is too big");
			}
		}
		
		System.out.println("Congrats");
		scan.close();
		
		
	}	
		
	public static double getRandomDouble(double min, double max) {
		double randomNumber = Math.random() * (max - min) + min;
		return randomNumber;
	}
		
	public static int getRandomInt(int min, int max) {
		return (int) getRandomDouble(min, max + 1);
	}
	

		
		
		
		
		
		
		
		
		
		
		
		
	
	}
		