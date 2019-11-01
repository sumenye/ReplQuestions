package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Repl152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Scanner scan = new Scanner(System.in);
//		    int size = scan.nextInt();
		   // String[] words = new String[size];
		    String[] words =  {"java", "code", "python", "code", "rust", "code", "rust"};
//		    for(int i=0; i < size; i++){
//		      words[i] = scan.next();
//		    }
		    printUniqueWords(words);
		  }
		  
		  public static void printUniqueWords(String[] words){
		    //WRITE YOUR CODE HERE
		
		    String[] newarr=Arrays.copyOf(words, words.length);
		   
			   
		   }
		  }

		    	
		  
		
		
//		  if(words[0]!=words[1]) {
//				System.out.println(words[0]);  
//			  }
//			  if(!words[words.length-2].equals(words[words.length-1])){
//				  System.out.println(words[words.length-1]);
//			  }
//		    
//		    for(int i=1;i<words.length-1;i++) {
//		    	if(!words[i].equals(words[i+1])&& !words[i].equals(words[i-1])){
//					  System.out.println(words[i]);
//				    }
		