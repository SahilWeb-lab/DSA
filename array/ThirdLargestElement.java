package com.practice.array;

import java.util.Arrays;

public class ThirdLargestElement {

////	Naive Approach:
////	Time Complexity: O(n*log(n))
////	Space Complexity : O(1)
//	public static int findThirdLargestElement(int nums[]) {
//		
//		if(nums.length < 3) 
//			return -1;
//		
////		Sort Array:
//		Arrays.sort(nums); // Time Complexity: O(n*log(n))
//		
//		return nums[nums.length - 3];
//	}
	
//	[Expected Approach - 1] Using Three Loops - O(n) time and O(1) space
//	Appraoch 2: Time Complexity -> (n + n + n) -> (3n) -> O(n) 
//	public static int findThirdLargestElement(int nums[]) {
//		
//		int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE,thirdMax = Integer.MIN_VALUE;
////		First : Find First Max Element:
//		for(int i = 0; i < nums.length; i++) { // T.C -> n
//			if(nums[i] > firstMax) {
//				firstMax = nums[i];
//			}
//		}
//		
////		Find Second Max:
//		for(int i = 0; i < nums.length; i++) {
//			if(nums[i] != firstMax && secondMax < nums[i]) { // T.C -> n
//				secondMax = nums[i];
//			}
//		}
//		
////		Find Third Max:
//		for(int i = 0; i < nums.length; i++) { // T.C -> n
//			if(firstMax != nums[i] && secondMax != nums[i] && nums[i] > thirdMax) {
//				thirdMax = nums[i];
//			}
//		}
//		
//		return thirdMax;
//	}
	
//	[Expected Approach - 2] Using Three variables - O(n) time and O(1) space
	public static int findThirdLargestElement(int nums[]) {
		
		if(nums.length < 3) {
			return -1;
		}
		
		int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE, thirdMax = Integer.MIN_VALUE;
		for(int i = 0; i < nums.length; i++) {
			
			if(nums[i] > firstMax) {
				thirdMax = secondMax;
				secondMax = firstMax;
				firstMax = nums[i];
			}
			
			if(nums[i] > secondMax && nums[i] < firstMax) {
				thirdMax = secondMax;
				secondMax = nums[i];
			}
			
			if(nums[i] > thirdMax && nums[i] < secondMax) {
				thirdMax = nums[i];
			}
			
		}
		
		return thirdMax;
	}
	
	public static void main(String[] args) {
		int arr[] = {-4, 4, 7};
		int result = findThirdLargestElement(arr);
		
		System.out.println("Third Largest : " + result);
	}
	
}
