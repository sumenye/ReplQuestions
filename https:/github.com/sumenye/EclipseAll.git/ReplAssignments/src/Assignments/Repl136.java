package Assignments;

import java.util.*;

public class Repl136 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	    int[] nums = new int[size];
	    for(int i = 0; i < size; i++){
	      nums[i] = scan.nextInt();
	    }
	    //WRITE YOUR CODE HERE
	    int temp=nums[0];
	    for(int i=0;i<size-1;i++){
	   nums[i]=nums[i+1];
	     }
	  
	    
	     nums[size-1]=temp;
	    System.out.print(Arrays.toString(nums));

	  }
	}
	