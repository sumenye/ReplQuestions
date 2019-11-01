package Assignments;
import java.util.Scanner;
public class Repl100 {

	public static void main(String[] args) {


		    Scanner scan = new Scanner(System.in);
		    int prize = 0;
		    System.out.println("Enter 4 numbers:");
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    int c = scan.nextInt();
		    int d = scan.nextInt();
		    
		   // for(int i =0; i<=4;i++) {
			if(a==b && b==c && c==d  && a==d) {
	    		prize = 30;}
			else if ((a==b && b==c && c!=d && a!=d) || (a!=b && b==c && c==d && a!=d) || (a!=b && b!=c && c==d && a==b) || (a==b && b!=c && c!=d && a==d)) {
	    		prize=20;}
	    	else if ((a==b && b!=c && c!=d && a!=d)|| (a!=b && b==c && c!=d && a!=d) || (a!=b && b!=c && c==d && a!=d) || (a!=b && b!=c && c!=d && a==c) || (a!=b && b!=c && c!=d && a==d) || (a!=b && b!=c && c!=d && b==d)) {
	    		prize=10;}
	    	else if (a!=b && b!=c && c!=d && a!=d) {
	    		prize = 0;}
	    	
	    System.out.println(prize);

}
}