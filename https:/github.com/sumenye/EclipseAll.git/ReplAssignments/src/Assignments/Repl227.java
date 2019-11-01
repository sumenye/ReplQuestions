package Assignments;

public class Repl227 {
	
	class Board {
		  
		 private String[][] boardR;//board array
		  private boolean destroyed;
		  private String[] shipTypes = new String[]{"s","m","d","c"};
		  
		  public Board(String[][] br)
		  {
		   boardR=br;
		  }//end constructor
		  
		  public boolean hit(int row,int column)
		  { boolean b=false;
		   if(row<=boardR.length && column<=boardR.length){
		  for(int i=0; i<shipTypes.length;i++){
		    if(boardR[row][column].equals(shipTypes[i])){
		    boardR[row][column]="h";
		    b=true;
		    }
		  }
		  if(boardR[row][column].equals("w")){
		      boardR[row][column]="~";
		      b=false;
		    }
		  }
		    return b;
		  }//end hit
		  
		  public boolean isDestroyed()
		  { boolean b=true;
		   for(int i=0; i<boardR.length; i++){
		     for(int j=0; j<boardR[i].length; j++){
		       if(boardR[i][j].equals("h")){
		       b=true;
		       }else
		       b=false;
		     }
		   } 
		    return b;
		  }//end isDestroyed
		  
		  public String[][] getBoardR(){
		    return boardR;
		  }
		  
		}
	


}
