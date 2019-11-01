package Assignments;


import java.util.*;
public class Repl111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    Scanner input = new Scanner(System.in);
    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
    
    //TODO: write your code below
  //---------------Vasyl's solution-------------------
    Arrays.sort(nums);
    // [1, 1, 2, 3, 4, 3, 4]
    // [1, 1, 2, 3, 3, 4, 4]
    for (int i = 0; i < nums.length; i++) {
        if (i == 0) {
            if (nums[i] != nums[i + 1]) {
                System.out.println(nums[i]);
            }
        } else if (i == nums.length - 1) {
            if (nums[i] != nums[i - 1]) {
                System.out.println(nums[i]);
            }
        } else {
            if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                System.out.println(nums[i]);
            }}
// //-----------another solution with counter-----------
//        int counter = 0;
//		int value = 0;
////		outer loop
//		for(int i =0; i<nums.length;i++) {
////			inner loop
//			for(int j =0; j<nums.length;j++) {
//				if(nums[i]==nums[j]) {
//					counter++;
//				}
//
//			}
//			if(counter == 1) {
//				value = nums[i];
//				break;
//			}
//			counter = 0;
//		}
//		System.out.println(value);
	}

	}}
