package OOPRepls;

public class TryinMethods {

	public static void main(String[] args) {
		
		String x = "deneme";
		String x1 = "deneme deneme2";
		System.out.println(capitalize(x));
		System.out.println(capitalize(x1));
		
		// TODO Auto-generated method stub

	}
    public static String capitalize(String word) {
		if(!word.isEmpty()) {
		word=""+word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
		return word;}
		return "";
    }

}
