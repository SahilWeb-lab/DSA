package com.practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum {
	
	public static List<List<Integer>> solution(int arr[], int target) {
		int n = arr.length;
		
//		Sort Array:
		Arrays.sort(arr);
		
		Set<List<Integer>> ans = new HashSet<List<Integer>>();
		
		for(int i = 0; i < n; i++) {
			if(i > 0 && arr[i] == arr[i - 1]) continue;
			
			for(int j = i + 1; j < n; j++) {
				if(j != (i + 1) && arr[j] == arr[j - 1]) continue;
				
				int k = j + 1;
				int l = n - 1;
				
				while(k < l) {
					long sum = arr[i];
					sum += arr[j];
					sum += arr[k];
					sum += arr[l];
					
					if(sum == target) {
						List<Integer> temp = new ArrayList<Integer>(Arrays.asList(arr[i], arr[j], arr[k], arr[l]));
						ans.add(temp);
						k++;
						l--;
						while(k < l && arr[k] == arr[k - 1]) k++;
						while(k < l && arr[l] == arr[l + 1]) l--;
						
					} else if(sum < target) {
						k++;
					} else {
						l--;
					}
				}
			}
		}
		
		List<List<Integer>> finalAns = new ArrayList<>(ans);
		return finalAns;
	}
	
	public static void main(String[] args) {
		int arr[] = {1000000000,1000000000,1000000000,1000000000};
		int target = -294967296;
		List<List<Integer>> solution = solution(arr, target);
		
		solution.stream().forEach(list -> list.stream().forEach(ele -> System.out.print(ele + " ")));
	}

}
