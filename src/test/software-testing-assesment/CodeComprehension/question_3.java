package CodeComprehension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class question_3 {

	   static void Question3(String SingleLine) {
		    // sorting arry in ascending order 
		   
		   
		// spliting
	        String[] IntergersList =   SingleLine.split(" ");
	        
	        // convert string array to int array
	        int[] values = Arrays.stream(IntergersList)
                    .mapToInt(Integer::parseInt)
                    .toArray();
	        // using method from Question 2
	        question_2.miniMaxSum(values);
		   
	    }
	

}
