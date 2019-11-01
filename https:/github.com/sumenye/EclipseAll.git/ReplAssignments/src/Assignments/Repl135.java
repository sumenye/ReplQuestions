package Assignments;

import java.util.Arrays;

public class Repl135 {

	public static void main(String[] args) {
	
	    String[][] chessBoard = new String[8][8];
	    //WRITE YOUR CODE HERE

	    String raws = "";
	    int j;
	    for(int i=0;i<8;i++){
	    	j=0;
	    //for(int j=0; j<chessBoard[i].length;j++){
	    	   for (char c = 'a'; c <= 'h'; c++) {
	    		   chessBoard[i][j] = (i + 1) + "" + c;
	     j++;
	    }}
	    
	    //DO NOT CHANGE
	    System.out.println(Arrays.deepToString(chessBoard));
	  }
	}