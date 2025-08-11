package com.practice.array;

import java.util.Arrays;

public class MissingAndRepeatingInAnArray {

//	My Own Approach:
	public static int[] solution(int arr[]) {
		
		int n = arr.length;
		int repeatedElement = 0;
		Arrays.sort(arr);
		for(int i = 0; i < n - 1; i++) {
			if(arr[i] == arr[i + 1]) {
				repeatedElement = arr[i];
			}
		}
		
		System.out.println("Repeated Element : " + repeatedElement);
		
//		find total sum:
		long totalSum = (long) n * (n + 1) / 2;
		System.out.println("Total Sum : " + totalSum);
		
//		My array element sum:
		long arrayTotalSum = 0;
		for(int i : arr) {
			arrayTotalSum += i;
		}
		
		arrayTotalSum = arrayTotalSum - repeatedElement;
		
		int missingElement = (int) (totalSum - arrayTotalSum);
		
		return new int[] {repeatedElement, missingElement};
	}
	

//	public static int[] solution(int arr[]) {
//		return null;
//	}
	
	public static void main(String[] args) {
		int arr[] = {3, 1, 3};
		int[] solution = solution(arr);
		
		for(int i : solution) 
			System.out.print(i + " ");
	}

}
