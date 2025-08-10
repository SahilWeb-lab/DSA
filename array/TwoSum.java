package com.practice.array;

import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static int[] solution(int arr[], int target) {
		Map<Integer, Integer> nums = new HashMap<>();
		
		for(int i = 0; i < arr.length; i++) {
			int req_num = target - arr[i];
			
			if(nums.containsKey(req_num)) {
				return new int[] {nums.get(req_num), i};
			}
			nums.put(arr[i], i);
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		int nums[] = {2,7,11,15};
		int target = 9;
		int[] solution = solution(nums, target);
		
		for(int i : solution) 
			System.out.print(i + " ");
	}

}
