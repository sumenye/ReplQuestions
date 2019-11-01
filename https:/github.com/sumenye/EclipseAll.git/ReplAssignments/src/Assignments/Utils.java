package Assignments;

import java.util.ArrayList;

public class Utils{
	public static String reverseLetters(String word){
		//TODO
		ArrayList<Character> reversed = new ArrayList<>();
		for(int i=reversed.size()-1;i>=0;i--){
if((word.charAt(i)>='A'&& word.charAt(i)<='Z')||(word.charAt(i)>='a'&& word.charAt(i)<='z'))
		  reversed.add(word.charAt(i));}
	 for (int j = 0; j < word.length(); j++) {
        if(!(word.charAt(j)>='A'&&word.charAt(j)<='Z') && !(word.charAt(j)>='a'&&word.charAt(j)<='z')) 
        reversed.add(j, word.charAt(j)); }
	String words = "";
	for(Character each : reversed){
		words+=each;}
		return words;
	}
}

//			  // degilse continue ile reverse
//	ArrayList<Character> reversed = new ArrayList<>();
//	for(int i=reversed.size()-1;i>=0;i--){
//	 if(!(word.charAt(i)>='A'&& word.charAt(i)<='Z') && !(word.charAt(i)>='a'&&word.charAt(i)<='z')) {
//		 continue;
//	 }
//	word.charAt(i)=temp;
//	word.charAt(reversed.size()-1)=word.charAt(i);
//	word.charAt(reversed.size()-1)=temp;		}