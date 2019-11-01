package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Repl124 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    int[] inhabitants = new int[8];
		    for(int i=0; i<inhabitants.length; i++) {
		      inhabitants[i] = input.nextInt();
		    }	
		    //CODE-------
		    int day = 0;
		    int indexOfLastElement =inhabitants.length-1;
		    int totalPopulation =0;
		    boolean precedingCityLostAllHabitants=false;
		    System.out.println("Day "+day+" "+Arrays.toString(inhabitants));
		    
		    //BURADAKI MANTIK, DIZININ BASINI, SONUNU VE ORTASINI AYRI AYRI KONTROL EDIYOR 
		    //VE CONDITION LARI ONA GORE YAZIYORUZ
		    do {
		    	day++;
		    	for(int i=0; i<inhabitants.length;i++) {
		    		//if its the first city, under attack
		    		//then we want to check 
		    		//if population of second city is equals to 0
		    		if(i==0) {
		    			if(inhabitants[1]==0) {
		    				//first will loose half of the population
		    				inhabitants[0]=inhabitants[0]/2;}
		    		}
		    //if it is a last city
//the  we want to check if population of second before last city is equals to 0
		    		else if (i==indexOfLastElement) {
		    			if(inhabitants[indexOfLastElement-1]==0) {
		    				//then last city will loose half of its population
		    				inhabitants[indexOfLastElement]/=2;}
		    			}
		    			else {//if it is not first or last city
		    				if(inhabitants[i]!=0) {
		    					if(inhabitants[i+1]==0) {
		    						//if its true, the  this city loses its population
		    						inhabitants[i] /=2;}
		    					//if preceding city has no population and it didnot loose population within a same the day
		    			else if(inhabitants[i-1]==0 && !precedingCityLostAllHabitants) {
		    				//if its true, then this city loses population
		    				inhabitants[i] /=2;
		    			//this is for seeting our condition
		    				//it set precedingCityLostAllHabitants to true only if city lost all inhabitants
		    			if (inhabitants[i]==0) {
		    				precedingCityLostAllHabitants=true;}	
		    			
		    			}
		    			}
		    					}
		    				}
		    	//we are printing updated info
		    	System.out.println("Day "+day+" "+Arrays.toString(inhabitants));
		    	//we are checking how many inhabitants left
		    	//if there is no more inhabitants
		    	//break the loop
		    	for(int i:inhabitants) {
		    		totalPopulation +=i;}
		    	//break if no more inhabitants
		    	if(totalPopulation==0) {
		    	break;}
		    	//reset condition
		    	precedingCityLostAllHabitants=false;
		    	//reset counter
		    	totalPopulation =0;
		    	} while(true);
		    System.out.println("---- EXTINCT ----");
		    
		    	
		    			
		    				
		    			}
		    		}
		
		    	
		    
		    


