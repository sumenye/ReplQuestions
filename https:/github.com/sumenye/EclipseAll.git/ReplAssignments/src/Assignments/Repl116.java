
//Given a String variable sentence, write code to type each word in separate lines.
//
//Example:
//sentence -> "Java is fun"
//Print
//Java
//is
//fun

package Assignments;
import java.util.Scanner;
public class Repl116 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    //type your code below
	  
	      String []newWords = sentence.split(" ");
	      for(int i=0; i<newWords.length;i++){
	    
	        System.out.println(newWords[i]); }
	  }}