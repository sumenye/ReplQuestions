package Assignments;

public class Repl231Y {
	public static void main(String[] args) {
		System.out.println(countLetters("aaabbcccc"));

	}

	public static String countLetters(String str) {
//	String[] arr1 = str.split("");
//	String[] arr2 = str.split("");
//	String last="";
//	
//	int countnew=0;
//	int countlast=0;
//	for(int x=countlast; x<arr1.length;) {
//		countnew=0;
//		for(int y=0; y<arr2.length;y++) {
//		if (arr1[x].equals(arr2[y])) {
//			countnew++;	}	}
//		countlast+=countnew;
//		last+= "" + countnew + arr2[countlast];
//	
//	}
//return last;
//}
		
	    String[] arr1 = str.split("");
	    
	    String last="";
	    int count = 1;
	    for (int i = 0; i < arr1.length; i++) {
	      count = 1;
	      
	      for (int j = i+1; j < arr1.length; j++) {
	        if(arr1[i].equals(arr1[j])) {
	          count++;
	          i=j;
	        }
	        
	      }
	      
	      last += count + arr1[i];
	    }
	    
	  
	    return last;	
	}
}
