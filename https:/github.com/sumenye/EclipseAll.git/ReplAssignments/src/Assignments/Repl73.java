package Assignments;

import java.util.Scanner;

public class Repl73 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
	    String start = scan.next();
	    String end = scan.next();
	    
	    if(start.equals("A")){
		    if( end.equals("B")){
		     System.out.println("right: B found");}
		    else if(end.equals("C")){
		     System.out.println("right > down: C found");}
		    else if(end.equals("D")){
		     System.out.println("right > down > left: D found");}
		       else if (start.equals(end)){
		    System.out.println(start + " found");}
		    }
		     else if(start.equals("B")){
		    if( end.equals("C")){
		     System.out.println("down: C found");}
		    else if(end.equals("D")){
		     System.out.println("down > left: D found");}
		     else if(end.equals("A")){
		     System.out.println("down > left > up: A found");}
		      else if (start.equals(end)){
		    System.out.println(start + " found");}
		    }
		    else if(start.equals("C")){
		      if( end.equals("D")){
		      System.out.println("left: D found");}
		     else if(end.equals("A")){
		     System.out.println("left > up: A found");}
		     else if(end.equals("B")){
		     System.out.println("left > up > right: B found");}
		     else if (start.equals(end)){
		    System.out.println(start + " found");}
		    }
		      else if(start.equals("D")){
		      if( end.equals("A")){
		      System.out.println("up: A found");}
		     else if(end.equals("B")){
		     System.out.println("up > right: B found");}
		     else if(end.equals("C")){
		     System.out.println("up > right > down: C found");}
		     else if (start.equals(end)){
		    System.out.println(start + " found");}
		    }
		    
		  }


		}



