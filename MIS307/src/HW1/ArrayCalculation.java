package HW1;
import java.util.*;

/**
 * Code for Problem 3 of HW1
 * @author
 */
public class ArrayCalculation {

	
	/**
	Gets the sum of the negative numbers in "numbers".
	@return sum of the negative numbers
    */
	public int getSumNegative(int[] numbers) {
		int sum = 0;
		// Your work starts here. Do not change the codes above.
		  
		for (int i = 0;i < numbers.length; i++){
			  if(numbers[i] < 0) {
				  sum = sum + numbers[i];
			  }
		  }
		  
		  
		  
	    // Your work ends here. Do not change the codes below.
		return sum;
	}
	
	/**
    Count positive numbers in "numbers"
    @return number of positive numbers in "numbers"
	 */
	public int countPositive(int[] numbers)
	{
		int cnt = 0;
		// Your work starts here. Do not change the codes above.
		  
		  for (int i = 0; i < numbers.length; i++) {
			  if(numbers[i] > 0) {
				  cnt++;
			  }
		  }
		  
		  
		  
	    // Your work ends here. Do not change the codes below.

		return cnt;
	}
	   
}
