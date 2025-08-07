package com.practice.array;

public class WaveArray {

	public static void solution(int arr[]) {
		int n = arr.length, temp = 0;
		
		for(int i = 0; i < n; i = i + 2) {
			if(i != n - 1) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5};
		
		for(int n : arr) 
			System.out.print(n + " ");
		
		System.out.println();
		solution(arr);
		
		for(int n : arr) 
			System.out.print(n + " ");
		
		
	}

}
