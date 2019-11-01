package Assignments;

public class Repl231 {

	public static void main(String[] args) {
		System.out.println(countLetters("aaabbcccc"));

	}

	public static String countLetters(String str) {
		int count1 = 0;
		String[] arr1 = str.split("");
		String[] arr2 = str.split("");

		for (int j = 0; j < arr2.length; j++) {
			if (arr1[0].equals(arr2[j])) {
				count1++;
			}
		}
	

		int count2 = 0;
		for (int j = 0; j < arr2.length; j++) {
			if (arr1[count1].equals(arr2[j])) {
				count2++;
			}
		}

		int count3 = 0;
		for (int j = 0; j < arr2.length; j++) {
			if (arr1[count1 + count2].equals(arr2[j])) {
				count3++;
			}
		}
		int count4 = 0;
		for (int j = 0; j < arr2.length; j++) {
			if (arr1[count1 + count2+count3].equals(arr2[j])) {
				count4++;
			}
		}
		int count5 = 0;
		for (int j = 0; j < arr2.length; j++) {
			if (arr1[count1 + count2+count3+count4].equals(arr2[j])) {
				count5++;
			}
		}
		if(str.length() >= (count1+count2+count3+count4+count5))
			return "" + count1 + arr2[0] + count2 + arr2[count1] + count3 + arr2[count1+count2]+count4+arr2[count1+count2+count3]+count5+arr2[count1+count2+count3+count4];
		else if(str.length() >= (count1+count2+count3+count4))
			return "" + count1 + arr2[0] + count2 + arr2[count1] + count3 + arr2[count1+count2]+count4+arr2[count1+count2+count3];		
		else if(str.length() >= (count1+count2+count3))
			return "" + count1 + arr2[0] + count2 + arr2[count1] + count3 + arr2[count1+count2];
		else if(str.length() >= (count1+count2))
			return "" + count1 + arr2[0] + count2 + arr2[count1];
		else if (str.length() >= count1)
			return "" + count1 + arr2[0];
		else return null;
	}
}
