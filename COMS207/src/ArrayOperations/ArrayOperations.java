package ArrayOperations;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayOperations {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter positive integers ending with a Q: ");
		ArrayList<Integer> data = readInput(stdin); // stdin is passed as Scanner argument
		System.out.print("\n");
		printArray(data);
		System.out.println("\nThe average is: " + average(data));
		System.out.println("The smallest element is: " + smallest(data));
		System.out.println("The index of the smallest element is: " + getMinIndex(data));
		System.out.println("The largest element is: " + largest(data));
		System.out.println("The index of the largest element is: " + getMaxIndex(data));

		sortUp(data);

		System.out.print("The sorted array in non-decreasing order is: ");

		printArray(data);
		ArrayList<Integer> reverseList = new ArrayList<Integer>();
		reverseList = reverse(data);
		System.out.print("\nThe reverse of the sorted array is: ");
		printArray(reverseList);
		stdin.close();
	} // end main

	// The code for the method readInput is given below. You can use this
	public static ArrayList<Integer> readInput(Scanner in) {
		// The input parameter in of type Scanner is used to read input
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (in.hasNextInt()) { // quit when you encounter ‘Q’
			int num = in.nextInt(); // assume input int is positive
			list.add(num); // add input to ArrayList named list
		} // end while
		return list;
	} // end readInput

	public static void printArray(ArrayList<Integer> values) {
		for (int i = 0; i <= values.size() - 1; i++) {
			System.out.print(values.get(i) + " ");
		}
	}

	public static double average(ArrayList<Integer> avg) {
		double average = 0.0;
		for (int i = 0; i < avg.size(); i++) {
			average = average + avg.get(i);
		}
		average = average / avg.size();
		return (average);

	}

	public static int getMaxIndex(ArrayList<Integer> max) {
		int max1 = max.get(0);
		int output = 0;
		for (int i = 1; i < max.size(); i++) {
			if (max1 < max.get(i)) {
				max1 = max.get(i);
				output = i;
			}
		}
		return (output);
	}

	public static int getMinIndex(ArrayList<Integer> min) {
		int min1 = min.get(0);
		int output = 0;
		for (int i = 1; i < min.size(); i++) {
			if (min1 > min.get(i)) {
				min1 = min.get(i);
				output = i;
			}
		}
		return (output);
	}

	public static int largest(ArrayList<Integer> large) {
		int large1 = large.get(0);
		for (int i = 1; i < large.size(); i++) {
			if (large1 < large.get(i)) {
				large1 = large.get(i);
			}
		}
		return (large1);
	}

	public static int smallest(ArrayList<Integer> small) {
		int small1 = small.get(0);
		for (int i = 0; i < small.size(); i++) {
			if (small1 > small.get(i)) {
				small1 = small.get(i);
			}
		}
		return (small1);
	}

	public static void sortUp(ArrayList<Integer> up) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		int size = up.size();
		for (int j = 0; j < size; j++) {
			int size2 = up.get(0);
			int num1 = 0;
			for (int i = 0; i < up.size(); i++) {
				if (size2 > up.get(i)) {
					size2 = up.get(i);
					num1 = i;
				}
			}
			up.remove(num1);
			output.add(size2);
		}
		for (int i = 0; i < size; i++) {
			up.add(output.get(i));
		}
	}

	public static ArrayList<Integer> reverse(ArrayList<Integer> down) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		int size = down.size();
		for (int j = 0; j < size; j++) {
			int size2 = down.get(0);
			int num1 = 0;
			for (int i = 0; i < down.size(); i++) {
				if (size2 > down.get(i)) {
					size2 = down.get(i);
					num1 = i;
				}
			}
			down.remove(num1);
			output.add(size2);
		}
		for (int l = size - 1; l != -1; l--) {
			down.add(output.get(l));
		}
		return (down);
	}

}