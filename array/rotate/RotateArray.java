package com.practice.array.rotate;

public class RotateArray {

	public static int[] solution(int arr[], int k) {
		
		int n = arr.length;
		int left = 0, right = n - 1;
//		k = k % n;
//		STEP 1 : Reverse Whole Array:
		reverseArray(arr, left, right);
		
		
//		STEP 2 : Reverse Sub Array:
		reverseArray(arr, left, k - 1);
		
//		STEP 3 : Reverse Remaining Elements:
		reverseArray(arr, k, right);
		
		return arr;
	}
	
	public static void reverseArray(int arr[], int left, int right) {
		int temp = 0;
		while(left < right) {
			temp = arr[right];
			arr[right] = arr[left];
			arr[left] = temp;
			left++;
			right--;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		
		for(int n : arr) 
			System.out.print(n + " ");
		
		System.out.println();
		
		solution(arr, 10);
		
		for(int n : arr) 
			System.out.print(n + " ");
		
		
	}

}
