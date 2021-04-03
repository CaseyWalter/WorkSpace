
public class CH5_review {

	public static void main(String[] args) {

		// CH5-Task1 (if statement, combining multiple conditions)
		// if myzip is between 50010 and 50014, then print "Ames". Otherwise, print "Not Ames"
		// Reference: Page 3, Page 9 of "MIS 307 Chapter 5-7 review.pptx"
		System.out.println("[CH5-Task1]");
		int myzip = 50021; // try 50014, 50052, etc

		if ((myzip >= 50010) && (myzip <= 50014)) {
			System.out.print("Ames");
		}else {
			System.out.print("Not Ames");
		}

		
		
		
		
		
		
		
		System.out.println();
		
		
		
		// CH5-Task2 (if statement for string)
		// if myareacode is 515, print "Des Moines". Otherwise, print "Not Des Moines" 
		// Hint: Strings cannot be compared using "=" signs
		// Reference: Page 4 of "MIS 307 Chapter 5-7 review.pptx"
		System.out.println("[CH5-Task2]");
		String myareacode = "515"; // try 765, 847, etc

		if(myareacode.equals("515")) {
			System.out.print("Des Moines");
		}else {
			System.out.print("Not Des Moines");
		}
		
		
		
		
		
		System.out.println();
		
		
		
		
		// CH5-Task3 (comparing strings)
		// Check if word1 comes before word2 in the dictionary
		// If word1 comes before, print "word1"
		// Otherwise, print "word2"
		// Reference: Pages 5-6 of "MIS 307 Chapter 5-7 review.pptx"
		System.out.println("[CH5-Task3]");
		String word1 = "Ivy";
		String word2 = "Information Systems";

		if(word1.compareTo(word2) < 0) {
			System.out.print("word1");
		}else {
			System.out.print("word2");
		}
		
		
		
		System.out.println();
		
		
		
		
		
		// CH5-Task4 (if and else if)
		// use if and else if determine letter grade for myscore.
		// A if score >= 90
		// B if 80 <= score < 90
		// C if score < 80
		// Hint: test general conditions after more specific conditions
		// Reference: Pages 7-8 of "MIS 307 Chapter 5-7 review.pptx"
		System.out.println("[CH5-Task4]");
		double myscore = 85;
		
		if(myscore >= 90) {	
			System.out.println("A");
		}else if(myscore >= 80) {
			System.out.println("B");
		}else {
			System.out.println("C");
		}
		
		
		
		
	}

}
