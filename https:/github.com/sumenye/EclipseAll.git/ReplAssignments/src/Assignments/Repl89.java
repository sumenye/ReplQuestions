package Assignments;

import java.util.Scanner;

public class Repl89 {

	public static void main(String[] args) {
		boolean exists = false;
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    int length =word.length();
	    for(int i=word.length()-3;i>=0 ;i--){
	      exists = false;
	   if(word.substring(0,4).equals("java") || word.substring(1,5).equals("java")){
	     exists = true;
	   }}
	    System.out.println(exists);
	}
	}