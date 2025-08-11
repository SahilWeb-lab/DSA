package com.practice.array;

public class InsertDuplicate {

	public static int[] solution(int arr[], int k) {
		
		int n = arr.length, count = 0;
		int ans[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			if(arr[i] == k && i < n - 1) {
				ans[count] = k;
				count++;
				ans[count] = k;
				count++;
			} else {
				if(count < n) {
					ans[count] = arr[i];
					count++;
				}
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		int arr[] = {7, 5, 8};
		int k = 5;
		int[] solution = solution(arr, k);
	
		for(int n : solution)
			System.out.print(n + " ");
	}

}
