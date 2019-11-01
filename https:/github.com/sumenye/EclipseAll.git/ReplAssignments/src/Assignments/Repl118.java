package Assignments;

import java.util.*;

public class Repl118 {

	public static void main(String[] args) {
		
		    Scanner input = new Scanner(System.in);
		    String email = input.nextLine();
		    
		    //Write your code below
		    int countOfSign =0;
		    for(int i=0; i<email.length();i++){
		    //if((email.charAt(i)).equals("@")){
		    	if(email.substring(i,i+1).equals("@")) {
		    countOfSign++;}}
		    if(countOfSign>1 || countOfSign==0){
		      System.out.println("invalid email");
		    }
		    else if (countOfSign==1){
		    String[] array = email.split("@");
			System.out.println("Email id: "+ array [0]);
		    System.out.println("Email domain: "+ array [1]);}
		  }
		}

//-----------------VASYL SOLUTION--------------
//String email = "myfancy@email.com";
//
////Write your code below
//if(email.contains("@")) {
//    String[] arr = email.split("@");
//    if(arr.length==2){
//      System.out.println("Email id: "+arr[0]);
//      System.out.println("Email domain: "+arr[1]);
//    }else{
//      System.out.println("invalid email");
//    }
//}else {
//    System.out.println("invalid email");
//}