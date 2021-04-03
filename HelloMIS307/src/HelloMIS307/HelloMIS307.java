package HelloMIS307;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class HelloMIS307 {
	/**
	 * Code for HW0
	 * Casey Walter 
	 */
	public static void main(String[] args) {
		
		System.out.println("Hello, MIS 307.");
		System.out.println("If you see this message in the console, ");
		System.out.println("it means you successfully installed Java and Eclipse (or your favorite IDE) on your computer!");
		System.out.println("By submitting HW0, you confirm that you have a computer ready (Java and your favorite IDE installed) for MIS 307.");
		System.out.println("Do not share your screenshot with others.");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println("\nCurrent time: " + dtf.format(now)); 
		System.out.println("Project path:" + System.getProperty("user.dir"));

	}

}
