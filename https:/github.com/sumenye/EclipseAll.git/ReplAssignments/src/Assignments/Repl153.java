package Assignments;

import java.util.Scanner;

public class Repl153 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    isPalindrome(num);
	  }
	  
	  public static void isPalindrome(int num){
	    //WRITE YOUR CODE HERE
		  int reversed=0;
		  int original=num;
		  while(num>0) {
			  reversed=reversed*10+num%10;
			  num=num/10;
		  }
	   System.out.println(reversed==original);
	  }
	}

/*
boolean result = true;
//into digits.....
int thousand = num/1000;
int hundred = num%1000-(num%100+num%10);
int tens = num%100-num%10;
int ones = num%10;
if(thousand==ones){
  if(hundred ==tens){
	  System.out.println(result);
	  }  }
else System.out.println(!result);*/  