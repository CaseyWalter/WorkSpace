package GroupProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Casey {
	public static void main(String[] args) throws FileNotFoundException {
		
		File inputFile = new File("Room.txt");
		
		Scanner in = new Scanner(inputFile);
		in.nextLine();
		
		while (in.hasNextLine()) {
			
			String roomName = in.nextLine();
			int roomID = Integer.parseInt(in.nextLine());
			int bedNums = Integer.parseInt(in.nextLine());
			int openBeds = Integer.parseInt(in.nextLine());
			
		}
		Scanner console = new Scanner(System.in);
		boolean continueProgram = true;
		while(continueProgram) {
			System.out.println("Select one of the following options: ");
			System.out.println("(F) Find Room");
			System.out.println("(A) Add Room");
			System.out.println("(R) Remove Room");
			System.out.println("(E) Exit");
			String select = console.next();
		if (select.equals("E")) {
			continueProgram = false;
			
		}else if (select.equals("F")) {
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
	}

}
