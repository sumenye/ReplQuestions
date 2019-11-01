package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Repl119 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    
	    int decimal = input.nextInt();
	    int[] binary = new int[8];
	    
	    //TODO: Write your code below.
	   
	    binary[0]=decimal/128;
	    binary[1]=(decimal%128)/64;
	    binary[2]=((decimal%128)%64)/32;
	    binary[3]=(((decimal%128)%64)%32)/16;
	    binary[4]=((((decimal%128)%64)%32)%16)/8;
	    binary[5]=(((((decimal%128)%64)%32)%16)%8)/4;
	    binary[6]=((((((decimal%128)%64)%32)%16)%8)%4)/2;
	    binary[7]=binary[1]%1;
	   
	    System.out.println(Arrays.toString(binary)); 
	  }
	}