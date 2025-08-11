package com.practice.array;

import java.util.ArrayList;
import java.util.List;

public class LeadersInAnArray {

	public static int[] solution(int arr[]) {
		
		int n = arr.length;
		List<Integer> leaders = new ArrayList<>();
		
		int max = Integer.MIN_VALUE;
		for(int i = n - 1; i >= 0; i--) {
			if(max <= arr[i]) {
				max = arr[i];
				leaders.add(max);
			}
		}
		
		int ans[] = new int[leaders.size()];
		int count = 0;
		for(int i = ans.length - 1; i >= 0; i--) {
			ans[i] = leaders.get(count);
			count++;
		}
		
		return ans;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 2};
		int[] solution = solution(arr);
		
		for(int i : solution)
			System.out.print(i + " ");
		
	}

}
