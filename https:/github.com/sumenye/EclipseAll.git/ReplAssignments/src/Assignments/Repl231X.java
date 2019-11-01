package Assignments;

public class Repl231X {
	
	public static void main(String[] args) {
		System.out.println(countLetters("aaabbcccc"));

	}

	public static String countLetters(String str) {
		int count1 = 0;
		String[] arr1 = str.split("");
		String[] arr2 = str.split("");
		String last="";
		
		int countnew=0;
		int countlast=0;
		for(int x=0; x<arr1.length;x++) {
			for(int y=0; y<arr2.length;y++) {
			if (arr1[x].equals(arr2[y])) {
				countnew++;	}
			if (str.length() >= countnew) {
				last+= "" + countnew + arr2[x];
			countlast+=countnew;}
			}
			x=countlast;
		}
		
		

		for (int j = 0; j < arr2.length; j++) {
			if (arr1[0].equals(arr2[j])) {
				count1++;
			}
		}
		if (str.length() >= count1)
			last= "" + count1 + arr2[0];
		else if (str.length() < count1) {

		int count2 = 0;
		for (int j = 0; j < arr2.length; j++) {
			if (arr1[count1].equals(arr2[j])) {
				count2++;
			}
		}
		if(str.length() >= (count1+count2))
			last= "" + count1 + arr2[0] + count2 + arr2[count1];
		else if(str.length() < (count1+count2)) {

		int count3 = 0;
		for (int j = 0; j < arr2.length; j++) {
			if (arr1[count1 + count2].equals(arr2[j])) 
				count3++;
	
		}
		if(str.length() >= (count1+count2+count3))
			last= "" + count1 + arr2[0] + count2 + arr2[count1] + count3 + arr2[count1+count2];
		else if (str.length() < (count1+count2+count3)) {
		
		int count4 = 0;
		for (int j = 0; j < arr2.length; j++) {
			if (arr1[count1 + count2+count3].equals(arr2[j])) {
				count4++;
			}
		}
		if(str.length() >= (count1+count2+count3+count4))
			last= "" + count1 + arr2[0] + count2 + arr2[count1] + count3 + arr2[count1+count2]+count4+arr2[count1+count2+count3];	
		else if (str.length() < (count1+count2+count3+count4)) {
		
		int count5 = 0;
		for (int j = 0; j < arr2.length; j++) {
			if (arr1[count1 + count2+count3+count4].equals(arr2[j])) {
				count5++;
			}
		}
		if(str.length() >= (count1+count2+count3+count4+count5))
			last= "" + count1 + arr2[0] + count2 + arr2[count1] + count3 + arr2[count1+count2]+count4+arr2[count1+count2+count3]+count5+arr2[count1+count2+count3+count4];	
		}}}
		
		
	}
return last;
}
}

