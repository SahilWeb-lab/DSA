package com.practice.array.reverse;

public class ReverseInGroup {

	public static void solution(int arr[], int k) {
		
		for(int i = 0; i < arr.length; i = i + k) {
			int temp = 0, left = i, right = Math.min(i + k - 1, arr.length - 1);
			
			while(left < right) {
				temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
		
		for(int n : arr)
			System.out.print(n + " ");
		
		System.out.println();
		solution(arr, 3);
		for(int n : arr)
			System.out.print(n + " ");
	}
	
}
