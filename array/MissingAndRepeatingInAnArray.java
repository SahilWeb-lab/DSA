package com.practice.array;

public class MissingAndRepeatingInAnArray {

	public static int[] solution(int arr[]) {
		int repeatedElement = 0;
		
//		Finding Repeated Element:
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] == arr[i + 1]) {				
				repeatedElement = arr[i];
			}
		}
		System.out.println("Repeated Element : " + repeatedElement);
		
//		Find Sum of giving array:
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			 if(arr[i] != repeatedElement) {
				 sum += arr[i];
			 }
		}
		int totalSum = sum + repeatedElement;
		
//		Find maximum element:
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
//		Find the actual sum of whole sequence:
		int actualSum = 0;
		for(int i = 1; i <= max; i++) {
			actualSum += i;
		}
		
		
		int missingNumber = actualSum - totalSum;
		
//		System.out.println("Give Array Elements Sum : " + totalSum);
//		System.out.println("Actual Sum : " + actualSum);
//		System.out.println("Missing Number : " + missingNumber);
		
		return new int[] {repeatedElement, missingNumber};
	}
	
	public static void main(String[] args) {
		int arr[] = {6,5,8,7,1,4,1,3,2};
		
		int[] result = solution(arr);
		System.out.println("Result : ");
		for(int i : result)
			System.out.println(i);
	}

}
