package Average;

import java.util.Scanner;
public class Average {

	public static void main(String[] args) {

Scanner stdin = new Scanner (System.in);

System.out.print("Enter four integers:   ");
int num1 = stdin.nextInt();
int num2 = stdin.nextInt();
int num3 = stdin.nextInt();
int num4 = stdin.nextInt();

int sum = num1 + num2 + num3 + num4;

double avg = sum / 4.0;

System.out.print("\nThe average is:" + avg);


stdin.close();



		}
}