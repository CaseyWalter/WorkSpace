package HW1;
import java.util.Scanner;

/**
 * Code for HW1-E6.8
 * Read three floating-point numbers and print
 * the largest of the three.
 * Casey Walter
 */
public class OneCharacterPerLine
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a word: ");
      String word = in.next();

      // Your work starts here. Do not change the codes above.
	  
	  for(int i = 0; i < word.length(); i++) {
		  System.out.println(word.charAt(i));
	  }
	  
	  
	  
	  // Your work ends here. Do not change the codes below.
      
      in.close();
   }
}