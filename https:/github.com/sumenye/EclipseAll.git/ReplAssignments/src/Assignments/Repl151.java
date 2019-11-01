package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Repl151 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    int[] nums = new int[size];
		    for(int i=0; i < size; i++){
		      nums[i] = scan.nextInt();
		    }
		    printUniqueNumbers(nums);
		  }
		  
		  public static void printUniqueNumbers(int[] nums){
		    //WRITE YOUR CODE HERE
		    int unique=0;
		   Arrays.sort(nums);
		   for(int i=1;i<nums.length;i++){
		     if(nums[0]!=nums[1]){
		       unique++;
		       System.out.println(nums[i]);
		     }
		     else if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1]) {
		    	 unique++;
			       System.out.println(nums[i]);}
		    if(i==nums.length-1){break;} 
		   }
	    
		  }
		}