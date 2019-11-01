package Assignments;

import java.util.Scanner;

public class Repl79 {

	public static void main(String[] args) {
	    //your code here
		int freeBooks = 0;
	    Scanner scan = new Scanner(System.in);
	 
	    boolean isPremiumCustomer = scan.nextBoolean();
	
	    int nbooksPurchased = scan.nextInt();
	    
	
	    if(isPremiumCustomer){
	      if (nbooksPurchased>=5 & nbooksPurchased<8 ){
	        freeBooks = 1;
	        System.out.println(freeBooks);}
	        else if (nbooksPurchased>=8){
	        freeBooks = 2;
	        System.out.println(freeBooks);}}
	        
	     else if (!isPremiumCustomer){
	     if (nbooksPurchased>=7 & nbooksPurchased<12){
	        freeBooks = 1;
	        System.out.println(freeBooks);}
	        else if (nbooksPurchased>=12){
	        freeBooks = 2;
	        System.out.println(freeBooks);}
	        else{
	         System.out.println(freeBooks);}}
	   
	  }
	}