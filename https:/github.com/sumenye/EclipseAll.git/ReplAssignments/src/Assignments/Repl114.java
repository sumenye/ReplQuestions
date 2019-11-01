package Assignments;

import java.util.*;

public class Repl114 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    //TODO Type your code below:
	   // String newstr = Arrays.toString(nums);
	    boolean b=false;
	   for(int i=0;i<nums.length;i++){
	   if(nums[i]==5 && nums[i+1]==5){
	   b = true;}}
	   
	   
	   
	   System.out.println(b); 
	  
	   // System.out.println(newstr.indexOf(i).equals("5") && newstr.indexOf(i+1).equals("5"));}
	  }
}
