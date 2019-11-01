package Assignments;

public class Repl44 {

	public static void main(String[] args) {
		  int num=1234;
		  
		
		 
		 int number = 1346; 
		 String sum="";
	
		 
		 
		 while(number > 0) { 
			 
			 sum+= " "+ number%10;
			 number = number/10;
			 
		 }
	
		 
		 System.out.print(sum.trim());
		 System.out.println();
		 String reversed="";
		 for(int i=sum.length()-1;i>=0;i--) {
		reversed+=sum.charAt(i);	
		 }
		 System.out.println(reversed);
		 
		 
		  
		  
	}}