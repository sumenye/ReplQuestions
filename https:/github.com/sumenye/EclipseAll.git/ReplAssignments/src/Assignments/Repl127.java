package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Repl127 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    String str = scan.nextLine();
		    
		    String shorts ="";
		    
		    String[] strarr = str.split(", ");
		    
		    String shortest = strarr[0];
		    
		    for(String each : strarr){
		      if(each.length()<shortest.length()){
		        shortest=each;
		      }}
		      
		      for(String each : strarr) {
		    	  if(each.length()==shortest.length()) {
		    		  shorts = shorts + each+" ";
		    	  }
		      } 
		    String[] newarr= shorts.split(" ");
		    Arrays.sort(newarr);
		    System.out.println(Arrays.toString(newarr));		  }
	}
