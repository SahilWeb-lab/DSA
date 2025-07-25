package com.practice.array;

import java.util.Arrays;

public class SecondLargestElement {
	
//	Approach 1:
//	public static int getSecondLargestElement(int nums[]) {
//		
//		if(nums.length == 0 || nums.length == 1) {
//			return -1;
//		}
//		
////		Find First Max:
//		int max = nums[0];
//		for(int i = 1; i < nums.length; i++) {
//			if(nums[i] > max) {
//				max = nums[i];
//			}
//		}
//		
//		int secondMax = -1;
//		for(int i = 0; i < nums.length; i++) {
//			if(nums[i] != max && nums[i] > secondMax) {
//				secondMax = nums[i];
//			}
//		}
//		
//		return secondMax;
//		
//	}
	
//	Naive Approach 2:
//	public static int getSecondLargestElement(int nums[]) {
//		
////		Find Array Length:
//		int n = nums.length;
//		
////		Sort Array in Ascending order:
//		Arrays.sort(nums);
//		
////		Max element:
//		int maxElement = nums[n - 1];
//		
////		Find second max:
//		for(int i = n-2; i >= 0; i--) {
//			if(maxElement != nums[i]) {
//				return nums[i];
//			}
//		}
//		
//		return -1;
//		
//	}
	
//	[Expected Approach] One Pass Search
	public static int getSecondLargestElement(int nums[]) {
		
//		Find array length:
		int n = nums.length;
		int max = -1, secondMax = -1;
		
		for(int i = 0; i < n; i++) {
			if(nums[i] > max) {
				secondMax = max;
				max = nums[i];
			} else if(nums[i] > secondMax && max > nums[i]) {
				secondMax = nums[i];
			}
		}
		
		return secondMax;
		
	}

	public static void main(String[] args) {
		int nums[] = {10, 5, 10};
		int result = getSecondLargestElement(nums);
		System.out.println("Second Largest : " + result);
	}
	
}
