package com.practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingRangesOfNumbers {

	public static List<List<Integer>> solution(int arr[], int upper, int lower) {
		List<List<Integer>> ansList = new ArrayList<List<Integer>>();
		
		
		int n = arr.length;
		
		if(n == 1) {
			if(lower != arr[0]) {
				ansList.add(Arrays.asList(lower, arr[0] - 1));
			}
			if(upper != arr[0]) 
				ansList.add(Arrays.asList(arr[0] + 1, upper));
			return ansList;
		}
		
		int lowerValue = -1;
		int upperValue = -1;
		for(int i = 0; i < arr.length; i++) {
			if(i == 0 && lower != arr[i]) {
				upperValue = arr[i] - 1;
				ansList.add(Arrays.asList(lower, upperValue));
				
				if(arr[i + 1] - arr[i] > 1 || arr[i + 1] - arr[i] < -1) {
					ansList.add(Arrays.asList(arr[i] + 1, arr[i + 1] - 1));
				}
				
			} else if(i == n - 1) {
				if(arr[i] != upper) {					
					lowerValue = arr[i] + 1;
					ansList.add(Arrays.asList(lowerValue, upper));
				}
			} else if(arr[i + 1] - arr[i] > 1) {
				lowerValue = arr[i] + 1;
				upperValue = arr[i + 1] - 1;
				ansList.add(Arrays.asList(lowerValue, upperValue));
			}
		}
		
		return ansList;
	}
	
	public static void main(String[] args) {
		int arr[] = {905};
		int lower = 905, upper = 935;
		
		Arrays.sort(arr);
		List<List<Integer>> solution = solution(arr, upper, lower);
		solution.stream().forEach(ele -> {
			ele.stream().forEach(i -> {
				System.out.print(i + " ");
			});
			System.out.println();
		});
	}
	
}
