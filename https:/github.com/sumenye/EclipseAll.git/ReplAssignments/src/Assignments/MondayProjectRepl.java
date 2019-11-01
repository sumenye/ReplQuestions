package Assignments;

import java.util.Scanner;

public class MondayProjectRepl {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    float[] score = new float[7];
	    //WRITE YOUR CODE HERE
	    float sum =0;
	   
	    float scoreMin =0;
	    float scoreMax =10;
	    
	    for(int i=0; i<score.length;i++){
	      System.out.println("Enter score for judge "+(i+1)+":");
	      score[i]=input.nextFloat();
	       
		    if (score[i] > scoreMax) {

				scoreMax = score[i];}
			if (score[i] < scoreMin) {

				scoreMin = score[i];}
		    
//	      if(score[i]==0 ||score[i]==10){
//	        continue;}
	        sum=sum+score[i];
	      }
	  

	    // FINAL OUTPUT
	    System.out.println("Enter difficulty:");
	    float difficult = input.nextFloat();
	    double total=(sum*difficult)*0.6;
	    
	 
	     System.out.println("Total :"+total); 
	  }
	}