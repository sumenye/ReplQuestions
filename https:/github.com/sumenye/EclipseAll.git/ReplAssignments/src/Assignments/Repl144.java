package Assignments;

import java.util.Scanner;

public class Repl144 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	    int size = inp.nextInt();
	    int[] arr = new int[size];
	    for(int i=0 ;i<=size-1;i++)
	    {

	        arr[i]=inp.nextInt();
	    }
	    
	    plus_minus(arr);
	  }//end main
	  public static void plus_minus(int[] arr){
	    int zero=0;
	    int positive=0;
	    int negative =0;
	  for(int i=0; i<arr.length;i++){
	    if(arr[i]==0)
	    zero++;
	    if (arr[i]>0)
	    positive++;
	    if (arr[i]<0)
	    negative++;
	  }
	  System.out.println("positives:"+positive+", negatives:"+negative+", zeros:"+zero);
	    
	  }  
	    
	}