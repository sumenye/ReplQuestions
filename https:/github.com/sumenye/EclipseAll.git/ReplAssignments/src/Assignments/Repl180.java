package Assignments;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class Repl180 {
	
	
	
	  public static String combineRs(String[] r1,String[] r2) 
	  {
	    ArrayList<String> str = new ArrayList<>(); 
	  for(int i=0; i<r1.length;i++){
	    str.add(r1[i]);
	  }
	   for(int i=0; i<r2.length;i++){
	    str.add(r2[i]);
	  }
	  return str.toString(); 
	  }
	}


