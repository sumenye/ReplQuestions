package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Repl130 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the size of inner array");
			int sizeInner = scan.nextInt();
			System.out.println("Enter the size of outer array");
			int sizeOuter = scan.nextInt();
			int[] inner = new int[sizeInner];
			int[] outer = new int[sizeOuter];
			System.out.println("Enter the elements of inner array");
			for(int i =0; i < sizeInner; i++) {
				inner[i] = scan.nextInt();
			}
			System.out.println("Enter the elements of outer array");
			for(int j =0; j < sizeOuter; j++) {
				outer[j] = scan.nextInt();
			}
			Arrays.sort(inner);
			Arrays.sort(outer);
			int equals=0;
			boolean b =true;
	
			//WRITE YOUR CODE HERE
			for(int i=0; i<sizeInner;i++){
			  for(int j=1;j<sizeOuter-1; j++){
			    if(inner[i]==outer[j]){
			      equals++;
			    }
			  }
			}
			if(equals==sizeInner || equals==sizeOuter){
	    b=true;}
	  
		System.out.println(b);	
			
	  }
	}