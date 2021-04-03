package recitation1026;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileEditor {
	public static void main(String[] args) throws IOException {

		// Ask the user for the name of the input file.
		System.out.println("Enter file name please");
		Scanner stdin = new Scanner(System.in);
		String fileName = stdin.nextLine();

		// fill in here:::::::::::::::
		// read the file line by line and store it in the array originalLines
		int maxLines = 1000;
		int linesRead = 0;
		String[] originalLines = new String[maxLines];
		// fill in above:::::::::::::::

		System.out.println("=======Here is the original file =======");
		for (int i = 0; i < linesRead; i++) {
			System.out.println(getLine(originalLines, i));
		}
		System.out.println("=======Here ends the original file =======");
		System.out.println("Read " + linesRead + " lines");

		// select some lines
		// While the user enters an integer line number and does not ask
		// for termination (input sentinel "Q"), call method getLine, which returns the
		// line in the file given its line number.
		System.out.println("Please select the lines");
		int index;
		String[] selectedLines = new String[maxLines];
		int linesSelected = 0;
		while (stdin.hasNextInt()) {
			index = stdin.nextInt();
			if (index < linesRead) {
				selectedLines[linesSelected] = getLine(originalLines, index);
				linesSelected++;
				System.out.println("Line " + index + " selected");
				if (linesSelected == maxLines) {
					System.out.println("You selected the max number of lines");
					break;
				}
			} else {
				System.out.println("There are " + linesRead + " lines in the file");
			}
		}
		stdin.nextLine();
		// Stop asking for more line numbers once the user enters the sentinel "Q".
		if (linesSelected != maxLines) {
			if (stdin.next().toLowerCase().equals("q")) {
				System.out.println("OK I won't ask anymore");
			} else {
				System.out.println("You did not enter Q. Terminating");
				return;
			}
			stdin.nextLine();
		}

		System.out.println("=======You selected these lines =======");
		for (int i = 0; i < linesSelected; i++) {
			System.out.println(getLine(selectedLines, i));
		}
		System.out.println("=======That is all you selected =======");

		// Ask if the user wants to store the selected lines in a new file.
		// If so, what is the name of the new file? Create a new file with the
		// selected lines. Either way, say goodbye and terminate the main program in the
		// end.
		System.out.println("Do you want to store the lines in a file? [y/N]");
		String input = stdin.nextLine().toLowerCase();
		System.out.println(input);
		if (input.equals("y")) {
			// Use file writer to write a file.
			System.out.println("Enter file name");
			String newFName = stdin.nextLine();
			FileWriter myWriter = new FileWriter(newFName);
			for (int i = 0; i < linesSelected; i++) {
				myWriter.write(getLine(selectedLines, i) + "\n");
			}
			myWriter.close();
			System.out.println("Written to " + newFName + ". Bye bye");

		} else if (input.equals("n")) {
			System.out.println("Sounds good. Good bye");
		} else {
			System.out.println("You did not enter [y/N]. Assuming No.");
		}

	}

	public static String getLine(String[] fileLines, int lineNumber) {
		return fileLines[lineNumber];
	}
}
