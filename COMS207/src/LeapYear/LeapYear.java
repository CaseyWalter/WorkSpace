package LeapYear;

import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
			
			Scanner stdin = new Scanner (System.in);
			
			System.out.print("Enter a year greater than 100: ");
			
			int year = stdin.nextInt();
			
			if (year % 4 != 0) {
				System.out.println(year + " is not a leap year.");
			} else if (year % 100 == 0 && year % 400 != 0) {
				System.out.println(year + " is not a leap year.");
			} else if (year % 100 == 0 && year % 400 == 0) {
				System.out.println(year + " is a leap year.");
			} else if (year % 100 != 0 && year % 4 == 0) {
				System.out.println(year + " is a leap year.");
			} 
	
	}
}
