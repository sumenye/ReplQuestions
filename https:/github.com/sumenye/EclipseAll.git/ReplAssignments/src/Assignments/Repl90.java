package Assignments;

import java.util.Scanner;

public class Repl90 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String html = scan.nextLine();
	    int firstIndex =html.indexOf("<p id=\"");
	    int lastindex = html.lastIndexOf("\"></p>");
	    String myValue = "";
	    
	    for(int i=0; i<html.length()-14;i++) {
	      if(html.contains("<p id=\"") && html.contains("\"></p>")){
	    myValue=html.substring(firstIndex+8,lastindex-2);	}
	    else 
	    myValue="Invalid input!";
	    } 
	 
	    System.out.println(myValue);
	 
	    
	}

}