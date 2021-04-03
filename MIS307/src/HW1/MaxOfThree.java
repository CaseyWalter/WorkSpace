package HW1;
import java.util.Scanner;
/**
 * Code for HW1-E5.17
 * Read three floating-point numbers and print
 * the largest of the three.
 * Casey Walter
 */
public class MaxOfThree
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Please enter three numbers: ");
      double x = in.nextDouble();
      double y = in.nextDouble();
      double z = in.nextDouble();

      double largest = 0;

      // Your work starts here. Do not change the codes above.
	  if( x > y && x > z) {
		  largest = x; 
	  } else if(y > x && y > z) {
		  largest = y;
	  }else {
		  largest = z;
	  }
	  
	  
	  
	  
	  // Your work ends here. Do not change the codes below.
      
      System.out.println("The largest number is " + largest + ".");
      in.close();
   }
}
