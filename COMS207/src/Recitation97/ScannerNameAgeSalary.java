package Recitation97;
import java.util.Scanner;

// You can reuse a scanner instance to read different data types

public class ScannerNameAgeSalary {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		System.out.println("Enter name, age and salary:");
		// String input, you have to hit enter, because nextLine() reads a whole line
		String name = stdin.nextLine();

		// Numerical input
		// You can enter both at once, since nextInt() and nextDouble() reads up to the white space
		int age = stdin.nextInt();
		double salary = stdin.nextDouble();

		// Print out the input by user
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);

		stdin.close();
	}

}
