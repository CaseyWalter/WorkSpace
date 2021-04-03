package GiveMeFive;

import java.util.Scanner;
public class GiveMeFive {
	
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner (System.in);
		System.out.print("Hello! Please enter five postive integers: \n");
		String string1 = stdin.nextLine();
		Scanner strin1 = new Scanner (string1);
		//System.out.print("Hello! Please enter five postive integers: ");
		
		
		int num1 = strin1.nextInt();
		
		int num2 = strin1.nextInt();
		
		int num3 = strin1.nextInt();
		
		int num4 = strin1.nextInt();
		
		int num5 = strin1.nextInt();
		
		int sum = num1 + num2 + num3 + num4 + num5;
		
		
		int Product = num1 * num2 * num3 * num4 * num5;
		
		int avgI = sum/5;
		double Avg1 = sum/5;
		double Avg2 = sum/5.0;
		
		System.out.println("The sum is " + sum);
		System.out.println("The product is " + Product);
		System.out.println("The average is " + Avg2);
		
		System.out.print("Well, that was fun! See ya later!");
		
		stdin.close();
		
		
		
		
				
		
				
}
}
