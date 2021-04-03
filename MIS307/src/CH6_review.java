
public class CH6_review {

	public static void main(String[] args) {

		double[] mynums = {8.8, 6.9, 5.6, 0.1, 9.8, 4.7, 8.3, 5.8, 4.5, 1.0, 6.9, 0.6, 0.9, 7.1, 9.4, 3.3, 3.0};
			
		
		// CH6-Task1 (for loop with if statement)
		// use for loop to print all numbers in mynums that are greater than 5
		// Expected output: 8.8  6.9  5.6  9.8  8.3  5.8  6.9  7.1  9.4
		// Reference: Page 14 of "MIS 307 Chapter 5-7 review.pptx"
		System.out.println("[CH6-Task1]");
		
		for(int i = 0;i<mynums.length; i++) {
			if (mynums[i] > 5) {
				System.out.print(mynums[i] + "false");
			}
		}
		
		
		
		
		
		
		System.out.println("\n");
		
		
		
		
		// CH6-Task2 (while loop)
		// convert CH6-Task1's for loop into while loop
		// Reference: Page 14 of "MIS 307 Chapter 5-7 review.pptx"
		System.out.println("[CH6-Task2]");
		int i=0;
		
		
		
		
		
		
		
		System.out.println("\n");
		
		
		
		
		// CH6-Task3 (comparing characters, counting matches)
		// use for loop to count the number of 'I' in the string mystr
		// Reference: Page 15 of "MIS 307 Chapter 5-7 review.pptx"
		System.out.println("[CH6-Task3]");
		String mystr = "Ivy College of Business ISBA";
		int cnt = 0; // store the answer
		
		for(int j=0; j<mystr.length(); j++) {
			char ch = mystr.charAt(j);
			if(ch == 'I') {	
				cnt++;
			}
		}
		
		
		
		
		
		System.out.println(cnt);
		System.out.println();
		
		// CH6-Task4 (nested loops)
		// Use nested for loops to print the output below
		// 1 2 3 4
		// 2 4 6 8
		// 3 6 9 12
		// Reference: Page 20 of "MIS 307 Chapter 5-7 review.pptx"
		System.out.println("[CH6-Task4]");

		for(int row = 1;row <= 3; row++) {
			for(int col = 1; col <= 4; col++) {
				System.out.print(row*col + " ");
			}
			System.out.println();
		}
		
		
		
	}

}
