package Assignments;
import java.util.*;
public class Rep132 {

	public static void main(String[] args) {
		int [][] multiplicationTable = new int[10][10];
	   	int row=1, column =1;
			for (int x = 0; x < multiplicationTable.length; x++) {
	            for (int y = 0; y < multiplicationTable[x].length; y++) {
	            	multiplicationTable[x][y] = row * column;
	            	column = column + 1;
	            	// System.out.print(multiplicationTable[x][y]+" ");
	            	 //System.out.print(Arrays.deepToString(multiplicationTable));}
	            }
	            row = row + 1;
	           column = 1;
	      
			}
		
	    
	    
	    
	    //Do not modify below line it will be used to test your code. And 
	    //Can be used by you while developing your code
	    System.out.println(Arrays.deepToString(multiplicationTable) ) ;
	  }
	}