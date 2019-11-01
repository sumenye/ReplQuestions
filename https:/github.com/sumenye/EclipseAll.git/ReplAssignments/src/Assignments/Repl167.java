package Assignments;

public class Repl167 {

	public static void main(String[] args) {

		System.out.println(coverString("java methods", "me")); // coverString("java methods", "me") ) ; ==> "java [me]thods"
		System.out.println(coverString("Certified Wooden Spoon", "o")); //coverString("Certified Wooden Spoon", "o") ) ; ==> "Certified W[o][o]den Sp[o][o]n"
		System.out.println(coverString("hello hello", "ello"));//coverString("hello hello", "ello") ) ; ==> "h[ello] h[ello]"
		System.out.println(coverString("apples", "pears"));//coverString("apples", "pears") ) ; ==> "[apples]"
	
	}

	public static String coverString(String main, String coverME) {
		//String expected = "";
		if (main.contains(coverME)) {
			return main.replace(coverME,"["+coverME+"]");
		}
		else 
			return "[" + main + "]";
	}
}
		
//		int count = 0;
//		for (int i = 0; i < main.length(); i++) {
//			for (int j = 0; j < coverME.length(); j++) {
//				if (main.contains(coverME)) {
//					count++;
//					
//				}
//			}
//		}
//		if (count == 2) {
//		
//
//		}
//		if (count == 1) {
//
//			int indexOfCoverMe = main.indexOf(coverME);
//
//			if (indexOfCoverMe == 0) {
//				expected = "[" + coverME + "]" + main;}
//
//			if (indexOfCoverMe > 0 && indexOfCoverMe < main.length() - 1) {
//				expected = main.substring(0, indexOfCoverMe) + "[" + coverME + "]"
//						+ main.substring(indexOfCoverMe + coverME.length());}
//
//			if (indexOfCoverMe == main.length() - 1) {
//				expected = main + "[" + coverME + "]";}
//		}
//
//			if (count == 0) {
//				expected = "[" + main + "]";
//			}


