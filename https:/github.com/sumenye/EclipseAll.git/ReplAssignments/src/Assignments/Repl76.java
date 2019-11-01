package Assignments;

import java.util.Scanner;

public class Repl76 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String sentence = scan.nextLine();
	    int lastCharCount = sentence.length()-1;
	    while(lastCharCount>=0){
	        System.out.print(sentence.charAt(lastCharCount));
	        lastCharCount--;  }
	    
	    }
	  }
	