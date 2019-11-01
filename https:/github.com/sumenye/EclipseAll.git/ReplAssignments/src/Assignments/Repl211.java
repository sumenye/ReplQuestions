package Assignments;

public class Repl211 {
	public static String reverseLetters(String word){
    char[] newStr = new char [word.length()];
    int i = 0;
    int j = word.length() - 1;
    while (i <= j) {
        if (!Character.isAlphabetic(word.charAt(i))) {
            newStr[i] = word.charAt(i);
            i++;
        }
        else if (!Character.isAlphabetic(word.charAt(j))) {
            newStr[j] = word.charAt(j);
            j--;
        } else {
            newStr[j] = word.charAt(i);
            newStr[i] = word.charAt(j);
            i++;
            j--;
        }
    }
    return new String(newStr);

}
	
	
//Faruk's solution
	/*import java.util.ArrayList;

public class Utils {
	public static String reverseLetters(String word){
	ArrayList<Character>reversed=new ArrayList<>(word.length());
			
	for (int i = word.length()-1; i >=0; i--) {
	if((word.charAt(i)>='A'&&word.charAt(i)<='Z')
		||(word.charAt(i)>='a'&&word.charAt(i)<='z')) { 
	reversed.add(word.charAt(i));		
		}}
	
	for (int j = 0; j < word.length(); j++) {
		if(!(word.charAt(j)>='A'&&word.charAt(j)<='Z')
		&!(word.charAt(j)>='a'&&word.charAt(j)<='z')) { 
		reversed.add(j, word.charAt(j));
	}	
	}
	String words="";
	for (Character each :reversed)  {
		words+=each;
	}
	
	return words;
	}
}*/
}
