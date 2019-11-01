package Assignments;
import java.util.ArrayList;
public class Repl187 {
	

	//create your method below
	public static void removeAll(ArrayList<String> wordList, String targetWord){
//	ArrayList<String> newList=new ArrayList<>();
	for(int i=0;i<wordList.size();i++){
	       if ( wordList.get(i).equals(targetWord)) {
        wordList.remove(i);
        i--;
      }
	}  
 
}
}