package Assignments;
import java.util.*;
public class Repl112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		    
		    Scanner input = new Scanner(System.in);
		    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
		   

		    //TODO: Write your code below
		    for(int i=0;i<words.length;i++){
		      System.out.println(words[i].substring(0,1)+words[i].substring(words[i].length()-1));
		    }
	 
		  
	}

}
