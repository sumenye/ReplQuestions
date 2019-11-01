package Assignments;

import java.util.Scanner;

public class Repl103 {

	public static void main(String[] args) {
	    int count = 0;
	    Scanner scan = new Scanner(System.in);
	    String  str = scan.nextLine();
	    
	    for(int i=0;i<str.length()-3;i++){
	      if(str.substring(i,i+2).equals("co") && str.substring(i+3,i+4).equals("e")){
	        count++; }
	    }
	    System.out.println(count);
	    
	  }
	}