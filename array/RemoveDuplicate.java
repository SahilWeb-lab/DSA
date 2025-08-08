package com.practice.array;

public class RemoveDuplicate {

	public static int solution(int arr[]) {
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(i < arr.length - 1 && arr[i] == arr[i + 1]) {
				arr[count] = arr[i];
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,1,1,2,2,3,3,4};
		int solution = solution(arr);
		
		System.out.println();
		System.out.println("Result : " + solution);
	}
	
}
