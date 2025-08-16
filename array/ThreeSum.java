package com.practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

//	Brute Force Approach: Time Limit Exceed:
//	public static List<List<Integer>> solution(int arr[]) {
//		
//		int n = arr.length;
//		Set<List<Integer>> uniqueTriplet = new HashSet<>();
//		for(int i = 0; i < n; i++) {
//			for(int j = i + 1; j < n; j++) {
//				for(int k = j + 1; k < n; k++) {
//					if(arr[i] + arr[j] + arr[k] == 0 && i != j && j != k && i !=k) {
//						List<Integer> temp = new ArrayList<>();
//						temp.add(arr[i]);
//						temp.add(arr[j]);
//						temp.add(arr[k]);
//						Collections.sort(temp);
//						uniqueTriplet.add(temp);
//					}
//				}
//			}
//		}
//		
//		List<List<Integer>> ans = new ArrayList<List<Integer>>(uniqueTriplet);
//		
//		return ans;
//		
//	}
	
//	Better Approach :
//	public static List<List<Integer>> solution(int arr[]) {
//		int n = arr.length, third = 0;
//		Set<List<Integer>> ans = new HashSet<>();
//		
//		for(int i = 0; i < n; i++) {
//			HashSet<Integer> hashSet = new HashSet<>();
//			for(int j = i + 1; j < n; j++) {
//				third = -(arr[i] + arr[j]);
//				
//				if(hashSet.contains(third)) {
//					List<Integer> temp = new ArrayList<>();
//					temp.add(arr[i]);
//					temp.add(arr[j]);
//					temp.add(third);
//					Collections.sort(temp);
//					ans.add(temp);
//				}
//				hashSet.add(arr[j]);
//			}
//		}
//		
//		List<List<Integer>> finalAns = new ArrayList<>(ans);
//		return finalAns;
//		
//	}
	
//	Expected Approach:
	public static List<List<Integer>> solution(int arr[]) {
		int n = arr.length;
		
//		Sort Array:
		Arrays.sort(arr);
		Set<List<Integer>> ans = new HashSet<>();
		
		for(int i = 0; i < n; i++) {
			if(i > 0 && arr[i] == arr[i- 1])
				continue;
			
			int j = i + 1;
			int k = n - 1;
			
			while(j < k) {
				int sum = arr[i] + arr[j] + arr[k];
				if(sum < 0) 
					j++;
				else if(sum > 0) 
					k--;
				else {
					List<Integer> temp = new ArrayList<>();
					temp.add(arr[i]);
					temp.add(arr[j]);
					temp.add(arr[k]);
					ans.add(temp);
					j++;
					k--;
					
					while(j < k && arr[j] == arr[j - 1]) j++;
					while(j < k && arr[k] == arr[k + 1]) k--;
				}
			}
		}
		
		List<List<Integer>> finalAns = new ArrayList<>(ans);

		
		return finalAns;
	}
	
	public static void main(String[] args) {
		int nums[] = {-1,0,1,2,-1,-4};
		List<List<Integer>> solution = solution(nums);
		
		solution.stream().forEach(list -> list.stream().forEach(ele -> System.out.print(ele + ", ")));
	}

}
