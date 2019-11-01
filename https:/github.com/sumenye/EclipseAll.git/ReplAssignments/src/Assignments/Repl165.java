package Assignments;

public class Repl165 {

	public static void main(String[] args) {
		mergeStrings("java","selenium");
		System.out.println(mergeStrings("java","selenium"));
	}
	
		 public static String mergeStrings(String one, String two) {
			 
			 int i=0;
			 int j=0;
			 String merged="";

			   for(;i<one.length() && j<two.length(); i++, j++) {
			     merged += ""+one.charAt(i) + two.charAt(j);
			   }
			  // return merged + one.substring(i, one.length()) + two.substring(j, two.length());
			   return merged + one.substring(i) + two.substring(j);
			 
			 
			 
			 
			 
//			 String str="";
//			 if(one.length()>two.length()){
//	         for(int i=0;i<one.length();i++){
//	                str+=one.charAt(i);
//	                for(int j=i;j<two.length();){
//	                    str+=two.charAt(j);
//	                    break;
//	                }
//	            }
//	        }
//	        else if(two.length()>one.length()){
//	            for(int i=0;i<two.length();i++){
//	                str+=two.charAt(i);
//	                for(int j=i;j<one.length();){
//	                    str+=one.charAt(j);
//	                    break;
//	                }
//	            }
//	        }
//			 
//	        else if (two.length()==one.length()) {
//	        	for(int i=0; i<one.length();i++){
//	        		  str += one.charAt(i);
//	        		  str += two.charAt(i);
//	        		}
//	        }
	      
			  
			    //System.out.println(merged);
		
			      
			    
			    
			  }
			}