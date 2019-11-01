package Assignments;

import java.util.Scanner;

public class Repl98 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    String str = scan.next();
		    int n = scan.nextInt();
		int i=0;
		int lastJ=0;
		int nJava=0;
		while (i != -1) {// -1 means there is no such word in string
					i = str.indexOf("java", lastJ); // index of word we looking
					if (i != -1) {
						nJava++; // if there is word we looking we increase counter by 1
					lastJ = i + "java".length(); }// we will start new index from last index plus the length of our word
		}
	int x=0;
	int lastP=0;
	int nPython=0;
	while (x != -1) {// -1 means there is no such word in string
	x = str.indexOf("Python", lastP); // index of word we looking
	if (x != -1) {
	nPython++; // if there is word we looking we increase counter by 1
	lastP = x + "Python".length(); }
		}
	

		System.out.println(nPython==nJava);
		
	}
	}
