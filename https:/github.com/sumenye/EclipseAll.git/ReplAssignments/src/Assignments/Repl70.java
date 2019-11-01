package Assignments;

import java.util.Scanner;

public class Repl70 {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    if ((word.startsWith("x"))||(word.startsWith("X")) || (word.endsWith("x")) || word.endsWith("X")) {
	    word = word.replace("x","");
	    word = word.replace("X","");
	     System.out.println(word);}
	       
	    else {
	     System.out.println(word); }
	  
	    
	  }
	}
