package Assignments;

import java.util.Scanner;

public class Repl96 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int inhabitants = scan.nextInt();
	    System.out.println("inhabitansts is "+inhabitants);
	   
	    int days = 0;
	for(; inhabitants>0;inhabitants/=2) {
		System.out.println("Day "+days+" ["+inhabitants+"]");
		  	
		  if(inhabitants==0) {break;}
		  days++;
		    }
	System.out.println("---- EXTINCT ----");
	}
}