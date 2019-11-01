package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Repl148 {
	public static void add_to_r(int[] r,int n) 
	{
		//create new array with one more position.
		int[] new_r=Arrays.copyOf(r,r.length+1);
		int lastInd=new_r.length-1;
	  n=new_r[lastInd];
	  for(int i=0; i<lastInd;i++) {
	  System.out.println(new_r[i]);}
	}
	
  public static void main(String[] args) {
    
    
    Scanner inp = new Scanner(System.in);
    int size = inp.nextInt(),n = inp.nextInt();
    int[] arr = new int[size];
    for(int i=0 ;i<=size-1;i++)
    {

        arr[i]=inp.nextInt();
    }
    
     add_to_r(arr, n);
   
    
  }
 
}

	

