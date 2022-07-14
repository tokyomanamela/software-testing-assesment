package CodeComprehension;

import java.util.Arrays;
import java.util.Scanner;

public class question_1 {

	   static String  findMinMax(int[] arr) {
		    // sorting arry in ascending order 
		  
		   int sum_Min = 0;
		   int sum_Max = 0;
		   
		   //sorting array
		   Arrays.sort(arr);
		   
		   //adding first 4 int
		   for(int i=0;i<4 ; i++) {
			 
			   sum_Min =  sum_Min + arr[i];
			   
		   }
		   //adding Last 4 int
		   for(int i=4;i>0 ; i--) {
			 
			   sum_Max = sum_Max + arr[i];
			   
		   }
		   
		   return sum_Min+"  "+ sum_Max;
		   
	    }

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       
		 
		
		
		
	}

}
