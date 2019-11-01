package Assignments;

import java.util.Scanner;

public class Repl94 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    	String str = scan.nextLine();
    int i = 0;
    int count =0;
    while(i<str.length()){
      if (str.charAt(i)=='h' && str.charAt(i+1)=='i'){
        count++;
        } }
      i++; 
        System.out.println(count);
   
  }
}