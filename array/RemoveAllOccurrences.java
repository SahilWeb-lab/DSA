package com.practice.array;

public class RemoveAllOccurrences {

	public static int solution(int arr[], int k) {
		int count = 0;
		
		for(int n : arr) {
			if(n != k) {
				arr[count] = n;
				count++;
			}
		}
		
		
		return count;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {3, 2, 2, 3};
		int k = 5;
		int solution = solution(arr, k);
		
		System.out.println("Result : " + solution);
		
	}
	
}
