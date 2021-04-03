package Recitation97;

// import here
import java.util.Scanner;
public class AreaOfCircle {

	public static void main(String[] args) {
		
		// take the radius from user input
		System.out.println("Please enter the radius in centimeters");
		// make a scanner (initialization of a Scanner instance, stdin)
		Scanner stdin = new Scanner(System.in);

		// use a scanner (call the correct method of the Scanner instance)
		double radius = stdin.nextDouble();

		// compute the area of the circle and save it in variable area
		// use Math.PI and Math.pow
		double area =Math.PI * Math.pow(radius, 2);

		// print out the correct area of circle
		System.out.print("This is the area of the circle with a radius of "+radius+" centimeters: ");
		System.out.println(area + " cm^2");
		System.out.println("Bye.");

		stdin.close();
	}
}
