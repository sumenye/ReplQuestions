package Assignments;

public class Repl166 {
	public static void main(String[] args) {
	    //test your code
	    System.out.println( uniqueChars("wooden-spoon") ) ;
	  }
	  
	  public static String uniqueChars(String str) {
	    //TODO: write your below
	    for(int i=0;i<str.length();i++){
	      for(int j=0;j<str.length();j++){
	        if(i==j){
	          continue;
	        }
	        System.out.println(i);
	      }
	    }
	    return str;
	    
	  }
	}

