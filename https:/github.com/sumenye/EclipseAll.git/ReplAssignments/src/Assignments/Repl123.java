package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Repl123 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int[] inhabitants = new int[8];
	    for(int i=0; i<inhabitants.length; i++) {
	      inhabitants[i] = input.nextInt();
	    }
	    
	    //TODO. Write you code below this line. 
	    int day=0;
	    
	    System.out.println("Day "+day++ +" "+Arrays.toString(inhabitants));
	    int totalPopulation=0;
	    
	    while(true){
	      for(int i=0; i<inhabitants.length; i++){
	        inhabitants [i] = inhabitants[i]/2;
	        
	      }
	      
	      for(int population : inhabitants){
	        totalPopulation+=population;
	      }
	      System.out.println("Day "+day++ +" "+Arrays.toString(inhabitants));
	      if(totalPopulation==0){
	        break;
	      }
	      totalPopulation=0;
	      
	    }
	    System.out.println(   "---- EXTINCT ----"         );
	  }
	}