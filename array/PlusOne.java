package com.practice.array;

public class PlusOne {

//	Approach 1:
	public static int[] solution(int arr[]) {
		
		int n = arr.length;
		
//		Check if array is empty or null:
		if(arr == null || n == 0) {
			int result[] = {1};
			return result;
		}
		
		for(int i = n - 1; i >= 0; i--) {
			if(arr[i] < 9) {
				arr[i]++;
				return arr;
			} else if(arr[i] == 9) {
				arr[i] = 0;
			}
		}
		
		int newNumber[] = new int[n + 1];
		newNumber[0] = 1;
		return newNumber;
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {9};
		int[] solution = solution(arr);
		for(int n : solution) 
			System.out.print(n + " ");
		
	}
	
}
