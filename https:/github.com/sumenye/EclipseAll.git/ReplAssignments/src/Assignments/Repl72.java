package Assignments;

import java.util.Scanner;

public class Repl72 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    String email = scan.next();
		  
		   int placeOf_ = email.indexOf("_");
		   int placeOfAt = email.indexOf("@");
		   int placeOfDot = email.indexOf(".");
		   String firstName = email.substring(0,placeOf_);
		   firstName.toUpperCase().charAt(0);
		   String lastName = email.substring(placeOf_+1,placeOfAt); 
		   lastName.toUpperCase().charAt(0);
		   String domain = email.substring(placeOfAt+1,placeOfDot);
		   String topLevel = email.substring(placeOfDot+1,email.length());	   
		
		    System.out.println("First name: "+ firstName.toUpperCase().charAt(0)+firstName.substring(1,firstName.length()));
		    System.out.println("Last name: "+ lastName.toUpperCase().charAt(0)+lastName.substring(1,lastName.length()));
		    System.out.println("Domain: "+ domain);
		    System.out.println("Top-Level Domain: "+ topLevel);
		
		
	}

}
