package HW1;
import java.util.*;

/**
 * Tester code for Problem 3 of HW1
 * You do not need to submit this file for HW1!!
 */
public class ArrayCalculationTest {

	public static void main(String[] args) {
		
		ArrayCalculation ac = new ArrayCalculation();
		int[] mynum = {3,5,-2,21,-31,91,0,24,-54,-11,55,76,0,14,19,6};
		int[] mynum2 = {5,31,-2,0,17,19,-41,-6,18,56,-21,-9,0,75,34,-25,0};

		System.out.println("[mynum]");
		System.out.println("number of positives:" + ac.countPositive(mynum));
		System.out.println("Expected count: 10");
		System.out.println("sum negative:" + ac.getSumNegative(mynum));
		System.out.println("Expected sum negative: -98");
		
		System.out.println("\n[mynum2]");
		System.out.println("number of positives:" + ac.countPositive(mynum2));
		System.out.println("Expected count: 8");
		System.out.println("sum negative:" + ac.getSumNegative(mynum2));
		System.out.println("Expected sum negative: -104");
		
		

	}

}
