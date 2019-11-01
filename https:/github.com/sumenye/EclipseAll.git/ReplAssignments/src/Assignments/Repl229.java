package Assignments;

import java.util.ArrayList;

public class Repl229 {
	public String blogDb(ArrayList<String[]> r,String id)  {

	    String[] newarr=new String[3];
//	    for(int i=0; i<r.size();i++){
//	    	for(int j=0;j<r.get(i).length;j++) {
//	      if(r.get(i).contains(id)){
//	         i--;
//	         newarr=r.get(i);}
//	         for(String eachstr: newarr)
//	         if(eachstr.equalsIgnoreCase(id))
//	         newarr=r.get(i);
//	      return newarr[1]+"\n"+newarr[2];}
//	    }
	    
	   return  null;
	   
	  }
	  
	  public static void main(String[] args) {
		  Repl229 m = new Repl229();
	    ArrayList<String[]>  arr = new ArrayList<String[]>();
	    arr.add(new String[]{"1","title 1","content"});
	    arr.add(new String[]{"2","title 2","content"});
	    arr.add(new String[]{"3","title 3","content3"});

	    String post = m.blogDb(arr,"3");
	    System.out.print(post);
	    //should output:
	    //title 3 
	    //content3
	   
	    
	  }//end main
	}