package com.practice.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

//	[Expected Approach] Using Moore's Voting Algorithm - O(n) Time and O(1) Space
	public static int solution(int arr[]) {
		int n = arr.length;
		int candidate = -1;
		int count = 0;
		
		for(int num : arr) {
			if(count == 0) {
				candidate = num;
				count++;
			} else if(candidate == num) {
				count++;
			} else {
				count--;
			}
		}
		
		count = 0;
		for(int e : arr) {
			if(candidate == e) {
				count++;
			}
		}
		
		if(count > n / 2) 
			return candidate;
		
		return -1;
	}
	
//	[Naive Approach] Using Two Nested Loops - O(n^2) Time and O(1) Space
//	public static int solution(int arr[]) {
//		
//		int n = arr.length;
//		int count = 0;
//		for(int i = 0; i < n; i++) {
//			count = 0;
//			for(int j = 0; j < n; j++) {
//				if(arr[i] == arr[j]) {
//					count++;
//				}
//			}
//			
//			if(count > n / 2) 
//				return arr[i];
//			
//		}
//		
//		return -1;
//	}
	
//	[Better Approach - 2] Using Hashing - O(n) Time and O(n) Space
//	public static int solution(int arr[]) {
//		
//		Map<Integer, Integer> countMap = new HashMap<>();
//		int n = arr.length;
//		
//		for(int ele : arr) {
//			countMap.put(ele, countMap.getOrDefault(ele, 0) + 1);
//			
//			if(countMap.get(ele) > n / 2) {
//				return ele;
//			}
//		}
//		
//		return -1;
//	}
//	
	public static void main(String[] args) {
		int nums[] = {3,2,3};
		int solution = solution(nums);
		System.out.println("Majority Element : " + solution);
	}

}
