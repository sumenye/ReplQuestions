package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Repl131 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	    int rows = inp.nextInt(), cols = inp.nextInt();
	    int[][] arr = new int[rows][cols];
	    for(int i=0 ;i<=rows-1;i++)
	    {
	      for(int j=0 ;j<=cols-1;j++)
	      {
	        arr[i][j]=inp.nextInt();
	      }//end for cols
	    }//end for rwos
	    
	    //your code here
	    Arrays.sort(arr);
	    int matches = 0;
	
	   
	    for(int i=0; i< arr.length;i++){//
	      for(int j=0; j< arr[i].length; j++){
	        
	          if(arr[i][j]==arr[i][j+1]){
	            matches++;}}
	
	   
	    
	    System.out.print("matches: "+matches);
	  }//end main
	}
}