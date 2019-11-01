package Assignments;

import java.util.Scanner;

public class Repl93 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	     String str = scan.next();
	     int countOfBread = 0;
	     int firstBread = str.indexOf("bread");
	    		int lastBread = str.lastIndexOf("bread");
	    		
	     for(int i=0; i<str.length()-4; i++){
	       if(str.substring(i,i+5).equals("bread")){
	       countOfBread++;
	       }}
	     
	       if (countOfBread==2)
	       System.out.println(str.substring(firstBread+5,lastBread));
	       else 
	       System.out.println("nothing");
	       
	     }
	     
	  }
