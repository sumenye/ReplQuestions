package Assignments;

public class ReverseANumberWithoutString {

	public static void main(String[] args) {
		int num = 2578 ;
		int newNum = 0 ; 
		
		/*
		 * idea : get each and every digit and re calculate the reverse
		 * 		
		 * 2578 % 10 ----> 8  first digit
		 * (0 * 10 = 0 then 0 + 8 = 8 ) this will make sense in below iteration
		 * 2578 / 10 ----> 257 
		 * 
		 * 257 % 10 ----> 7  socond digit
		 * 8 * 10 = 80 then 80 + 7 --> 87
		 * 257 / 10 ----> 25  
		 * 
		 * 25 % 10 ----> 5 third digit 
		 * 87 * 10 = 870 then 870 + 5 --> 875
		 * 25 / 10 ----> 2 
		 * 
		 * 2 % 10 ----> 2 forth digit 
		 * 875 * 10 = 8750 then 8750 + 2 --> 8752
		 * 2 / 10 ----> 0   means this is the last digit and That's all
		 * 
		 * 
		 * below is step by step version without loop
		 * */
		
		System.out.println("Remainder :" + num%10);
		newNum = newNum*10 + num%10 ;
		System.out.println(newNum);
		System.out.println( num/=10 );
		
		System.out.println("Remainder :" + num%10);
		newNum = newNum*10 + num%10 ;
		System.out.println(newNum);
		System.out.println( num/=10 );
		
		System.out.println("Remainder :" + num%10);
		newNum = newNum*10 + num%10 ;
		System.out.println(newNum);
		System.out.println( num/=10 );
		
		System.out.println("Remainder :" + num%10);
		newNum = newNum*10 + num%10 ;
		System.out.println(newNum);
		System.out.println( num/=10 );
		
		/*as we see above all flows are 
		 *the same so we can put it under the loop*/
		
		while(num!=0) {
			newNum = newNum*10 + num%10 ;
			System.out.println("new Number at this iteration: " + newNum);
			num/=10 ;
			System.out.println("num at this iteration: " + num);
		}
		

}


}